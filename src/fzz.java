import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fzz implements gad {
   private final GameProfile a;
   private final Supplier<hfk> b;
   private final wo c;

   public fzz(GameProfile $$0) {
      this.a = $$0;
      this.b = flj.Q().an().a($$0);
      this.c = wo.b($$0.getName());
   }

   @Override
   public void a(gab $$0) {
      flj.Q().L().b(new aie(this.a.getId()));
   }

   @Override
   public wo aS_() {
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
