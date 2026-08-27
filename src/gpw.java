import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class gpw {
   private final atf a;
   private final Map<ajt, CompletableFuture<eui>> b = Maps.newHashMap();

   public gpw(atf $$0) {
      this.a = $$0;
   }

   public CompletableFuture<eui> a(ajt $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
            try {
               eui var5;
               try (
                  InputStream $$1 = this.a.open($$0x);
                  eug $$2 = new eug($$1);
               ) {
                  ByteBuffer $$3 = $$2.b();
                  var5 = new eui($$3, $$2.a());
               }

               return var5;
            } catch (IOException var10) {
               throw new CompletionException(var10);
            }
         }, ac.f()));
   }

   public CompletableFuture<gps> a(ajt $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (gps)($$1 ? new gpu(eug::new, $$2) : new eug($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ac.f());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(eui::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<got> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
