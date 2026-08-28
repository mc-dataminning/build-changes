import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class lz implements lw {
   private final ly.a d;
   private final List<ma> e;
   private final CompletableFuture<jk.a> f;

   public lz(ly $$0, CompletableFuture<jk.a> $$1, List<ma> $$2) {
      this.d = $$0.a(ly.b.a, "advancements");
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(lu $$0) {
      return this.f.thenCompose($$1 -> {
         Set<alb> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<af> $$4 = $$4x -> {
            if (!$$2.add($$4x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$4x.a());
            } else {
               Path $$5x = this.d.a($$4x.a());
               $$3.add(lw.a($$0, $$1, ae.a, $$4x.b(), $$5x));
            }
         };

         for (ma $$5 : this.e) {
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
