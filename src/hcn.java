import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hcn extends avo {
   @Nullable
   private uk h;

   public hcn(hco $$0, jx<alr> $$1, ett $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aro $$0) {
      if (this.b().a($$0.gj())) {
         this.h = $$0.f(new uk());
      }

      super.b($$0);
   }

   @Override
   public xi a(SocketAddress $$0, GameProfile $$1) {
      return (xi)(this.b().a($$1) && this.a($$1.getName()) != null ? xi.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hco b() {
      return (hco)super.c();
   }

   @Nullable
   @Override
   public uk r() {
      return this.h;
   }
}
