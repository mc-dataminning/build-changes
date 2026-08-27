import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gfx extends apy {
   private sd a;

   public gfx(gfy $$0, in<agv> $$1, eev $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(amj $$0) {
      if (this.b().a($$0.fS())) {
         this.a = $$0.f(new sd());
      }

      super.b($$0);
   }

   @Override
   public uv a(SocketAddress $$0, GameProfile $$1) {
      return (uv)(this.b().a($$1) && this.a($$1.getName()) != null ? uv.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gfy b() {
      return (gfy)super.c();
   }

   @Override
   public sd r() {
      return this.a;
   }
}
