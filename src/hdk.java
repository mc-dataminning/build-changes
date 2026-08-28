import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hdk implements AutoCloseable {
   private final Map<alz, hdk.a> a;

   public hdk(Map<alz, alz> $$0, hbk $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hbi $$2 = new hbi((alz)$$1x.getKey());
         $$1.a((alz)$$1x.getKey(), $$2);
         return new hdk.a($$2, (alz)$$1x.getValue());
      }));
   }

   public hbi a(alz $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hdk.a::close);
      this.a.clear();
   }

   public Map<alz, CompletableFuture<hdk.b>> a(avv $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hdk.a $$4 = $$3.getValue();
         return hbe.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hdk.b($$4.a, $$1xx));
      }));
   }

   static record a(hbi a, alz b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final hbi a;
      private final hbe.a b;

      public b(hbi $$0, hbe.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hbj a(alz $$0) {
         return this.b.f().get($$0);
      }

      public hbj a() {
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
