import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class glf {
   private final Map<alz, hdn> a = new HashMap<>();
   private final Supplier<hdn> b;
   private final Function<alz, hdn> c;

   public glf(hea $$0) {
      this.b = $$0::a;
      this.c = $$1 -> $$0.a(heb.a($$1));
   }

   public hdn a(cxp $$0) {
      alz $$1 = $$0.a(ku.i);
      return $$1 == null ? this.b.get() : this.a($$1);
   }

   public hdn a(alz $$0) {
      return this.a.computeIfAbsent($$0, this.c);
   }

   public void a() {
      this.a.clear();
   }
}
