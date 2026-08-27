import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class zb implements xd<yx> {
   private final Object2IntMap<art<?>> a;

   public zb(Object2IntMap<art<?>> $$0) {
      this.a = $$0;
   }

   public zb(ug $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         arv<?> $$2 = $$1.a(kd.x);
         return a($$0, $$2);
      }, ug::n);
   }

   private static <T> art<T> a(ug $$0, arv<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a, zb::a, ug::c);
   }

   private static <T> void a(ug $$0, art<T> $$1) {
      $$0.a(kd.x, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<art<?>, Integer> a() {
      return this.a;
   }
}
