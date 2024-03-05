package com.mtit.NutrientPublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class NutrientActivator implements BundleActivator {

	ServiceRegistration nutrientServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Nutrient Publisher Started");
		NutrientPublishImpl nutrientPublisher = new NutrientPublishImpl();
		nutrientServiceRegistration = context.registerService(NutrientPublisher.class.getName(), nutrientPublisher,
				null);
	}

	@Override
	public void stop(BundleContext Context) throws Exception {
		System.out.println("Nutrient Publisher Stopped");

	}

}
