import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fvk {
   private final List<fve> a;
   private final fvd b;
   private final Map<String, fvk> c = Maps.newHashMap();

   fvk(List<fve> $$0, fvd $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fvk a(String $$0, fvg $$1, fvd $$2) {
      fvk $$3 = new fvk($$1.b(), $$2);
      fvk $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fvb a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fvb> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fvk)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fvb.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fvb $$4 = new fvb($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fvk a(String $$0) {
      return this.c.get($$0);
   }
}
