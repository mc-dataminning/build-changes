import java.util.Collection;
import java.util.function.Consumer;

public record ro(String b, Collection<ru> c, Consumer<apa> d, Consumer<apa> e) {
   public static final String a = "defaultBatch";

   public ro(String b, Collection<ru> c, Consumer<apa> d, Consumer<apa> e) {
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

   public Collection<ru> b() {
      return this.c;
   }

   public Consumer<apa> c() {
      return this.d;
   }

   public Consumer<apa> d() {
      return this.e;
   }
}
