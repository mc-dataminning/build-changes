import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class na implements lj {
   private final ll d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public na(ll $$0) {
      this.d = $$0;
   }

   public <T> na a(aso<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(lh $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return lj.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static na a(ll $$0, ws $$1) {
      return new na($$0).a(asp.b, new asp($$1, t.a.a(asc.b), Optional.empty()));
   }

   public static na a(ll $$0, ws $$1, cmy $$2) {
      return a($$0, $$1).a(arw.a, new arw($$2));
   }
}
