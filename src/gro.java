import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gro implements AutoCloseable {
   private final Map<akk, gro.a> a;

   public gro(Map<akk, akk> $$0, gpp $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gpn $$2 = new gpn((akk)$$1x.getKey());
         $$1.a((akk)$$1x.getKey(), $$2);
         return new gro.a($$2, (akk)$$1x.getValue());
      }));
   }

   public gpn a(akk $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gro.a::close);
      this.a.clear();
   }

   public Map<akk, CompletableFuture<gro.b>> a(atw $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gro.a $$4 = $$3.getValue();
         return gpj.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gro.b($$4.a, $$1xx));
      }));
   }

   static record a(gpn a, akk b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gpn a;
      private final gpj.a b;

      public b(gpn $$0, gpj.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gpo a(akk $$0) {
         return this.b.f().get($$0);
      }

      public gpo a() {
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
