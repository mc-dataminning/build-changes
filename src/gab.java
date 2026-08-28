import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class gab implements gaf {
   private final GameProfile a;
   private final Supplier<hfv> b;
   private final wp c;

   public gab(GameProfile $$0) {
      this.a = $$0;
      this.b = flk.Q().an().a($$0);
      this.c = wp.b($$0.getName());
   }

   @Override
   public void a(gad $$0) {
      flk.Q().L().b(new aif(this.a.getId()));
   }

   @Override
   public wp aS_() {
      return this.c;
   }

   @Override
   public void a(fof $$0, float $$1, float $$2) {
      fpt.a($$0, this.b.get(), 2, 2, 12, axk.a($$2));
   }

   @Override
   public boolean aT_() {
      return true;
   }
}
