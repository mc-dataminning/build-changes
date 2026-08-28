import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class nm implements ma {
   private final mc d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public nm(mc $$0) {
      this.d = $$0;
   }

   public <T> nm a(ate<T> $$0, T $$1) {
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

   public static nm a(mc $$0, wz $$1) {
      return new nm($$0).a(atf.b, new atf($$1, t.a.a(ass.b), Optional.empty()));
   }

   public static nm a(mc $$0, wz $$1, cpl $$2) {
      return a($$0, $$1).a(asm.a, new asm($$2));
   }
}
