import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gbg implements AutoCloseable {
   private final Map<aey, gbg.a> a;

   public gbg(Map<aey, aey> $$0, fzh $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         fzf $$2 = new fzf((aey)$$1x.getKey());
         $$1.a((aey)$$1x.getKey(), $$2);
         return new gbg.a($$2, (aey)$$1x.getValue());
      }));
   }

   public fzf a(aey $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gbg.a::close);
      this.a.clear();
   }

   public Map<aey, CompletableFuture<gbg.b>> a(anv $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gbg.a $$4 = $$3.getValue();
         return fzb.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gbg.b($$4.a, $$1xx));
      }));
   }

   static record a(fzf a, aey b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final fzf a;
      private final fzb.a b;

      public b(fzf $$0, fzb.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public fzg a(aey $$0) {
         return this.b.f().get($$0);
      }

      public fzg a() {
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
