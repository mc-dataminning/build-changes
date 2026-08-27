import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fwf {
   private final List<fvz> a;
   private final fvy b;
   private final Map<String, fwf> c = Maps.newHashMap();

   fwf(List<fvz> $$0, fvy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fwf a(String $$0, fwb $$1, fvy $$2) {
      fwf $$3 = new fwf($$1.b(), $$2);
      fwf $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fvw a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fvw> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fwf)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fvw.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fvw $$4 = new fvw($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fwf a(String $$0) {
      return this.c.get($$0);
   }
}
