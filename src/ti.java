import java.util.Collection;
import java.util.function.Consumer;

public record ti(String b, Collection<to> c, Consumer<arf> d, Consumer<arf> e) {
   public static final String a = "defaultBatch";

   public ti(String b, Collection<to> c, Consumer<arf> d, Consumer<arf> e) {
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

   public Collection<to> b() {
      return this.c;
   }

   public Consumer<arf> c() {
      return this.d;
   }

   public Consumer<arf> d() {
      return this.e;
   }
}
