import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class kq implements jk {
   private final jm d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public kq(jm $$0) {
      this.d = $$0;
   }

   public <T> kq a(amq<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(ji $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return jk.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static kq a(jm $$0, ti $$1) {
      return new kq($$0).a(amr.b, new amr($$1, t.a.a(ame.b), Optional.empty()));
   }

   public static kq a(jm $$0, ti $$1, cdx $$2) {
      return a($$0, $$1).a(ama.a, new ama($$2));
   }
}
