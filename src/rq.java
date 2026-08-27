import java.util.Collection;
import java.util.function.Consumer;

public record rq(String b, Collection<rw> c, Consumer<apf> d, Consumer<apf> e) {
   public static final String a = "defaultBatch";

   public rq(String b, Collection<rw> c, Consumer<apf> d, Consumer<apf> e) {
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

   public Collection<rw> b() {
      return this.c;
   }

   public Consumer<apf> c() {
      return this.d;
   }

   public Consumer<apf> d() {
      return this.e;
   }
}
