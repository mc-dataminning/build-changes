import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class fzx implements gab {
   private final GameProfile a;
   private final Supplier<hfo> b;
   private final wo c;

   public fzx(GameProfile $$0) {
      this.a = $$0;
      this.b = flh.Q().an().a($$0);
      this.c = wo.b($$0.getName());
   }

   @Override
   public void a(fzz $$0) {
      flh.Q().L().b(new aie(this.a.getId()));
   }

   @Override
   public wo aS_() {
      return this.c;
   }

   @Override
   public void a(fob $$0, float $$1, float $$2) {
      fpp.a($$0, this.b.get(), 2, 2, 12, axj.a($$2));
   }

   @Override
   public boolean aT_() {
      return true;
   }
}
