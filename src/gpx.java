import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gpx implements auf, AutoCloseable {
   private final got a;
   private final alb b;
   private final Set<atk<?>> c;

   public gpx(gov $$0, alb $$1, alb $$2) {
      this($$0, $$1, $$2, gop.a);
   }

   public gpx(gov $$0, alb $$1, alb $$2, Set<atk<?>> $$3) {
      this.b = $$2;
      this.a = new got($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gou a(alb $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auf.a $$0, aul $$1, bnd $$2, bnd $$3, Executor $$4, Executor $$5) {
      return gop.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gop.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gop.a $$0, bnd $$1) {
      $$1.a();
      $$1.a("upload");
      this.a.a($$0);
      $$1.c();
      $$1.b();
   }

   @Override
   public void close() {
      this.a.f();
   }
}
