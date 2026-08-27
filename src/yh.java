import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class yh implements wk<yd> {
   private final Object2IntMap<aqy<?>> a;

   public yh(Object2IntMap<aqy<?>> $$0) {
      this.a = $$0;
   }

   public yh(tu $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         ara<?> $$2 = $$1.a(jy.y);
         return a($$0, $$2);
      }, tu::n);
   }

   private static <T> aqy<T> a(tu $$0, ara<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, yh::a, tu::c);
   }

   private static <T> void a(tu $$0, aqy<T> $$1) {
      $$0.a(jy.y, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<aqy<?>, Integer> a() {
      return this.a;
   }
}
