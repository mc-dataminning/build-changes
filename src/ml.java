import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ml implements mi {
   private final mk.a d;
   private final List<mm> e;
   private final CompletableFuture<jt.a> f;

   public ml(mk $$0, CompletableFuture<jt.a> $$1, List<mm> $$2) {
      this.d = $$0.a(mc.bl);
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      return this.f.thenCompose($$1 -> {
         Set<aku> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<ai> $$4 = $$4x -> {
            if (!$$2.add($$4x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$4x.a());
            } else {
               Path $$5x = this.d.a($$4x.a());
               $$3.add(mi.a($$0, $$1, ah.a, $$4x.b(), $$5x));
            }
         };

         for (mm $$5 : this.e) {
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
