import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ni implements lx {
   private final lz d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public ni(lz $$0) {
      this.d = $$0;
   }

   public <T> ni a(asw<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(lv $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return lx.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static ni a(lz $$0, wu $$1) {
      return new ni($$0).a(asx.b, new asx($$1, t.a.a(ask.b), Optional.empty()));
   }

   public static ni a(lz $$0, wu $$1, coy $$2) {
      return a($$0, $$1).a(ase.a, new ase($$2));
   }
}
