import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hdb {
   private final ave a;
   private final Map<ali, CompletableFuture<fbx>> b = Maps.newHashMap();

   public hdb(ave $$0) {
      this.a = $$0;
   }

   public CompletableFuture<fbx> a(ali $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               fbx var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  hcw $$2 = new hcy($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new fbx($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ae.i()));
   }

   public CompletableFuture<hct> a(ali $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hct)($$1 ? new hcz(hcy::new, $$2) : new hcy($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ae.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(fbx::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hbx> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
