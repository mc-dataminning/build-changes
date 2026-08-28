import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class gfw implements gga {
   private final GameProfile a;
   private final Supplier<hme> b;
   private final xc c;

   public gfw(GameProfile $$0) {
      this.a = $$0;
      this.b = frf.Q().an().a($$0);
      this.c = xc.b($$0.getName());
   }

   @Override
   public void a(gfy $$0) {
      frf.Q().L().b(new ait(this.a.getId()));
   }

   @Override
   public xc aT_() {
      return this.c;
   }

   @Override
   public void a(ftz $$0, float $$1, float $$2) {
      fvm.a($$0, this.b.get(), 2, 2, 12, aya.a($$2));
   }

   @Override
   public boolean aU_() {
      return true;
   }
}
