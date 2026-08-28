import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fxi {
   private final List<fxc> a;
   private final fxb b;
   private final Map<String, fxi> c = Maps.newHashMap();

   fxi(List<fxc> $$0, fxb $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxi a(String $$0, fxe $$1, fxb $$2) {
      fxi $$3 = new fxi($$1.b(), $$2);
      fxi $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fwz a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fwz> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fxi)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fwz.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fwz $$4 = new fwz($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fxi a(String $$0) {
      return this.c.get($$0);
   }
}
