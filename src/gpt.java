import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gpt {
   private static final gqb[] a = new gqb[]{
      a("textures/entity/player/slim/alex.png", gqb.a.a),
      a("textures/entity/player/slim/ari.png", gqb.a.a),
      a("textures/entity/player/slim/efe.png", gqb.a.a),
      a("textures/entity/player/slim/kai.png", gqb.a.a),
      a("textures/entity/player/slim/makena.png", gqb.a.a),
      a("textures/entity/player/slim/noor.png", gqb.a.a),
      a("textures/entity/player/slim/steve.png", gqb.a.a),
      a("textures/entity/player/slim/sunny.png", gqb.a.a),
      a("textures/entity/player/slim/zuri.png", gqb.a.a),
      a("textures/entity/player/wide/alex.png", gqb.a.b),
      a("textures/entity/player/wide/ari.png", gqb.a.b),
      a("textures/entity/player/wide/efe.png", gqb.a.b),
      a("textures/entity/player/wide/kai.png", gqb.a.b),
      a("textures/entity/player/wide/makena.png", gqb.a.b),
      a("textures/entity/player/wide/noor.png", gqb.a.b),
      a("textures/entity/player/wide/steve.png", gqb.a.b),
      a("textures/entity/player/wide/sunny.png", gqb.a.b),
      a("textures/entity/player/wide/zuri.png", gqb.a.b)
   };

   public static alf a() {
      return a[6].a();
   }

   public static gqb a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gqb a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gqb a(String $$0, gqb.a $$1) {
      return new gqb(new alf($$0), null, null, null, $$1, true);
   }
}
