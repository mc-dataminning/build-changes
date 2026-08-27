import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gon implements AutoCloseable {
   private final Map<akf, gon.a> a;

   public gon(Map<akf, akf> $$0, gmp $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gmn $$2 = new gmn((akf)$$1x.getKey());
         $$1.a((akf)$$1x.getKey(), $$2);
         return new gon.a($$2, (akf)$$1x.getValue());
      }));
   }

   public gmn a(akf $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gon.a::close);
      this.a.clear();
   }

   public Map<akf, CompletableFuture<gon.b>> a(ato $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gon.a $$4 = $$3.getValue();
         return gmj.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gon.b($$4.a, $$1xx));
      }));
   }

   static record a(gmn a, akf b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gmn a;
      private final gmj.a b;

      public b(gmn $$0, gmj.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gmo a(akf $$0) {
         return this.b.f().get($$0);
      }

      public gmo a() {
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
