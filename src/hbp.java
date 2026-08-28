import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class hbp {
   private final Set<hbp.a> a = Sets.newIdentityHashSet();
   final faw b;
   final Executor c;

   public hbp(faw $$0, Executor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public CompletableFuture<hbp.a> a(faw.c $$0) {
      CompletableFuture<hbp.a> $$1 = new CompletableFuture<>();
      this.c.execute(() -> {
         fav $$2 = this.b.a($$0);
         if ($$2 != null) {
            hbp.a $$3 = new hbp.a($$2);
            this.a.add($$3);
            $$1.complete($$3);
         } else {
            $$1.complete(null);
         }
      });
      return $$1;
   }

   public void a(Consumer<Stream<fav>> $$0) {
      this.c.execute(() -> $$0.accept(this.a.stream().map($$0xx -> $$0xx.b).filter(Objects::nonNull)));
   }

   public void a() {
      this.c.execute(() -> {
         Iterator<hbp.a> $$0 = this.a.iterator();

         while ($$0.hasNext()) {
            hbp.a $$1 = $$0.next();
            $$1.b.j();
            if ($$1.b.h()) {
               $$1.b();
               $$0.remove();
            }
         }
      });
   }

   public void b() {
      this.a.forEach(hbp.a::b);
      this.a.clear();
   }

   public class a {
      @Nullable
      fav b;
      private boolean c;

      public boolean a() {
         return this.c;
      }

      public a(final fav $$1) {
         this.b = $$1;
      }

      public void a(Consumer<fav> $$0) {
         hbp.this.c.execute(() -> {
            if (this.b != null) {
               $$0.accept(this.b);
            }
         });
      }

      public void b() {
         this.c = true;
         hbp.this.b.a(this.b);
         this.b = null;
      }
   }
}
