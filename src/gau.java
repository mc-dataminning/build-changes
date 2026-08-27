import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gau implements AutoCloseable {
   private final Map<aer, gau.a> a;

   public gau(Map<aer, aer> $$0, fyv $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         fyt $$2 = new fyt((aer)$$1x.getKey());
         $$1.a((aer)$$1x.getKey(), $$2);
         return new gau.a($$2, (aer)$$1x.getValue());
      }));
   }

   public fyt a(aer $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gau.a::close);
      this.a.clear();
   }

   public Map<aer, CompletableFuture<gau.b>> a(anm $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gau.a $$4 = $$3.getValue();
         return fyp.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gau.b($$4.a, $$1xx));
      }));
   }

   static record a(fyt a, aer b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final fyt a;
      private final fyp.a b;

      public b(fyt $$0, fyp.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public fyu a(aer $$0) {
         return this.b.f().get($$0);
      }

      public fyu a() {
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
