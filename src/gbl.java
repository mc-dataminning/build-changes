import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gbl {
   private final List<gbe> a;
   private final gbd b;
   private final Map<String, gbl> c = Maps.newHashMap();

   gbl(List<gbe> $$0, gbd $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gbl a(String $$0, gbg $$1, gbd $$2) {
      gbl $$3 = new gbl($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gbl a(String $$0, gbl $$1) {
      gbl $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gbl a(String $$0) {
      return this.a($$0, gbg.c(), gbd.a);
   }

   public gbb a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gbb> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gbl)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gbb.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      gbb $$4 = new gbb($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gbl b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gbl>> a() {
      return this.c.entrySet();
   }

   public gbl a(UnaryOperator<gbd> $$0) {
      gbl $$1 = new gbl(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
