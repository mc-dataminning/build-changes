import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gpv extends atr {
   private to a;

   public gpv(gpw $$0, iu<ake> $$1, end $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(apv $$0) {
      if (this.b().a($$0.fY())) {
         this.a = $$0.f(new to());
      }

      super.b($$0);
   }

   @Override
   public wi a(SocketAddress $$0, GameProfile $$1) {
      return (wi)(this.b().a($$1) && this.a($$1.getName()) != null ? wi.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gpw b() {
      return (gpw)super.c();
   }

   @Override
   public to r() {
      return this.a;
   }
}
