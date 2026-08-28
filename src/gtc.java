import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class gtc extends avc {
   @Nullable
   private ur h;

   public gtc(gtd $$0, jp<aln> $$1, epy $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(arf $$0) {
      if (this.b().a($$0.gb())) {
         this.h = $$0.f(new ur());
      }

      super.b($$0);
   }

   @Override
   public xo a(SocketAddress $$0, GameProfile $$1) {
      return (xo)(this.b().a($$1) && this.a($$1.getName()) != null ? xo.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gtd b() {
      return (gtd)super.c();
   }

   @Nullable
   @Override
   public ur r() {
      return this.h;
   }
}
