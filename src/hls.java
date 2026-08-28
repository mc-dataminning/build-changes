import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hls {
   private static final hmc[] a = new hmc[]{
      a("textures/entity/player/slim/alex.png", hmc.a.a),
      a("textures/entity/player/slim/ari.png", hmc.a.a),
      a("textures/entity/player/slim/efe.png", hmc.a.a),
      a("textures/entity/player/slim/kai.png", hmc.a.a),
      a("textures/entity/player/slim/makena.png", hmc.a.a),
      a("textures/entity/player/slim/noor.png", hmc.a.a),
      a("textures/entity/player/slim/steve.png", hmc.a.a),
      a("textures/entity/player/slim/sunny.png", hmc.a.a),
      a("textures/entity/player/slim/zuri.png", hmc.a.a),
      a("textures/entity/player/wide/alex.png", hmc.a.b),
      a("textures/entity/player/wide/ari.png", hmc.a.b),
      a("textures/entity/player/wide/efe.png", hmc.a.b),
      a("textures/entity/player/wide/kai.png", hmc.a.b),
      a("textures/entity/player/wide/makena.png", hmc.a.b),
      a("textures/entity/player/wide/noor.png", hmc.a.b),
      a("textures/entity/player/wide/steve.png", hmc.a.b),
      a("textures/entity/player/wide/sunny.png", hmc.a.b),
      a("textures/entity/player/wide/zuri.png", hmc.a.b)
   };

   public static ali a() {
      return b().a();
   }

   public static hmc b() {
      return a[6];
   }

   public static hmc a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hmc a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hmc a(String $$0, hmc.a $$1) {
      return new hmc(ali.b($$0), null, null, null, $$1, true);
   }
}
