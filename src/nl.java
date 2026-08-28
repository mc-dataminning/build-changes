import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class nl implements ma {
   private final mc d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public nl(mc $$0) {
      this.d = $$0;
   }

   public <T> nl a(atd<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(ly $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return ma.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static nl a(mc $$0, wy $$1) {
      return new nl($$0).a(ate.b, new ate($$1, t.a.a(asr.b), Optional.empty()));
   }

   public static nl a(mc $$0, wy $$1, cpj $$2) {
      return a($$0, $$1).a(asl.a, new asl($$2));
   }
}
