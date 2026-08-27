import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class uw implements uo<ur> {
   private final Object2IntMap<amo<?>> a;

   public uw(Object2IntMap<amo<?>> $$0) {
      this.a = $$0;
   }

   public uw(sf $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         amq<?> $$2 = $$1.a(jb.y);
         return a($$0, $$2);
      }, sf::m);
   }

   private static <T> amo<T> a(sf $$0, amq<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a, uw::a, sf::d);
   }

   private static <T> void a(sf $$0, amo<T> $$1) {
      $$0.a(jb.y, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<amo<?>, Integer> a() {
      return this.a;
   }
}
