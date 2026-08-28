import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hbf implements AutoCloseable {
   private final Map<alj, hbf.a> a;

   public hbf(Map<alj, alj> $$0, gzf $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gzd $$2 = new gzd((alj)$$1x.getKey());
         $$1.a((alj)$$1x.getKey(), $$2);
         return new hbf.a($$2, (alj)$$1x.getValue());
      }));
   }

   public gzd a(alj $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hbf.a::close);
      this.a.clear();
   }

   public Map<alj, CompletableFuture<hbf.b>> a(avd $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hbf.a $$4 = $$3.getValue();
         return gyz.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hbf.b($$4.a, $$1xx));
      }));
   }

   static record a(gzd a, alj b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final gzd a;
      private final gyz.a b;

      public b(gzd $$0, gyz.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gze a(alj $$0) {
         return this.b.f().get($$0);
      }

      public gze a() {
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
