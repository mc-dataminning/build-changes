import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class np implements mb {
   private final md d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public np(md $$0) {
      this.d = $$0;
   }

   public <T> np a(att<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(lz $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return mb.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static np a(md $$0, xd $$1) {
      return new np($$0).a(atu.b, new atu($$1, t.a.a(ath.b), Optional.empty()));
   }

   public static np a(md $$0, xd $$1, cqn $$2) {
      return a($$0, $$1).a(atb.a, new atb($$2));
   }
}
