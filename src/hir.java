import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hir implements AutoCloseable {
   private final Map<ald, hir.a> a;

   public hir(Map<ald, ald> $$0, hgu $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hgr $$2 = new hgr((ald)$$1x.getKey());
         $$1.a((ald)$$1x.getKey(), $$2);
         return new hir.a($$2, (ald)$$1x.getValue());
      }));
   }

   public hgr a(ald $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hir.a::close);
      this.a.clear();
   }

   public Map<ald, CompletableFuture<hir.b>> a(ava $$0, int $$1, Executor $$2) {
      return af.a(
         this.a, (Function<? super hir.a, CompletableFuture<hir.b>>)($$3 -> hgn.a($$3.a).a($$0, $$3.b, $$1, $$2).thenApply($$1xx -> new hir.b($$3.a, $$1xx)))
      );
   }

   static record a(hgr a, ald b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final hgr a;
      private final hgn.a b;

      public b(hgr $$0, hgn.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hgs a(ald $$0) {
         return this.b.f().get($$0);
      }

      public hgs a() {
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
