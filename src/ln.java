import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ln implements kf {
   private final kh d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public ln(kh $$0) {
      this.d = $$0;
   }

   public <T> ln a(anu<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(kd $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return kf.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static ln a(kh $$0, ui $$1) {
      return new ln($$0).a(anv.b, new anv($$1, t.a.a(ani.b), Optional.empty()));
   }

   public static ln a(kh $$0, ui $$1, cfg $$2) {
      return a($$0, $$1).a(ane.a, new ane($$2));
   }
}
