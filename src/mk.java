import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class mk implements mh {
   private final mj.a d;
   private final List<ml> e;
   private final CompletableFuture<js.a> f;

   public mk(mj $$0, CompletableFuture<js.a> $$1, List<ml> $$2) {
      this.d = $$0.a(mb.bi);
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(mf $$0) {
      return this.f.thenCompose($$1 -> {
         Set<alz> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<ah> $$4 = $$4x -> {
            if (!$$2.add($$4x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$4x.a());
            } else {
               Path $$5x = this.d.a($$4x.a());
               $$3.add(mh.a($$0, $$1, ag.a, $$4x.b(), $$5x));
            }
         };

         for (ml $$5 : this.e) {
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
