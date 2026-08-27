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

public class mm {
   private final Optional<ahd> a;
   private final Set<mp> b;
   private final Optional<String> c;

   public mm(Optional<ahd> $$0, Optional<String> $$1, mp... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public ahd a(cwj $$0) {
      return ml.a($$0, this.c.orElse(""));
   }

   public ahd a(cwj $$0, mo $$1, BiConsumer<ahd, Supplier<JsonElement>> $$2) {
      return this.a(ml.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public ahd a(cwj $$0, String $$1, mo $$2, BiConsumer<ahd, Supplier<JsonElement>> $$3) {
      return this.a(ml.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public ahd b(cwj $$0, String $$1, mo $$2, BiConsumer<ahd, Supplier<JsonElement>> $$3) {
      return this.a(ml.a($$0, $$1), $$2, $$3);
   }

   public ahd a(ahd $$0, mo $$1, BiConsumer<ahd, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public ahd a(ahd $$0, mo $$1, BiConsumer<ahd, Supplier<JsonElement>> $$2, mm.a $$3) {
      Map<mp, ahd> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(ahd $$0, Map<mp, ahd> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<mp, ahd> a(mo $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(ahd var1, Map<mp, ahd> var2);
   }
}
