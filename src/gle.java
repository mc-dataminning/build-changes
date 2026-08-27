import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gle extends aso {
   private sw a;

   public gle(glf $$0, iq<ajh> $$1, eiv $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aox $$0) {
      if (this.b().a($$0.fS())) {
         this.a = $$0.f(new sw());
      }

      super.b($$0);
   }

   @Override
   public vq a(SocketAddress $$0, GameProfile $$1) {
      return (vq)(this.b().a($$1) && this.a($$1.getName()) != null ? vq.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public glf b() {
      return (glf)super.c();
   }

   @Override
   public sw r() {
      return this.a;
   }
}
