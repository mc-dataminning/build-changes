import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fzl implements fzp {
   private final GameProfile a;
   private final Supplier<hck> b;
   private final xv c;

   public fzl(GameProfile $$0) {
      this.a = $$0;
      this.b = fme.Q().an().a($$0);
      this.c = xv.b($$0.getName());
   }

   @Override
   public void a(fzn $$0) {
      fme.Q().L().b(new ajj(this.a.getId()));
   }

   @Override
   public xv aU_() {
      return this.c;
   }

   @Override
   public void a(fnq $$0, float $$1, float $$2) {
      fpd.a($$0, this.b.get(), 2, 2, 12, ayp.a($$2));
   }

   @Override
   public boolean aV_() {
      return true;
   }
}
