import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class oo implements mi {
   private final mk d;
   private final CompletableFuture<jt.a> e;

   public oo(mk $$0, CompletableFuture<jt.a> $$1) {
      this.e = $$1;
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      return this.e.thenCompose($$1 -> {
         DynamicOps<JsonElement> $$2 = $$1.a(JsonOps.INSTANCE);
         return CompletableFuture.allOf(akq.a.stream().flatMap($$3 -> this.a($$0, $$1, $$2, (akq.d<?>)$$3).stream()).toArray(CompletableFuture[]::new));
      });
   }

   private <T> Optional<CompletableFuture<?>> a(mg $$0, jt.a $$1, DynamicOps<JsonElement> $$2, akq.d<T> $$3) {
      aku<? extends ke<T>> $$4 = $$3.a();
      return $$1.a($$4).map($$4x -> {
         mk.a $$5 = this.d.a($$4);
         return CompletableFuture.allOf($$4x.c().map($$4xx -> a($$5.a($$4xx.h().a()), $$0, $$2, $$3.b(), $$4xx.a())).toArray(CompletableFuture[]::new));
      });
   }

   private static <E> CompletableFuture<?> a(Path $$0, mg $$1, DynamicOps<JsonElement> $$2, Encoder<E> $$3, E $$4) {
      return (CompletableFuture<?>)$$3.encodeStart($$2, $$4)
         .mapOrElse(
            $$2x -> mi.a($$1, $$2x, $$0),
            $$1x -> CompletableFuture.failedFuture(new IllegalStateException("Couldn't generate file '" + $$0 + "': " + $$1x.message()))
         );
   }

   @Override
   public final String a() {
      return "Registries";
   }
}
