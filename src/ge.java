import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class ge {
   private final gf a;

   public ge(in.a $$0) {
      this.a = new gf($$0, true);
   }

   public Predicate<crj> a(StringReader $$0) throws CommandSyntaxException {
      final List<Predicate<crj>> $$1 = new ArrayList<>();
      final jn.a $$2 = jn.a();
      this.a.a($$0, new gf.c() {
         @Override
         public void a(il<cre> $$0) {
            $$1.add($$1xx -> $$1xx.a($$0));
         }

         @Override
         public void a(ip<cre> $$0) {
            $$1.add($$1xx -> $$1xx.a($$0));
         }

         @Override
         public <T> void a(jo<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public void a(tm $$0) {
            $$1.add(ctt.a(jp.a, $$0));
         }
      });
      jn $$3 = $$2.a();
      if (!$$3.b()) {
         $$1.add($$3::a);
      }

      return ac.a($$1);
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      return this.a.a($$0);
   }
}
