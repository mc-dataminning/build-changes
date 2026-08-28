import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fyr {
   private final List<fyl> a;
   private final fyk b;
   private final Map<String, fyr> c = Maps.newHashMap();

   fyr(List<fyl> $$0, fyk $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fyr a(String $$0, fyn $$1, fyk $$2) {
      fyr $$3 = new fyr($$1.b(), $$2);
      fyr $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fyi a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fyi> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fyr)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fyi.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fyi $$4 = new fyi($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fyr a(String $$0) {
      return this.c.get($$0);
   }
}
