import java.util.Collection;
import java.util.function.Consumer;

public record rm(String b, Collection<rs> c, Consumer<aov> d, Consumer<aov> e) {
   public static final String a = "defaultBatch";

   public rm(String b, Collection<rs> c, Consumer<aov> d, Consumer<aov> e) {
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

   public Collection<rs> b() {
      return this.c;
   }

   public Consumer<aov> c() {
      return this.d;
   }

   public Consumer<aov> d() {
      return this.e;
   }
}
