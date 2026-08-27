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

public class ky implements kv {
   private final csv a;
   private final List<lb> b;
   private final Set<dgm<?>> c = Sets.newHashSet();
   private final List<kz> d = Lists.newArrayList();

   private ky(csv $$0, List<lb> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ky a(kz $$0) {
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
      Stream<Pair<la, List<lb>>> $$0 = Stream.of(Pair.of(la.a(), this.b));

      for (kz $$1 : this.d) {
         Map<la, List<lb>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               la $$2x = ((la)$$1.getFirst()).a((la)$$1xx.getKey());
               List<lb> $$3 = a((List<lb>)$$1.getSecond(), (List<lb>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((la)$$1.getFirst()).b(), lb.a((List<lb>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<lb> a(List<lb> $$0, List<lb> $$1) {
      Builder<lb> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(lb.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public csv a() {
      return this.a;
   }

   public static ky a(csv $$0) {
      return new ky($$0, ImmutableList.of(lb.a()));
   }

   public static ky a(csv $$0, lb $$1) {
      return new ky($$0, ImmutableList.of($$1));
   }

   public static ky a(csv $$0, lb... $$1) {
      return new ky($$0, ImmutableList.copyOf($$1));
   }
}
