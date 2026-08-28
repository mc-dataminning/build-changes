import java.util.Collection;
import java.util.function.Consumer;

public record th(String b, Collection<tn> c, Consumer<arb> d, Consumer<arb> e) {
   public static final String a = "defaultBatch";

   public th(String b, Collection<tn> c, Consumer<arb> d, Consumer<arb> e) {
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

   public Collection<tn> b() {
      return this.c;
   }

   public Consumer<arb> c() {
      return this.d;
   }

   public Consumer<arb> d() {
      return this.e;
   }
}
