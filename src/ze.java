import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class ze implements xf<za> {
   private final Object2IntMap<ary<?>> a;

   public ze(Object2IntMap<ary<?>> $$0) {
      this.a = $$0;
   }

   public ze(ui $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         asa<?> $$2 = $$1.a(kd.x);
         return a($$0, $$2);
      }, ui::n);
   }

   private static <T> ary<T> a(ui $$0, asa<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a, ze::a, ui::c);
   }

   private static <T> void a(ui $$0, ary<T> $$1) {
      $$0.a(kd.x, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<ary<?>, Integer> a() {
      return this.a;
   }
}
