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

public class nm implements nj {
   private final ddy a;
   private final List<np> b;
   private final Set<dse<?>> c = Sets.newHashSet();
   private final List<nn> d = Lists.newArrayList();

   private nm(ddy $$0, List<np> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public nm a(nn $$0) {
      $$0.b().forEach($$0x -> {
         if (this.a.m().a($$0x.f()) != $$0x) {
            throw new IllegalStateException("Property " + $$0x + " is not defined for block " + this.a);
         } else if (!this.c.add($$0x)) {
            throw new IllegalStateException("Values of property " + $$0x + " already defined for block " + this.a);
         }
      });
      this.d.add($$0);
      return this;
   }

   public JsonElement b() {
      Stream<Pair<no, List<np>>> $$0 = Stream.of(Pair.of(no.a(), this.b));

      for (nn $$1 : this.d) {
         Map<no, List<np>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               no $$2x = ((no)$$1.getFirst()).a((no)$$1xx.getKey());
               List<np> $$3 = a((List<np>)$$1.getSecond(), (List<np>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((no)$$1.getFirst()).b(), np.a((List<np>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<np> a(List<np> $$0, List<np> $$1) {
      Builder<np> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(np.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public ddy a() {
      return this.a;
   }

   public static nm a(ddy $$0) {
      return new nm($$0, ImmutableList.of(np.a()));
   }

   public static nm a(ddy $$0, np $$1) {
      return new nm($$0, ImmutableList.of($$1));
   }

   public static nm a(ddy $$0, np... $$1) {
      return new nm($$0, ImmutableList.copyOf($$1));
   }
}
