import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gcy extends aoj {
   private qw a;

   public gcy(gcz $$0, hl<afi> $$1, ecd $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aku $$0) {
      if (this.b().a($$0.fR())) {
         this.a = $$0.f(new qw());
      }

      super.b($$0);
   }

   @Override
   public tl a(SocketAddress $$0, GameProfile $$1) {
      return (tl)(this.b().a($$1) && this.a($$1.getName()) != null ? tl.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gcz b() {
      return (gcz)super.c();
   }

   @Override
   public qw r() {
      return this.a;
   }
}
