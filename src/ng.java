import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ng implements lo {
   private final lq d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public ng(lq $$0) {
      this.d = $$0;
   }

   public <T> ng a(atd<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(lm $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return lo.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static ng a(lq $$0, xe $$1) {
      return new ng($$0).a(ate.b, new ate($$1, t.a.a(asr.b), Optional.empty()));
   }

   public static ng a(lq $$0, xe $$1, cop $$2) {
      return a($$0, $$1).a(asl.a, new asl($$2));
   }
}
