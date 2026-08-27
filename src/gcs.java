import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gcs extends anz {
   private qr a;

   public gcs(gct $$0, hl<afa> $$1, ebz $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(akl $$0) {
      if (this.b().a($$0.fP())) {
         this.a = $$0.f(new qr());
      }

      super.b($$0);
   }

   @Override
   public tf a(SocketAddress $$0, GameProfile $$1) {
      return (tf)(this.b().a($$1) && this.a($$1.getName()) != null ? tf.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gct b() {
      return (gct)super.c();
   }

   @Override
   public qr r() {
      return this.a;
   }
}
