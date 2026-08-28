import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class np implements lw {
   private final ly d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public np(ly $$0) {
      this.d = $$0;
   }

   public <T> np a(ato<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(lu $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return lw.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static np a(ly $$0, xo $$1) {
      return new np($$0).a(atp.b, new atp($$1, t.a.a(atc.b), Optional.empty()));
   }

   public static np a(ly $$0, xo $$1, cpj $$2) {
      return a($$0, $$1).a(asw.a, new asw($$2));
   }
}
