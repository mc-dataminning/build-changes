import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gfn {
   private final List<gfg> a;
   private final gff b;
   private final Map<String, gfn> c = Maps.newHashMap();

   gfn(List<gfg> $$0, gff $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gfn a(String $$0, gfi $$1, gff $$2) {
      gfn $$3 = new gfn($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gfn a(String $$0, gfn $$1) {
      gfn $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gfn a(String $$0) {
      return this.a($$0, gfi.c(), gff.a);
   }

   public gfd a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gfd> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gfn)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gfd.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      gfd $$4 = new gfd($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gfn b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gfn>> a() {
      return this.c.entrySet();
   }

   public gfn a(UnaryOperator<gff> $$0) {
      gfn $$1 = new gfn(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
