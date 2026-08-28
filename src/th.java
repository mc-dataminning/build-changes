import java.util.Collection;
import java.util.function.Consumer;

public record th(String b, Collection<tn> c, Consumer<are> d, Consumer<are> e) {
   public static final String a = "defaultBatch";

   public th(String b, Collection<tn> c, Consumer<are> d, Consumer<are> e) {
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

   public Consumer<are> c() {
      return this.d;
   }

   public Consumer<are> d() {
      return this.e;
   }
}
