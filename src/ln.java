import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ln implements lk {
   private final lm.a d;
   private final List<lo> e;
   private final CompletableFuture<iy.a> f;

   public ln(lm $$0, CompletableFuture<iy.a> $$1, List<lo> $$2) {
      this.d = $$0.a(lm.b.a, "advancements");
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(li $$0) {
      return this.f.thenCompose($$1 -> {
         Set<akh> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<af> $$4 = $$4x -> {
            if (!$$2.add($$4x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$4x.a());
            } else {
               Path $$5x = this.d.a($$4x.a());
               $$3.add(lk.a($$0, $$1, ae.a, $$4x.b(), $$5x));
            }
         };

         for (lo $$5 : this.e) {
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
