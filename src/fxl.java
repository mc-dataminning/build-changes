import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fxl implements fxp {
   private final GameProfile a;
   private final Supplier<haf> b;
   private final xj c;

   public fxl(GameProfile $$0) {
      this.a = $$0;
      this.b = fke.Q().an().a($$0);
      this.c = xj.b($$0.getName());
   }

   @Override
   public void a(fxn $$0) {
      fke.Q().L().b(new ait(this.a.getId()));
   }

   @Override
   public xj aS_() {
      return this.c;
   }

   @Override
   public void a(flq $$0, float $$1, float $$2) {
      fnc.a($$0, this.b.get(), 2, 2, 12, axx.a($$2));
   }

   @Override
   public boolean aT_() {
      return true;
   }
}
