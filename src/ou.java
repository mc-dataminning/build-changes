import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ou implements mo {
   private final mq d;
   private final CompletableFuture<ji.a> e;

   public ou(mq $$0, CompletableFuture<ji.a> $$1) {
      this.e = $$1;
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(mm $$0) {
      return this.e.thenCompose($$1 -> {
         DynamicOps<JsonElement> $$2 = $$1.a(JsonOps.INSTANCE);
         return CompletableFuture.allOf(alm.a.stream().flatMap($$3 -> this.a($$0, $$1, $$2, (alm.d<?>)$$3).stream()).toArray(CompletableFuture[]::new));
      });
   }

   private <T> Optional<CompletableFuture<?>> a(mm $$0, ji.a $$1, DynamicOps<JsonElement> $$2, alm.d<T> $$3) {
      alq<? extends jt<T>> $$4 = $$3.a();
      return $$1.a($$4).map($$4x -> {
         mq.a $$5 = this.d.a($$4);
         return CompletableFuture.allOf($$4x.c().map($$4xx -> a($$5.a($$4xx.h().a()), $$0, $$2, $$3.b(), $$4xx.a())).toArray(CompletableFuture[]::new));
      });
   }

   private static <E> CompletableFuture<?> a(Path $$0, mm $$1, DynamicOps<JsonElement> $$2, Encoder<E> $$3, E $$4) {
      return (CompletableFuture<?>)$$3.encodeStart($$2, $$4)
         .mapOrElse(
            $$2x -> mo.a($$1, $$2x, $$0),
            $$1x -> CompletableFuture.failedFuture(new IllegalStateException("Couldn't generate file '" + $$0 + "': " + $$1x.message()))
         );
   }

   @Override
   public final String a() {
      return "Registries";
   }
}
