import java.util.Collection;
import java.util.function.Consumer;

public record tc(String b, Collection<ti> c, Consumer<arq> d, Consumer<arq> e) {
   public static final String a = "defaultBatch";

   public tc(String b, Collection<ti> c, Consumer<arq> d, Consumer<arq> e) {
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

   public Collection<ti> b() {
      return this.c;
   }

   public Consumer<arq> c() {
      return this.d;
   }

   public Consumer<arq> d() {
      return this.e;
   }
}
