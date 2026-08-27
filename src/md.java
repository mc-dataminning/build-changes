import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class md implements kp {
   private final kr d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public md(kr $$0) {
      this.d = $$0;
   }

   public <T> md a(aro<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(kn $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return kp.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static md a(kr $$0, vu $$1) {
      return new md($$0).a(arp.b, new arp($$1, t.a.a(arc.b), Optional.empty()));
   }

   public static md a(kr $$0, vu $$1, clh $$2) {
      return a($$0, $$1).a(aqw.a, new aqw($$2));
   }
}
