import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class mp implements mm {
   private final mo.a d;
   private final List<mq> e;
   private final CompletableFuture<jg.a> f;

   public mp(mo $$0, CompletableFuture<jg.a> $$1, List<mq> $$2) {
      this.d = $$0.a(mg.br);
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      return this.f.thenCompose($$1 -> {
         Set<ale> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<ai> $$4 = $$4x -> {
            if (!$$2.add($$4x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$4x.a());
            } else {
               Path $$5x = this.d.a($$4x.a());
               $$3.add(mm.a($$0, $$1, ah.a, $$4x.b(), $$5x));
            }
         };

         for (mq $$5 : this.e) {
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
