import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ki implements kf {
   private final kh.a d;
   private final List<kj> e;
   private final CompletableFuture<id.b> f;

   public ki(kh $$0, CompletableFuture<id.b> $$1, List<kj> $$2) {
      this.d = $$0.a(kh.b.a, "advancements");
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(kd $$0) {
      return this.f.thenCompose($$1 -> {
         Set<agg> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<af> $$4 = $$3x -> {
            if (!$$2.add($$3x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$3x.a());
            } else {
               Path $$4x = this.d.a($$3x.a());
               $$3.add(kf.a($$0, $$3x.b().a(), $$4x));
            }
         };

         for (kj $$5 : this.e) {
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
