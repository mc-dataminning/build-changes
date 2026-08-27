import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gff extends apq {
   private rz a;

   public gff(gfg $$0, ij<agp> $$1, eee $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(amb $$0) {
      if (this.b().a($$0.fR())) {
         this.a = $$0.f(new rz());
      }

      super.b($$0);
   }

   @Override
   public ur a(SocketAddress $$0, GameProfile $$1) {
      return (ur)(this.b().a($$1) && this.a($$1.getName()) != null ? ur.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gfg b() {
      return (gfg)super.c();
   }

   @Override
   public rz r() {
      return this.a;
   }
}
