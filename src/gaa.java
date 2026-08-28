import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class gaa implements gae {
   private final GameProfile a;
   private final Supplier<hfu> b;
   private final wp c;

   public gaa(GameProfile $$0) {
      this.a = $$0;
      this.b = flj.Q().an().a($$0);
      this.c = wp.b($$0.getName());
   }

   @Override
   public void a(gac $$0) {
      flj.Q().L().b(new aif(this.a.getId()));
   }

   @Override
   public wp aS_() {
      return this.c;
   }

   @Override
   public void a(foe $$0, float $$1, float $$2) {
      fps.a($$0, this.b.get(), 2, 2, 12, axk.a($$2));
   }

   @Override
   public boolean aT_() {
      return true;
   }
}
