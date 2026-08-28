import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gfm {
   private final List<gff> a;
   private final gfe b;
   private final Map<String, gfm> c = Maps.newHashMap();

   gfm(List<gff> $$0, gfe $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gfm a(String $$0, gfh $$1, gfe $$2) {
      gfm $$3 = new gfm($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gfm a(String $$0, gfm $$1) {
      gfm $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gfm a(String $$0) {
      return this.a($$0, gfh.c(), gfe.a);
   }

   public gfc a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gfc> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gfm)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gfc.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      gfc $$4 = new gfc($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gfm b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gfm>> a() {
      return this.c.entrySet();
   }

   public gfm a(UnaryOperator<gfe> $$0) {
      gfm $$1 = new gfm(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
