import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class hp<T extends ej<T>> implements hk<T> {
   private final String a;
   private final hb b;
   private final CommandContext<T> c;

   public hp(String $$0, hb $$1, CommandContext<T> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hg<T> $$1, hi $$2) {
      $$1.c().a(() -> "execute " + this.a);

      try {
         $$1.e();
         int $$3 = ContextChain.runExecutable(this.c, $$0, ej.b_(), this.b.a());
         hj $$4 = $$1.b();
         if ($$4 != null) {
            $$4.a($$2.c(), this.a, $$3);
         }
      } catch (CommandSyntaxException var9) {
         $$0.a(var9, this.b.a(), $$1.b());
      } finally {
         $$1.c().c();
      }
   }
}
