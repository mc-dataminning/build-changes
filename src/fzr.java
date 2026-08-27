import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class fzr {
   private static final fzz[] a = new fzz[]{
      a("textures/entity/player/slim/alex.png", fzz.a.a),
      a("textures/entity/player/slim/ari.png", fzz.a.a),
      a("textures/entity/player/slim/efe.png", fzz.a.a),
      a("textures/entity/player/slim/kai.png", fzz.a.a),
      a("textures/entity/player/slim/makena.png", fzz.a.a),
      a("textures/entity/player/slim/noor.png", fzz.a.a),
      a("textures/entity/player/slim/steve.png", fzz.a.a),
      a("textures/entity/player/slim/sunny.png", fzz.a.a),
      a("textures/entity/player/slim/zuri.png", fzz.a.a),
      a("textures/entity/player/wide/alex.png", fzz.a.b),
      a("textures/entity/player/wide/ari.png", fzz.a.b),
      a("textures/entity/player/wide/efe.png", fzz.a.b),
      a("textures/entity/player/wide/kai.png", fzz.a.b),
      a("textures/entity/player/wide/makena.png", fzz.a.b),
      a("textures/entity/player/wide/noor.png", fzz.a.b),
      a("textures/entity/player/wide/steve.png", fzz.a.b),
      a("textures/entity/player/wide/sunny.png", fzz.a.b),
      a("textures/entity/player/wide/zuri.png", fzz.a.b)
   };

   public static aeu a() {
      return a[6].a();
   }

   public static fzz a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static fzz a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static fzz a(String $$0, fzz.a $$1) {
      return new fzz(new aeu($$0), null, null, null, $$1, true);
   }
}
