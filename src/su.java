import java.util.Collection;
import java.util.function.Consumer;

public record su(String b, Collection<ta> c, Consumer<arh> d, Consumer<arh> e) {
   public static final String a = "defaultBatch";

   public su(String b, Collection<ta> c, Consumer<arh> d, Consumer<arh> e) {
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

   public Consumer<arh> c() {
      return this.d;
   }

   public Consumer<arh> d() {
      return this.e;
   }
}
