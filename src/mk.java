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

public class mk {
   private final Optional<agt> a;
   private final Set<mn> b;
   private final Optional<String> c;

   public mk(Optional<agt> $$0, Optional<String> $$1, mn... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public agt a(cvz $$0) {
      return mj.a($$0, this.c.orElse(""));
   }

   public agt a(cvz $$0, mm $$1, BiConsumer<agt, Supplier<JsonElement>> $$2) {
      return this.a(mj.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public agt a(cvz $$0, String $$1, mm $$2, BiConsumer<agt, Supplier<JsonElement>> $$3) {
      return this.a(mj.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public agt b(cvz $$0, String $$1, mm $$2, BiConsumer<agt, Supplier<JsonElement>> $$3) {
      return this.a(mj.a($$0, $$1), $$2, $$3);
   }

   public agt a(agt $$0, mm $$1, BiConsumer<agt, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public agt a(agt $$0, mm $$1, BiConsumer<agt, Supplier<JsonElement>> $$2, mk.a $$3) {
      Map<mn, agt> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(agt $$0, Map<mn, agt> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<mn, agt> a(mm $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(agt var1, Map<mn, agt> var2);
   }
}
