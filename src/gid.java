import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gid implements arv, AutoCloseable {
   private final gha a;
   private final aiy b;
   private final Set<arb<?>> c;

   public gid(ghc $$0, aiy $$1, aiy $$2) {
      this($$0, $$1, $$2, ggw.a);
   }

   public gid(ghc $$0, aiy $$1, aiy $$2, Set<arb<?>> $$3) {
      this.b = $$2;
      this.a = new gha($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected ghb a(aiy $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(arv.a $$0, asb $$1, bin $$2, bin $$3, Executor $$4, Executor $$5) {
      return ggw.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(ggw.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(ggw.a $$0, bin $$1) {
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
