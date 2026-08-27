import java.util.Collection;
import java.util.function.Consumer;

public record ta(String b, Collection<tg> c, Consumer<aqt> d, Consumer<aqt> e) {
   public static final String a = "defaultBatch";

   public ta(String b, Collection<tg> c, Consumer<aqt> d, Consumer<aqt> e) {
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

   public Collection<tg> b() {
      return this.c;
   }

   public Consumer<aqt> c() {
      return this.d;
   }

   public Consumer<aqt> d() {
      return this.e;
   }
}
