import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hbf {
   private final auv a;
   private final Map<alb, CompletableFuture<fal>> b = Maps.newHashMap();

   public hbf(auv $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fal> a(alb $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fal var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hba $$2 = new hbc($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fal($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ad.i()));
   }

   public CompletableFuture<hax> a(alb $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hax)($$1 ? new hbd(hbc::new, $$2) : new hbc($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ad.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fal::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hab> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
