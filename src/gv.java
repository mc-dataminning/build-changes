import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gv<T extends dw<T>> implements gq<T> {
   private final String a;
   private final boolean b;
   private final CommandContext<T> c;

   public gv(String $$0, boolean $$1, CommandContext<T> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, gn<T> $$1, int $$2) {
      $$1.c().a(() -> "execute " + this.a);

      try {
         $$1.e();
         int $$3 = ContextChain.runExecutable(this.c, $$0, dw.a_(), this.b);
         gp $$4 = $$1.b();
         if ($$4 != null) {
            $$4.a($$2, this.a, $$3);
         }
      } catch (CommandSyntaxException var9) {
         $$0.a(var9, this.b, $$1.b());
      } finally {
         $$1.c().c();
      }
   }
}
