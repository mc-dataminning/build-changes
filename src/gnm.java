import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gnm {
   private final asr a;
   private final Map<ajh, CompletableFuture<erz>> b = Maps.newHashMap();

   public gnm(asr $$0) {
      this.a = $$0;
   }

   public CompletableFuture<erz> a(ajh $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               erz var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  erx $$2 = new erx($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new erz($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gni> a(ajh $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gni)($$1 ? new gnk(erx::new, $$2) : new erx($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(erz::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gmj> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
