import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hkb extends avd {
   @Nullable
   private tq h;

   public hkb(hkc $$0, jy<ald> $$1, ewf $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(are $$0) {
      if (this.b().a($$0.gk())) {
         this.h = $$0.f(new tq());
      }

      super.b($$0);
   }

   @Override
   public wp a(SocketAddress $$0, GameProfile $$1) {
      return (wp)(this.b().a($$1) && this.a($$1.getName()) != null ? wp.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hkc b() {
      return (hkc)super.c();
   }

   @Nullable
   @Override
   public tq r() {
      return this.h;
   }
}
