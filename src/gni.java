import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gni implements AutoCloseable {
   private final Map<ajt, gni.a> a;

   public gni(Map<ajt, ajt> $$0, glk $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gli $$2 = new gli((ajt)$$1x.getKey());
         $$1.a((ajt)$$1x.getKey(), $$2);
         return new gni.a($$2, (ajt)$$1x.getValue());
      }));
   }

   public gli a(ajt $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gni.a::close);
      this.a.clear();
   }

   public Map<ajt, CompletableFuture<gni.b>> a(atc $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gni.a $$4 = $$3.getValue();
         return gle.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gni.b($$4.a, $$1xx));
      }));
   }

   static record a(gli a, ajt b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gli a;
      private final gle.a b;

      public b(gli $$0, gle.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public glj a(ajt $$0) {
         return this.b.f().get($$0);
      }

      public glj a() {
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
