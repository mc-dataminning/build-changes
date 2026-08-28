import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class get {
   private final List<gem> a;
   private final gel b;
   private final Map<String, get> c = Maps.newHashMap();

   get(List<gem> $$0, gel $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public get a(String $$0, geo $$1, gel $$2) {
      get $$3 = new get($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public get a(String $$0, get $$1) {
      get $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public get a(String $$0) {
      return this.a($$0, geo.c(), gel.a);
   }

   public gej a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gej> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((get)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gej.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      gej $$4 = new gej($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public get b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, get>> a() {
      return this.c.entrySet();
   }

   public get a(UnaryOperator<gel> $$0) {
      get $$1 = new get(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
