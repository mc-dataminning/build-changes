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

public class oe implements ob {
   private final dkd a;
   private final List<oh> b;
   private final Set<dyq<?>> c = Sets.newHashSet();
   private final List<of> d = Lists.newArrayList();

   private oe(dkd $$0, List<oh> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public oe a(of $$0) {
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
      Stream<Pair<og, List<oh>>> $$0 = Stream.of(Pair.of(og.a(), this.b));

      for (of $$1 : this.d) {
         Map<og, List<oh>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               og $$2x = ((og)$$1.getFirst()).a((og)$$1xx.getKey());
               List<oh> $$3 = a((List<oh>)$$1.getSecond(), (List<oh>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((og)$$1.getFirst()).b(), oh.a((List<oh>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ae.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<oh> a(List<oh> $$0, List<oh> $$1) {
      Builder<oh> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(oh.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dkd a() {
      return this.a;
   }

   public static oe a(dkd $$0) {
      return new oe($$0, ImmutableList.of(oh.a()));
   }

   public static oe a(dkd $$0, oh $$1) {
      return new oe($$0, ImmutableList.of($$1));
   }

   public static oe a(dkd $$0, oh... $$1) {
      return new oe($$0, ImmutableList.copyOf($$1));
   }
}
