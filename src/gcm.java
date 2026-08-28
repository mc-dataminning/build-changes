import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gcm {
   private final List<gcf> a;
   private final gce b;
   private final Map<String, gcm> c = Maps.newHashMap();

   gcm(List<gcf> $$0, gce $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gcm a(String $$0, gch $$1, gce $$2) {
      gcm $$3 = new gcm($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gcm a(String $$0, gcm $$1) {
      gcm $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gcm a(String $$0) {
      return this.a($$0, gch.c(), gce.a);
   }

   public gcc a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gcc> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gcm)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gcc.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      gcc $$4 = new gcc($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gcm b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gcm>> a() {
      return this.c.entrySet();
   }

   public gcm a(UnaryOperator<gce> $$0) {
      gcm $$1 = new gcm(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
