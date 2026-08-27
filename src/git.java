import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class git implements AutoCloseable {
   private final Map<aiy, git.a> a;

   public git(Map<aiy, aiy> $$0, ggv $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         ggt $$2 = new ggt((aiy)$$1x.getKey());
         $$1.a((aiy)$$1x.getKey(), $$2);
         return new git.a($$2, (aiy)$$1x.getValue());
      }));
   }

   public ggt a(aiy $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(git.a::close);
      this.a.clear();
   }

   public Map<aiy, CompletableFuture<git.b>> a(asa $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         git.a $$4 = $$3.getValue();
         return ggp.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new git.b($$4.a, $$1xx));
      }));
   }

   static record a(ggt a, aiy b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final ggt a;
      private final ggp.a b;

      public b(ggt $$0, ggp.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public ggu a(aiy $$0) {
         return this.b.f().get($$0);
      }

      public ggu a() {
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
