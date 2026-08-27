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

public class ni implements nf {
   private final dcv a;
   private final List<nl> b;
   private final Set<drb<?>> c = Sets.newHashSet();
   private final List<nj> d = Lists.newArrayList();

   private ni(dcv $$0, List<nl> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ni a(nj $$0) {
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
      Stream<Pair<nk, List<nl>>> $$0 = Stream.of(Pair.of(nk.a(), this.b));

      for (nj $$1 : this.d) {
         Map<nk, List<nl>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               nk $$2x = ((nk)$$1.getFirst()).a((nk)$$1xx.getKey());
               List<nl> $$3 = a((List<nl>)$$1.getSecond(), (List<nl>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((nk)$$1.getFirst()).b(), nl.a((List<nl>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<nl> a(List<nl> $$0, List<nl> $$1) {
      Builder<nl> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(nl.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dcv a() {
      return this.a;
   }

   public static ni a(dcv $$0) {
      return new ni($$0, ImmutableList.of(nl.a()));
   }

   public static ni a(dcv $$0, nl $$1) {
      return new ni($$0, ImmutableList.of($$1));
   }

   public static ni a(dcv $$0, nl... $$1) {
      return new ni($$0, ImmutableList.copyOf($$1));
   }
}
