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

public class mj implements mg {
   private final czf a;
   private final List<mm> b;
   private final Set<dnh<?>> c = Sets.newHashSet();
   private final List<mk> d = Lists.newArrayList();

   private mj(czf $$0, List<mm> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public mj a(mk $$0) {
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
      Stream<Pair<ml, List<mm>>> $$0 = Stream.of(Pair.of(ml.a(), this.b));

      for (mk $$1 : this.d) {
         Map<ml, List<mm>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               ml $$2x = ((ml)$$1.getFirst()).a((ml)$$1xx.getKey());
               List<mm> $$3 = a((List<mm>)$$1.getSecond(), (List<mm>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((ml)$$1.getFirst()).b(), mm.a((List<mm>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<mm> a(List<mm> $$0, List<mm> $$1) {
      Builder<mm> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(mm.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public czf a() {
      return this.a;
   }

   public static mj a(czf $$0) {
      return new mj($$0, ImmutableList.of(mm.a()));
   }

   public static mj a(czf $$0, mm $$1) {
      return new mj($$0, ImmutableList.of($$1));
   }

   public static mj a(czf $$0, mm... $$1) {
      return new mj($$0, ImmutableList.copyOf($$1));
   }
}
