import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fvn implements fvr {
   private final GameProfile a;
   private final Supplier<gyc> b;
   private final xd c;

   public fvn(GameProfile $$0) {
      this.a = $$0;
      this.b = fil.Q().an().a($$0);
      this.c = xd.b($$0.getName());
   }

   @Override
   public void a(fvp $$0) {
      fil.Q().L().b(new ain(this.a.getId()));
   }

   @Override
   public xd aS_() {
      return this.c;
   }

   @Override
   public void a(fjx $$0, float $$1, float $$2) {
      flj.a($$0, this.b.get(), 2, 2, 12, axo.a($$2));
   }

   @Override
   public boolean aT_() {
      return true;
   }
}
