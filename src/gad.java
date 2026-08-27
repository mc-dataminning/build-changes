import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gad implements anq, AutoCloseable {
   private final fyz a;
   private final aez b;
   private final Set<amw<?>> c;

   public gad(fzb $$0, aez $$1, aez $$2) {
      this($$0, $$1, $$2, fyv.a);
   }

   public gad(fzb $$0, aez $$1, aez $$2, Set<amw<?>> $$3) {
      this.b = $$2;
      this.a = new fyz($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected fza a(aez $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(anq.a $$0, anw $$1, bdv $$2, bdv $$3, Executor $$4, Executor $$5) {
      return fyv.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(fyv.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(fyv.a $$0, bdv $$1) {
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
