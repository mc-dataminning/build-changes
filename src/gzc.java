import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gzc implements AutoCloseable {
   private final Map<alc, gzc.a> a;

   public gzc(Map<alc, alc> $$0, gxc $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gxa $$2 = new gxa((alc)$$1x.getKey());
         $$1.a((alc)$$1x.getKey(), $$2);
         return new gzc.a($$2, (alc)$$1x.getValue());
      }));
   }

   public gxa a(alc $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gzc.a::close);
      this.a.clear();
   }

   public Map<alc, CompletableFuture<gzc.b>> a(aut $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gzc.a $$4 = $$3.getValue();
         return gww.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gzc.b($$4.a, $$1xx));
      }));
   }

   static record a(gxa a, alc b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final gxa a;
      private final gww.a b;

      public b(gxa $$0, gww.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gxb a(alc $$0) {
         return this.b.f().get($$0);
      }

      public gxb a() {
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
