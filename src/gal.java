import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gal {
   private final List<gae> a;
   private final gad b;
   private final Map<String, gal> c = Maps.newHashMap();

   gal(List<gae> $$0, gad $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gal a(String $$0, gag $$1, gad $$2) {
      gal $$3 = new gal($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gal a(String $$0, gal $$1) {
      gal $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gal a(String $$0) {
      return this.a($$0, gag.c(), gad.a);
   }

   public gab a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gab> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gal)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gab.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      gab $$4 = new gab($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gal b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gal>> a() {
      return this.c.entrySet();
   }

   public gal a(UnaryOperator<gad> $$0) {
      gal $$1 = new gal(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
