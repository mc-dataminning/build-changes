import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hbw {
   private static final hcf[] a = new hcf[]{
      a("textures/entity/player/slim/alex.png", hcf.a.a),
      a("textures/entity/player/slim/ari.png", hcf.a.a),
      a("textures/entity/player/slim/efe.png", hcf.a.a),
      a("textures/entity/player/slim/kai.png", hcf.a.a),
      a("textures/entity/player/slim/makena.png", hcf.a.a),
      a("textures/entity/player/slim/noor.png", hcf.a.a),
      a("textures/entity/player/slim/steve.png", hcf.a.a),
      a("textures/entity/player/slim/sunny.png", hcf.a.a),
      a("textures/entity/player/slim/zuri.png", hcf.a.a),
      a("textures/entity/player/wide/alex.png", hcf.a.b),
      a("textures/entity/player/wide/ari.png", hcf.a.b),
      a("textures/entity/player/wide/efe.png", hcf.a.b),
      a("textures/entity/player/wide/kai.png", hcf.a.b),
      a("textures/entity/player/wide/makena.png", hcf.a.b),
      a("textures/entity/player/wide/noor.png", hcf.a.b),
      a("textures/entity/player/wide/steve.png", hcf.a.b),
      a("textures/entity/player/wide/sunny.png", hcf.a.b),
      a("textures/entity/player/wide/zuri.png", hcf.a.b)
   };

   public static alz a() {
      return b().a();
   }

   public static hcf b() {
      return a[6];
   }

   public static hcf a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hcf a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hcf a(String $$0, hcf.a $$1) {
      return new hcf(alz.b($$0), null, null, null, $$1, true);
   }
}
