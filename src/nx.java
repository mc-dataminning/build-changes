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

public class nx {
   private final Optional<akt> a;
   private final Set<oa> b;
   private final Optional<String> c;

   public nx(Optional<akt> $$0, Optional<String> $$1, oa... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public akt a(dfc $$0) {
      return nw.a($$0, this.c.orElse(""));
   }

   public akt a(dfc $$0, nz $$1, BiConsumer<akt, Supplier<JsonElement>> $$2) {
      return this.a(nw.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public akt a(dfc $$0, String $$1, nz $$2, BiConsumer<akt, Supplier<JsonElement>> $$3) {
      return this.a(nw.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public akt b(dfc $$0, String $$1, nz $$2, BiConsumer<akt, Supplier<JsonElement>> $$3) {
      return this.a(nw.a($$0, $$1), $$2, $$3);
   }

   public akt a(akt $$0, nz $$1, BiConsumer<akt, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public akt a(akt $$0, nz $$1, BiConsumer<akt, Supplier<JsonElement>> $$2, nx.a $$3) {
      Map<oa, akt> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(akt $$0, Map<oa, akt> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<oa, akt> a(nz $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(akt var1, Map<oa, akt> var2);
   }
}
