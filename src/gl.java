import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.lang3.mutable.MutableObject;

public class gl {
   private final go a;

   public gl(ix.a $$0) {
      this.a = new go($$0, false);
   }

   public gl.a a(StringReader $$0) throws CommandSyntaxException {
      final MutableObject<iv<cry>> $$1 = new MutableObject();
      final jv.a $$2 = jv.a();
      this.a.a($$0, new go.c() {
         @Override
         public void a(iv<cry> $$0) {
            $$1.setValue($$0);
         }

         @Override
         public <T> void a(jy<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public void a(ty $$0) {
            $$2.a(jz.a, cuq.a($$0));
         }
      });
      return new gl.a(Objects.requireNonNull((iv<cry>)$$1.getValue(), "Parser gave no item"), $$2.a());
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      return this.a.a($$0);
   }

   public static record a(iv<cry> a, jv b) {
   }
}
