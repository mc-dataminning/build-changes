import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class gfu implements gfy {
   private final GameProfile a;
   private final Supplier<hmc> b;
   private final xa c;

   public gfu(GameProfile $$0) {
      this.a = $$0;
      this.b = frd.Q().an().a($$0);
      this.c = xa.b($$0.getName());
   }

   @Override
   public void a(gfw $$0) {
      frd.Q().L().b(new air(this.a.getId()));
   }

   @Override
   public xa aT_() {
      return this.c;
   }

   @Override
   public void a(ftx $$0, float $$1, float $$2) {
      fvk.a($$0, this.b.get(), 2, 2, 12, axy.a($$2));
   }

   @Override
   public boolean aU_() {
      return true;
   }
}
