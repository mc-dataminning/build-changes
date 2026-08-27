import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class goy implements AutoCloseable {
   private final Map<akh, goy.a> a;

   public goy(Map<akh, akh> $$0, gmz $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gmx $$2 = new gmx((akh)$$1x.getKey());
         $$1.a((akh)$$1x.getKey(), $$2);
         return new goy.a($$2, (akh)$$1x.getValue());
      }));
   }

   public gmx a(akh $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(goy.a::close);
      this.a.clear();
   }

   public Map<akh, CompletableFuture<goy.b>> a(atr $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         goy.a $$4 = $$3.getValue();
         return gmt.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new goy.b($$4.a, $$1xx));
      }));
   }

   static record a(gmx a, akh b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gmx a;
      private final gmt.a b;

      public b(gmx $$0, gmt.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gmy a(akh $$0) {
         return this.b.f().get($$0);
      }

      public gmy a() {
         return this.b.e();
      }

      public CompletableFuture<Void> b() {
         return this.b.g();
      }

      public void c() {
         this.a.a(this.b);
      }
   }
}
