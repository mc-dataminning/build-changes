import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fxr {
   private final List<fxl> a;
   private final fxk b;
   private final Map<String, fxr> c = Maps.newHashMap();

   fxr(List<fxl> $$0, fxk $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fxr a(String $$0, fxn $$1, fxk $$2) {
      fxr $$3 = new fxr($$1.b(), $$2);
      fxr $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fxi a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fxi> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fxr)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fxi.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fxi $$4 = new fxi($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fxr a(String $$0) {
      return this.c.get($$0);
   }
}
