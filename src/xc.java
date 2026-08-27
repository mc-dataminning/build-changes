import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class xc implements vf<wy> {
   private final Object2IntMap<apm<?>> a;

   public xc(Object2IntMap<apm<?>> $$0) {
      this.a = $$0;
   }

   public xc(sq $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         apo<?> $$2 = $$1.a(jd.y);
         return a($$0, $$2);
      }, sq::m);
   }

   private static <T> apm<T> a(sq $$0, apo<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a, xc::a, sq::c);
   }

   private static <T> void a(sq $$0, apm<T> $$1) {
      $$0.a(jd.y, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<apm<?>, Integer> a() {
      return this.a;
   }
}
