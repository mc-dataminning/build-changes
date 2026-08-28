import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class ny implements nv {
   private final dhm a;
   private final List<ob> b;
   private final Set<dvv<?>> c = Sets.newHashSet();
   private final List<nz> d = Lists.newArrayList();

   private ny(dhm $$0, List<ob> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ny a(nz $$0) {
      $$0.b().forEach($$0x -> {
         if (this.a.k().a($$0x.f()) != $$0x) {
            throw new IllegalStateException("Property " + $$0x + " is not defined for block " + this.a);
         } else if (!this.c.add($$0x)) {
            throw new IllegalStateException("Values of property " + $$0x + " already defined for block " + this.a);
         }
      });
      this.d.add($$0);
      return this;
   }

   public JsonElement b() {
      Stream<Pair<oa, List<ob>>> $$0 = Stream.of(Pair.of(oa.a(), this.b));

      for (nz $$1 : this.d) {
         Map<oa, List<ob>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               oa $$2x = ((oa)$$1.getFirst()).a((oa)$$1xx.getKey());
               List<ob> $$3 = a((List<ob>)$$1.getSecond(), (List<ob>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((oa)$$1.getFirst()).b(), ob.a((List<ob>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ad.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<ob> a(List<ob> $$0, List<ob> $$1) {
      Builder<ob> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(ob.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dhm a() {
      return this.a;
   }

   public static ny a(dhm $$0) {
      return new ny($$0, ImmutableList.of(ob.a()));
   }

   public static ny a(dhm $$0, ob $$1) {
      return new ny($$0, ImmutableList.of($$1));
   }

   public static ny a(dhm $$0, ob... $$1) {
      return new ny($$0, ImmutableList.copyOf($$1));
   }
}
