import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Streams;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class mo {
   private final Optional<ahh> a;
   private final Set<mr> b;
   private final Optional<String> c;

   public mo(Optional<ahh> $$0, Optional<String> $$1, mr... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public ahh a(cwy $$0) {
      return mn.a($$0, this.c.orElse(""));
   }

   public ahh a(cwy $$0, mq $$1, BiConsumer<ahh, Supplier<JsonElement>> $$2) {
      return this.a(mn.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public ahh a(cwy $$0, String $$1, mq $$2, BiConsumer<ahh, Supplier<JsonElement>> $$3) {
      return this.a(mn.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public ahh b(cwy $$0, String $$1, mq $$2, BiConsumer<ahh, Supplier<JsonElement>> $$3) {
      return this.a(mn.a($$0, $$1), $$2, $$3);
   }

   public ahh a(ahh $$0, mq $$1, BiConsumer<ahh, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public ahh a(ahh $$0, mq $$1, BiConsumer<ahh, Supplier<JsonElement>> $$2, mo.a $$3) {
      Map<mr, ahh> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(ahh $$0, Map<mr, ahh> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<mr, ahh> a(mq $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(ahh var1, Map<mr, ahh> var2);
   }
}
