import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hcd {
   private static final hcm[] a = new hcm[]{
      a("textures/entity/player/slim/alex.png", hcm.a.a),
      a("textures/entity/player/slim/ari.png", hcm.a.a),
      a("textures/entity/player/slim/efe.png", hcm.a.a),
      a("textures/entity/player/slim/kai.png", hcm.a.a),
      a("textures/entity/player/slim/makena.png", hcm.a.a),
      a("textures/entity/player/slim/noor.png", hcm.a.a),
      a("textures/entity/player/slim/steve.png", hcm.a.a),
      a("textures/entity/player/slim/sunny.png", hcm.a.a),
      a("textures/entity/player/slim/zuri.png", hcm.a.a),
      a("textures/entity/player/wide/alex.png", hcm.a.b),
      a("textures/entity/player/wide/ari.png", hcm.a.b),
      a("textures/entity/player/wide/efe.png", hcm.a.b),
      a("textures/entity/player/wide/kai.png", hcm.a.b),
      a("textures/entity/player/wide/makena.png", hcm.a.b),
      a("textures/entity/player/wide/noor.png", hcm.a.b),
      a("textures/entity/player/wide/steve.png", hcm.a.b),
      a("textures/entity/player/wide/sunny.png", hcm.a.b),
      a("textures/entity/player/wide/zuri.png", hcm.a.b)
   };

   public static alz a() {
      return b().a();
   }

   public static hcm b() {
      return a[6];
   }

   public static hcm a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hcm a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hcm a(String $$0, hcm.a $$1) {
      return new hcm(alz.b($$0), null, null, null, $$1, true);
   }
}
