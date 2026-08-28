import java.util.Collection;
import java.util.function.Consumer;

public record sf(String b, Collection<sl> c, Consumer<arc> d, Consumer<arc> e) {
   public static final String a = "defaultBatch";

   public sf(String b, Collection<sl> c, Consumer<arc> d, Consumer<arc> e) {
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

   public Collection<sl> b() {
      return this.c;
   }

   public Consumer<arc> c() {
      return this.d;
   }

   public Consumer<arc> d() {
      return this.e;
   }
}
