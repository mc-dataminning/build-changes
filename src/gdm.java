import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gdm {
   private final anx a;
   private final Map<aex, CompletableFuture<ejp>> b = Maps.newHashMap();

   public gdm(anx $$0) {
      this.a = $$0;
   }

   public CompletableFuture<ejp> a(aex $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               ejp var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  ejn $$2 = new ejn($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new ejp($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gdi> a(aex $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gdi)($$1 ? new gdk(ejn::new, $$2) : new ejn($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(ejp::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gcj> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
