import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class mb implements ko {
   private final kq d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public mb(kq $$0) {
      this.d = $$0;
   }

   public <T> mb a(arg<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(km $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return ko.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static mb a(kq $$0, vs $$1) {
      return new mb($$0).a(arh.b, new arh($$1, t.a.a(aqu.b), Optional.empty()));
   }

   public static mb a(kq $$0, vs $$1, ckl $$2) {
      return a($$0, $$1).a(aqq.a, new aqq($$2));
   }
}
