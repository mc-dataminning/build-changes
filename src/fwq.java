import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fwq implements AutoCloseable {
   private final Map<acq, fwq.a> a;

   public fwq(Map<acq, acq> $$0, fuw $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         fuu $$2 = new fuu((acq)$$1x.getKey());
         $$1.a((acq)$$1x.getKey(), $$2);
         return new fwq.a($$2, (acq)$$1x.getValue());
      }));
   }

   public fuu a(acq $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(fwq.a::close);
      this.a.clear();
   }

   public Map<acq, CompletableFuture<fwq.b>> a(akx $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         fwq.a $$4 = $$3.getValue();
         return fuq.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new fwq.b($$4.a, $$1xx));
      }));
   }

   static record a(fuu a, acq b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final fuu a;
      private final fuq.a b;

      public b(fuu $$0, fuq.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public fuv a(acq $$0) {
         return this.b.f().get($$0);
      }

      public fuv a() {
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
