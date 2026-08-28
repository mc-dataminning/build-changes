import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fvd implements fvh {
   private final GameProfile a;
   private final Supplier<gxl> b;
   private final xd c;

   public fvd(GameProfile $$0) {
      this.a = $$0;
      this.b = fib.Q().am().a($$0);
      this.c = xd.b($$0.getName());
   }

   @Override
   public void a(fvf $$0) {
      fib.Q().L().b(new ain(this.a.getId()));
   }

   @Override
   public xd aU_() {
      return this.c;
   }

   @Override
   public void a(fjn $$0, float $$1, float $$2) {
      fkz.a($$0, this.b.get(), 2, 2, 12, axn.a($$2));
   }

   @Override
   public boolean aV_() {
      return true;
   }
}
