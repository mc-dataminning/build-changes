import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class grz extends auk {
   private ud h;

   public grz(gsa $$0, je<akw> $$1, epa $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aqo $$0) {
      if (this.b().a($$0.gb())) {
         this.h = $$0.f(new ud());
      }

      super.b($$0);
   }

   @Override
   public wx a(SocketAddress $$0, GameProfile $$1) {
      return (wx)(this.b().a($$1) && this.a($$1.getName()) != null ? wx.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gsa b() {
      return (gsa)super.c();
   }

   @Override
   public ud r() {
      return this.h;
   }
}
