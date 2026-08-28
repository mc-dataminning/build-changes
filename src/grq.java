import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class grq implements AutoCloseable {
   private final Map<akk, grq.a> a;

   public grq(Map<akk, akk> $$0, gpr $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gpp $$2 = new gpp((akk)$$1x.getKey());
         $$1.a((akk)$$1x.getKey(), $$2);
         return new grq.a($$2, (akk)$$1x.getValue());
      }));
   }

   public gpp a(akk $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(grq.a::close);
      this.a.clear();
   }

   public Map<akk, CompletableFuture<grq.b>> a(atw $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         grq.a $$4 = $$3.getValue();
         return gpl.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new grq.b($$4.a, $$1xx));
      }));
   }

   static record a(gpp a, akk b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gpp a;
      private final gpl.a b;

      public b(gpp $$0, gpl.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gpq a(akk $$0) {
         return this.b.f().get($$0);
      }

      public gpq a() {
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
