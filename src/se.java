import java.util.Collection;
import java.util.function.Consumer;

public record se(String b, Collection<sk> c, Consumer<apu> d, Consumer<apu> e) {
   public static final String a = "defaultBatch";

   public se(String b, Collection<sk> c, Consumer<apu> d, Consumer<apu> e) {
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

   public Collection<sk> b() {
      return this.c;
   }

   public Consumer<apu> c() {
      return this.d;
   }

   public Consumer<apu> d() {
      return this.e;
   }
}
