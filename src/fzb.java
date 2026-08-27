import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fzb {
   private final List<fyv> a;
   private final fyu b;
   private final Map<String, fzb> c = Maps.newHashMap();

   fzb(List<fyv> $$0, fyu $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fzb a(String $$0, fyx $$1, fyu $$2) {
      fzb $$3 = new fzb($$1.b(), $$2);
      fzb $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fys a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fys> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fzb)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fys.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fys $$4 = new fys($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fzb a(String $$0) {
      return this.c.get($$0);
   }
}
