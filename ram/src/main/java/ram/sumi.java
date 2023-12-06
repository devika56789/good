package ram;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class sumi {

	public static void main(String[] args)
	{
	Resource rs=new ClassPathResource("ramu.xml");
	BeanFactory bn=new XmlBeanFactory(rs);
	doni d=(doni)bn.getBean("cst2");
	d.disp();

	}

}
