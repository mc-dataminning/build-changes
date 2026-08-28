import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gje {
   private final List<gix> a;
   private final giw b;
   private final Map<String, gje> c = Maps.newHashMap();

   gje(List<gix> $$0, giw $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gje a(String $$0, giz $$1, giw $$2) {
      gje $$3 = new gje($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gje a(String $$0, gje $$1) {
      gje $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gje a(String $$0) {
      gje $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No child with name: " + $$0);
      } else {
         return this.a($$0, giz.c(), $$1.b);
      }
   }

   public giu a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, giu> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gje)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<giu.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      giu $$4 = new giu($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gje b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gje>> a() {
      return this.c.entrySet();
   }

   public gje a(UnaryOperator<giw> $$0) {
      gje $$1 = new gje(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
