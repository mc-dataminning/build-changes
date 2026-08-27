import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class jm implements jj {
   private final jl.a d;
   private final List<jn> e;
   private final CompletableFuture<hh.b> f;

   public jm(jl $$0, CompletableFuture<hh.b> $$1, List<jn> $$2) {
      this.d = $$0.a(jl.b.a, "advancements");
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(jh $$0) {
      return this.f.thenCompose($$1 -> {
         Set<aep> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<ae> $$4 = $$3x -> {
            if (!$$2.add($$3x.j())) {
               throw new IllegalStateException("Duplicate advancement " + $$3x.j());
            } else {
               Path $$4x = this.d.a($$3x.j());
               $$3.add(jj.a($$0, $$3x.a().c(), $$4x));
            }
         };

         for (jn $$5 : this.e) {
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
