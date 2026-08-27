import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gah implements ann, AutoCloseable {
   private final fzd a;
   private final aew b;
   private final Set<amt<?>> c;

   public gah(fzf $$0, aew $$1, aew $$2) {
      this($$0, $$1, $$2, fyz.a);
   }

   public gah(fzf $$0, aew $$1, aew $$2, Set<amt<?>> $$3) {
      this.b = $$2;
      this.a = new fzd($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected fze a(aew $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(ann.a $$0, ant $$1, bdp $$2, bdp $$3, Executor $$4, Executor $$5) {
      return fyz.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(fyz.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(fyz.a $$0, bdp $$1) {
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
