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

public class oi implements of {
   private final dke a;
   private final List<ol> b;
   private final Set<dyp<?>> c = Sets.newHashSet();
   private final List<oj> d = Lists.newArrayList();

   private oi(dke $$0, List<ol> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public oi a(oj $$0) {
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
      Stream<Pair<ok, List<ol>>> $$0 = Stream.of(Pair.of(ok.a(), this.b));

      for (oj $$1 : this.d) {
         Map<ok, List<ol>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               ok $$2x = ((ok)$$1.getFirst()).a((ok)$$1xx.getKey());
               List<ol> $$3 = a((List<ol>)$$1.getSecond(), (List<ol>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((ok)$$1.getFirst()).b(), ol.a((List<ol>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ae.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<ol> a(List<ol> $$0, List<ol> $$1) {
      Builder<ol> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(ol.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dke a() {
      return this.a;
   }

   public static oi a(dke $$0) {
      return new oi($$0, ImmutableList.of(ol.a()));
   }

   public static oi a(dke $$0, ol $$1) {
      return new oi($$0, ImmutableList.of($$1));
   }

   public static oi a(dke $$0, ol... $$1) {
      return new oi($$0, ImmutableList.copyOf($$1));
   }
}
