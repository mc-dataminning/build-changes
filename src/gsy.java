import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gsy extends auz {
   private ur h;

   public gsy(gsz $$0, jp<alk> $$1, epu $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(arc $$0) {
      if (this.b().a($$0.gb())) {
         this.h = $$0.f(new ur());
      }

      super.b($$0);
   }

   @Override
   public xl a(SocketAddress $$0, GameProfile $$1) {
      return (xl)(this.b().a($$1) && this.a($$1.getName()) != null ? xl.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gsz b() {
      return (gsz)super.c();
   }

   @Override
   public ur r() {
      return this.h;
   }
}
