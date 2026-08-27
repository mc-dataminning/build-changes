import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public interface gp<T> {
   void a(T var1, ContextChain<T> var2, gn var3, gt<T> var4);

   public interface a<T> extends Command<T>, gp<T> {
      default int run(CommandContext<T> $$0) throws CommandSyntaxException {
         throw new UnsupportedOperationException("This function should not run");
      }
   }

   public abstract static class b<T extends dw<T>> implements gp<T> {
      public final void a(T $$0, ContextChain<T> $$1, gn $$2, gt<T> $$3) {
         try {
            this.b($$0, $$1, $$2, $$3);
         } catch (CommandSyntaxException var6) {
            this.a(var6, $$0, $$2, $$3.a());
            $$0.p().onFailure();
         }
      }

      protected void a(CommandSyntaxException $$0, T $$1, gn $$2, @Nullable gv $$3) {
         $$1.a($$0, $$2.a(), $$3);
      }

      protected abstract void b(T var1, ContextChain<T> var2, gn var3, gt<T> var4) throws CommandSyntaxException;
   }
}
