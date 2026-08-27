import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class ys implements wu<yo> {
   private final Object2IntMap<arj<?>> a;

   public ys(Object2IntMap<arj<?>> $$0) {
      this.a = $$0;
   }

   public ys(ue $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         arl<?> $$2 = $$1.a(kb.x);
         return a($$0, $$2);
      }, ue::n);
   }

   private static <T> arj<T> a(ue $$0, arl<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a, ys::a, ue::c);
   }

   private static <T> void a(ue $$0, arj<T> $$1) {
      $$0.a(kb.x, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<arj<?>, Integer> a() {
      return this.a;
   }
}
