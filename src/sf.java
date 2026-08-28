import java.util.Collection;
import java.util.function.Consumer;

public record sf(String b, Collection<sl> c, Consumer<ard> d, Consumer<ard> e) {
   public static final String a = "defaultBatch";

   public sf(String b, Collection<sl> c, Consumer<ard> d, Consumer<ard> e) {
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

   public Consumer<ard> c() {
      return this.d;
   }

   public Consumer<ard> d() {
      return this.e;
   }
}
