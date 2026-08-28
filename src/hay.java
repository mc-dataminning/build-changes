import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class hay {
   private final Set<hay.a> a = Sets.newIdentityHashSet();
   final fah b;
   final Executor c;

   public hay(fah $$0, Executor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public CompletableFuture<hay.a> a(fah.c $$0) {
      CompletableFuture<hay.a> $$1 = new CompletableFuture<>();
      this.c.execute(() -> {
         fag $$2 = this.b.a($$0);
         if ($$2 != null) {
            hay.a $$3 = new hay.a($$2);
            this.a.add($$3);
            $$1.complete($$3);
         } else {
            $$1.complete(null);
         }
      });
      return $$1;
   }

   public void a(Consumer<Stream<fag>> $$0) {
      this.c.execute(() -> $$0.accept(this.a.stream().map($$0xx -> $$0xx.b).filter(Objects::nonNull)));
   }

   public void a() {
      this.c.execute(() -> {
         Iterator<hay.a> $$0 = this.a.iterator();

         while ($$0.hasNext()) {
            hay.a $$1 = $$0.next();
            $$1.b.j();
            if ($$1.b.h()) {
               $$1.b();
               $$0.remove();
            }
         }
      });
   }

   public void b() {
      this.a.forEach(hay.a::b);
      this.a.clear();
   }

   public class a {
      @Nullable
      fag b;
      private boolean c;

      public boolean a() {
         return this.c;
      }

      public a(final fag $$1) {
         this.b = $$1;
      }

      public void a(Consumer<fag> $$0) {
         hay.this.c.execute(() -> {
            if (this.b != null) {
               $$0.accept(this.b);
            }
         });
      }

      public void b() {
         this.c = true;
         hay.this.b.a(this.b);
         this.b = null;
      }
   }
}
