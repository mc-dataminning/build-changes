import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class gax implements gbb {
   private final GameProfile a;
   private final Supplier<hgt> b;
   private final wp c;

   public gax(GameProfile $$0) {
      this.a = $$0;
      this.b = fmg.Q().an().a($$0);
      this.c = wp.b($$0.getName());
   }

   @Override
   public void a(gaz $$0) {
      fmg.Q().L().b(new aie(this.a.getId()));
   }

   @Override
   public wp aS_() {
      return this.c;
   }

   @Override
   public void a(fpc $$0, float $$1, float $$2) {
      fqp.a($$0, this.b.get(), 2, 2, 12, axk.a($$2));
   }

   @Override
   public boolean aT_() {
      return true;
   }
}
