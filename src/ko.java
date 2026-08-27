import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ko implements ji {
   private final jk d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public ko(jk $$0) {
      this.d = $$0;
   }

   public <T> ko a(amn<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(jg $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return ji.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static ko a(jk $$0, tf $$1) {
      return new ko($$0).a(amo.b, new amo($$1, t.a.a(amb.b), Optional.empty()));
   }

   public static ko a(jk $$0, tf $$1, cdu $$2) {
      return a($$0, $$1).a(alx.a, new alx($$2));
   }
}
