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

public class mb implements ly {
   private final cvz a;
   private final List<me> b;
   private final Set<djs<?>> c = Sets.newHashSet();
   private final List<mc> d = Lists.newArrayList();

   private mb(cvz $$0, List<me> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public mb a(mc $$0) {
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
      Stream<Pair<md, List<me>>> $$0 = Stream.of(Pair.of(md.a(), this.b));

      for (mc $$1 : this.d) {
         Map<md, List<me>> $$2 = $$1.a();
         $$0 = $$0.flatMap($$1x -> $$2.entrySet().stream().map($$1xx -> {
               md $$2x = ((md)$$1.getFirst()).a((md)$$1xx.getKey());
               List<me> $$3 = a((List<me>)$$1.getSecond(), (List<me>)$$1xx.getValue());
               return Pair.of($$2x, $$3);
            }));
      }

      Map<String, JsonElement> $$3 = new TreeMap<>();
      $$0.forEach($$1 -> $$3.put(((md)$$1.getFirst()).b(), me.a((List<me>)$$1.getSecond())));
      JsonObject $$4 = new JsonObject();
      $$4.add("variants", ac.a(new JsonObject(), $$1 -> $$3.forEach($$1::add)));
      return $$4;
   }

   private static List<me> a(List<me> $$0, List<me> $$1) {
      Builder<me> $$2 = ImmutableList.builder();
      $$0.forEach($$2x -> $$1.forEach($$2xx -> $$2.add(me.a($$2x, $$2xx))));
      return $$2.build();
   }

   @Override
   public cvz a() {
      return this.a;
   }

   public static mb a(cvz $$0) {
      return new mb($$0, ImmutableList.of(me.a()));
   }

   public static mb a(cvz $$0, me $$1) {
      return new mb($$0, ImmutableList.of($$1));
   }

   public static mb a(cvz $$0, me... $$1) {
      return new mb($$0, ImmutableList.copyOf($$1));
   }
}
