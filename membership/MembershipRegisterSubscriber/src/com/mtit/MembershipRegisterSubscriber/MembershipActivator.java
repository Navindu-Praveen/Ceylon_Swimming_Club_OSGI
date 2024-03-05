package com.mtit.MembershipRegisterSubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.MembershipRegisterPublisher.MembershipPublisher;

public class MembershipActivator implements BundleActivator {

      ServiceReference serviceReference;
      Scanner sc = new Scanner(System.in);

	public void start(BundleContext context) throws Exception {
			System.out.println("Started Membership Subscriber");
			serviceReference = context.getServiceReference(MembershipPublisher.class.getName());
			
			MembershipPublisher membershipPublisher = (MembershipPublisher)context.getService(serviceReference);
		     MembershipSubscriber membershipSubscriber = new MembershipSubscriberImpl();
		     membershipSubscriber.getService(membershipPublisher);      
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopped Membership Subscriber");
	
	}

}
