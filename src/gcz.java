import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class gcz implements gdd {
   private final GameProfile a;
   private final Supplier<hja> b;
   private final ww c;

   public gcz(GameProfile $$0) {
      this.a = $$0;
      this.b = fof.Q().an().a($$0);
      this.c = ww.b($$0.getName());
   }

   @Override
   public void a(gdb $$0) {
      fof.Q().L().b(new ain(this.a.getId()));
   }

   @Override
   public ww aO_() {
      return this.c;
   }

   @Override
   public void a(frc $$0, float $$1, float $$2) {
      fsp.a($$0, this.b.get(), 2, 2, 12, axu.a($$2));
   }

   @Override
   public boolean aP_() {
      return true;
   }
}
