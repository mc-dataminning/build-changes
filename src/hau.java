import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hau implements AutoCloseable {
   private final Map<all, hau.a> a;

   public hau(Map<all, all> $$0, gyu $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gys $$2 = new gys((all)$$1x.getKey());
         $$1.a((all)$$1x.getKey(), $$2);
         return new hau.a($$2, (all)$$1x.getValue());
      }));
   }

   public gys a(all $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hau.a::close);
      this.a.clear();
   }

   public Map<all, CompletableFuture<hau.b>> a(ave $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hau.a $$4 = $$3.getValue();
         return gyo.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hau.b($$4.a, $$1xx));
      }));
   }

   static record a(gys a, all b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final gys a;
      private final gyo.a b;

      public b(gys $$0, gyo.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gyt a(all $$0) {
         return this.b.f().get($$0);
      }

      public gyt a() {
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
