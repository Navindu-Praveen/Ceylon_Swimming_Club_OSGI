package com.mtit.PackagePaymentPublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PackagePaymentActivator implements BundleActivator {
	ServiceRegistration publishServiceRegistrion;

	@Override
	public void start(BundleContext context) throws Exception {
		PackagePaymentPublisher packagePaymentPublisher = new PackagePaymentImpl();
		publishServiceRegistrion = context.registerService(PackagePaymentPublisher.class.getName(),
				packagePaymentPublisher, null);
		System.out.println("Start Payment Service");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Subscriber Service, Good Bye!");
		publishServiceRegistrion.unregister();
		System.out.println("Stop Payment Service");
	}

}
