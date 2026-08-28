import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gxc {
   private static final gxl[] a = new gxl[]{
      a("textures/entity/player/slim/alex.png", gxl.a.a),
      a("textures/entity/player/slim/ari.png", gxl.a.a),
      a("textures/entity/player/slim/efe.png", gxl.a.a),
      a("textures/entity/player/slim/kai.png", gxl.a.a),
      a("textures/entity/player/slim/makena.png", gxl.a.a),
      a("textures/entity/player/slim/noor.png", gxl.a.a),
      a("textures/entity/player/slim/steve.png", gxl.a.a),
      a("textures/entity/player/slim/sunny.png", gxl.a.a),
      a("textures/entity/player/slim/zuri.png", gxl.a.a),
      a("textures/entity/player/wide/alex.png", gxl.a.b),
      a("textures/entity/player/wide/ari.png", gxl.a.b),
      a("textures/entity/player/wide/efe.png", gxl.a.b),
      a("textures/entity/player/wide/kai.png", gxl.a.b),
      a("textures/entity/player/wide/makena.png", gxl.a.b),
      a("textures/entity/player/wide/noor.png", gxl.a.b),
      a("textures/entity/player/wide/steve.png", gxl.a.b),
      a("textures/entity/player/wide/sunny.png", gxl.a.b),
      a("textures/entity/player/wide/zuri.png", gxl.a.b)
   };

   public static alb a() {
      return b().a();
   }

   public static gxl b() {
      return a[6];
   }

   public static gxl a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gxl a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gxl a(String $$0, gxl.a $$1) {
      return new gxl(alb.b($$0), null, null, null, $$1, true);
   }
}
