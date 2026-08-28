import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gkd {
   private final List<gjw> a;
   private final gjv b;
   private final Map<String, gkd> c = Maps.newHashMap();

   gkd(List<gjw> $$0, gjv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gkd a(String $$0, gjy $$1, gjv $$2) {
      gkd $$3 = new gkd($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gkd a(String $$0, gkd $$1) {
      gkd $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gkd a(String $$0) {
      gkd $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No child with name: " + $$0);
      } else {
         return this.a($$0, gjy.c(), $$1.b);
      }
   }

   public gjt a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gjt> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gkd)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gjt.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      gjt $$4 = new gjt($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gkd b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gkd>> a() {
      return this.c.entrySet();
   }

   public gkd a(UnaryOperator<gjv> $$0) {
      gkd $$1 = new gkd(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
