import java.util.Collection;
import java.util.function.Consumer;

public record ta(String b, Collection<tg> c, Consumer<arp> d, Consumer<arp> e) {
   public static final String a = "defaultBatch";

   public ta(String b, Collection<tg> c, Consumer<arp> d, Consumer<arp> e) {
      if (c.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one GameTestInfo!");
      } else {
         this.b = b;
         this.c = c;
         this.d = d;
         this.e = e;
      }
   }

   public String a() {
      return this.b;
   }

   public Collection<tg> b() {
      return this.c;
   }

   public Consumer<arp> c() {
      return this.d;
   }

   public Consumer<arp> d() {
      return this.e;
   }
}
