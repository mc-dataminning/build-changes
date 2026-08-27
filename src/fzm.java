import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class fzm {
   private static final fzu[] a = new fzu[]{
      a("textures/entity/player/slim/alex.png", fzu.a.a),
      a("textures/entity/player/slim/ari.png", fzu.a.a),
      a("textures/entity/player/slim/efe.png", fzu.a.a),
      a("textures/entity/player/slim/kai.png", fzu.a.a),
      a("textures/entity/player/slim/makena.png", fzu.a.a),
      a("textures/entity/player/slim/noor.png", fzu.a.a),
      a("textures/entity/player/slim/steve.png", fzu.a.a),
      a("textures/entity/player/slim/sunny.png", fzu.a.a),
      a("textures/entity/player/slim/zuri.png", fzu.a.a),
      a("textures/entity/player/wide/alex.png", fzu.a.b),
      a("textures/entity/player/wide/ari.png", fzu.a.b),
      a("textures/entity/player/wide/efe.png", fzu.a.b),
      a("textures/entity/player/wide/kai.png", fzu.a.b),
      a("textures/entity/player/wide/makena.png", fzu.a.b),
      a("textures/entity/player/wide/noor.png", fzu.a.b),
      a("textures/entity/player/wide/steve.png", fzu.a.b),
      a("textures/entity/player/wide/sunny.png", fzu.a.b),
      a("textures/entity/player/wide/zuri.png", fzu.a.b)
   };

   public static aer a() {
      return a[6].a();
   }

   public static fzu a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static fzu a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static fzu a(String $$0, fzu.a $$1) {
      return new fzu(new aer($$0), null, null, null, $$1, true);
   }
}
