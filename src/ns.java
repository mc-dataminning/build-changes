import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ns implements me {
   private final mg d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public ns(mg $$0) {
      this.d = $$0;
   }

   public <T> ns a(atz<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(mc $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return me.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static ns a(mg $$0, xh $$1) {
      return new ns($$0).a(aua.b, new aua($$1, t.a.a(atn.b), Optional.empty()));
   }

   public static ns a(mg $$0, xh $$1, cra $$2) {
      return a($$0, $$1).a(ath.a, new ath($$2));
   }
}
