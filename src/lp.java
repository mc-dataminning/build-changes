import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class lp implements kf {
   private final kh d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public lp(kh $$0) {
      this.d = $$0;
   }

   public <T> lp a(aoe<T> $$0, T $$1) {
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

   public static lp a(kh $$0, ur $$1) {
      return new lp($$0).a(aof.b, new aof($$1, t.a.a(ans.b), Optional.empty()));
   }

   public static lp a(kh $$0, ur $$1, cfv $$2) {
      return a($$0, $$1).a(ano.a, new ano($$2));
   }
}
