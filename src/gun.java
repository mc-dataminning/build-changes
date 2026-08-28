import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class gun extends aur {
   @Nullable
   private ub h;

   public gun(guo $$0, jt<ala> $$1, eri $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aqv $$0) {
      if (this.b().a($$0.fX())) {
         this.h = $$0.f(new ub());
      }

      super.b($$0);
   }

   @Override
   public wz a(SocketAddress $$0, GameProfile $$1) {
      return (wz)(this.b().a($$1) && this.a($$1.getName()) != null ? wz.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public guo b() {
      return (guo)super.c();
   }

   @Nullable
   @Override
   public ub r() {
      return this.h;
   }
}
