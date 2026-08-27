import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class no implements km {
   private static final Logger d = LogUtils.getLogger();
   private final ko e;
   private final CompletableFuture<il.b> f;

   public no(ko $$0, CompletableFuture<il.b> $$1) {
      this.f = $$1;
      this.e = $$0;
   }

   @Override
   public CompletableFuture<?> a(kk $$0) {
      return this.f.thenCompose($$1 -> {
         DynamicOps<JsonElement> $$2 = aiw.a(JsonOps.INSTANCE, $$1);
         return CompletableFuture.allOf(ait.a.stream().flatMap($$3 -> this.a($$0, $$1, $$2, (ait.b<?>)$$3).stream()).toArray(CompletableFuture[]::new));
      });
   }

   private <T> Optional<CompletableFuture<?>> a(kk $$0, il.b $$1, DynamicOps<JsonElement> $$2, ait.b<T> $$3) {
      aix<? extends iv<T>> $$4 = $$3.a();
      return $$1.a($$4).map($$4x -> {
         ko.a $$5 = this.e.a(ko.b.a, $$4.a().a());
         return CompletableFuture.allOf($$4x.b().map($$4xx -> a($$5.a($$4xx.h().a()), $$0, $$2, $$3.b(), $$4xx.a())).toArray(CompletableFuture[]::new));
      });
   }

   private static <E> CompletableFuture<?> a(Path $$0, kk $$1, DynamicOps<JsonElement> $$2, Encoder<E> $$3, E $$4) {
      Optional<JsonElement> $$5 = $$3.encodeStart($$2, $$4).resultOrPartial($$1x -> d.error("Couldn't serialize element {}: {}", $$0, $$1x));
      return $$5.isPresent() ? km.a($$1, $$5.get(), $$0) : CompletableFuture.completedFuture(null);
   }

   @Override
   public final String a() {
      return "Registries";
   }
}
