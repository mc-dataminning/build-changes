import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class wt implements uw<wo> {
   private final Object2IntMap<apb<?>> a;

   public wt(Object2IntMap<apb<?>> $$0) {
      this.a = $$0;
   }

   public wt(sh $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         apd<?> $$2 = $$1.a(jc.y);
         return a($$0, $$2);
      }, sh::m);
   }

   private static <T> apb<T> a(sh $$0, apd<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a, wt::a, sh::c);
   }

   private static <T> void a(sh $$0, apb<T> $$1) {
      $$0.a(jc.y, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<apb<?>, Integer> a() {
      return this.a;
   }
}
