import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hdf implements AutoCloseable {
   private final Map<alz, hdf.a> a;

   public hdf(Map<alz, alz> $$0, hbf $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hbd $$2 = new hbd((alz)$$1x.getKey());
         $$1.a((alz)$$1x.getKey(), $$2);
         return new hdf.a($$2, (alz)$$1x.getValue());
      }));
   }

   public hbd a(alz $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hdf.a::close);
      this.a.clear();
   }

   public Map<alz, CompletableFuture<hdf.b>> a(avv $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hdf.a $$4 = $$3.getValue();
         return haz.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hdf.b($$4.a, $$1xx));
      }));
   }

   static record a(hbd a, alz b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final hbd a;
      private final haz.a b;

      public b(hbd $$0, haz.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hbe a(alz $$0) {
         return this.b.f().get($$0);
      }

      public hbe a() {
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
