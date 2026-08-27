import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class lr implements lo {
   private final lq.a d;
   private final List<ls> e;
   private final CompletableFuture<jc.a> f;

   public lr(lq $$0, CompletableFuture<jc.a> $$1, List<ls> $$2) {
      this.d = $$0.a(lq.b.a, "advancements");
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(lm $$0) {
      return this.f.thenCompose($$1 -> {
         Set<akt> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<ag> $$4 = $$4x -> {
            if (!$$2.add($$4x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$4x.a());
            } else {
               Path $$5x = this.d.a($$4x.a());
               $$3.add(lo.a($$0, $$1, af.a, $$4x.b(), $$5x));
            }
         };

         for (ls $$5 : this.e) {
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
