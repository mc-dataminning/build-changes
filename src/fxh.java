import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fxh {
   private final List<fxb> a;
   private final fxa b;
   private final Map<String, fxh> c = Maps.newHashMap();

   fxh(List<fxb> $$0, fxa $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxh a(String $$0, fxd $$1, fxa $$2) {
      fxh $$3 = new fxh($$1.b(), $$2);
      fxh $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fwy a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fwy> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fxh)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fwy.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fwy $$4 = new fwy($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fxh a(String $$0) {
      return this.c.get($$0);
   }
}
