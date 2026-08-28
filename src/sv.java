import java.util.Collection;
import java.util.function.Consumer;

public record sv(String b, Collection<tb> c, Consumer<arj> d, Consumer<arj> e) {
   public static final String a = "defaultBatch";

   public sv(String b, Collection<tb> c, Consumer<arj> d, Consumer<arj> e) {
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

   public Collection<tb> b() {
      return this.c;
   }

   public Consumer<arj> c() {
      return this.d;
   }

   public Consumer<arj> d() {
      return this.e;
   }
}
