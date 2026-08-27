import com.mojang.brigadier.exceptions.CommandSyntaxException;

public record gj<T>(int a, gm<T> b) {
   public void a(gn<T> $$0) {
      gp $$1 = $$0.b();

      try {
         this.b.execute($$0, this.a);
      } catch (CommandSyntaxException var4) {
         if ($$1 != null) {
            $$1.b(this.a, var4.getRawMessage().getString());
         }
      } catch (Exception var5) {
         if ($$1 != null) {
            $$1.b(this.a, var5.getMessage());
         }
      }
   }
}
