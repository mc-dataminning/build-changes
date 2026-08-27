import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class xb implements vd<ww> {
   private final Object2IntMap<apl<?>> a;

   public xb(Object2IntMap<apl<?>> $$0) {
      this.a = $$0;
   }

   public xb(so $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         apn<?> $$2 = $$1.a(jd.y);
         return a($$0, $$2);
      }, so::m);
   }

   private static <T> apl<T> a(so $$0, apn<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, xb::a, so::c);
   }

   private static <T> void a(so $$0, apl<T> $$1) {
      $$0.a(jd.y, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<apl<?>, Integer> a() {
      return this.a;
   }
}
