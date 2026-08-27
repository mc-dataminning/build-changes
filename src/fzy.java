import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class fzy {
   private static final gag[] a = new gag[]{
      a("textures/entity/player/slim/alex.png", gag.a.a),
      a("textures/entity/player/slim/ari.png", gag.a.a),
      a("textures/entity/player/slim/efe.png", gag.a.a),
      a("textures/entity/player/slim/kai.png", gag.a.a),
      a("textures/entity/player/slim/makena.png", gag.a.a),
      a("textures/entity/player/slim/noor.png", gag.a.a),
      a("textures/entity/player/slim/steve.png", gag.a.a),
      a("textures/entity/player/slim/sunny.png", gag.a.a),
      a("textures/entity/player/slim/zuri.png", gag.a.a),
      a("textures/entity/player/wide/alex.png", gag.a.b),
      a("textures/entity/player/wide/ari.png", gag.a.b),
      a("textures/entity/player/wide/efe.png", gag.a.b),
      a("textures/entity/player/wide/kai.png", gag.a.b),
      a("textures/entity/player/wide/makena.png", gag.a.b),
      a("textures/entity/player/wide/noor.png", gag.a.b),
      a("textures/entity/player/wide/steve.png", gag.a.b),
      a("textures/entity/player/wide/sunny.png", gag.a.b),
      a("textures/entity/player/wide/zuri.png", gag.a.b)
   };

   public static aey a() {
      return a[6].a();
   }

   public static gag a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gag a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gag a(String $$0, gag.a $$1) {
      return new gag(new aey($$0), null, null, null, $$1, true);
   }
}
