import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fxl {
   private final List<fxf> a;
   private final fxe b;
   private final Map<String, fxl> c = Maps.newHashMap();

   fxl(List<fxf> $$0, fxe $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxl a(String $$0, fxh $$1, fxe $$2) {
      fxl $$3 = new fxl($$1.b(), $$2);
      fxl $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fxc a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fxc> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fxl)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fxc.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fxc $$4 = new fxc($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fxl a(String $$0) {
      return this.c.get($$0);
   }
}
