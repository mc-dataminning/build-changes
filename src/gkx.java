import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gkx extends asn {
   private sw a;

   public gkx(gky $$0, iq<ajh> $$1, eio $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aow $$0) {
      if (this.b().a($$0.fS())) {
         this.a = $$0.f(new sw());
      }

      super.b($$0);
   }

   @Override
   public vq a(SocketAddress $$0, GameProfile $$1) {
      return (vq)(this.b().a($$1) && this.a($$1.getName()) != null ? vq.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gky b() {
      return (gky)super.c();
   }

   @Override
   public sw r() {
      return this.a;
   }
}
