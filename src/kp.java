import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class kp implements jj {
   private final jl d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public kp(jl $$0) {
      this.d = $$0;
   }

   public <T> kp a(aml<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(jh $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return jj.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static kp a(jl $$0, te $$1) {
      return new kp($$0).a(amm.b, new amm($$1, t.a.a(alz.b), Optional.empty()));
   }

   public static kp a(jl $$0, te $$1, cdt $$2) {
      return a($$0, $$1).a(alv.a, new alv($$2));
   }
}
