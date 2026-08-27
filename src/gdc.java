import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gdc extends aoh {
   private qx a;

   public gdc(gdd $$0, hn<afg> $$1, ecj $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aks $$0) {
      if (this.b().a($$0.fQ())) {
         this.a = $$0.f(new qx());
      }

      super.b($$0);
   }

   @Override
   public tl a(SocketAddress $$0, GameProfile $$1) {
      return (tl)(this.b().a($$1) && this.a($$1.getName()) != null ? tl.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gdd b() {
      return (gdd)super.c();
   }

   @Override
   public qx r() {
      return this.a;
   }
}
