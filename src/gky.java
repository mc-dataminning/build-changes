import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class gky {
   private final Map<alz, hdg> a = new HashMap<>();
   private final Supplier<hdg> b;
   private final Function<alz, hdg> c;

   public gky(hdt $$0) {
      this.b = $$0::a;
      this.c = $$1 -> $$0.a(hdu.a($$1));
   }

   public hdg a(cxk $$0) {
      alz $$1 = $$0.a(ku.i);
      return $$1 == null ? this.b.get() : this.a($$1);
   }

   public hdg a(alz $$0) {
      return this.a.computeIfAbsent($$0, this.c);
   }

   public void a() {
      this.a.clear();
   }
}
