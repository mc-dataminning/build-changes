import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fzm implements fzq {
   private final GameProfile a;
   private final Supplier<hcl> b;
   private final xv c;

   public fzm(GameProfile $$0) {
      this.a = $$0;
      this.b = fmf.Q().an().a($$0);
      this.c = xv.b($$0.getName());
   }

   @Override
   public void a(fzo $$0) {
      fmf.Q().L().b(new ajj(this.a.getId()));
   }

   @Override
   public xv aU_() {
      return this.c;
   }

   @Override
   public void a(fnr $$0, float $$1, float $$2) {
      fpe.a($$0, this.b.get(), 2, 2, 12, ayp.a($$2));
   }

   @Override
   public boolean aV_() {
      return true;
   }
}
