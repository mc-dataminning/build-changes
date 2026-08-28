import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gyk {
   private static final gyt[] a = new gyt[]{
      a("textures/entity/player/slim/alex.png", gyt.a.a),
      a("textures/entity/player/slim/ari.png", gyt.a.a),
      a("textures/entity/player/slim/efe.png", gyt.a.a),
      a("textures/entity/player/slim/kai.png", gyt.a.a),
      a("textures/entity/player/slim/makena.png", gyt.a.a),
      a("textures/entity/player/slim/noor.png", gyt.a.a),
      a("textures/entity/player/slim/steve.png", gyt.a.a),
      a("textures/entity/player/slim/sunny.png", gyt.a.a),
      a("textures/entity/player/slim/zuri.png", gyt.a.a),
      a("textures/entity/player/wide/alex.png", gyt.a.b),
      a("textures/entity/player/wide/ari.png", gyt.a.b),
      a("textures/entity/player/wide/efe.png", gyt.a.b),
      a("textures/entity/player/wide/kai.png", gyt.a.b),
      a("textures/entity/player/wide/makena.png", gyt.a.b),
      a("textures/entity/player/wide/noor.png", gyt.a.b),
      a("textures/entity/player/wide/steve.png", gyt.a.b),
      a("textures/entity/player/wide/sunny.png", gyt.a.b),
      a("textures/entity/player/wide/zuri.png", gyt.a.b)
   };

   public static alh a() {
      return b().a();
   }

   public static gyt b() {
      return a[6];
   }

   public static gyt a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gyt a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gyt a(String $$0, gyt.a $$1) {
      return new gyt(alh.b($$0), null, null, null, $$1, true);
   }
}
