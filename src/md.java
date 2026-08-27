import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class md implements ji {
   private static final Logger d = LogUtils.getLogger();
   private final jk e;
   private final CompletableFuture<hg.b> f;

   public md(jk $$0, CompletableFuture<hg.b> $$1) {
      this.f = $$1;
      this.e = $$0;
   }

   @Override
   public CompletableFuture<?> a(jg $$0) {
      return this.f.thenCompose($$1 -> {
         DynamicOps<JsonElement> $$2 = aep.a(JsonOps.INSTANCE, $$1);
         return CompletableFuture.allOf(aem.a.stream().flatMap($$3 -> this.a($$0, $$1, $$2, (aem.b<?>)$$3).stream()).toArray(CompletableFuture[]::new));
      });
   }

   private <T> Optional<CompletableFuture<?>> a(jg $$0, hg.b $$1, DynamicOps<JsonElement> $$2, aem.b<T> $$3) {
      aeq<? extends hr<T>> $$4 = $$3.a();
      return $$1.a($$4).map($$4x -> {
         jk.a $$5 = this.e.a(jk.b.a, $$4.a().a());
         return CompletableFuture.allOf($$4x.b().map($$4xx -> a($$5.a($$4xx.g().a()), $$0, $$2, $$3.b(), $$4xx.a())).toArray(CompletableFuture[]::new));
      });
   }

   private static <E> CompletableFuture<?> a(Path $$0, jg $$1, DynamicOps<JsonElement> $$2, Encoder<E> $$3, E $$4) {
      Optional<JsonElement> $$5 = $$3.encodeStart($$2, $$4).resultOrPartial($$1x -> d.error("Couldn't serialize element {}: {}", $$0, $$1x));
      return $$5.isPresent() ? ji.a($$1, $$5.get(), $$0) : CompletableFuture.completedFuture(null);
   }

   @Override
   public final String a() {
      return "Registries";
   }
}
