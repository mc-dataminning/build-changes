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

public class od implements oa {
   private final dij a;
   private final List<og> b;
   private final Set<dwq<?>> c = Sets.newHashSet();
   private final List<oe> d = Lists.newArrayList();

   private od(dij $$0, List<og> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public od a(oe $$0) {
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
      Stream<Pair<of, List<og>>> $$0 = Stream.of(Pair.of(of.a(), this.b));

      for (oe $$1 : this.d) {
         Map<of, List<og>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               of $$2x = ((of)$$1.getFirst()).a((of)$$1xx.getKey());
               List<og> $$3 = a((List<og>)$$1.getSecond(), (List<og>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((of)$$1.getFirst()).b(), og.a((List<og>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ae.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<og> a(List<og> $$0, List<og> $$1) {
      Builder<og> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(og.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dij a() {
      return this.a;
   }

   public static od a(dij $$0) {
      return new od($$0, ImmutableList.of(og.a()));
   }

   public static od a(dij $$0, og $$1) {
      return new od($$0, ImmutableList.of($$1));
   }

   public static od a(dij $$0, og... $$1) {
      return new od($$0, ImmutableList.copyOf($$1));
   }
}
