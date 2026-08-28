import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ggm {
   private final List<ggf> a;
   private final gge b;
   private final Map<String, ggm> c = Maps.newHashMap();

   ggm(List<ggf> $$0, gge $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ggm a(String $$0, ggh $$1, gge $$2) {
      ggm $$3 = new ggm($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public ggm a(String $$0, ggm $$1) {
      ggm $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public ggm a(String $$0) {
      return this.a($$0, ggh.c(), gge.a);
   }

   public ggc a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, ggc> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((ggm)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<ggc.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      ggc $$4 = new ggc($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public ggm b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, ggm>> a() {
      return this.c.entrySet();
   }

   public ggm a(UnaryOperator<gge> $$0) {
      ggm $$1 = new ggm(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
