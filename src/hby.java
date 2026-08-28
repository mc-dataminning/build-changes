import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hby {
   private static final hch[] a = new hch[]{
      a("textures/entity/player/slim/alex.png", hch.a.a),
      a("textures/entity/player/slim/ari.png", hch.a.a),
      a("textures/entity/player/slim/efe.png", hch.a.a),
      a("textures/entity/player/slim/kai.png", hch.a.a),
      a("textures/entity/player/slim/makena.png", hch.a.a),
      a("textures/entity/player/slim/noor.png", hch.a.a),
      a("textures/entity/player/slim/steve.png", hch.a.a),
      a("textures/entity/player/slim/sunny.png", hch.a.a),
      a("textures/entity/player/slim/zuri.png", hch.a.a),
      a("textures/entity/player/wide/alex.png", hch.a.b),
      a("textures/entity/player/wide/ari.png", hch.a.b),
      a("textures/entity/player/wide/efe.png", hch.a.b),
      a("textures/entity/player/wide/kai.png", hch.a.b),
      a("textures/entity/player/wide/makena.png", hch.a.b),
      a("textures/entity/player/wide/noor.png", hch.a.b),
      a("textures/entity/player/wide/steve.png", hch.a.b),
      a("textures/entity/player/wide/sunny.png", hch.a.b),
      a("textures/entity/player/wide/zuri.png", hch.a.b)
   };

   public static alp a() {
      return b().a();
   }

   public static hch b() {
      return a[6];
   }

   public static hch a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hch a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hch a(String $$0, hch.a $$1) {
      return new hch(alp.b($$0), null, null, null, $$1, true);
   }
}
