import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class mh implements me {
   private final mg.a d;
   private final List<mi> e;
   private final CompletableFuture<jr.a> f;

   public mh(mg $$0, CompletableFuture<jr.a> $$1, List<mi> $$2) {
      this.d = $$0.a(ly.bg);
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(mc $$0) {
      return this.f.thenCompose($$1 -> {
         Set<alh> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<ag> $$4 = $$4x -> {
            if (!$$2.add($$4x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$4x.a());
            } else {
               Path $$5x = this.d.a($$4x.a());
               $$3.add(me.a($$0, $$1, af.a, $$4x.b(), $$5x));
            }
         };

         for (mi $$5 : this.e) {
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
