import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hfx implements auj, AutoCloseable {
   private final her a;
   private final akv b;
   private final Set<atp<?>> c;

   public hfx(heu $$0, akv $$1, akv $$2) {
      this($$0, $$1, $$2, hen.a);
   }

   public hfx(heu $$0, akv $$1, akv $$2, Set<atp<?>> $$3) {
      this.b = $$2;
      this.a = new her($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected hes a(akv $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      return hen.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hen.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(hen.a $$0) {
      try (boy $$1 = bos.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.f();
   }
}
