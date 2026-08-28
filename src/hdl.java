import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hdl implements AutoCloseable {
   private final Map<alz, hdl.a> a;

   public hdl(Map<alz, alz> $$0, hbl $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hbj $$2 = new hbj((alz)$$1x.getKey());
         $$1.a((alz)$$1x.getKey(), $$2);
         return new hdl.a($$2, (alz)$$1x.getValue());
      }));
   }

   public hbj a(alz $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hdl.a::close);
      this.a.clear();
   }

   public Map<alz, CompletableFuture<hdl.b>> a(avv $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hdl.a $$4 = $$3.getValue();
         return hbf.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hdl.b($$4.a, $$1xx));
      }));
   }

   static record a(hbj a, alz b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final hbj a;
      private final hbf.a b;

      public b(hbj $$0, hbf.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hbk a(alz $$0) {
         return this.b.f().get($$0);
      }

      public hbk a() {
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
