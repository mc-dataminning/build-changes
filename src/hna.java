import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hna implements AutoCloseable {
   private final Map<ali, hna.a> a;

   public hna(Map<ali, ali> $$0, hlc $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hkz $$2 = new hkz((ali)$$1x.getKey());
         $$1.a((ali)$$1x.getKey(), $$2);
         return new hna.a($$2, (ali)$$1x.getValue());
      }));
   }

   public hkz a(ali $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hna.a::close);
      this.a.clear();
   }

   public Map<ali, CompletableFuture<hna.b>> a(avf $$0, int $$1, Executor $$2) {
      return ag.a(
         this.a, (Function<? super hna.a, CompletableFuture<hna.b>>)($$3 -> hkv.a($$3.a).a($$0, $$3.b, $$1, $$2).thenApply($$1xx -> new hna.b($$3.a, $$1xx)))
      );
   }

   static record a(hkz a, ali b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.d();
      }
   }

   public static class b {
      private final hkz a;
      private final hkv.a b;

      public b(hkz $$0, hkv.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hla a(ali $$0) {
         return this.b.f().get($$0);
      }

      public hla a() {
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
