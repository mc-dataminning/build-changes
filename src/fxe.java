import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fxe {
   private final List<fwy> a;
   private final fwx b;
   private final Map<String, fxe> c = Maps.newHashMap();

   fxe(List<fwy> $$0, fwx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxe a(String $$0, fxa $$1, fwx $$2) {
      fxe $$3 = new fxe($$1.b(), $$2);
      fxe $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fwv a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fwv> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fxe)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fwv.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fwv $$4 = new fwv($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fxe a(String $$0) {
      return this.c.get($$0);
   }
}
