import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ks implements jk {
   private final jm d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public ks(jm $$0) {
      this.d = $$0;
   }

   public <T> ks a(amv<T> $$0, T $$1) {
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

   public static ks a(jm $$0, tm $$1) {
      return new ks($$0).a(amw.b, new amw($$1, t.a.a(amj.b), Optional.empty()));
   }

   public static ks a(jm $$0, tm $$1, cec $$2) {
      return a($$0, $$1).a(amf.a, new amf($$2));
   }
}
