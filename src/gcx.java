import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gcx extends aoc {
   private qu a;

   public gcx(gcy $$0, hn<afd> $$1, ece $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(ako $$0) {
      if (this.b().a($$0.fP())) {
         this.a = $$0.f(new qu());
      }

      super.b($$0);
   }

   @Override
   public ti a(SocketAddress $$0, GameProfile $$1) {
      return (ti)(this.b().a($$1) && this.a($$1.getName()) != null ? ti.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gcy b() {
      return (gcy)super.c();
   }

   @Override
   public qu r() {
      return this.a;
   }
}
