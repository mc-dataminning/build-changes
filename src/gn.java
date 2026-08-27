import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class gn {
   private final go a;

   public gn(ix.a $$0) {
      this.a = new go($$0, true);
   }

   public Predicate<csd> a(StringReader $$0) throws CommandSyntaxException {
      final List<Predicate<csd>> $$1 = new ArrayList<>();
      final jx.a $$2 = jx.a();
      this.a.a($$0, new go.c() {
         @Override
         public void a(iv<cry> $$0) {
            $$1.add($$1xx -> $$1xx.a($$0));
         }

         @Override
         public void a(iz<cry> $$0) {
            $$1.add($$1xx -> $$1xx.a($$0));
         }

         @Override
         public <T> void a(jy<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public void a(ty $$0) {
            $$1.add(cuq.a(jz.a, $$0));
         }
      });
      jx $$3 = $$2.a();
      if (!$$3.b()) {
         $$1.add($$3::a);
      }

      return ac.a($$1);
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      return this.a.a($$0);
   }
}
