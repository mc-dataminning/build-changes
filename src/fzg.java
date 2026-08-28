import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fzg implements fzk {
   private final GameProfile a;
   private final Supplier<hch> b;
   private final xk c;

   public fzg(GameProfile $$0) {
      this.a = $$0;
      this.b = flz.Q().an().a($$0);
      this.c = xk.b($$0.getName());
   }

   @Override
   public void a(fzi $$0) {
      flz.Q().L().b(new aiz(this.a.getId()));
   }

   @Override
   public xk aU_() {
      return this.c;
   }

   @Override
   public void a(fnl $$0, float $$1, float $$2) {
      foy.a($$0, this.b.get(), 2, 2, 12, ayf.a($$2));
   }

   @Override
   public boolean aV_() {
      return true;
   }
}
