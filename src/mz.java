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

public class mz implements mw {
   private final dch a;
   private final List<nc> b;
   private final Set<dql<?>> c = Sets.newHashSet();
   private final List<na> d = Lists.newArrayList();

   private mz(dch $$0, List<nc> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public mz a(na $$0) {
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
      Stream<Pair<nb, List<nc>>> $$0 = Stream.of(Pair.of(nb.a(), this.b));

      for (na $$1 : this.d) {
         Map<nb, List<nc>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               nb $$2x = ((nb)$$1.getFirst()).a((nb)$$1xx.getKey());
               List<nc> $$3 = a((List<nc>)$$1.getSecond(), (List<nc>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((nb)$$1.getFirst()).b(), nc.a((List<nc>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<nc> a(List<nc> $$0, List<nc> $$1) {
      Builder<nc> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(nc.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dch a() {
      return this.a;
   }

   public static mz a(dch $$0) {
      return new mz($$0, ImmutableList.of(nc.a()));
   }

   public static mz a(dch $$0, nc $$1) {
      return new mz($$0, ImmutableList.of($$1));
   }

   public static mz a(dch $$0, nc... $$1) {
      return new mz($$0, ImmutableList.copyOf($$1));
   }
}
