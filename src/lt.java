import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class lt implements kj {
   private final kl d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public lt(kl $$0) {
      this.d = $$0;
   }

   public <T> lt a(aom<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(kh $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return kj.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static lt a(kl $$0, uv $$1) {
      return new lt($$0).a(aon.b, new aon($$1, t.a.a(aoa.b), Optional.empty()));
   }

   public static lt a(kl $$0, uv $$1, cgi $$2) {
      return a($$0, $$1).a(anw.a, new anw($$2));
   }
}
