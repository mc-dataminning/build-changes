import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hbi extends avh {
   @Nullable
   private uf h;

   public hbi(hbj $$0, ju<all> $$1, esy $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(ari $$0) {
      if (this.b().a($$0.gb())) {
         this.h = $$0.f(new uf());
      }

      super.b($$0);
   }

   @Override
   public xd a(SocketAddress $$0, GameProfile $$1) {
      return (xd)(this.b().a($$1) && this.a($$1.getName()) != null ? xd.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hbj b() {
      return (hbj)super.c();
   }

   @Nullable
   @Override
   public uf r() {
      return this.h;
   }
}
