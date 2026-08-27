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

public class mg {
   private final Optional<agi> a;
   private final Set<mj> b;
   private final Optional<String> c;

   public mg(Optional<agi> $$0, Optional<String> $$1, mj... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public agi a(cva $$0) {
      return mf.a($$0, this.c.orElse(""));
   }

   public agi a(cva $$0, mi $$1, BiConsumer<agi, Supplier<JsonElement>> $$2) {
      return this.a(mf.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public agi a(cva $$0, String $$1, mi $$2, BiConsumer<agi, Supplier<JsonElement>> $$3) {
      return this.a(mf.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public agi b(cva $$0, String $$1, mi $$2, BiConsumer<agi, Supplier<JsonElement>> $$3) {
      return this.a(mf.a($$0, $$1), $$2, $$3);
   }

   public agi a(agi $$0, mi $$1, BiConsumer<agi, Supplier<JsonElement>> $$2) {
      return this.a($$0, $$1, $$2, this::a);
   }

   public agi a(agi $$0, mi $$1, BiConsumer<agi, Supplier<JsonElement>> $$2, mg.a $$3) {
      Map<mj, agi> $$4 = this.a($$1);
      $$2.accept($$0, () -> $$3.create($$0, $$4));
      return $$0;
   }

   public JsonObject a(agi $$0, Map<mj, agi> $$1) {
      JsonObject $$2 = new JsonObject();
      this.a.ifPresent($$1x -> $$2.addProperty("parent", $$1x.toString()));
      if (!$$1.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         $$1.forEach(($$1x, $$2x) -> $$3.addProperty($$1x.a(), $$2x.toString()));
         $$2.add("textures", $$3);
      }

      return $$2;
   }

   private Map<mj, agi> a(mi $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }

   public interface a {
      JsonObject create(agi var1, Map<mj, agi> var2);
   }
}
