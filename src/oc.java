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

public class oc implements nz {
   private final die a;
   private final List<of> b;
   private final Set<dwm<?>> c = Sets.newHashSet();
   private final List<od> d = Lists.newArrayList();

   private oc(die $$0, List<of> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public oc a(od $$0) {
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
      Stream<Pair<oe, List<of>>> $$0 = Stream.of(Pair.of(oe.a(), this.b));

      for (od $$1 : this.d) {
         Map<oe, List<of>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               oe $$2x = ((oe)$$1.getFirst()).a((oe)$$1xx.getKey());
               List<of> $$3 = a((List<of>)$$1.getSecond(), (List<of>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((oe)$$1.getFirst()).b(), of.a((List<of>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ae.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<of> a(List<of> $$0, List<of> $$1) {
      Builder<of> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(of.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public die a() {
      return this.a;
   }

   public static oc a(die $$0) {
      return new oc($$0, ImmutableList.of(of.a()));
   }

   public static oc a(die $$0, of $$1) {
      return new oc($$0, ImmutableList.of($$1));
   }

   public static oc a(die $$0, of... $$1) {
      return new oc($$0, ImmutableList.copyOf($$1));
   }
}
