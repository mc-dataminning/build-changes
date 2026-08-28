import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class gir {
   private final Map<all, hav> a = new HashMap<>();
   private final Supplier<hav> b;
   private final Function<all, hav> c;

   public gir(hbi $$0) {
      this.b = $$0::a;
      this.c = $$1 -> $$0.a(hbj.a($$1));
   }

   public hav a(cwf $$0) {
      all $$1 = $$0.a(ku.i);
      return $$1 == null ? this.b.get() : this.a($$1);
   }

   public hav a(all $$0) {
      return this.a.computeIfAbsent($$0, this.c);
   }

   public void a() {
      this.a.clear();
   }
}
