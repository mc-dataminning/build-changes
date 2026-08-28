import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hdm implements AutoCloseable {
   private final Map<alz, hdm.a> a;

   public hdm(Map<alz, alz> $$0, hbm $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hbk $$2 = new hbk((alz)$$1x.getKey());
         $$1.a((alz)$$1x.getKey(), $$2);
         return new hdm.a($$2, (alz)$$1x.getValue());
      }));
   }

   public hbk a(alz $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hdm.a::close);
      this.a.clear();
   }

   public Map<alz, CompletableFuture<hdm.b>> a(avv $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hdm.a $$4 = $$3.getValue();
         return hbg.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hdm.b($$4.a, $$1xx));
      }));
   }

   static record a(hbk a, alz b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final hbk a;
      private final hbg.a b;

      public b(hbk $$0, hbg.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hbl a(alz $$0) {
         return this.b.f().get($$0);
      }

      public hbl a() {
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
