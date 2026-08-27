import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class kn implements kk {
   private final km.a d;
   private final List<ko> e;
   private final CompletableFuture<ij.b> f;

   public kn(km $$0, CompletableFuture<ij.b> $$1, List<ko> $$2) {
      this.d = $$0.a(km.b.a, "advancements");
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(ki $$0) {
      return this.f.thenCompose($$1 -> {
         Set<ahd> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<af> $$4 = $$3x -> {
            if (!$$2.add($$3x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$3x.a());
            } else {
               Path $$4x = this.d.a($$3x.a());
               $$3.add(kk.a($$0, ae.a, $$3x.b(), $$4x));
            }
         };

         for (ko $$5 : this.e) {
            $$5.a($$1, $$4);
         }

         return CompletableFuture.allOf($$3.toArray(CompletableFuture[]::new));
      });
   }

   @Override
   public final String a() {
      return "Advancements";
   }
}
