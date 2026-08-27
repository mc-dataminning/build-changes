import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class yl implements wo<yh> {
   private final Object2IntMap<arc<?>> a;

   public yl(Object2IntMap<arc<?>> $$0) {
      this.a = $$0;
   }

   public yl(ty $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         are<?> $$2 = $$1.a(kc.y);
         return a($$0, $$2);
      }, ty::n);
   }

   private static <T> arc<T> a(ty $$0, are<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a, yl::a, ty::c);
   }

   private static <T> void a(ty $$0, arc<T> $$1) {
      $$0.a(kc.y, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<arc<?>, Integer> a() {
      return this.a;
   }
}
