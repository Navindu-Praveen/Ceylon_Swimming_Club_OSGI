package com.mtit.NutrientSubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.NutrientPublisher.NutrientPublisher;

public class NutrientActivator implements BundleActivator {

      ServiceReference serviceReference;
      Scanner sc = new Scanner(System.in);

	public void start(BundleContext context) throws Exception {
			System.out.println("Started Membership Subscriber");
			serviceReference = context.getServiceReference(NutrientPublisher.class.getName());
			
			NutrientPublisher nutrientPublisher = (NutrientPublisher)context.getService(serviceReference);
		     NutrientSubscriber nutrientSubscriber = new NutrientSubscriberImpl();
		     nutrientSubscriber.getService(nutrientPublisher);      
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stoped Membership Subscriber");
	
	}

}
