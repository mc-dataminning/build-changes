import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gfe {
   private static final gfl[] a = new gfl[]{
      a("textures/entity/player/slim/alex.png", gfl.a.a),
      a("textures/entity/player/slim/ari.png", gfl.a.a),
      a("textures/entity/player/slim/efe.png", gfl.a.a),
      a("textures/entity/player/slim/kai.png", gfl.a.a),
      a("textures/entity/player/slim/makena.png", gfl.a.a),
      a("textures/entity/player/slim/noor.png", gfl.a.a),
      a("textures/entity/player/slim/steve.png", gfl.a.a),
      a("textures/entity/player/slim/sunny.png", gfl.a.a),
      a("textures/entity/player/slim/zuri.png", gfl.a.a),
      a("textures/entity/player/wide/alex.png", gfl.a.b),
      a("textures/entity/player/wide/ari.png", gfl.a.b),
      a("textures/entity/player/wide/efe.png", gfl.a.b),
      a("textures/entity/player/wide/kai.png", gfl.a.b),
      a("textures/entity/player/wide/makena.png", gfl.a.b),
      a("textures/entity/player/wide/noor.png", gfl.a.b),
      a("textures/entity/player/wide/steve.png", gfl.a.b),
      a("textures/entity/player/wide/sunny.png", gfl.a.b),
      a("textures/entity/player/wide/zuri.png", gfl.a.b)
   };

   public static ahg a() {
      return a[6].a();
   }

   public static gfl a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gfl a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gfl a(String $$0, gfl.a $$1) {
      return new gfl(new ahg($$0), null, null, null, $$1, true);
   }
}
