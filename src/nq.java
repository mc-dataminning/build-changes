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

public class nq implements nn {
   private final dff a;
   private final List<nt> b;
   private final Set<dtk<?>> c = Sets.newHashSet();
   private final List<nr> d = Lists.newArrayList();

   private nq(dff $$0, List<nt> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public nq a(nr $$0) {
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
      Stream<Pair<ns, List<nt>>> $$0 = Stream.of(Pair.of(ns.a(), this.b));

      for (nr $$1 : this.d) {
         Map<ns, List<nt>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               ns $$2x = ((ns)$$1.getFirst()).a((ns)$$1xx.getKey());
               List<nt> $$3 = a((List<nt>)$$1.getSecond(), (List<nt>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((ns)$$1.getFirst()).b(), nt.a((List<nt>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<nt> a(List<nt> $$0, List<nt> $$1) {
      Builder<nt> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(nt.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dff a() {
      return this.a;
   }

   public static nq a(dff $$0) {
      return new nq($$0, ImmutableList.of(nt.a()));
   }

   public static nq a(dff $$0, nt $$1) {
      return new nq($$0, ImmutableList.of($$1));
   }

   public static nq a(dff $$0, nt... $$1) {
      return new nq($$0, ImmutableList.copyOf($$1));
   }
}
