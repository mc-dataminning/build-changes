import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fxk {
   private final List<fxe> a;
   private final fxd b;
   private final Map<String, fxk> c = Maps.newHashMap();

   fxk(List<fxe> $$0, fxd $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxk a(String $$0, fxg $$1, fxd $$2) {
      fxk $$3 = new fxk($$1.b(), $$2);
      fxk $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fxb a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fxb> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fxk)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fxb.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fxb $$4 = new fxb($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fxk a(String $$0) {
      return this.c.get($$0);
   }
}
