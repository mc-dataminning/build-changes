import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class xa implements vd<ww> {
   private final Object2IntMap<apk<?>> a;

   public xa(Object2IntMap<apk<?>> $$0) {
      this.a = $$0;
   }

   public xa(so $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         apm<?> $$2 = $$1.a(jb.y);
         return a($$0, $$2);
      }, so::m);
   }

   private static <T> apk<T> a(so $$0, apm<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, xa::a, so::c);
   }

   private static <T> void a(so $$0, apk<T> $$1) {
      $$0.a(jb.y, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<apk<?>, Integer> a() {
      return this.a;
   }
}
