import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class hga {
   private final Set<hga.a> a = Sets.newIdentityHashSet();
   final fed b;
   final Executor c;

   public hga(fed $$0, Executor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public CompletableFuture<hga.a> a(fed.c $$0) {
      CompletableFuture<hga.a> $$1 = new CompletableFuture<>();
      this.c.execute(() -> {
         fec $$2 = this.b.a($$0);
         if ($$2 != null) {
            hga.a $$3 = new hga.a($$2);
            this.a.add($$3);
            $$1.complete($$3);
         } else {
            $$1.complete(null);
         }
      });
      return $$1;
   }

   public void a(Consumer<Stream<fec>> $$0) {
      this.c.execute(() -> $$0.accept(this.a.stream().map($$0xx -> $$0xx.b).filter(Objects::nonNull)));
   }

   public void a() {
      this.c.execute(() -> {
         Iterator<hga.a> $$0 = this.a.iterator();

         while ($$0.hasNext()) {
            hga.a $$1 = $$0.next();
            $$1.b.j();
            if ($$1.b.h()) {
               $$1.b();
               $$0.remove();
            }
         }
      });
   }

   public void b() {
      this.a.forEach(hga.a::b);
      this.a.clear();
   }

   public class a {
      @Nullable
      fec b;
      private boolean c;

      public boolean a() {
         return this.c;
      }

      public a(final fec $$1) {
         this.b = $$1;
      }

      public void a(Consumer<fec> $$0) {
         hga.this.c.execute(() -> {
            if (this.b != null) {
               $$0.accept(this.b);
            }
         });
      }

      public void b() {
         this.c = true;
         hga.this.b.a(this.b);
         this.b = null;
      }
   }
}
