import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class gtr extends auj {
   @Nullable
   private tx h;

   public gtr(gts $$0, jq<akt> $$1, eqn $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aqn $$0) {
      if (this.b().a($$0.fZ())) {
         this.h = $$0.f(new tx());
      }

      super.b($$0);
   }

   @Override
   public wu a(SocketAddress $$0, GameProfile $$1) {
      return (wu)(this.b().a($$1) && this.a($$1.getName()) != null ? wu.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gts b() {
      return (gts)super.c();
   }

   @Nullable
   @Override
   public tx r() {
      return this.h;
   }
}
