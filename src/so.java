import java.util.Collection;
import java.util.function.Consumer;

public record so(String b, Collection<su> c, Consumer<aqe> d, Consumer<aqe> e) {
   public static final String a = "defaultBatch";

   public so(String b, Collection<su> c, Consumer<aqe> d, Consumer<aqe> e) {
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

   public Collection<su> b() {
      return this.c;
   }

   public Consumer<aqe> c() {
      return this.d;
   }

   public Consumer<aqe> d() {
      return this.e;
   }
}
