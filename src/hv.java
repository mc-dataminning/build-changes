import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.List;

public interface hv<T> {
   void a(T var1, List<T> var2, ContextChain<T> var3, hs var4, hy<T> var5);

   public interface a<T> extends RedirectModifier<T>, hv<T> {
      default Collection<T> apply(CommandContext<T> $$0) throws CommandSyntaxException {
         throw new UnsupportedOperationException("This function should not run");
      }
   }
}
