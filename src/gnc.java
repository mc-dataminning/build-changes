import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gnc extends atb {
   private ta a;

   public gnc(gnd $$0, is<ajq> $$1, ekn $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(apg $$0) {
      if (this.b().a($$0.fY())) {
         this.a = $$0.f(new ta());
      }

      super.b($$0);
   }

   @Override
   public vu a(SocketAddress $$0, GameProfile $$1) {
      return (vu)(this.b().a($$1) && this.a($$1.getName()) != null ? vu.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gnd b() {
      return (gnd)super.c();
   }

   @Override
   public ta r() {
      return this.a;
   }
}
