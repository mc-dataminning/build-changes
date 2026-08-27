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

public class md implements ma {
   private final cwj a;
   private final List<mg> b;
   private final Set<dkd<?>> c = Sets.newHashSet();
   private final List<me> d = Lists.newArrayList();

   private md(cwj $$0, List<mg> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public md a(me $$0) {
      $$0.b().forEach($$0x -> {
         if (this.a.n().a($$0x.f()) != $$0x) {
            throw new IllegalStateException("Property " + $$0x + " is not defined for block " + this.a);
         } else if (!this.c.add($$0x)) {
            throw new IllegalStateException("Values of property " + $$0x + " already defined for block " + this.a);
         }
      });
      this.d.add($$0);
      return this;
   }

   public JsonElement b() {
      Stream<Pair<mf, List<mg>>> $$0 = Stream.of(Pair.of(mf.a(), this.b));

      for (me $$1 : this.d) {
         Map<mf, List<mg>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               mf $$2x = ((mf)$$1.getFirst()).a((mf)$$1xx.getKey());
               List<mg> $$3 = a((List<mg>)$$1.getSecond(), (List<mg>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((mf)$$1.getFirst()).b(), mg.a((List<mg>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<mg> a(List<mg> $$0, List<mg> $$1) {
      Builder<mg> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(mg.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public cwj a() {
      return this.a;
   }

   public static md a(cwj $$0) {
      return new md($$0, ImmutableList.of(mg.a()));
   }

   public static md a(cwj $$0, mg $$1) {
      return new md($$0, ImmutableList.of($$1));
   }

   public static md a(cwj $$0, mg... $$1) {
      return new md($$0, ImmutableList.copyOf($$1));
   }
}
