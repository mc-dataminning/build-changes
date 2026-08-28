import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class gla {
   private final Map<alp, hdi> a = new HashMap<>();
   private final Supplier<hdi> b;
   private final Function<alp, hdi> c;

   public gla(hdv $$0) {
      this.b = $$0::a;
      this.c = $$1 -> $$0.a(hdw.a($$1));
   }

   public hdi a(cxg $$0) {
      alp $$1 = $$0.a(ku.i);
      return $$1 == null ? this.b.get() : this.a($$1);
   }

   public hdi a(alp $$0) {
      return this.a.computeIfAbsent($$0, this.c);
   }

   public void a() {
      this.a.clear();
   }
}
