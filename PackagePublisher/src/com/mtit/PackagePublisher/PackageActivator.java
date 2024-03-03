package com.mtit.PackagePublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PackageActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistrion;

	@Override
	public void start(BundleContext context) throws Exception {
		PackagePublisher publisherService = new PackageImpl();
		publishServiceRegistrion = context.registerService(PackagePublisher.class.getName(), publisherService, null);
		System.out.println("Start Package Service");

	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("Publisher Stop");
		publishServiceRegistrion.unregister();
		System.out.println("Stop Package Service");
	}

}
