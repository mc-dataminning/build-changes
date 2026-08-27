import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gml implements asw, AutoCloseable {
   private final gli a;
   private final ajt b;
   private final Set<asb<?>> c;

   public gml(glk $$0, ajt $$1, ajt $$2) {
      this($$0, $$1, $$2, gle.a);
   }

   public gml(glk $$0, ajt $$1, ajt $$2, Set<asb<?>> $$3) {
      this.b = $$2;
      this.a = new gli($$1);
      $$0.a(this.a.g(), this.a);
      this.c = $$3;
   }

   protected glj a(ajt $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(asw.a $$0, atc $$1, bko $$2, bko $$3, Executor $$4, Executor $$5) {
      return gle.a(this.a).a($$1, this.b, 0, $$4, this.c).thenCompose(gle.a::a).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private void a(gle.a $$0, bko $$1) {
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
