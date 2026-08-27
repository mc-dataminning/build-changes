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
   private final Optional<akm> a;
   private final Set<ny> b;
   private final Optional<String> c;

   public nv(Optional<akm> $$0, Optional<String> $$1, ny... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public akm a(ddy $$0) {
      return nu.a($$0, this.c.orElse(""));
   }

   public akm a(ddy $$0, nx $$1, BiConsumer<akm, Supplier<JsonElement>> $$2) {
      return this.a(nu.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public akm a(ddy $$0, String $$1, nx $$2, BiConsumer<akm, Supplier<JsonElement>> $$3) {
      return this.a(nu.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public akm b(ddy $$0, String $$1, nx $$2, BiConsumer<akm, Supplier<JsonElement>> $$3) {
      return this.a(nu.a($$0, $$1), $$2, $$3);
   }

   public akm a(akm $$0, nx $$1, BiConsumer<akm, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public akm a(akm $$0, nx $$1, BiConsumer<akm, Supplier<JsonElement>> $$2, nv.a $$3) {
      Map<ny, akm> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(akm $$0, Map<ny, akm> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<ny, akm> a(nx $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(akm var1, Map<ny, akm> var2);
   }
}
