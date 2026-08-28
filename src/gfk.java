import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gfk {
   private final List<gfd> a;
   private final gfc b;
   private final Map<String, gfk> c = Maps.newHashMap();

   gfk(List<gfd> $$0, gfc $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gfk a(String $$0, gff $$1, gfc $$2) {
      gfk $$3 = new gfk($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gfk a(String $$0, gfk $$1) {
      gfk $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gfk a(String $$0) {
      return this.a($$0, gff.c(), gfc.a);
   }

   public gfa a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gfa> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gfk)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gfa.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      gfa $$4 = new gfa($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gfk b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gfk>> a() {
      return this.c.entrySet();
   }

   public gfk a(UnaryOperator<gfc> $$0) {
      gfk $$1 = new gfk(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
