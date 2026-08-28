import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gew {
   private final List<gep> a;
   private final geo b;
   private final Map<String, gew> c = Maps.newHashMap();

   gew(List<gep> $$0, geo $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gew a(String $$0, ger $$1, geo $$2) {
      gew $$3 = new gew($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gew a(String $$0, gew $$1) {
      gew $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gew a(String $$0) {
      return this.a($$0, ger.c(), geo.a);
   }

   public gem a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gem> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gew)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gem.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      gem $$4 = new gem($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gew b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gew>> a() {
      return this.c.entrySet();
   }

   public gew a(UnaryOperator<geo> $$0) {
      gew $$1 = new gew(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
