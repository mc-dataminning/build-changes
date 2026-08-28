import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gud {
   private final atz a;
   private final Map<akk, CompletableFuture<eym>> b = Maps.newHashMap();

   public gud(atz $$0) {
      this.a = $$0;
   }

   public CompletableFuture<eym> a(akk $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               eym var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  gty $$2 = new gua($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new eym($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.i()));
   }

   public CompletableFuture<gtv> a(akk $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gtv)($$1 ? new gub(gua::new, $$2) : new gua($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.i());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(eym::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<gsz> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
