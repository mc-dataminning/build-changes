import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hfr implements aui, AutoCloseable {
   private final hel a;
   private final aku b;
   private final Set<ato<?>> c;

   public hfr(heo $$0, aku $$1, aku $$2) {
      this($$0, $$1, $$2, heh.a);
   }

   public hfr(heo $$0, aku $$1, aku $$2, Set<ato<?>> $$3) {
      this.b = $$2;
      this.a = new hel($$1);
      $$0.a(this.a.h(), this.a);
      this.c = $$3;
   }

   protected hem a(aku $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(aui.a $$0, auo $$1, Executor $$2, Executor $$3) {
      return heh.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(heh.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(heh.a $$0) {
      try (bow $$1 = boq.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.g();
   }
}
