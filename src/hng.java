import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class hng {
   private final Set<hng.a> a = Sets.newIdentityHashSet();
   final fgp b;
   final Executor c;

   public hng(fgp $$0, Executor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public CompletableFuture<hng.a> a(fgp.c $$0) {
      CompletableFuture<hng.a> $$1 = new CompletableFuture<>();
      this.c.execute(() -> {
         fgo $$2 = this.b.a($$0);
         if ($$2 != null) {
            hng.a $$3 = new hng.a($$2);
            this.a.add($$3);
            $$1.complete($$3);
         } else {
            $$1.complete(null);
         }
      });
      return $$1;
   }

   public void a(Consumer<Stream<fgo>> $$0) {
      this.c.execute(() -> $$0.accept(this.a.stream().map($$0xx -> $$0xx.b).filter(Objects::nonNull)));
   }

   public void a() {
      this.c.execute(() -> {
         Iterator<hng.a> $$0 = this.a.iterator();

         while ($$0.hasNext()) {
            hng.a $$1 = $$0.next();
            $$1.b.j();
            if ($$1.b.h()) {
               $$1.b();
               $$0.remove();
            }
         }
      });
   }

   public void b() {
      this.a.forEach(hng.a::b);
      this.a.clear();
   }

   public class a {
      @Nullable
      fgo b;
      private boolean c;

      public boolean a() {
         return this.c;
      }

      public a(final fgo $$1) {
         this.b = $$1;
      }

      public void a(Consumer<fgo> $$0) {
         hng.this.c.execute(() -> {
            if (this.b != null) {
               $$0.accept(this.b);
            }
         });
      }

      public void b() {
         this.c = true;
         hng.this.b.a(this.b);
         this.b = null;
      }
   }
}
