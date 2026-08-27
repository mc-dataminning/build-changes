import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class mp implements ky {
   private final la d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public mp(la $$0) {
      this.d = $$0;
   }

   public <T> mp a(asc<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(kw $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return ky.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static mp a(la $$0, wg $$1) {
      return new mp($$0).a(asd.b, new asd($$1, t.a.a(arq.b), Optional.empty()));
   }

   public static mp a(la $$0, wg $$1, cmg $$2) {
      return a($$0, $$1).a(ark.a, new ark($$2));
   }
}
