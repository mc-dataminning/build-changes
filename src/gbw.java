import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gbw {
   private final List<gbp> a;
   private final gbo b;
   private final Map<String, gbw> c = Maps.newHashMap();

   gbw(List<gbp> $$0, gbo $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gbw a(String $$0, gbr $$1, gbo $$2) {
      gbw $$3 = new gbw($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gbw a(String $$0, gbw $$1) {
      gbw $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gbw a(String $$0) {
      return this.a($$0, gbr.c(), gbo.a);
   }

   public gbm a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gbm> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gbw)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gbm.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      gbm $$4 = new gbm($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gbw b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gbw>> a() {
      return this.c.entrySet();
   }

   public gbw a(UnaryOperator<gbo> $$0) {
      gbw $$1 = new gbw(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
