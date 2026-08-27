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

public class la implements kx {
   private final csx a;
   private final List<ld> b;
   private final Set<dgo<?>> c = Sets.newHashSet();
   private final List<lb> d = Lists.newArrayList();

   private la(csx $$0, List<ld> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public la a(lb $$0) {
      $$0.b().forEach($$0x -> {
         if (this.a.l().a($$0x.f()) != $$0x) {
            throw new IllegalStateException("Property " + $$0x + " is not defined for block " + this.a);
         } else if (!this.c.add($$0x)) {
            throw new IllegalStateException("Values of property " + $$0x + " already defined for block " + this.a);
         }
      });
      this.d.add($$0);
      return this;
   }

   public JsonElement b() {
      Stream<Pair<lc, List<ld>>> $$0 = Stream.of(Pair.of(lc.a(), this.b));

      for (lb $$1 : this.d) {
         Map<lc, List<ld>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               lc $$2x = ((lc)$$1.getFirst()).a((lc)$$1xx.getKey());
               List<ld> $$3 = a((List<ld>)$$1.getSecond(), (List<ld>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((lc)$$1.getFirst()).b(), ld.a((List<ld>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<ld> a(List<ld> $$0, List<ld> $$1) {
      Builder<ld> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(ld.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public csx a() {
      return this.a;
   }

   public static la a(csx $$0) {
      return new la($$0, ImmutableList.of(ld.a()));
   }

   public static la a(csx $$0, ld $$1) {
      return new la($$0, ImmutableList.of($$1));
   }

   public static la a(csx $$0, ld... $$1) {
      return new la($$0, ImmutableList.copyOf($$1));
   }
}
