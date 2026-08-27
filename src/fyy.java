import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class fyy {
   private static final fzg[] a = new fzg[]{
      a("textures/entity/player/slim/alex.png", fzg.a.a),
      a("textures/entity/player/slim/ari.png", fzg.a.a),
      a("textures/entity/player/slim/efe.png", fzg.a.a),
      a("textures/entity/player/slim/kai.png", fzg.a.a),
      a("textures/entity/player/slim/makena.png", fzg.a.a),
      a("textures/entity/player/slim/noor.png", fzg.a.a),
      a("textures/entity/player/slim/steve.png", fzg.a.a),
      a("textures/entity/player/slim/sunny.png", fzg.a.a),
      a("textures/entity/player/slim/zuri.png", fzg.a.a),
      a("textures/entity/player/wide/alex.png", fzg.a.b),
      a("textures/entity/player/wide/ari.png", fzg.a.b),
      a("textures/entity/player/wide/efe.png", fzg.a.b),
      a("textures/entity/player/wide/kai.png", fzg.a.b),
      a("textures/entity/player/wide/makena.png", fzg.a.b),
      a("textures/entity/player/wide/noor.png", fzg.a.b),
      a("textures/entity/player/wide/steve.png", fzg.a.b),
      a("textures/entity/player/wide/sunny.png", fzg.a.b),
      a("textures/entity/player/wide/zuri.png", fzg.a.b)
   };

   public static aep a() {
      return a[6].a();
   }

   public static fzg a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static fzg a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static fzg a(String $$0, fzg.a $$1) {
      return new fzg(new aep($$0), null, null, $$1, true);
   }
}
