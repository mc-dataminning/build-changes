import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class nz implements mh {
   private final mj d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public nz(mj $$0) {
      this.d = $$0;
   }

   public <T> nz a(auu<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(mf $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return mh.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static nz a(mj $$0, xv $$1) {
      return new nz($$0).a(auv.b, new auv($$1, t.a.a(aui.b), Optional.empty()));
   }

   public static nz a(mj $$0, xv $$1, cso $$2) {
      return a($$0, $$1).a(auc.a, new auc($$2));
   }
}
