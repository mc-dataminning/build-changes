import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gba {
   private final List<gat> a;
   private final gas b;
   private final Map<String, gba> c = Maps.newHashMap();

   gba(List<gat> $$0, gas $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gba a(String $$0, gav $$1, gas $$2) {
      gba $$3 = new gba($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gba a(String $$0, gba $$1) {
      gba $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gba a(String $$0) {
      return this.a($$0, gav.c(), gas.a);
   }

   public gaq a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gaq> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gba)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gaq.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      gaq $$4 = new gaq($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gba b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gba>> a() {
      return this.c.entrySet();
   }

   public gba a(UnaryOperator<gas> $$0) {
      gba $$1 = new gba(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
