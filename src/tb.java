import java.util.Collection;
import java.util.function.Consumer;

public record tb(String b, Collection<th> c, Consumer<arx> d, Consumer<arx> e) {
   public static final String a = "defaultBatch";

   public tb(String b, Collection<th> c, Consumer<arx> d, Consumer<arx> e) {
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

   public Collection<th> b() {
      return this.c;
   }

   public Consumer<arx> c() {
      return this.d;
   }

   public Consumer<arx> d() {
      return this.e;
   }
}
