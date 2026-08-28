import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class glo {
   private final List<glh> a;
   private final glg b;
   private final Map<String, glo> c = Maps.newHashMap();

   glo(List<glh> $$0, glg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public glo a(String $$0, glj $$1, glg $$2) {
      glo $$3 = new glo($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public glo a(String $$0, glo $$1) {
      glo $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public glo a(String $$0) {
      glo $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No child with name: " + $$0);
      } else {
         return this.a($$0, glj.c(), $$1.b);
      }
   }

   public gle a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gle> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((glo)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gle.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      gle $$4 = new gle($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public glo b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, glo>> a() {
      return this.c.entrySet();
   }

   public glo a(UnaryOperator<glg> $$0) {
      glo $$1 = new glo(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
