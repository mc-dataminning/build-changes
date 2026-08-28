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

public class ob implements ny {
   private final dhy a;
   private final List<oe> b;
   private final Set<dwg<?>> c = Sets.newHashSet();
   private final List<oc> d = Lists.newArrayList();

   private ob(dhy $$0, List<oe> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ob a(oc $$0) {
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
      Stream<Pair<od, List<oe>>> $$0 = Stream.of(Pair.of(od.a(), this.b));

      for (oc $$1 : this.d) {
         Map<od, List<oe>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               od $$2x = ((od)$$1.getFirst()).a((od)$$1xx.getKey());
               List<oe> $$3 = a((List<oe>)$$1.getSecond(), (List<oe>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((od)$$1.getFirst()).b(), oe.a((List<oe>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ad.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<oe> a(List<oe> $$0, List<oe> $$1) {
      Builder<oe> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(oe.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dhy a() {
      return this.a;
   }

   public static ob a(dhy $$0) {
      return new ob($$0, ImmutableList.of(oe.a()));
   }

   public static ob a(dhy $$0, oe $$1) {
      return new ob($$0, ImmutableList.of($$1));
   }

   public static ob a(dhy $$0, oe... $$1) {
      return new ob($$0, ImmutableList.copyOf($$1));
   }
}
