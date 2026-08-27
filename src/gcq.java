import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class gcq {
   private final Set<gcq.a> a = Sets.newIdentityHashSet();
   final ejc b;
   final Executor c;

   public gcq(ejc $$0, Executor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public CompletableFuture<gcq.a> a(ejc.c $$0) {
      CompletableFuture<gcq.a> $$1 = new CompletableFuture<>();
      this.c.execute(() -> {
         ejb $$2 = this.b.a($$0);
         if ($$2 != null) {
            gcq.a $$3 = new gcq.a($$2);
            this.a.add($$3);
            $$1.complete($$3);
         } else {
            $$1.complete(null);
         }
      });
      return $$1;
   }

   public void a(Consumer<Stream<ejb>> $$0) {
      this.c.execute(() -> $$0.accept(this.a.stream().map($$0xx -> $$0xx.b).filter(Objects::nonNull)));
   }

   public void a() {
      this.c.execute(() -> {
         Iterator<gcq.a> $$0 = this.a.iterator();

         while ($$0.hasNext()) {
            gcq.a $$1 = $$0.next();
            $$1.b.j();
            if ($$1.b.h()) {
               $$1.b();
               $$0.remove();
            }
         }
      });
   }

   public void b() {
      this.a.forEach(gcq.a::b);
      this.a.clear();
   }

   public class a {
      @Nullable
      ejb b;
      private boolean c;

      public boolean a() {
         return this.c;
      }

      public a(ejb $$1) {
         this.b = $$1;
      }

      public void a(Consumer<ejb> $$0) {
         gcq.this.c.execute(() -> {
            if (this.b != null) {
               $$0.accept(this.b);
            }
         });
      }

      public void b() {
         this.c = true;
         gcq.this.b.a(this.b);
         this.b = null;
      }
   }
}
