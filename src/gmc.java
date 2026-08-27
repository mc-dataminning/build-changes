import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gmc extends ass {
   private sy a;

   public gmc(gmd $$0, is<ajl> $$1, ejr $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(apb $$0) {
      if (this.b().a($$0.fU())) {
         this.a = $$0.f(new sy());
      }

      super.b($$0);
   }

   @Override
   public vs a(SocketAddress $$0, GameProfile $$1) {
      return (vs)(this.b().a($$1) && this.a($$1.getName()) != null ? vs.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gmd b() {
      return (gmd)super.c();
   }

   @Override
   public sy r() {
      return this.a;
   }
}
