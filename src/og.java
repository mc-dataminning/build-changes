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

public class og {
   private final Optional<alc> a;
   private final Set<oj> b;
   private final Optional<String> c;

   public og(Optional<alc> $$0, Optional<String> $$1, oj... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public alc a(dhj $$0) {
      return of.a($$0, this.c.orElse(""));
   }

   public alc a(dhj $$0, oi $$1, BiConsumer<alc, Supplier<JsonElement>> $$2) {
      return this.a(of.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public alc a(dhj $$0, String $$1, oi $$2, BiConsumer<alc, Supplier<JsonElement>> $$3) {
      return this.a(of.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public alc b(dhj $$0, String $$1, oi $$2, BiConsumer<alc, Supplier<JsonElement>> $$3) {
      return this.a(of.a($$0, $$1), $$2, $$3);
   }

   public alc a(alc $$0, oi $$1, BiConsumer<alc, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public alc a(alc $$0, oi $$1, BiConsumer<alc, Supplier<JsonElement>> $$2, og.a $$3) {
      Map<oj, alc> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(alc $$0, Map<oj, alc> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<oj, alc> a(oi $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(alc var1, Map<oj, alc> var2);
   }
}
