import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class xb implements ve<wx> {
   private final Object2IntMap<apn<?>> a;

   public xb(Object2IntMap<apn<?>> $$0) {
      this.a = $$0;
   }

   public xb(so $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         app<?> $$2 = $$1.a(jb.y);
         return a($$0, $$2);
      }, so::n);
   }

   private static <T> apn<T> a(so $$0, app<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, xb::a, so::c);
   }

   private static <T> void a(so $$0, apn<T> $$1) {
      $$0.a(jb.y, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<apn<?>, Integer> a() {
      return this.a;
   }
}
