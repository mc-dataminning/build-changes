import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class mq implements mn {
   private final mp.a d;
   private final List<mr> e;
   private final CompletableFuture<jh.a> f;

   public mq(mp $$0, CompletableFuture<jh.a> $$1, List<mr> $$2) {
      this.d = $$0.a(mh.bu);
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      return this.f.thenCompose($$1 -> {
         Set<ali> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<aj> $$4 = $$4x -> {
            if (!$$2.add($$4x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$4x.a());
            } else {
               Path $$5x = this.d.a($$4x.a());
               $$3.add(mn.a($$0, $$1, ai.a, $$4x.b(), $$5x));
            }
         };

         for (mr $$5 : this.e) {
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
