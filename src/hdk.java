import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class hdk {
   private final Set<hdk.a> a = Sets.newIdentityHashSet();
   final fbx b;
   final Executor c;

   public hdk(fbx $$0, Executor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public CompletableFuture<hdk.a> a(fbx.c $$0) {
      CompletableFuture<hdk.a> $$1 = new CompletableFuture<>();
      this.c.execute(() -> {
         fbw $$2 = this.b.a($$0);
         if ($$2 != null) {
            hdk.a $$3 = new hdk.a($$2);
            this.a.add($$3);
            $$1.complete($$3);
         } else {
            $$1.complete(null);
         }
      });
      return $$1;
   }

   public void a(Consumer<Stream<fbw>> $$0) {
      this.c.execute(() -> $$0.accept(this.a.stream().map($$0xx -> $$0xx.b).filter(Objects::nonNull)));
   }

   public void a() {
      this.c.execute(() -> {
         Iterator<hdk.a> $$0 = this.a.iterator();

         while ($$0.hasNext()) {
            hdk.a $$1 = $$0.next();
            $$1.b.j();
            if ($$1.b.h()) {
               $$1.b();
               $$0.remove();
            }
         }
      });
   }

   public void b() {
      this.a.forEach(hdk.a::b);
      this.a.clear();
   }

   public class a {
      @Nullable
      fbw b;
      private boolean c;

      public boolean a() {
         return this.c;
      }

      public a(final fbw $$1) {
         this.b = $$1;
      }

      public void a(Consumer<fbw> $$0) {
         hdk.this.c.execute(() -> {
            if (this.b != null) {
               $$0.accept(this.b);
            }
         });
      }

      public void b() {
         this.c = true;
         hdk.this.b.a(this.b);
         this.b = null;
      }
   }
}
