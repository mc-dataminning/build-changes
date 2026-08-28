import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fxz {
   private final List<fxt> a;
   private final fxs b;
   private final Map<String, fxz> c = Maps.newHashMap();

   fxz(List<fxt> $$0, fxs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxz a(String $$0, fxv $$1, fxs $$2) {
      fxz $$3 = new fxz($$1.b(), $$2);
      fxz $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fxq a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fxq> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fxz)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fxq.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fxq $$4 = new fxq($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fxz a(String $$0) {
      return this.c.get($$0);
   }
}
