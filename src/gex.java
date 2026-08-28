import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gex {
   private final List<geq> a;
   private final gep b;
   private final Map<String, gex> c = Maps.newHashMap();

   gex(List<geq> $$0, gep $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gex a(String $$0, ges $$1, gep $$2) {
      gex $$3 = new gex($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gex a(String $$0, gex $$1) {
      gex $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gex a(String $$0) {
      return this.a($$0, ges.c(), gep.a);
   }

   public gen a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gen> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gex)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gen.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      gen $$4 = new gen($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gex b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gex>> a() {
      return this.c.entrySet();
   }

   public gex a(UnaryOperator<gep> $$0) {
      gex $$1 = new gex(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
