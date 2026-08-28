import java.util.Collection;
import java.util.function.Consumer;

public record su(String b, Collection<ta> c, Consumer<arg> d, Consumer<arg> e) {
   public static final String a = "defaultBatch";

   public su(String b, Collection<ta> c, Consumer<arg> d, Consumer<arg> e) {
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

   public Collection<ta> b() {
      return this.c;
   }

   public Consumer<arg> c() {
      return this.d;
   }

   public Consumer<arg> d() {
      return this.e;
   }
}
