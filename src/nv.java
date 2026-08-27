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

public class nv {
   private final Optional<akn> a;
   private final Set<ny> b;
   private final Optional<String> c;

   public nv(Optional<akn> $$0, Optional<String> $$1, ny... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public akn a(dea $$0) {
      return nu.a($$0, this.c.orElse(""));
   }

   public akn a(dea $$0, nx $$1, BiConsumer<akn, Supplier<JsonElement>> $$2) {
      return this.a(nu.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public akn a(dea $$0, String $$1, nx $$2, BiConsumer<akn, Supplier<JsonElement>> $$3) {
      return this.a(nu.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public akn b(dea $$0, String $$1, nx $$2, BiConsumer<akn, Supplier<JsonElement>> $$3) {
      return this.a(nu.a($$0, $$1), $$2, $$3);
   }

   public akn a(akn $$0, nx $$1, BiConsumer<akn, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public akn a(akn $$0, nx $$1, BiConsumer<akn, Supplier<JsonElement>> $$2, nv.a $$3) {
      Map<ny, akn> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(akn $$0, Map<ny, akn> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<ny, akn> a(nx $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(akn var1, Map<ny, akn> var2);
   }
}
