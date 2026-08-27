import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gbd implements aon, AutoCloseable {
   private final fzz a;
   private final afw b;
   private final Set<ant<?>> c;

   public gbd(gab $$0, afw $$1, afw $$2) {
      this($$0, $$1, $$2, fzv.a);
   }

   public gbd(gab $$0, afw $$1, afw $$2, Set<ant<?>> $$3) {
      this.b = $$2;
      this.a = new fzz($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gaa a(afw $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aon.a $$0, aot $$1, bes $$2, bes $$3, Executor $$4, Executor $$5) {
      return fzv.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(fzv.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(fzv.a $$0, bes $$1) {
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
