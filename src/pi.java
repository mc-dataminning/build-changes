import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pi implements mf {
   private final mh d;
   private final CompletableFuture<js.a> e;

   public pi(mh $$0, CompletableFuture<js.a> $$1) {
      this.e = $$1;
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(md $$0) {
      return this.e.thenCompose($$1 -> {
         DynamicOps<JsonElement> $$2 = $$1.a(JsonOps.INSTANCE);
         return CompletableFuture.allOf(ald.a.stream().flatMap($$3 -> this.a($$0, $$1, $$2, (ald.d<?>)$$3).stream()).toArray(CompletableFuture[]::new));
      });
   }

   private <T> Optional<CompletableFuture<?>> a(md $$0, js.a $$1, DynamicOps<JsonElement> $$2, ald.d<T> $$3) {
      alh<? extends kd<T>> $$4 = $$3.a();
      return $$1.a($$4).map($$4x -> {
         mh.a $$5 = this.d.a($$4);
         return CompletableFuture.allOf($$4x.c().map($$4xx -> a($$5.a($$4xx.h().a()), $$0, $$2, $$3.b(), $$4xx.a())).toArray(CompletableFuture[]::new));
      });
   }

   private static <E> CompletableFuture<?> a(Path $$0, md $$1, DynamicOps<JsonElement> $$2, Encoder<E> $$3, E $$4) {
      return (CompletableFuture<?>)$$3.encodeStart($$2, $$4)
         .mapOrElse(
            $$2x -> mf.a($$1, $$2x, $$0),
            $$1x -> CompletableFuture.failedFuture(new IllegalStateException("Couldn't generate file '" + $$0 + "': " + $$1x.message()))
         );
   }

   @Override
   public final String a() {
      return "Registries";
   }
}
