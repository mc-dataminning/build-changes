import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gpr {
   private static final gpz[] a = new gpz[]{
      a("textures/entity/player/slim/alex.png", gpz.a.a),
      a("textures/entity/player/slim/ari.png", gpz.a.a),
      a("textures/entity/player/slim/efe.png", gpz.a.a),
      a("textures/entity/player/slim/kai.png", gpz.a.a),
      a("textures/entity/player/slim/makena.png", gpz.a.a),
      a("textures/entity/player/slim/noor.png", gpz.a.a),
      a("textures/entity/player/slim/steve.png", gpz.a.a),
      a("textures/entity/player/slim/sunny.png", gpz.a.a),
      a("textures/entity/player/slim/zuri.png", gpz.a.a),
      a("textures/entity/player/wide/alex.png", gpz.a.b),
      a("textures/entity/player/wide/ari.png", gpz.a.b),
      a("textures/entity/player/wide/efe.png", gpz.a.b),
      a("textures/entity/player/wide/kai.png", gpz.a.b),
      a("textures/entity/player/wide/makena.png", gpz.a.b),
      a("textures/entity/player/wide/noor.png", gpz.a.b),
      a("textures/entity/player/wide/steve.png", gpz.a.b),
      a("textures/entity/player/wide/sunny.png", gpz.a.b),
      a("textures/entity/player/wide/zuri.png", gpz.a.b)
   };

   public static alf a() {
      return a[6].a();
   }

   public static gpz a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gpz a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gpz a(String $$0, gpz.a $$1) {
      return new gpz(new alf($$0), null, null, null, $$1, true);
   }
}
