import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gmu implements asy, AutoCloseable {
   private final glr a;
   private final ajv b;
   private final Set<asd<?>> c;

   public gmu(glt $$0, ajv $$1, ajv $$2) {
      this($$0, $$1, $$2, gln.a);
   }

   public gmu(glt $$0, ajv $$1, ajv $$2, Set<asd<?>> $$3) {
      this.b = $$2;
      this.a = new glr($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gls a(ajv $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(asy.a $$0, ate $$1, bkt $$2, bkt $$3, Executor $$4, Executor $$5) {
      return gln.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gln.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gln.a $$0, bkt $$1) {
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
