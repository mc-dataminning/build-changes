import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gfo {
   private final List<gfh> a;
   private final gfg b;
   private final Map<String, gfo> c = Maps.newHashMap();

   gfo(List<gfh> $$0, gfg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gfo a(String $$0, gfj $$1, gfg $$2) {
      gfo $$3 = new gfo($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gfo a(String $$0, gfo $$1) {
      gfo $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gfo a(String $$0) {
      return this.a($$0, gfj.c(), gfg.a);
   }

   public gfe a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gfe> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gfo)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gfe.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      gfe $$4 = new gfe($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gfo b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gfo>> a() {
      return this.c.entrySet();
   }

   public gfo a(UnaryOperator<gfg> $$0) {
      gfo $$1 = new gfo(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
