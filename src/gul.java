import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class gul extends aur {
   @Nullable
   private ub h;

   public gul(gum $$0, jt<ala> $$1, erg $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aqv $$0) {
      if (this.b().a($$0.fY())) {
         this.h = $$0.f(new ub());
      }

      super.b($$0);
   }

   @Override
   public wz a(SocketAddress $$0, GameProfile $$1) {
      return (wz)(this.b().a($$1) && this.a($$1.getName()) != null ? wz.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gum b() {
      return (gum)super.c();
   }

   @Nullable
   @Override
   public ub r() {
      return this.h;
   }
}
