import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class gnj {
   private final Set<gnj.a> a = Sets.newIdentityHashSet();
   final eru b;
   final Executor c;

   public gnj(eru $$0, Executor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public CompletableFuture<gnj.a> a(eru.c $$0) {
      CompletableFuture<gnj.a> $$1 = new CompletableFuture<>();
      this.c.execute(() -> {
         ert $$2 = this.b.a($$0);
         if ($$2 != null) {
            gnj.a $$3 = new gnj.a($$2);
            this.a.add($$3);
            $$1.complete($$3);
         } else {
            $$1.complete(null);
         }
      });
      return $$1;
   }

   public void a(Consumer<Stream<ert>> $$0) {
      this.c.execute(() -> $$0.accept(this.a.stream().map($$0xx -> $$0xx.b).filter(Objects::nonNull)));
   }

   public void a() {
      this.c.execute(() -> {
         Iterator<gnj.a> $$0 = this.a.iterator();

         while ($$0.hasNext()) {
            gnj.a $$1 = $$0.next();
            $$1.b.j();
            if ($$1.b.h()) {
               $$1.b();
               $$0.remove();
            }
         }
      });
   }

   public void b() {
      this.a.forEach(gnj.a::b);
      this.a.clear();
   }

   public class a {
      @Nullable
      ert b;
      private boolean c;

      public boolean a() {
         return this.c;
      }

      public a(ert $$1) {
         this.b = $$1;
      }

      public void a(Consumer<ert> $$0) {
         gnj.this.c.execute(() -> {
            if (this.b != null) {
               $$0.accept(this.b);
            }
         });
      }

      public void b() {
         this.c = true;
         gnj.this.b.a(this.b);
         this.b = null;
      }
   }
}
