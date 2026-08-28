import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class glq {
   private final List<glj> a;
   private final gli b;
   private final Map<String, glq> c = Maps.newHashMap();

   glq(List<glj> $$0, gli $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public glq a(String $$0, gll $$1, gli $$2) {
      glq $$3 = new glq($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public glq a(String $$0, glq $$1) {
      glq $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public glq a(String $$0) {
      glq $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No child with name: " + $$0);
      } else {
         return this.a($$0, gll.c(), $$1.b);
      }
   }

   public glg a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, glg> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((glq)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<glg.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      glg $$4 = new glg($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public glq b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, glq>> a() {
      return this.c.entrySet();
   }

   public glq a(UnaryOperator<gli> $$0) {
      glq $$1 = new glq(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
