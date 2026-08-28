import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class gzh implements auu, AutoCloseable {
   private final gyc a;
   private final ali b;
   private final Set<atz<?>> c;

   public gzh(gye $$0, ali $$1, ali $$2) {
      this($$0, $$1, $$2, gxy.a);
   }

   public gzh(gye $$0, ali $$1, ali $$2, Set<atz<?>> $$3) {
      this.b = $$2;
      this.a = new gyc($$1);
      $$0.a(this.a.h(), this.a);
      this.c = $$3;
   }

   protected gyd a(ali $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> a(auu.a $$0, avb $$1, Executor $$2, Executor $$3) {
      return gxy.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(gxy.a::a).thenCompose($$0::a).thenAcceptAsync(this::a, $$3);
   }

   private void a(gxy.a $$0) {
      try (bos $$1 = bom.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.g();
   }
}
