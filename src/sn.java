import java.util.Collection;
import java.util.function.Consumer;

public record sn(String b, Collection<st> c, Consumer<aqk> d, Consumer<aqk> e) {
   public static final String a = "defaultBatch";

   public sn(String b, Collection<st> c, Consumer<aqk> d, Consumer<aqk> e) {
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

   public Collection<st> b() {
      return this.c;
   }

   public Consumer<aqk> c() {
      return this.d;
   }

   public Consumer<aqk> d() {
      return this.e;
   }
}
