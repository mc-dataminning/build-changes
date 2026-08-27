import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gce extends anx {
   private qs a;

   public gce(gcf $$0, hm<aey> $$1, eby $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(akj $$0) {
      if (this.b().a($$0.fP())) {
         this.a = $$0.f(new qs());
      }

      super.b($$0);
   }

   @Override
   public te a(SocketAddress $$0, GameProfile $$1) {
      return (te)(this.b().a($$1) && this.a($$1.getName()) != null ? te.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gcf b() {
      return (gcf)super.c();
   }

   @Override
   public qs r() {
      return this.a;
   }
}
