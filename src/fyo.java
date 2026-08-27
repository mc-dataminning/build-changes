import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class fyo extends alk {
   private qr a;

   public fyo(fyp $$0, hl<acz> $$1, dzb $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aig $$0) {
      if (this.b().a($$0.fM())) {
         this.a = $$0.f(new qr());
      }

      super.b($$0);
   }

   @Override
   public sw a(SocketAddress $$0, GameProfile $$1) {
      return (sw)(this.b().a($$1) && this.a($$1.getName()) != null ? sw.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public fyp b() {
      return (fyp)super.c();
   }

   @Override
   public qr r() {
      return this.a;
   }
}
