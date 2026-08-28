import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class gds implements gdw {
   private final GameProfile a;
   private final Supplier<hjy> b;
   private final wy c;

   public gds(GameProfile $$0) {
      this.a = $$0;
      this.b = foz.Q().an().a($$0);
      this.c = wy.b($$0.getName());
   }

   @Override
   public void a(gdu $$0) {
      foz.Q().L().b(new aip(this.a.getId()));
   }

   @Override
   public wy aP_() {
      return this.c;
   }

   @Override
   public void a(frv $$0, float $$1, float $$2) {
      fti.a($$0, this.b.get(), 2, 2, 12, axw.a($$2));
   }

   @Override
   public boolean aQ_() {
      return true;
   }
}
