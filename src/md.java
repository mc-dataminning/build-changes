import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class md implements ma {
   private final mc.a d;
   private final List<me> e;
   private final CompletableFuture<jo.a> f;

   public md(mc $$0, CompletableFuture<jo.a> $$1, List<me> $$2) {
      this.d = $$0.a(lu.bf);
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(ly $$0) {
      return this.f.thenCompose($$1 -> {
         Set<akq> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<ag> $$4 = $$4x -> {
            if (!$$2.add($$4x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$4x.a());
            } else {
               Path $$5x = this.d.a($$4x.a());
               $$3.add(ma.a($$0, $$1, af.a, $$4x.b(), $$5x));
            }
         };

         for (me $$5 : this.e) {
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
