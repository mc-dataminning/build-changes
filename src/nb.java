import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class nb implements lk {
   private final lm d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public nb(lm $$0) {
      this.d = $$0;
   }

   public <T> nb a(asr<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(li $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return lk.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static nb a(lm $$0, wu $$1) {
      return new nb($$0).a(ass.b, new ass($$1, t.a.a(asf.b), Optional.empty()));
   }

   public static nb a(lm $$0, wu $$1, cnu $$2) {
      return a($$0, $$1).a(arz.a, new arz($$2));
   }
}
