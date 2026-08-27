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

public class mu {
   private final Optional<ajh> a;
   private final Set<mx> b;
   private final Optional<String> c;

   public mu(Optional<ajh> $$0, Optional<String> $$1, mx... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public ajh a(dac $$0) {
      return mt.a($$0, this.c.orElse(""));
   }

   public ajh a(dac $$0, mw $$1, BiConsumer<ajh, Supplier<JsonElement>> $$2) {
      return this.a(mt.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public ajh a(dac $$0, String $$1, mw $$2, BiConsumer<ajh, Supplier<JsonElement>> $$3) {
      return this.a(mt.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public ajh b(dac $$0, String $$1, mw $$2, BiConsumer<ajh, Supplier<JsonElement>> $$3) {
      return this.a(mt.a($$0, $$1), $$2, $$3);
   }

   public ajh a(ajh $$0, mw $$1, BiConsumer<ajh, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public ajh a(ajh $$0, mw $$1, BiConsumer<ajh, Supplier<JsonElement>> $$2, mu.a $$3) {
      Map<mx, ajh> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(ajh $$0, Map<mx, ajh> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<mx, ajh> a(mw $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(ajh var1, Map<mx, ajh> var2);
   }
}
