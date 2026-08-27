import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class lx implements kk {
   private final km d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public lx(km $$0) {
      this.d = $$0;
   }

   public <T> lx a(apj<T> $$0, T $$1) {
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

   public static lx a(km $$0, vf $$1) {
      return new lx($$0).a(apk.b, new apk($$1, t.a.a(aox.b), Optional.empty()));
   }

   public static lx a(km $$0, vf $$1, chs $$2) {
      return a($$0, $$1).a(aot.a, new aot($$2));
   }
}
