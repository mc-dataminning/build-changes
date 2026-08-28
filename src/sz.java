import java.util.Collection;
import java.util.function.Consumer;

public record sz(String b, Collection<tf> c, Consumer<arn> d, Consumer<arn> e) {
   public static final String a = "defaultBatch";

   public sz(String b, Collection<tf> c, Consumer<arn> d, Consumer<arn> e) {
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

   public Collection<tf> b() {
      return this.c;
   }

   public Consumer<arn> c() {
      return this.d;
   }

   public Consumer<arn> d() {
      return this.e;
   }
}
