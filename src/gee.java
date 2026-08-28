import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class gee implements gei {
   private final GameProfile a;
   private final Supplier<hkl> b;
   private final wy c;

   public gee(GameProfile $$0) {
      this.a = $$0;
      this.b = fpo.Q().an().a($$0);
      this.c = wy.b($$0.getName());
   }

   @Override
   public void a(geg $$0) {
      fpo.Q().L().b(new aip(this.a.getId()));
   }

   @Override
   public wy aP_() {
      return this.c;
   }

   @Override
   public void a(fsh $$0, float $$1, float $$2) {
      ftu.a($$0, this.b.get(), 2, 2, 12, axw.a($$2));
   }

   @Override
   public boolean aQ_() {
      return true;
   }
}
