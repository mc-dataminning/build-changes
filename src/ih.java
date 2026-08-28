import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class ih<T extends ez<T>> implements ib<T> {
   private final String a;
   private final hs b;
   private final CommandContext<T> c;

   public ih(String $$0, hs $$1, CommandContext<T> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hx<T> $$1, hz $$2) {
      $$1.c().a(() -> "execute " + this.a);

      try {
         $$1.e();
         int $$3 = ContextChain.runExecutable(this.c, $$0, ez.b_(), this.b.a());
         ia $$4 = $$1.b();
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
