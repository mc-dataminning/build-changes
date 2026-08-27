import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class kl implements ki {
   private final kk.a d;
   private final List<km> e;
   private final CompletableFuture<ih.b> f;

   public kl(kk $$0, CompletableFuture<ih.b> $$1, List<km> $$2) {
      this.d = $$0.a(kk.b.a, "advancements");
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(kg $$0) {
      return this.f.thenCompose($$1 -> {
         Set<agt> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<af> $$4 = $$3x -> {
            if (!$$2.add($$3x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$3x.a());
            } else {
               Path $$4x = this.d.a($$3x.a());
               $$3.add(ki.a($$0, ae.a, $$3x.b(), $$4x));
            }
         };

         for (km $$5 : this.e) {
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
