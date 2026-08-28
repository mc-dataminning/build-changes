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

public class ok {
   private final Optional<alh> a;
   private final Set<on> b;
   private final Optional<String> c;

   public ok(Optional<alh> $$0, Optional<String> $$1, on... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public alh a(dhy $$0) {
      return oj.a($$0, this.c.orElse(""));
   }

   public alh a(dhy $$0, om $$1, BiConsumer<alh, Supplier<JsonElement>> $$2) {
      return this.a(oj.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public alh a(dhy $$0, String $$1, om $$2, BiConsumer<alh, Supplier<JsonElement>> $$3) {
      return this.a(oj.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public alh b(dhy $$0, String $$1, om $$2, BiConsumer<alh, Supplier<JsonElement>> $$3) {
      return this.a(oj.a($$0, $$1), $$2, $$3);
   }

   public alh a(alh $$0, om $$1, BiConsumer<alh, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public alh a(alh $$0, om $$1, BiConsumer<alh, Supplier<JsonElement>> $$2, ok.a $$3) {
      Map<on, alh> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(alh $$0, Map<on, alh> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<on, alh> a(om $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(alh var1, Map<on, alh> var2);
   }
}
