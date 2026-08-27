import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gid extends aqp {
   private sl a;

   public gid(gie $$0, io<ahm> $$1, egi $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(ana $$0) {
      if (this.b().a($$0.fR())) {
         this.a = $$0.f(new sl());
      }

      super.b($$0);
   }

   @Override
   public vd a(SocketAddress $$0, GameProfile $$1) {
      return (vd)(this.b().a($$1) && this.a($$1.getName()) != null ? vd.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gie b() {
      return (gie)super.c();
   }

   @Override
   public sl r() {
      return this.a;
   }
}
