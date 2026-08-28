import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hfu extends awi {
   @Nullable
   private ux h;

   public hfu(hfv $$0, jx<ami> $$1, ewf $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(asi $$0) {
      if (this.b().a($$0.gh())) {
         this.h = $$0.f(new ux());
      }

      super.b($$0);
   }

   @Override
   public xv a(SocketAddress $$0, GameProfile $$1) {
      return (xv)(this.b().a($$1) && this.a($$1.getName()) != null ? xv.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hfv b() {
      return (hfv)super.c();
   }

   @Nullable
   @Override
   public ux r() {
      return this.h;
   }
}
