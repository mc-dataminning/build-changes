import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class lv implements kk {
   private final km d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public lv(km $$0) {
      this.d = $$0;
   }

   public <T> lv a(apd<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(ki $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return kk.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static lv a(km $$0, vd $$1) {
      return new lv($$0).a(ape.b, new ape($$1, t.a.a(aor.b), Optional.empty()));
   }

   public static lv a(km $$0, vd $$1, chl $$2) {
      return a($$0, $$1).a(aon.a, new aon($$2));
   }
}
