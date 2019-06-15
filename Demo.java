import java.util.Scanner;

public class Demo {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("Add your original  url key: ");
		Scanner scanner = new Scanner(System.in);
		String originalurl = scanner.nextLine();
		double num=Math.random()*1000;
		long num1=(long)num;
		
		URL url = new URL();
		url.setId(num);
		url.setOrginalURL(originalurl);
		
		Base62Converter convertTo62Base= new Base62Converter();
		String result=convertTo62Base.convertTo62Base(num1);
		String shortnedurl=UrlService.shortenedURL(result);
		
		System.out.println("Shortened URL: "+shortnedurl);
		
		URL url1 = new URL();
		url1.setShortenedURL(shortnedurl);
		url1.setOrginalURL(url.getOrginalURL());
		
		System.out.println("Enter your short url key: ");
		String shorturl = scanner.nextLine();
		
		if(shorturl.equals(url1.getShortenedURL()))
		{
			System.out.println("Original URL: "+url1.getOrginalURL());
		}
		else
		{
			System.out.println("invalid URL");
		}
		
	}

}
