import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class wx implements va<ws> {
   private final Object2IntMap<apg<?>> a;

   public wx(Object2IntMap<apg<?>> $$0) {
      this.a = $$0;
   }

   public wx(sl $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         api<?> $$2 = $$1.a(jd.y);
         return a($$0, $$2);
      }, sl::m);
   }

   private static <T> apg<T> a(sl $$0, api<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a, wx::a, sl::c);
   }

   private static <T> void a(sl $$0, apg<T> $$1) {
      $$0.a(jd.y, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<apg<?>, Integer> a() {
      return this.a;
   }
}
