import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class nt implements mf {
   private final mh d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public nt(mh $$0) {
      this.d = $$0;
   }

   public <T> nt a(aua<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(md $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return mf.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static nt a(mh $$0, xi $$1) {
      return new nt($$0).a(aub.b, new aub($$1, t.a.a(ato.b), Optional.empty()));
   }

   public static nt a(mh $$0, xi $$1, crf $$2) {
      return a($$0, $$1).a(ati.a, new ati($$2));
   }
}
