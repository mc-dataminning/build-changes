import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gex {
   private static final gff[] a = new gff[]{
      a("textures/entity/player/slim/alex.png", gff.a.a),
      a("textures/entity/player/slim/ari.png", gff.a.a),
      a("textures/entity/player/slim/efe.png", gff.a.a),
      a("textures/entity/player/slim/kai.png", gff.a.a),
      a("textures/entity/player/slim/makena.png", gff.a.a),
      a("textures/entity/player/slim/noor.png", gff.a.a),
      a("textures/entity/player/slim/steve.png", gff.a.a),
      a("textures/entity/player/slim/sunny.png", gff.a.a),
      a("textures/entity/player/slim/zuri.png", gff.a.a),
      a("textures/entity/player/wide/alex.png", gff.a.b),
      a("textures/entity/player/wide/ari.png", gff.a.b),
      a("textures/entity/player/wide/efe.png", gff.a.b),
      a("textures/entity/player/wide/kai.png", gff.a.b),
      a("textures/entity/player/wide/makena.png", gff.a.b),
      a("textures/entity/player/wide/noor.png", gff.a.b),
      a("textures/entity/player/wide/steve.png", gff.a.b),
      a("textures/entity/player/wide/sunny.png", gff.a.b),
      a("textures/entity/player/wide/zuri.png", gff.a.b)
   };

   public static ahd a() {
      return a[6].a();
   }

   public static gff a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gff a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gff a(String $$0, gff.a $$1) {
      return new gff(new ahd($$0), null, null, null, $$1, true);
   }
}
