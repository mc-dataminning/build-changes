import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class giq extends aqv {
   private sn a;

   public giq(gir $$0, io<ahp> $$1, egp $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(ane $$0) {
      if (this.b().a($$0.fR())) {
         this.a = $$0.f(new sn());
      }

      super.b($$0);
   }

   @Override
   public vf a(SocketAddress $$0, GameProfile $$1) {
      return (vf)(this.b().a($$1) && this.a($$1.getName()) != null ? vf.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gir b() {
      return (gir)super.c();
   }

   @Override
   public sn r() {
      return this.a;
   }
}
