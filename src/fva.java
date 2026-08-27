import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fva {
   private final List<fuu> a;
   private final fut b;
   private final Map<String, fva> c = Maps.newHashMap();

   fva(List<fuu> $$0, fut $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fva a(String $$0, fuw $$1, fut $$2) {
      fva $$3 = new fva($$1.b(), $$2);
      fva $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fur a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fur> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fva)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fur.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fur $$4 = new fur($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fva a(String $$0) {
      return this.c.get($$0);
   }
}
