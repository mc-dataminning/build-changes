import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gvb {
   private final auh a;
   private final Map<akr, CompletableFuture<ezj>> b = Maps.newHashMap();

   public gvb(auh $$0) {
      this.a = $$0;
   }

   public CompletableFuture<ezj> a(akr $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               ezj var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  guw $$2 = new guy($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new ezj($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ad.i()));
   }

   public CompletableFuture<gut> a(akr $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gut)($$1 ? new guz(guy::new, $$2) : new guy($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ad.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(ezj::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gtx> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
