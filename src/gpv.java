import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gpv implements AutoCloseable {
   private final Map<akm, gpv.a> a;

   public gpv(Map<akm, akm> $$0, gnw $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gnu $$2 = new gnu((akm)$$1x.getKey());
         $$1.a((akm)$$1x.getKey(), $$2);
         return new gpv.a($$2, (akm)$$1x.getValue());
      }));
   }

   public gnu a(akm $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gpv.a::close);
      this.a.clear();
   }

   public Map<akm, CompletableFuture<gpv.b>> a(atw $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gpv.a $$4 = $$3.getValue();
         return gnq.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gpv.b($$4.a, $$1xx));
      }));
   }

   static record a(gnu a, akm b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gnu a;
      private final gnq.a b;

      public b(gnu $$0, gnq.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gnv a(akm $$0) {
         return this.b.f().get($$0);
      }

      public gnv a() {
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
