import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fxx {
   private final List<fxr> a;
   private final fxq b;
   private final Map<String, fxx> c = Maps.newHashMap();

   fxx(List<fxr> $$0, fxq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxx a(String $$0, fxt $$1, fxq $$2) {
      fxx $$3 = new fxx($$1.b(), $$2);
      fxx $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fxo a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fxo> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fxx)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fxo.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fxo $$4 = new fxo($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fxx a(String $$0) {
      return this.c.get($$0);
   }
}
