public class BrowserHistory {
    public static void main(String[] args) {

        // Object Instantiation / declaration
        History his1 = new History();
        his1.setUrl("Instagram.com");
        History his2 = new History("Youtube.com");
        History his4 = new History("Twitch.com");
        History his3 = new History("Facebook.com", his4);

        // create link
        his1.next = his2;
        his2.next = his3;
        // Get all histories starting from H1
        // Hist1
        System.out.println("url: " + his1.getUrl());
        // His2
        System.out.println("URL " + his1.next.getUrl());
        // His3
        System.out.println("URL " + his1.next.next.getUrl());
        // His4
        System.out.println("URL " + his1.next.next.next.getUrl());
        // override His4
        his1.next.next.next.setUrl("Vimeo.com");

        System.out.println("URL " + his1.next.next.next.getUrl());
        
        System.out.println("---- Iterate to each Node using Loop -----");
        History current = his1;
        while (current != null) {
            System.out.println("Current URL  " + current.getUrl());
            current = current.next;
        }

    }
}
