package org.apache.hupa.shared.storage;


import gwtTestSelection.shared.InstrumentationLoggerProvider;
import com.google.gwt.regexp.shared.MatchResult;
import com.google.gwt.regexp.shared.RegExp;
import com.google.inject.Inject;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanCodex;
import com.google.web.bindery.autobean.shared.AutoBeanFactory;
import com.google.web.bindery.autobean.shared.AutoBeanUtils;
import com.google.web.bindery.requestfactory.shared.BaseProxy;
import com.google.web.bindery.requestfactory.shared.DefaultProxyStore;
import com.google.web.bindery.requestfactory.shared.RequestFactory;

public class AppSerializer {

  public AppSerializer(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d181fd3b3_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d181fd3b30x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d181fd3b30x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8ddca914ae0x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8ddca914ae_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8ddca914ae0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8df5dbe2ee0x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8df5dbe2ee0x3_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8df5dbe2ee_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8df5dbe2ee0x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8df5dbe2ee0x30x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8df5dbe2ee0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8dfe87821c0x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8dfe87821c_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8dfe87821c0x3_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8dfe87821c0x30x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8dfe87821c0x2_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8dfe87821c0x0");
	}
	


@Inject RequestFactory requestFactory;
  @Inject AutoBeanFactory beanFactory;

  private final RegExp proxyIdRegexp = RegExp.compile("^.*?\"([^\"]+@\\d+@[^\"]+)\":\\{\"[POSTY]\":(.+)$");
  private final RegExp proxyMultIdRegexp = RegExp.compile("^.*?([^#]+@\\d+@[^#]+)#~#(.+)$");

  private boolean containsMultipleProxies(String data) {
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x2_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x3_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f5_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x20x0");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x30x00x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x30x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x30x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x30x00x1");
	MatchResult r = proxyIdRegexp.exec(data);
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x30x10x00x10x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x30x10x00x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x30x10x00x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x30x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x30x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d5db229f50x30x10x00x0");
	return r != null && proxyIdRegexp.exec(r.getGroup(2)) != null;
  }

  public <T extends BaseProxy> T deserialize(Class<T> clz, String payload) {
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x4_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x30x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x2_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x5_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x30x00x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x40x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x30x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd9393_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x3_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x0");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x50x00x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x50x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x50x00x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x50x0");
	String keyData[] = splitKeyData(payload);
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x50x10x10x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x50x10x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x50x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x50x10x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x50x10x0");
	DefaultProxyStore store = new DefaultProxyStore(keyData[1]);
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x50x20x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x50x2_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d32dd93930x50x20x00x0");
	return requestFactory.getSerializer(store).deserialize(clz, keyData[0]);
  }

  private String[] splitKeyData(String payload) {
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x20x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x3_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x2_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e78_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x10x0");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x00x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x0");
	MatchResult r;
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x10x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x1");
	r = proxyMultIdRegexp.exec(payload);
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x2_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x20x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x20x1");
	if (r != null) {
      InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x20x10x00x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x20x10x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x20x10x0");
	payload = r.getGroup(2);
    } else {
      InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x20x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x20x20x00x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x20x20x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x20x20x0");
	r = proxyIdRegexp.exec(payload);
    }
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x30x00x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x3_____org_apache_hupa_shared_storage_AppSerializer_java0x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x30x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8de2d23e780x30x30x0");
	return new String[]{r.getGroup(1), payload};
  }

  public <T extends BaseProxy> String serialize(T proxy) {
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x3_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x2_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x4_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x30x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x0");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x00x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x00x10x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x00x1");
	DefaultProxyStore store = new DefaultProxyStore();
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x10x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x10x10x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x10x10x0");
	String key = requestFactory.getSerializer(store).serialize(proxy);
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x20x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x20x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x20x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x2");
	String data = store.encode();
    if (containsMultipleProxies(data)) {
      InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x30x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x30x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x30x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x30x10x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x30x10x00x00x0");
	data = key + "#~#" + data;
    }
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d529af30f0x40x4");
	return data;
  }

  public <T> T deserializeBean(Class<T> clz, String payload) {
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x30x00x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x5_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x2_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x4_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x30x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x30x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x40x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x3");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x50x00x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x50x00x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x50x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x50x00x00x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x50x00x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x50x00x0");
	AutoBean<T> a = AutoBeanCodex.decode(beanFactory, clz, payload);
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x50x10x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x50x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x50x10x0");
	assert a != null : "There is no info about AutoBean: " + clz + ", maybe you forgot to include it in the App AutoBeanFactory";
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x50x2_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d3994660d0x50x20x0");
	return a.as();
  }

  public <T> String serializeBean(T proxy) {
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x3_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x2_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x30x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e6_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x4_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x0");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x40x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x40x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x40x00x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x40x00x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x40x00x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x40x00x00x1");
	AutoBean<T> bean = AutoBeanUtils.getAutoBean(proxy);
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x40x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x40x10x10x00x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x40x10x10x0_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x40x1_____org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x40x10x1");
	String json = AutoBeanCodex.encode(bean).getPayload();
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_storage_AppSerializer_java0x081001b8d25ffc1e60x40x2");
	return json;
  }


}
