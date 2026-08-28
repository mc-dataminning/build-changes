import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class giq {
   private final List<gij> a;
   private final gii b;
   private final Map<String, giq> c = Maps.newHashMap();

   giq(List<gij> $$0, gii $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public giq a(String $$0, gil $$1, gii $$2) {
      giq $$3 = new giq($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public giq a(String $$0, giq $$1) {
      giq $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public giq a(String $$0) {
      giq $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No child with name: " + $$0);
      } else {
         return this.a($$0, gil.c(), $$1.b);
      }
   }

   public gig a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gig> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((giq)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gig.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      gig $$4 = new gig($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public giq b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, giq>> a() {
      return this.c.entrySet();
   }

   public giq a(UnaryOperator<gii> $$0) {
      giq $$1 = new giq(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
