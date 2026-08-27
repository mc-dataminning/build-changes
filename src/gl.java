import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.List;

public interface gl<T> {
   void a(List<T> var1, ContextChain<T> var2, boolean var3, go<T> var4);

   public interface a<T> extends RedirectModifier<T>, gl<T> {
      default Collection<T> apply(CommandContext<T> $$0) throws CommandSyntaxException {
         throw new UnsupportedOperationException("This function should not run");
      }
   }
}
