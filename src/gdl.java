import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class gdl implements gdp {
   private final GameProfile a;
   private final Supplier<hjq> b;
   private final wy c;

   public gdl(GameProfile $$0) {
      this.a = $$0;
      this.b = fos.Q().an().a($$0);
      this.c = wy.b($$0.getName());
   }

   @Override
   public void a(gdn $$0) {
      fos.Q().L().b(new aip(this.a.getId()));
   }

   @Override
   public wy aO_() {
      return this.c;
   }

   @Override
   public void a(fro $$0, float $$1, float $$2) {
      ftb.a($$0, this.b.get(), 2, 2, 12, axw.a($$2));
   }

   @Override
   public boolean aP_() {
      return true;
   }
}
