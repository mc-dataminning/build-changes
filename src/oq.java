import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class oq implements lk {
   private static final Logger d = LogUtils.getLogger();
   private final lm e;
   private final CompletableFuture<iy.a> f;

   public oq(lm $$0, CompletableFuture<iy.a> $$1) {
      this.f = $$1;
      this.e = $$0;
   }

   @Override
   public CompletableFuture<?> a(li $$0) {
      return this.f.thenCompose($$1 -> {
         DynamicOps<JsonElement> $$2 = $$1.a(JsonOps.INSTANCE);
         return CompletableFuture.allOf(akc.a.stream().flatMap($$3 -> this.a($$0, $$1, $$2, (akc.c<?>)$$3).stream()).toArray(CompletableFuture[]::new));
      });
   }

   private <T> Optional<CompletableFuture<?>> a(li $$0, iy.a $$1, DynamicOps<JsonElement> $$2, akc.c<T> $$3) {
      akg<? extends jj<T>> $$4 = $$3.a();
      return $$1.a($$4).map($$4x -> {
         lm.a $$5 = this.e.a(lm.b.a, $$4.a().a());
         return CompletableFuture.allOf($$4x.b().map($$4xx -> a($$5.a($$4xx.h().a()), $$0, $$2, $$3.b(), $$4xx.a())).toArray(CompletableFuture[]::new));
      });
   }

   private static <E> CompletableFuture<?> a(Path $$0, li $$1, DynamicOps<JsonElement> $$2, Encoder<E> $$3, E $$4) {
      Optional<JsonElement> $$5 = $$3.encodeStart($$2, $$4).resultOrPartial($$1x -> d.error("Couldn't serialize element {}: {}", $$0, $$1x));
      return $$5.isPresent() ? lk.a($$1, $$5.get(), $$0) : CompletableFuture.completedFuture(null);
   }

   @Override
   public final String a() {
      return "Registries";
   }
}
