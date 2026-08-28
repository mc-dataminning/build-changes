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

public class nx implements nu {
   private final dfb a;
   private final List<oa> b;
   private final Set<dth<?>> c = Sets.newHashSet();
   private final List<ny> d = Lists.newArrayList();

   private nx(dfb $$0, List<oa> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public nx a(ny $$0) {
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
      Stream<Pair<nz, List<oa>>> $$0 = Stream.of(Pair.of(nz.a(), this.b));

      for (ny $$1 : this.d) {
         Map<nz, List<oa>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               nz $$2x = ((nz)$$1.getFirst()).a((nz)$$1xx.getKey());
               List<oa> $$3 = a((List<oa>)$$1.getSecond(), (List<oa>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((nz)$$1.getFirst()).b(), oa.a((List<oa>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<oa> a(List<oa> $$0, List<oa> $$1) {
      Builder<oa> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(oa.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public dfb a() {
      return this.a;
   }

   public static nx a(dfb $$0) {
      return new nx($$0, ImmutableList.of(oa.a()));
   }

   public static nx a(dfb $$0, oa $$1) {
      return new nx($$0, ImmutableList.of($$1));
   }

   public static nx a(dfb $$0, oa... $$1) {
      return new nx($$0, ImmutableList.copyOf($$1));
   }
}
