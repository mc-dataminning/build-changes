import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gnp {
   private final asr a;
   private final Map<ajh, CompletableFuture<esb>> b = Maps.newHashMap();

   public gnp(asr $$0) {
      this.a = $$0;
   }

   public CompletableFuture<esb> a(ajh $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               esb var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  erz $$2 = new erz($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new esb($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gnl> a(ajh $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gnl)($$1 ? new gnn(erz::new, $$2) : new erz($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(esb::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gmm> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
