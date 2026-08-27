import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class fzd {
   private static final fzl[] a = new fzl[]{
      a("textures/entity/player/slim/alex.png", fzl.a.a),
      a("textures/entity/player/slim/ari.png", fzl.a.a),
      a("textures/entity/player/slim/efe.png", fzl.a.a),
      a("textures/entity/player/slim/kai.png", fzl.a.a),
      a("textures/entity/player/slim/makena.png", fzl.a.a),
      a("textures/entity/player/slim/noor.png", fzl.a.a),
      a("textures/entity/player/slim/steve.png", fzl.a.a),
      a("textures/entity/player/slim/sunny.png", fzl.a.a),
      a("textures/entity/player/slim/zuri.png", fzl.a.a),
      a("textures/entity/player/wide/alex.png", fzl.a.b),
      a("textures/entity/player/wide/ari.png", fzl.a.b),
      a("textures/entity/player/wide/efe.png", fzl.a.b),
      a("textures/entity/player/wide/kai.png", fzl.a.b),
      a("textures/entity/player/wide/makena.png", fzl.a.b),
      a("textures/entity/player/wide/noor.png", fzl.a.b),
      a("textures/entity/player/wide/steve.png", fzl.a.b),
      a("textures/entity/player/wide/sunny.png", fzl.a.b),
      a("textures/entity/player/wide/zuri.png", fzl.a.b)
   };

   public static aer a() {
      return a[6].a();
   }

   public static fzl a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static fzl a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static fzl a(String $$0, fzl.a $$1) {
      return new fzl(new aer($$0), null, null, $$1, true);
   }
}
