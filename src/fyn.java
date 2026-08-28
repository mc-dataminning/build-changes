import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fyn {
   private final List<fyh> a;
   private final fyg b;
   private final Map<String, fyn> c = Maps.newHashMap();

   fyn(List<fyh> $$0, fyg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fyn a(String $$0, fyj $$1, fyg $$2) {
      fyn $$3 = new fyn($$1.b(), $$2);
      fyn $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fye a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fye> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fyn)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fye.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fye $$4 = new fye($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fyn a(String $$0) {
      return this.c.get($$0);
   }
}
