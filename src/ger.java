import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ger {
   private final List<gek> a;
   private final gej b;
   private final Map<String, ger> c = Maps.newHashMap();

   ger(List<gek> $$0, gej $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ger a(String $$0, gem $$1, gej $$2) {
      ger $$3 = new ger($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public ger a(String $$0, ger $$1) {
      ger $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public ger a(String $$0) {
      return this.a($$0, gem.c(), gej.a);
   }

   public geh a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, geh> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((ger)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<geh.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      geh $$4 = new geh($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public ger b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, ger>> a() {
      return this.c.entrySet();
   }

   public ger a(UnaryOperator<gej> $$0) {
      ger $$1 = new ger(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
