import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ghn {
   private final List<ghg> a;
   private final ghf b;
   private final Map<String, ghn> c = Maps.newHashMap();

   ghn(List<ghg> $$0, ghf $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ghn a(String $$0, ghi $$1, ghf $$2) {
      ghn $$3 = new ghn($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public ghn a(String $$0, ghn $$1) {
      ghn $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public ghn a(String $$0) {
      ghn $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No child with name: " + $$0);
      } else {
         return this.a($$0, ghi.c(), $$1.b);
      }
   }

   public ghd a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, ghd> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((ghn)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<ghd.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      ghd $$4 = new ghd($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public ghn b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, ghn>> a() {
      return this.c.entrySet();
   }

   public ghn a(UnaryOperator<ghf> $$0) {
      ghn $$1 = new ghn(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
