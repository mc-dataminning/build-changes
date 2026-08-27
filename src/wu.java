import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class wu implements ux<wp> {
   private final Object2IntMap<apd<?>> a;

   public wu(Object2IntMap<apd<?>> $$0) {
      this.a = $$0;
   }

   public wu(si $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         apf<?> $$2 = $$1.a(jb.y);
         return a($$0, $$2);
      }, si::m);
   }

   private static <T> apd<T> a(si $$0, apf<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a, wu::a, si::c);
   }

   private static <T> void a(si $$0, apd<T> $$1) {
      $$0.a(jb.y, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<apd<?>, Integer> a() {
      return this.a;
   }
}
