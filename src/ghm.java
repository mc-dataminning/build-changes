import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class ghm extends aqf {
   private sj a;

   public ghm(ghn $$0, im<ahc> $$1, efx $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(amq $$0) {
      if (this.b().a($$0.fR())) {
         this.a = $$0.f(new sj());
      }

      super.b($$0);
   }

   @Override
   public vb a(SocketAddress $$0, GameProfile $$1) {
      return (vb)(this.b().a($$1) && this.a($$1.getName()) != null ? vb.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public ghn b() {
      return (ghn)super.c();
   }

   @Override
   public sj r() {
      return this.a;
   }
}
