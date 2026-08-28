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

public class or {
   private final Optional<alz> a;
   private final Set<ou> b;
   private final Optional<String> c;

   public or(Optional<alz> $$0, Optional<String> $$1, ou... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public alz a(dke $$0) {
      return oq.a($$0, this.c.orElse(""));
   }

   public alz a(dke $$0, ot $$1, BiConsumer<alz, Supplier<JsonElement>> $$2) {
      return this.a(oq.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public alz a(dke $$0, String $$1, ot $$2, BiConsumer<alz, Supplier<JsonElement>> $$3) {
      return this.a(oq.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public alz b(dke $$0, String $$1, ot $$2, BiConsumer<alz, Supplier<JsonElement>> $$3) {
      return this.a(oq.a($$0, $$1), $$2, $$3);
   }

   public alz a(alz $$0, ot $$1, BiConsumer<alz, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public alz a(alz $$0, ot $$1, BiConsumer<alz, Supplier<JsonElement>> $$2, or.a $$3) {
      Map<ou, alz> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(alz $$0, Map<ou, alz> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<ou, alz> a(ot $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(alz var1, Map<ou, alz> var2);
   }
}
