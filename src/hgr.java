import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hgr implements AutoCloseable {
   private final Map<akv, hgr.a> a;

   public hgr(Map<akv, akv> $$0, heu $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         her $$2 = new her((akv)$$1x.getKey());
         $$1.a((akv)$$1x.getKey(), $$2);
         return new hgr.a($$2, (akv)$$1x.getValue());
      }));
   }

   public her a(akv $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hgr.a::close);
      this.a.clear();
   }

   public Map<akv, CompletableFuture<hgr.b>> a(aup $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hgr.a $$4 = $$3.getValue();
         return hen.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hgr.b($$4.a, $$1xx));
      }));
   }

   static record a(her a, akv b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final her a;
      private final hen.a b;

      public b(her $$0, hen.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hes a(akv $$0) {
         return this.b.f().get($$0);
      }

      public hes a() {
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
