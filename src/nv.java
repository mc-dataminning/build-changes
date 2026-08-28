import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class nv implements mh {
   private final mj d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public nv(mj $$0) {
      this.d = $$0;
   }

   public <T> nv a(auk<T> $$0, T $$1) {
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

   public static nv a(mj $$0, xk $$1) {
      return new nv($$0).a(aul.b, new aul($$1, t.a.a(aty.b), Optional.empty()));
   }

   public static nv a(mj $$0, xk $$1, csk $$2) {
      return a($$0, $$1).a(ats.a, new ats($$2));
   }
}
