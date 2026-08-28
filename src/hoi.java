import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class hoi {
   private final Set<hoi.a> a = Sets.newIdentityHashSet();
   final fhk b;
   final Executor c;

   public hoi(fhk $$0, Executor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public CompletableFuture<hoi.a> a(fhk.c $$0) {
      CompletableFuture<hoi.a> $$1 = new CompletableFuture<>();
      this.c.execute(() -> {
         fhj $$2 = this.b.a($$0);
         if ($$2 != null) {
            hoi.a $$3 = new hoi.a($$2);
            this.a.add($$3);
            $$1.complete($$3);
         } else {
            $$1.complete(null);
         }
      });
      return $$1;
   }

   public void a(Consumer<Stream<fhj>> $$0) {
      this.c.execute(() -> $$0.accept(this.a.stream().map($$0xx -> $$0xx.b).filter(Objects::nonNull)));
   }

   public void a() {
      this.c.execute(() -> {
         Iterator<hoi.a> $$0 = this.a.iterator();

         while ($$0.hasNext()) {
            hoi.a $$1 = $$0.next();
            $$1.b.j();
            if ($$1.b.h()) {
               $$1.b();
               $$0.remove();
            }
         }
      });
   }

   public void b() {
      this.a.forEach(hoi.a::b);
      this.a.clear();
   }

   public class a {
      @Nullable
      fhj b;
      private boolean c;

      public boolean a() {
         return this.c;
      }

      public a(final fhj $$1) {
         this.b = $$1;
      }

      public void a(Consumer<fhj> $$0) {
         hoi.this.c.execute(() -> {
            if (this.b != null) {
               $$0.accept(this.b);
            }
         });
      }

      public void b() {
         this.c = true;
         hoi.this.b.a(this.b);
         this.b = null;
      }
   }
}
