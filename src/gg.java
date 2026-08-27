import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class gg {
   private final gh a;

   public gg(ip.a $$0) {
      this.a = new gh($$0, true);
   }

   public Predicate<crs> a(StringReader $$0) throws CommandSyntaxException {
      final List<Predicate<crs>> $$1 = new ArrayList<>();
      final jp.a $$2 = jp.a();
      this.a.a($$0, new gh.c() {
         @Override
         public void a(in<crn> $$0) {
            $$1.add($$1xx -> $$1xx.a($$0));
         }

         @Override
         public void a(ir<crn> $$0) {
            $$1.add($$1xx -> $$1xx.a($$0));
         }

         @Override
         public <T> void a(jq<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public void a(to $$0) {
            $$1.add(cuc.a(jr.a, $$0));
         }
      });
      jp $$3 = $$2.a();
      if (!$$3.b()) {
         $$1.add($$3::a);
      }

      return ac.a($$1);
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      return this.a.a($$0);
   }
}
