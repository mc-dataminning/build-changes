import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gdo {
   private final any a;
   private final Map<aey, CompletableFuture<ejr>> b = Maps.newHashMap();

   public gdo(any $$0) {
      this.a = $$0;
   }

   public CompletableFuture<ejr> a(aey $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               ejr var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  ejp $$2 = new ejp($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new ejr($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gdk> a(aey $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gdk)($$1 ? new gdm(ejp::new, $$2) : new ejp($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(ejr::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gcl> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
