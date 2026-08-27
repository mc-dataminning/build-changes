import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gde extends aoi {
   private qy a;

   public gde(gdf $$0, hn<afh> $$1, ecl $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(akt $$0) {
      if (this.b().a($$0.fQ())) {
         this.a = $$0.f(new qy());
      }

      super.b($$0);
   }

   @Override
   public tn a(SocketAddress $$0, GameProfile $$1) {
      return (tn)(this.b().a($$1) && this.a($$1.getName()) != null ? tn.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gdf b() {
      return (gdf)super.c();
   }

   @Override
   public qy r() {
      return this.a;
   }
}
