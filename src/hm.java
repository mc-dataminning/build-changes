import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class hm<T extends eg<T>> implements hh<T> {
   private final String a;
   private final gy b;
   private final CommandContext<T> c;

   public hm(String $$0, gy $$1, CommandContext<T> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hd<T> $$1, hf $$2) {
      $$1.c().a(() -> "execute " + this.a);

      try {
         $$1.e();
         int $$3 = ContextChain.runExecutable(this.c, $$0, eg.b_(), this.b.a());
         hg $$4 = $$1.b();
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
