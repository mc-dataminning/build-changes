import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class jl implements ji {
   private final jk.a d;
   private final List<jm> e;
   private final CompletableFuture<hg.b> f;

   public jl(jk $$0, CompletableFuture<hg.b> $$1, List<jm> $$2) {
      this.d = $$0.a(jk.b.a, "advancements");
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(jg $$0) {
      return this.f.thenCompose($$1 -> {
         Set<aer> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<ae> $$4 = $$3x -> {
            if (!$$2.add($$3x.j())) {
               throw new IllegalStateException("Duplicate advancement " + $$3x.j());
            } else {
               Path $$4x = this.d.a($$3x.j());
               $$3.add(ji.a($$0, $$3x.a().c(), $$4x));
            }
         };

         for (jm $$5 : this.e) {
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
