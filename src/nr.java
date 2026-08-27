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

public class nr {
   private final Optional<akf> a;
   private final Set<nu> b;
   private final Optional<String> c;

   public nr(Optional<akf> $$0, Optional<String> $$1, nu... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public akf a(dcv $$0) {
      return nq.a($$0, this.c.orElse(""));
   }

   public akf a(dcv $$0, nt $$1, BiConsumer<akf, Supplier<JsonElement>> $$2) {
      return this.a(nq.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public akf a(dcv $$0, String $$1, nt $$2, BiConsumer<akf, Supplier<JsonElement>> $$3) {
      return this.a(nq.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public akf b(dcv $$0, String $$1, nt $$2, BiConsumer<akf, Supplier<JsonElement>> $$3) {
      return this.a(nq.a($$0, $$1), $$2, $$3);
   }

   public akf a(akf $$0, nt $$1, BiConsumer<akf, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public akf a(akf $$0, nt $$1, BiConsumer<akf, Supplier<JsonElement>> $$2, nr.a $$3) {
      Map<nu, akf> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(akf $$0, Map<nu, akf> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<nu, akf> a(nt $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(akf var1, Map<nu, akf> var2);
   }
}
