import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class guu {
   private final aug a;
   private final Map<akq, CompletableFuture<ezd>> b = Maps.newHashMap();

   public guu(aug $$0) {
      this.a = $$0;
   }

   public CompletableFuture<ezd> a(akq $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               ezd var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  gup $$2 = new gur($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new ezd($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ad.i()));
   }

   public CompletableFuture<gum> a(akq $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gum)($$1 ? new gus(gur::new, $$2) : new gur($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ad.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(ezd::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gtq> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
