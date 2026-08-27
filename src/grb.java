import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class grb {
   private final atr a;
   private final Map<akf, CompletableFuture<evn>> b = Maps.newHashMap();

   public grb(atr $$0) {
      this.a = $$0;
   }

   public CompletableFuture<evn> a(akf $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               evn var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  evl $$2 = new evl($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new evn($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gqx> a(akf $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gqx)($$1 ? new gqz(evl::new, $$2) : new evl($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(evn::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gpy> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
