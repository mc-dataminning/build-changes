import java.util.Collection;
import java.util.function.Consumer;

public record sy(String b, Collection<te> c, Consumer<arm> d, Consumer<arm> e) {
   public static final String a = "defaultBatch";

   public sy(String b, Collection<te> c, Consumer<arm> d, Consumer<arm> e) {
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

   public Collection<te> b() {
      return this.c;
   }

   public Consumer<arm> c() {
      return this.d;
   }

   public Consumer<arm> d() {
      return this.e;
   }
}
