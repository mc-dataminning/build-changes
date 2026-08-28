import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class np implements lw {
   private final ly d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public np(ly $$0) {
      this.d = $$0;
   }

   public <T> np a(atl<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(lu $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return lw.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static np a(ly $$0, xl $$1) {
      return new np($$0).a(atm.b, new atm($$1, t.a.a(asz.b), Optional.empty()));
   }

   public static np a(ly $$0, xl $$1, cpg $$2) {
      return a($$0, $$1).a(ast.a, new ast($$2));
   }
}
