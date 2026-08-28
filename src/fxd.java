import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fxd implements fxh {
   private final GameProfile a;
   private final Supplier<gzu> b;
   private final xl c;

   public fxd(GameProfile $$0) {
      this.a = $$0;
      this.b = fjx.Q().an().a($$0);
      this.c = xl.b($$0.getName());
   }

   @Override
   public void a(fxf $$0) {
      fjx.Q().L().b(new aiv(this.a.getId()));
   }

   @Override
   public xl aT_() {
      return this.c;
   }

   @Override
   public void a(flj $$0, float $$1, float $$2) {
      fmv.a($$0, this.b.get(), 2, 2, 12, axy.a($$2));
   }

   @Override
   public boolean aU_() {
      return true;
   }
}
