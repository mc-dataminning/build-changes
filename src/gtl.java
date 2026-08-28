import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class gtl {
   private final Set<gtl.a> a = Sets.newIdentityHashSet();
   final exv b;
   final Executor c;

   public gtl(exv $$0, Executor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public CompletableFuture<gtl.a> a(exv.c $$0) {
      CompletableFuture<gtl.a> $$1 = new CompletableFuture<>();
      this.c.execute(() -> {
         exu $$2 = this.b.a($$0);
         if ($$2 != null) {
            gtl.a $$3 = new gtl.a($$2);
            this.a.add($$3);
            $$1.complete($$3);
         } else {
            $$1.complete(null);
         }
      });
      return $$1;
   }

   public void a(Consumer<Stream<exu>> $$0) {
      this.c.execute(() -> $$0.accept(this.a.stream().map($$0xx -> $$0xx.b).filter(Objects::nonNull)));
   }

   public void a() {
      this.c.execute(() -> {
         Iterator<gtl.a> $$0 = this.a.iterator();

         while ($$0.hasNext()) {
            gtl.a $$1 = $$0.next();
            $$1.b.j();
            if ($$1.b.h()) {
               $$1.b();
               $$0.remove();
            }
         }
      });
   }

   public void b() {
      this.a.forEach(gtl.a::b);
      this.a.clear();
   }

   public class a {
      @Nullable
      exu b;
      private boolean c;

      public boolean a() {
         return this.c;
      }

      public a(final exu $$1) {
         this.b = $$1;
      }

      public void a(Consumer<exu> $$0) {
         gtl.this.c.execute(() -> {
            if (this.b != null) {
               $$0.accept(this.b);
            }
         });
      }

      public void b() {
         this.c = true;
         gtl.this.b.a(this.b);
         this.b = null;
      }
   }
}
