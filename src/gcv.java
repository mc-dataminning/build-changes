import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gcv {
   private final List<gco> a;
   private final gcn b;
   private final Map<String, gcv> c = Maps.newHashMap();

   gcv(List<gco> $$0, gcn $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gcv a(String $$0, gcq $$1, gcn $$2) {
      gcv $$3 = new gcv($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gcv a(String $$0, gcv $$1) {
      gcv $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gcv a(String $$0) {
      return this.a($$0, gcq.c(), gcn.a);
   }

   public gcl a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gcl> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gcv)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gcl.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      gcl $$4 = new gcl($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gcv b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gcv>> a() {
      return this.c.entrySet();
   }

   public gcv a(UnaryOperator<gcn> $$0) {
      gcv $$1 = new gcv(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
