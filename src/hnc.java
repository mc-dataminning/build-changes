import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hnc implements AutoCloseable {
   private final Map<alk, hnc.a> a;

   public hnc(Map<alk, alk> $$0, hle $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hlb $$2 = new hlb((alk)$$1x.getKey());
         $$1.a((alk)$$1x.getKey(), $$2);
         return new hnc.a($$2, (alk)$$1x.getValue());
      }));
   }

   public hlb a(alk $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hnc.a::close);
      this.a.clear();
   }

   public Map<alk, CompletableFuture<hnc.b>> a(avh $$0, int $$1, Executor $$2) {
      return ag.a(
         this.a, (Function<? super hnc.a, CompletableFuture<hnc.b>>)($$3 -> hkx.a($$3.a).a($$0, $$3.b, $$1, $$2).thenApply($$1xx -> new hnc.b($$3.a, $$1xx)))
      );
   }

   static record a(hlb a, alk b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.d();
      }
   }

   public static class b {
      private final hlb a;
      private final hkx.a b;

      public b(hlb $$0, hkx.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hlc a(alk $$0) {
         return this.b.f().get($$0);
      }

      public hlc a() {
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
