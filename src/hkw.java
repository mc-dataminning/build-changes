import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hkw implements AutoCloseable {
   private final Map<alg, hkw.a> a;

   public hkw(Map<alg, alg> $$0, hiz $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hiw $$2 = new hiw((alg)$$1x.getKey());
         $$1.a((alg)$$1x.getKey(), $$2);
         return new hkw.a($$2, (alg)$$1x.getValue());
      }));
   }

   public hiw a(alg $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hkw.a::close);
      this.a.clear();
   }

   public Map<alg, CompletableFuture<hkw.b>> a(avd $$0, int $$1, Executor $$2) {
      return af.a(
         this.a, (Function<? super hkw.a, CompletableFuture<hkw.b>>)($$3 -> his.a($$3.a).a($$0, $$3.b, $$1, $$2).thenApply($$1xx -> new hkw.b($$3.a, $$1xx)))
      );
   }

   static record a(hiw a, alg b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final hiw a;
      private final his.a b;

      public b(hiw $$0, his.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hix a(alg $$0) {
         return this.b.f().get($$0);
      }

      public hix a() {
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
