import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class nu implements mg {
   private final mi d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public nu(mi $$0) {
      this.d = $$0;
   }

   public <T> nu a(aud<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(me $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return mg.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static nu a(mi $$0, xl $$1) {
      return new nu($$0).a(aue.b, new aue($$1, t.a.a(atr.b), Optional.empty()));
   }

   public static nu a(mi $$0, xl $$1, crj $$2) {
      return a($$0, $$1).a(atl.a, new atl($$2));
   }
}
