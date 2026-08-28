import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hgk implements AutoCloseable {
   private final Map<aku, hgk.a> a;

   public hgk(Map<aku, aku> $$0, hek $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hei $$2 = new hei((aku)$$1x.getKey());
         $$1.a((aku)$$1x.getKey(), $$2);
         return new hgk.a($$2, (aku)$$1x.getValue());
      }));
   }

   public hei a(aku $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hgk.a::close);
      this.a.clear();
   }

   public Map<aku, CompletableFuture<hgk.b>> a(aup $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hgk.a $$4 = $$3.getValue();
         return hee.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hgk.b($$4.a, $$1xx));
      }));
   }

   static record a(hei a, aku b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final hei a;
      private final hee.a b;

      public b(hei $$0, hee.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hej a(aku $$0) {
         return this.b.f().get($$0);
      }

      public hej a() {
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
