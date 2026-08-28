import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fvr implements fvv {
   private final GameProfile a;
   private final Supplier<gyh> b;
   private final xe c;

   public fvr(GameProfile $$0) {
      this.a = $$0;
      this.b = fip.Q().an().a($$0);
      this.c = xe.b($$0.getName());
   }

   @Override
   public void a(fvt $$0) {
      fip.Q().L().b(new aio(this.a.getId()));
   }

   @Override
   public xe aT_() {
      return this.c;
   }

   @Override
   public void a(fkb $$0, float $$1, float $$2) {
      fln.a($$0, this.b.get(), 2, 2, 12, axq.a($$2));
   }

   @Override
   public boolean aU_() {
      return true;
   }
}
