import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class xb implements ve<wx> {
   private final Object2IntMap<apl<?>> a;

   public xb(Object2IntMap<apl<?>> $$0) {
      this.a = $$0;
   }

   public xb(sp $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         apn<?> $$2 = $$1.a(jd.y);
         return a($$0, $$2);
      }, sp::m);
   }

   private static <T> apl<T> a(sp $$0, apn<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a, xb::a, sp::c);
   }

   private static <T> void a(sp $$0, apl<T> $$1) {
      $$0.a(jd.y, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<apl<?>, Integer> a() {
      return this.a;
   }
}
