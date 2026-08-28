import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fzn implements fzr {
   private final GameProfile a;
   private final Supplier<hcm> b;
   private final xv c;

   public fzn(GameProfile $$0) {
      this.a = $$0;
      this.b = fmg.Q().an().a($$0);
      this.c = xv.b($$0.getName());
   }

   @Override
   public void a(fzp $$0) {
      fmg.Q().L().b(new ajj(this.a.getId()));
   }

   @Override
   public xv aU_() {
      return this.c;
   }

   @Override
   public void a(fns $$0, float $$1, float $$2) {
      fpf.a($$0, this.b.get(), 2, 2, 12, ayp.a($$2));
   }

   @Override
   public boolean aV_() {
      return true;
   }
}
