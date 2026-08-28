import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class gtf {
   private final Set<gtf.a> a = Sets.newIdentityHashSet();
   final exp b;
   final Executor c;

   public gtf(exp $$0, Executor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public CompletableFuture<gtf.a> a(exp.c $$0) {
      CompletableFuture<gtf.a> $$1 = new CompletableFuture<>();
      this.c.execute(() -> {
         exo $$2 = this.b.a($$0);
         if ($$2 != null) {
            gtf.a $$3 = new gtf.a($$2);
            this.a.add($$3);
            $$1.complete($$3);
         } else {
            $$1.complete(null);
         }
      });
      return $$1;
   }

   public void a(Consumer<Stream<exo>> $$0) {
      this.c.execute(() -> $$0.accept(this.a.stream().map($$0xx -> $$0xx.b).filter(Objects::nonNull)));
   }

   public void a() {
      this.c.execute(() -> {
         Iterator<gtf.a> $$0 = this.a.iterator();

         while ($$0.hasNext()) {
            gtf.a $$1 = $$0.next();
            $$1.b.j();
            if ($$1.b.h()) {
               $$1.b();
               $$0.remove();
            }
         }
      });
   }

   public void b() {
      this.a.forEach(gtf.a::b);
      this.a.clear();
   }

   public class a {
      @Nullable
      exo b;
      private boolean c;

      public boolean a() {
         return this.c;
      }

      public a(final exo $$1) {
         this.b = $$1;
      }

      public void a(Consumer<exo> $$0) {
         gtf.this.c.execute(() -> {
            if (this.b != null) {
               $$0.accept(this.b);
            }
         });
      }

      public void b() {
         this.c = true;
         gtf.this.b.a(this.b);
         this.b = null;
      }
   }
}
