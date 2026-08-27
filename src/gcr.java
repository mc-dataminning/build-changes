import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gcr {
   private static final gcz[] a = new gcz[]{
      a("textures/entity/player/slim/alex.png", gcz.a.a),
      a("textures/entity/player/slim/ari.png", gcz.a.a),
      a("textures/entity/player/slim/efe.png", gcz.a.a),
      a("textures/entity/player/slim/kai.png", gcz.a.a),
      a("textures/entity/player/slim/makena.png", gcz.a.a),
      a("textures/entity/player/slim/noor.png", gcz.a.a),
      a("textures/entity/player/slim/steve.png", gcz.a.a),
      a("textures/entity/player/slim/sunny.png", gcz.a.a),
      a("textures/entity/player/slim/zuri.png", gcz.a.a),
      a("textures/entity/player/wide/alex.png", gcz.a.b),
      a("textures/entity/player/wide/ari.png", gcz.a.b),
      a("textures/entity/player/wide/efe.png", gcz.a.b),
      a("textures/entity/player/wide/kai.png", gcz.a.b),
      a("textures/entity/player/wide/makena.png", gcz.a.b),
      a("textures/entity/player/wide/noor.png", gcz.a.b),
      a("textures/entity/player/wide/steve.png", gcz.a.b),
      a("textures/entity/player/wide/sunny.png", gcz.a.b),
      a("textures/entity/player/wide/zuri.png", gcz.a.b)
   };

   public static agm a() {
      return a[6].a();
   }

   public static gcz a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gcz a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gcz a(String $$0, gcz.a $$1) {
      return new gcz(new agm($$0), null, null, null, $$1, true);
   }
}
