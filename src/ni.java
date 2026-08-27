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

public class ni {
   private final Optional<ajv> a;
   private final Set<nl> b;
   private final Optional<String> c;

   public ni(Optional<ajv> $$0, Optional<String> $$1, nl... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public ajv a(dch $$0) {
      return nh.a($$0, this.c.orElse(""));
   }

   public ajv a(dch $$0, nk $$1, BiConsumer<ajv, Supplier<JsonElement>> $$2) {
      return this.a(nh.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public ajv a(dch $$0, String $$1, nk $$2, BiConsumer<ajv, Supplier<JsonElement>> $$3) {
      return this.a(nh.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public ajv b(dch $$0, String $$1, nk $$2, BiConsumer<ajv, Supplier<JsonElement>> $$3) {
      return this.a(nh.a($$0, $$1), $$2, $$3);
   }

   public ajv a(ajv $$0, nk $$1, BiConsumer<ajv, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public ajv a(ajv $$0, nk $$1, BiConsumer<ajv, Supplier<JsonElement>> $$2, ni.a $$3) {
      Map<nl, ajv> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(ajv $$0, Map<nl, ajv> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<nl, ajv> a(nk $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(ajv var1, Map<nl, ajv> var2);
   }
}
