import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hmq implements AutoCloseable {
   private final Map<alr, hmq.a> a;

   public hmq(Map<alr, alr> $$0, hks $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hkp $$2 = new hkp((alr)$$1x.getKey());
         $$1.a((alr)$$1x.getKey(), $$2);
         return new hmq.a($$2, (alr)$$1x.getValue());
      }));
   }

   public hkp a(alr $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hmq.a::close);
      this.a.clear();
   }

   public Map<alr, CompletableFuture<hmq.b>> a(avo $$0, int $$1, Executor $$2) {
      return ag.a(
         this.a, (Function<? super hmq.a, CompletableFuture<hmq.b>>)($$3 -> hkl.a($$3.a).a($$0, $$3.b, $$1, $$2).thenApply($$1xx -> new hmq.b($$3.a, $$1xx)))
      );
   }

   static record a(hkp a, alr b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.d();
      }
   }

   public static class b {
      private final hkp a;
      private final hkl.a b;

      public b(hkp $$0, hkl.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hkq a(alr $$0) {
         return this.b.f().get($$0);
      }

      public hkq a() {
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
