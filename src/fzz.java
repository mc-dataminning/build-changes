import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fzz implements gad {
   private final GameProfile a;
   private final Supplier<hft> b;
   private final wp c;

   public fzz(GameProfile $$0) {
      this.a = $$0;
      this.b = fli.Q().an().a($$0);
      this.c = wp.b($$0.getName());
   }

   @Override
   public void a(gab $$0) {
      fli.Q().L().b(new aif(this.a.getId()));
   }

   @Override
   public wp aS_() {
      return this.c;
   }

   @Override
   public void a(fod $$0, float $$1, float $$2) {
      fpr.a($$0, this.b.get(), 2, 2, 12, axk.a($$2));
   }

   @Override
   public boolean aT_() {
      return true;
   }
}
