import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.List;

public interface gk<T> {
   void a(T var1, List<T> var2, ContextChain<T> var3, gh var4, gn<T> var5);

   public interface a<T> extends RedirectModifier<T>, gk<T> {
      default Collection<T> apply(CommandContext<T> $$0) throws CommandSyntaxException {
         throw new UnsupportedOperationException("This function should not run");
      }
   }
}
