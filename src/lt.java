import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class lt implements ki {
   private final kk d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public lt(kk $$0) {
      this.d = $$0;
   }

   public <T> lt a(aot<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(kg $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return ki.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static lt a(kk $$0, vb $$1) {
      return new lt($$0).a(aou.b, new aou($$1, t.a.a(aoh.b), Optional.empty()));
   }

   public static lt a(kk $$0, vb $$1, chb $$2) {
      return a($$0, $$1).a(aod.a, new aod($$2));
   }
}
