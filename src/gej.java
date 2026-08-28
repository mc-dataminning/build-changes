import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class gej implements gen {
   private final GameProfile a;
   private final Supplier<hks> b;
   private final wy c;

   public gej(GameProfile $$0) {
      this.a = $$0;
      this.b = fpt.Q().an().a($$0);
      this.c = wy.b($$0.getName());
   }

   @Override
   public void a(gel $$0) {
      fpt.Q().L().b(new aip(this.a.getId()));
   }

   @Override
   public wy aP_() {
      return this.c;
   }

   @Override
   public void a(fsm $$0, float $$1, float $$2) {
      ftz.a($$0, this.b.get(), 2, 2, 12, axw.a($$2));
   }

   @Override
   public boolean aQ_() {
      return true;
   }
}
