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

public class ml implements mi {
   private final daa a;
   private final List<mo> b;
   private final Set<doc<?>> c = Sets.newHashSet();
   private final List<mm> d = Lists.newArrayList();

   private ml(daa $$0, List<mo> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ml a(mm $$0) {
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
      Stream<Pair<mn, List<mo>>> $$0 = Stream.of(Pair.of(mn.a(), this.b));

      for (mm $$1 : this.d) {
         Map<mn, List<mo>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               mn $$2x = ((mn)$$1.getFirst()).a((mn)$$1xx.getKey());
               List<mo> $$3 = a((List<mo>)$$1.getSecond(), (List<mo>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((mn)$$1.getFirst()).b(), mo.a((List<mo>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<mo> a(List<mo> $$0, List<mo> $$1) {
      Builder<mo> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(mo.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public daa a() {
      return this.a;
   }

   public static ml a(daa $$0) {
      return new ml($$0, ImmutableList.of(mo.a()));
   }

   public static ml a(daa $$0, mo $$1) {
      return new ml($$0, ImmutableList.of($$1));
   }

   public static ml a(daa $$0, mo... $$1) {
      return new ml($$0, ImmutableList.copyOf($$1));
   }
}
