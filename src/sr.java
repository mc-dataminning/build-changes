import java.util.Collection;
import java.util.function.Consumer;

public record sr(String b, Collection<sx> c, Consumer<aqu> d, Consumer<aqu> e) {
   public static final String a = "defaultBatch";

   public sr(String b, Collection<sx> c, Consumer<aqu> d, Consumer<aqu> e) {
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

   public Collection<sx> b() {
      return this.c;
   }

   public Consumer<aqu> c() {
      return this.d;
   }

   public Consumer<aqu> d() {
      return this.e;
   }
}
