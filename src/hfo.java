import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hfo extends awi {
   @Nullable
   private ux h;

   public hfo(hfp $$0, jx<ami> $$1, evy $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(asi $$0) {
      if (this.b().a($$0.gf())) {
         this.h = $$0.f(new ux());
      }

      super.b($$0);
   }

   @Override
   public xv a(SocketAddress $$0, GameProfile $$1) {
      return (xv)(this.b().a($$1) && this.a($$1.getName()) != null ? xv.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hfp b() {
      return (hfp)super.c();
   }

   @Nullable
   @Override
   public ux r() {
      return this.h;
   }
}
