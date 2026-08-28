import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class glb {
   private final List<gku> a;
   private final gkt b;
   private final Map<String, glb> c = Maps.newHashMap();

   glb(List<gku> $$0, gkt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public glb a(String $$0, gkw $$1, gkt $$2) {
      glb $$3 = new glb($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public glb a(String $$0, glb $$1) {
      glb $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public glb a(String $$0) {
      glb $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No child with name: " + $$0);
      } else {
         return this.a($$0, gkw.c(), $$1.b);
      }
   }

   public gkr a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gkr> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((glb)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gkr.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      gkr $$4 = new gkr($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public glb b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, glb>> a() {
      return this.c.entrySet();
   }

   public glb a(UnaryOperator<gkt> $$0) {
      glb $$1 = new glb(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
