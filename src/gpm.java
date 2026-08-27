import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gpm extends atp {
   private tm a;

   public gpm(gpn $$0, is<akc> $$1, emu $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(apt $$0) {
      if (this.b().a($$0.fY())) {
         this.a = $$0.f(new tm());
      }

      super.b($$0);
   }

   @Override
   public wg a(SocketAddress $$0, GameProfile $$1) {
      return (wg)(this.b().a($$1) && this.a($$1.getName()) != null ? wg.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gpn b() {
      return (gpn)super.c();
   }

   @Override
   public tm r() {
      return this.a;
   }
}
