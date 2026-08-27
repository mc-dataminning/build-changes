import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class gqc {
   private final Set<gqc.a> a = Sets.newIdentityHashSet();
   final eum b;
   final Executor c;

   public gqc(eum $$0, Executor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public CompletableFuture<gqc.a> a(eum.c $$0) {
      CompletableFuture<gqc.a> $$1 = new CompletableFuture<>();
      this.c.execute(() -> {
         eul $$2 = this.b.a($$0);
         if ($$2 != null) {
            gqc.a $$3 = new gqc.a($$2);
            this.a.add($$3);
            $$1.complete($$3);
         } else {
            $$1.complete(null);
         }
      });
      return $$1;
   }

   public void a(Consumer<Stream<eul>> $$0) {
      this.c.execute(() -> $$0.accept(this.a.stream().map($$0xx -> $$0xx.b).filter(Objects::nonNull)));
   }

   public void a() {
      this.c.execute(() -> {
         Iterator<gqc.a> $$0 = this.a.iterator();

         while ($$0.hasNext()) {
            gqc.a $$1 = $$0.next();
            $$1.b.j();
            if ($$1.b.h()) {
               $$1.b();
               $$0.remove();
            }
         }
      });
   }

   public void b() {
      this.a.forEach(gqc.a::b);
      this.a.clear();
   }

   public class a {
      @Nullable
      eul b;
      private boolean c;

      public boolean a() {
         return this.c;
      }

      public a(eul $$1) {
         this.b = $$1;
      }

      public void a(Consumer<eul> $$0) {
         gqc.this.c.execute(() -> {
            if (this.b != null) {
               $$0.accept(this.b);
            }
         });
      }

      public void b() {
         this.c = true;
         gqc.this.b.a(this.b);
         this.b = null;
      }
   }
}
