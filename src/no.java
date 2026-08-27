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

public class no implements nl {
   private final dfc a;
   private final List<nr> b;
   private final Set<duf<?>> c = Sets.newHashSet();
   private final List<np> d = Lists.newArrayList();

   private no(dfc $$0, List<nr> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public no a(np $$0) {
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
      Stream<Pair<nq, List<nr>>> $$0 = Stream.of(Pair.of(nq.a(), this.b));

      for (np $$1 : this.d) {
         Map<nq, List<nr>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               nq $$2x = ((nq)$$1.getFirst()).a((nq)$$1xx.getKey());
               List<nr> $$3 = a((List<nr>)$$1.getSecond(), (List<nr>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((nq)$$1.getFirst()).b(), nr.a((List<nr>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ad.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<nr> a(List<nr> $$0, List<nr> $$1) {
      Builder<nr> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(nr.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dfc a() {
      return this.a;
   }

   public static no a(dfc $$0) {
      return new no($$0, ImmutableList.of(nr.a()));
   }

   public static no a(dfc $$0, nr $$1) {
      return new no($$0, ImmutableList.of($$1));
   }

   public static no a(dfc $$0, nr... $$1) {
      return new no($$0, ImmutableList.copyOf($$1));
   }
}
