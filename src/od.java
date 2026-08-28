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

public class od {
   private final Optional<akr> a;
   private final Set<og> b;
   private final Optional<String> c;

   public od(Optional<akr> $$0, Optional<String> $$1, og... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public akr a(dfy $$0) {
      return oc.a($$0, this.c.orElse(""));
   }

   public akr a(dfy $$0, of $$1, BiConsumer<akr, Supplier<JsonElement>> $$2) {
      return this.a(oc.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public akr a(dfy $$0, String $$1, of $$2, BiConsumer<akr, Supplier<JsonElement>> $$3) {
      return this.a(oc.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public akr b(dfy $$0, String $$1, of $$2, BiConsumer<akr, Supplier<JsonElement>> $$3) {
      return this.a(oc.a($$0, $$1), $$2, $$3);
   }

   public akr a(akr $$0, of $$1, BiConsumer<akr, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public akr a(akr $$0, of $$1, BiConsumer<akr, Supplier<JsonElement>> $$2, od.a $$3) {
      Map<og, akr> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(akr $$0, Map<og, akr> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<og, akr> a(of $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(akr var1, Map<og, akr> var2);
   }
}
