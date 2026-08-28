import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hfy implements auj, AutoCloseable {
   private final hes a;
   private final akv b;
   private final Set<atp<?>> c;

   public hfy(hev $$0, akv $$1, akv $$2) {
      this($$0, $$1, $$2, heo.a);
   }

   public hfy(hev $$0, akv $$1, akv $$2, Set<atp<?>> $$3) {
      this.b = $$2;
      this.a = new hes($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected het a(akv $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      return heo.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(heo.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(heo.a $$0) {
      try (boz $$1 = bot.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.f();
   }
}
