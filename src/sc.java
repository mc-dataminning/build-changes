import java.util.Collection;
import java.util.function.Consumer;

public record sc(String b, Collection<si> c, Consumer<aps> d, Consumer<aps> e) {
   public static final String a = "defaultBatch";

   public sc(String b, Collection<si> c, Consumer<aps> d, Consumer<aps> e) {
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

   public Collection<si> b() {
      return this.c;
   }

   public Consumer<aps> c() {
      return this.d;
   }

   public Consumer<aps> d() {
      return this.e;
   }
}
