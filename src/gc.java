import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.lang3.mutable.MutableObject;

public class gc {
   private final gf a;

   public gc(in.a $$0) {
      this.a = new gf($$0, false);
   }

   public gc.a a(StringReader $$0) throws CommandSyntaxException {
      final MutableObject<il<cre>> $$1 = new MutableObject();
      final jl.a $$2 = jl.a();
      this.a.a($$0, new gf.c() {
         @Override
         public void a(il<cre> $$0) {
            $$1.setValue($$0);
         }

         @Override
         public <T> void a(jo<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public void a(tm $$0) {
            $$2.a(jp.a, ctt.a($$0));
         }
      });
      return new gc.a(Objects.requireNonNull((il<cre>)$$1.getValue(), "Parser gave no item"), $$2.a());
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      return this.a.a($$0);
   }

   public static record a(il<cre> a, jl b) {
   }
}
