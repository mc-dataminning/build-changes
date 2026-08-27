import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gfi implements apw, AutoCloseable {
   private final gee a;
   private final ahd b;
   private final Set<apc<?>> c;

   public gfi(geg $$0, ahd $$1, ahd $$2) {
      this($$0, $$1, $$2, gea.a);
   }

   public gfi(geg $$0, ahd $$1, ahd $$2, Set<apc<?>> $$3) {
      this.b = $$2;
      this.a = new gee($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected gef a(ahd $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(apw.a $$0, aqc $$1, bgm $$2, bgm $$3, Executor $$4, Executor $$5) {
      return gea.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gea.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gea.a $$0, bgm $$1) {
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
