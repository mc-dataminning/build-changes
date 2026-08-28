import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gjy {
   private final List<gjr> a;
   private final gjq b;
   private final Map<String, gjy> c = Maps.newHashMap();

   gjy(List<gjr> $$0, gjq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gjy a(String $$0, gjt $$1, gjq $$2) {
      gjy $$3 = new gjy($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gjy a(String $$0, gjy $$1) {
      gjy $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gjy a(String $$0) {
      gjy $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No child with name: " + $$0);
      } else {
         return this.a($$0, gjt.c(), $$1.b);
      }
   }

   public gjo a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gjo> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gjy)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gjo.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      gjo $$4 = new gjo($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gjy b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gjy>> a() {
      return this.c.entrySet();
   }

   public gjy a(UnaryOperator<gjq> $$0) {
      gjy $$1 = new gjy(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
