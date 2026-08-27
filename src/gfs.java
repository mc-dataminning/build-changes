import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gfs extends apu {
   private rz a;

   public gfs(gft $$0, ij<agr> $$1, eeq $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(amf $$0) {
      if (this.b().a($$0.fS())) {
         this.a = $$0.f(new rz());
      }

      super.b($$0);
   }

   @Override
   public ur a(SocketAddress $$0, GameProfile $$1) {
      return (ur)(this.b().a($$1) && this.a($$1.getName()) != null ? ur.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gft b() {
      return (gft)super.c();
   }

   @Override
   public rz r() {
      return this.a;
   }
}
