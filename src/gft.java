import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gft {
   private static final gga[] a = new gga[]{
      a("textures/entity/player/slim/alex.png", gga.a.a),
      a("textures/entity/player/slim/ari.png", gga.a.a),
      a("textures/entity/player/slim/efe.png", gga.a.a),
      a("textures/entity/player/slim/kai.png", gga.a.a),
      a("textures/entity/player/slim/makena.png", gga.a.a),
      a("textures/entity/player/slim/noor.png", gga.a.a),
      a("textures/entity/player/slim/steve.png", gga.a.a),
      a("textures/entity/player/slim/sunny.png", gga.a.a),
      a("textures/entity/player/slim/zuri.png", gga.a.a),
      a("textures/entity/player/wide/alex.png", gga.a.b),
      a("textures/entity/player/wide/ari.png", gga.a.b),
      a("textures/entity/player/wide/efe.png", gga.a.b),
      a("textures/entity/player/wide/kai.png", gga.a.b),
      a("textures/entity/player/wide/makena.png", gga.a.b),
      a("textures/entity/player/wide/noor.png", gga.a.b),
      a("textures/entity/player/wide/steve.png", gga.a.b),
      a("textures/entity/player/wide/sunny.png", gga.a.b),
      a("textures/entity/player/wide/zuri.png", gga.a.b)
   };

   public static ahh a() {
      return a[6].a();
   }

   public static gga a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gga a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gga a(String $$0, gga.a $$1) {
      return new gga(new ahh($$0), null, null, null, $$1, true);
   }
}
