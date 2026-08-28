import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gav {
   private final List<gao> a;
   private final gan b;
   private final Map<String, gav> c = Maps.newHashMap();

   gav(List<gao> $$0, gan $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gav a(String $$0, gaq $$1, gan $$2) {
      gav $$3 = new gav($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gav a(String $$0, gav $$1) {
      gav $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gav a(String $$0) {
      return this.a($$0, gaq.c(), gan.a);
   }

   public gal a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gal> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gav)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gal.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      gal $$4 = new gal($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gav b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gav>> a() {
      return this.c.entrySet();
   }

   public gav a(UnaryOperator<gan> $$0) {
      gav $$1 = new gav(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
