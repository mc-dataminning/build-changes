import java.util.Collection;
import java.util.function.Consumer;

public record tm(String b, Collection<ts> c, Consumer<ash> d, Consumer<ash> e) {
   public static final String a = "defaultBatch";

   public tm(String b, Collection<ts> c, Consumer<ash> d, Consumer<ash> e) {
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

   public Collection<ts> b() {
      return this.c;
   }

   public Consumer<ash> c() {
      return this.d;
   }

   public Consumer<ash> d() {
      return this.e;
   }
}
