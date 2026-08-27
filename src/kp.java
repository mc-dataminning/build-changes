import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class kp implements km {
   private final ko.a d;
   private final List<kq> e;
   private final CompletableFuture<il.b> f;

   public kp(ko $$0, CompletableFuture<il.b> $$1, List<kq> $$2) {
      this.d = $$0.a(ko.b.a, "advancements");
      this.e = $$2;
      this.f = $$1;
   }

   @Override
   public CompletableFuture<?> a(kk $$0) {
      return this.f.thenCompose($$1 -> {
         Set<aiy> $$2 = new HashSet<>();
         List<CompletableFuture<?>> $$3 = new ArrayList<>();
         Consumer<af> $$4 = $$3x -> {
            if (!$$2.add($$3x.a())) {
               throw new IllegalStateException("Duplicate advancement " + $$3x.a());
            } else {
               Path $$4x = this.d.a($$3x.a());
               $$3.add(km.a($$0, ae.a, $$3x.b(), $$4x));
            }
         };

         for (kq $$5 : this.e) {
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
