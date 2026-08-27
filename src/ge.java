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

   public Predicate<cpq> a(StringReader $$0) throws CommandSyntaxException {
      final List<Predicate<cpq>> $$1 = new ArrayList<>();
      this.a.a($$0, new gf.c() {
         @Override
         public void a(il<cpl> $$0) {
            $$1.add($$1xx -> $$1xx.a($$0));
         }

         @Override
         public void a(ip<cpl> $$0) {
            $$1.add($$1xx -> $$1xx.a($$0));
         }

         @Override
         public void a(sy $$0) {
            if (!$$0.g()) {
               $$1.add($$1xx -> {
                  sy $$2 = $$1xx.w();
                  return tn.a($$0, $$2, true);
               });
            }
         }
      });
      return ac.a($$1);
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      return this.a.a($$0);
   }
}
