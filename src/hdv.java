import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class hdv {
   private final Set<hdv.a> a = Sets.newIdentityHashSet();
   final fce b;
   final Executor c;

   public hdv(fce $$0, Executor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public CompletableFuture<hdv.a> a(fce.c $$0) {
      CompletableFuture<hdv.a> $$1 = new CompletableFuture<>();
      this.c.execute(() -> {
         fcd $$2 = this.b.a($$0);
         if ($$2 != null) {
            hdv.a $$3 = new hdv.a($$2);
            this.a.add($$3);
            $$1.complete($$3);
         } else {
            $$1.complete(null);
         }
      });
      return $$1;
   }

   public void a(Consumer<Stream<fcd>> $$0) {
      this.c.execute(() -> $$0.accept(this.a.stream().map($$0xx -> $$0xx.b).filter(Objects::nonNull)));
   }

   public void a() {
      this.c.execute(() -> {
         Iterator<hdv.a> $$0 = this.a.iterator();

         while ($$0.hasNext()) {
            hdv.a $$1 = $$0.next();
            $$1.b.j();
            if ($$1.b.h()) {
               $$1.b();
               $$0.remove();
            }
         }
      });
   }

   public void b() {
      this.a.forEach(hdv.a::b);
      this.a.clear();
   }

   public class a {
      @Nullable
      fcd b;
      private boolean c;

      public boolean a() {
         return this.c;
      }

      public a(final fcd $$1) {
         this.b = $$1;
      }

      public void a(Consumer<fcd> $$0) {
         hdv.this.c.execute(() -> {
            if (this.b != null) {
               $$0.accept(this.b);
            }
         });
      }

      public void b() {
         this.c = true;
         hdv.this.b.a(this.b);
         this.b = null;
      }
   }
}
