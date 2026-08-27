import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public class gc {
   private final gf a;

   public gc(in.a $$0) {
      this.a = new gf($$0, false);
   }

   public gc.a a(StringReader $$0) throws CommandSyntaxException {
      final MutableObject<il<cqf>> $$1 = new MutableObject();
      final MutableObject<ta> $$2 = new MutableObject();
      this.a.a($$0, new gf.c() {
         @Override
         public void a(il<cqf> $$0) {
            $$1.setValue($$0);
         }

         @Override
         public void a(ta $$0) {
            $$2.setValue($$0);
         }
      });
      return new gc.a(Objects.requireNonNull((il<cqf>)$$1.getValue(), "Parser gave no item"), (ta)$$2.getValue());
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      return this.a.a($$0);
   }

   public static record a(il<cqf> a, @Nullable ta b) {
   }
}
