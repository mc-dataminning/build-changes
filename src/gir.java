import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gir {
   private static final giy[] a = new giy[]{
      a("textures/entity/player/slim/alex.png", giy.a.a),
      a("textures/entity/player/slim/ari.png", giy.a.a),
      a("textures/entity/player/slim/efe.png", giy.a.a),
      a("textures/entity/player/slim/kai.png", giy.a.a),
      a("textures/entity/player/slim/makena.png", giy.a.a),
      a("textures/entity/player/slim/noor.png", giy.a.a),
      a("textures/entity/player/slim/steve.png", giy.a.a),
      a("textures/entity/player/slim/sunny.png", giy.a.a),
      a("textures/entity/player/slim/zuri.png", giy.a.a),
      a("textures/entity/player/wide/alex.png", giy.a.b),
      a("textures/entity/player/wide/ari.png", giy.a.b),
      a("textures/entity/player/wide/efe.png", giy.a.b),
      a("textures/entity/player/wide/kai.png", giy.a.b),
      a("textures/entity/player/wide/makena.png", giy.a.b),
      a("textures/entity/player/wide/noor.png", giy.a.b),
      a("textures/entity/player/wide/steve.png", giy.a.b),
      a("textures/entity/player/wide/sunny.png", giy.a.b),
      a("textures/entity/player/wide/zuri.png", giy.a.b)
   };

   public static ajc a() {
      return a[6].a();
   }

   public static giy a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static giy a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static giy a(String $$0, giy.a $$1) {
      return new giy(new ajc($$0), null, null, null, $$1, true);
   }
}
