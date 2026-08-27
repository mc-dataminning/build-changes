import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.lang3.mutable.MutableObject;

public class ge {
   private final gh a;

   public ge(ip.a $$0) {
      this.a = new gh($$0, false);
   }

   public ge.a a(StringReader $$0) throws CommandSyntaxException {
      final MutableObject<in<crn>> $$1 = new MutableObject();
      final jn.a $$2 = jn.a();
      this.a.a($$0, new gh.c() {
         @Override
         public void a(in<crn> $$0) {
            $$1.setValue($$0);
         }

         @Override
         public <T> void a(jq<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public void a(to $$0) {
            $$2.a(jr.a, cuc.a($$0));
         }
      });
      return new ge.a(Objects.requireNonNull((in<crn>)$$1.getValue(), "Parser gave no item"), $$2.a());
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      return this.a.a($$0);
   }

   public static record a(in<crn> a, jn b) {
   }
}
