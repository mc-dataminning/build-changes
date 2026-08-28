import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fyt {
   private final List<fyn> a;
   private final fym b;
   private final Map<String, fyt> c = Maps.newHashMap();

   fyt(List<fyn> $$0, fym $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fyt a(String $$0, fyp $$1, fym $$2) {
      fyt $$3 = new fyt($$1.b(), $$2);
      fyt $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fyk a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fyk> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fyt)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fyk.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fyk $$4 = new fyk($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fyt a(String $$0) {
      return this.c.get($$0);
   }
}
