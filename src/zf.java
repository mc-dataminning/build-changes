import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class zf implements xg<zb> {
   private final Object2IntMap<asa<?>> a;

   public zf(Object2IntMap<asa<?>> $$0) {
      this.a = $$0;
   }

   public zf(uj $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         asc<?> $$2 = $$1.a(kd.x);
         return a($$0, $$2);
      }, uj::n);
   }

   private static <T> asa<T> a(uj $$0, asc<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a, zf::a, uj::c);
   }

   private static <T> void a(uj $$0, asa<T> $$1) {
      $$0.a(kd.x, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<asa<?>, Integer> a() {
      return this.a;
   }
}
