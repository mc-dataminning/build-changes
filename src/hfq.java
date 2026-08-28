import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hfq extends avy {
   @Nullable
   private um h;

   public hfq(hfr $$0, jx<aly> $$1, evz $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(ary $$0) {
      if (this.b().a($$0.gh())) {
         this.h = $$0.f(new um());
      }

      super.b($$0);
   }

   @Override
   public xk a(SocketAddress $$0, GameProfile $$1) {
      return (xk)(this.b().a($$1) && this.a($$1.getName()) != null ? xk.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hfr b() {
      return (hfr)super.c();
   }

   @Nullable
   @Override
   public um r() {
      return this.h;
   }
}
