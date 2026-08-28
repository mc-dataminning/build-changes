import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fwc implements fwg {
   private final GameProfile a;
   private final Supplier<gyt> b;
   private final xh c;

   public fwc(GameProfile $$0) {
      this.a = $$0;
      this.b = fja.Q().an().a($$0);
      this.c = xh.b($$0.getName());
   }

   @Override
   public void a(fwe $$0) {
      fja.Q().L().b(new air(this.a.getId()));
   }

   @Override
   public xh aT_() {
      return this.c;
   }

   @Override
   public void a(fkm $$0, float $$1, float $$2) {
      fly.a($$0, this.b.get(), 2, 2, 12, axu.a($$2));
   }

   @Override
   public boolean aU_() {
      return true;
   }
}
