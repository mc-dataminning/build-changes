import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hhq implements AutoCloseable {
   private final Map<aku, hhq.a> a;

   public hhq(Map<aku, aku> $$0, hft $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hfq $$2 = new hfq((aku)$$1x.getKey());
         $$1.a((aku)$$1x.getKey(), $$2);
         return new hhq.a($$2, (aku)$$1x.getValue());
      }));
   }

   public hfq a(aku $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hhq.a::close);
      this.a.clear();
   }

   public Map<aku, CompletableFuture<hhq.b>> a(aup $$0, int $$1, Executor $$2) {
      return af.a(
         this.a, (Function<? super hhq.a, CompletableFuture<hhq.b>>)($$3 -> hfm.a($$3.a).a($$0, $$3.b, $$1, $$2).thenApply($$1xx -> new hhq.b($$3.a, $$1xx)))
      );
   }

   static record a(hfq a, aku b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final hfq a;
      private final hfm.a b;

      public b(hfq $$0, hfm.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hfr a(aku $$0) {
         return this.b.f().get($$0);
      }

      public hfr a() {
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
