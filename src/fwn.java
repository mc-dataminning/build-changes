import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fwn implements fwr {
   private final GameProfile a;
   private final Supplier<gze> b;
   private final xi c;

   public fwn(GameProfile $$0) {
      this.a = $$0;
      this.b = fji.Q().an().a($$0);
      this.c = xi.b($$0.getName());
   }

   @Override
   public void a(fwp $$0) {
      fji.Q().L().b(new ais(this.a.getId()));
   }

   @Override
   public xi aS_() {
      return this.c;
   }

   @Override
   public void a(fku $$0, float $$1, float $$2) {
      fmg.a($$0, this.b.get(), 2, 2, 12, axv.a($$2));
   }

   @Override
   public boolean aT_() {
      return true;
   }
}
