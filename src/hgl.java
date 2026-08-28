import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hgl implements AutoCloseable {
   private final Map<aku, hgl.a> a;

   public hgl(Map<aku, aku> $$0, heo $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hel $$2 = new hel((aku)$$1x.getKey());
         $$1.a((aku)$$1x.getKey(), $$2);
         return new hgl.a($$2, (aku)$$1x.getValue());
      }));
   }

   public hel a(aku $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hgl.a::close);
      this.a.clear();
   }

   public Map<aku, CompletableFuture<hgl.b>> a(auo $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hgl.a $$4 = $$3.getValue();
         return heh.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hgl.b($$4.a, $$1xx));
      }));
   }

   static record a(hel a, aku b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final hel a;
      private final heh.a b;

      public b(hel $$0, heh.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hem a(aku $$0) {
         return this.b.f().get($$0);
      }

      public hem a() {
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
