import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class xy implements wb<xu> {
   private final Object2IntMap<aqk<?>> a;

   public xy(Object2IntMap<aqk<?>> $$0) {
      this.a = $$0;
   }

   public xy(tl $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         aqm<?> $$2 = $$1.a(jy.y);
         return a($$0, $$2);
      }, tl::n);
   }

   private static <T> aqk<T> a(tl $$0, aqm<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a, xy::a, tl::c);
   }

   private static <T> void a(tl $$0, aqk<T> $$1) {
      $$0.a(jy.y, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<aqk<?>, Integer> a() {
      return this.a;
   }
}
