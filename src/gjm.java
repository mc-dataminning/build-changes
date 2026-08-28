import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gjm {
   private final List<gjf> a;
   private final gje b;
   private final Map<String, gjm> c = Maps.newHashMap();

   gjm(List<gjf> $$0, gje $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gjm a(String $$0, gjh $$1, gje $$2) {
      gjm $$3 = new gjm($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gjm a(String $$0, gjm $$1) {
      gjm $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gjm a(String $$0) {
      gjm $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No child with name: " + $$0);
      } else {
         return this.a($$0, gjh.c(), $$1.b);
      }
   }

   public gjc a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gjc> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gjm)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gjc.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      gjc $$4 = new gjc($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gjm b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gjm>> a() {
      return this.c.entrySet();
   }

   public gjm a(UnaryOperator<gje> $$0) {
      gjm $$1 = new gjm(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
