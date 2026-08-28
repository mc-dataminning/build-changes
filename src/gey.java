import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gey {
   private final List<ger> a;
   private final geq b;
   private final Map<String, gey> c = Maps.newHashMap();

   gey(List<ger> $$0, geq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gey a(String $$0, get $$1, geq $$2) {
      gey $$3 = new gey($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gey a(String $$0, gey $$1) {
      gey $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gey a(String $$0) {
      return this.a($$0, get.c(), geq.a);
   }

   public geo a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, geo> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gey)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<geo.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      geo $$4 = new geo($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gey b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gey>> a() {
      return this.c.entrySet();
   }

   public gey a(UnaryOperator<geq> $$0) {
      gey $$1 = new gey(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
