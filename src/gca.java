import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gca implements AutoCloseable {
   private final Map<afw, gca.a> a;

   public gca(Map<afw, afw> $$0, gab $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         fzz $$2 = new fzz((afw)$$1x.getKey());
         $$1.a((afw)$$1x.getKey(), $$2);
         return new gca.a($$2, (afw)$$1x.getValue());
      }));
   }

   public fzz a(afw $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gca.a::close);
      this.a.clear();
   }

   public Map<afw, CompletableFuture<gca.b>> a(aot $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gca.a $$4 = $$3.getValue();
         return fzv.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gca.b($$4.a, $$1xx));
      }));
   }

   static record a(fzz a, afw b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final fzz a;
      private final fzv.a b;

      public b(fzz $$0, fzv.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gaa a(afw $$0) {
         return this.b.f().get($$0);
      }

      public gaa a() {
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
