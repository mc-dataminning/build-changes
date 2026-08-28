import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hpz {
   private final avi a;
   private final Map<ali, CompletableFuture<fic>> b = Maps.newHashMap();

   public hpz(avi $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fic> a(ali $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fic var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hpt $$2 = new hpv($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fic($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ag.j()));
   }

   public CompletableFuture<hpq> a(ali $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hpq)($$1 ? new hpw(hpv::new, $$2) : new hpv($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ag.j());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fic::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hou> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
