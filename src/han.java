import com.mojang.datafixers.util.Either;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class han {
   public static final String a = "missing";
   public static final ali b = hax.a("missing");
   public static final hat c = new hat(b, "missing");

   public static hay a() {
      gjs $$0 = new gjs(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jm, gjq> $$1 = new EnumMap<>(jm.class);

      for (jm $$2 : jm.values()) {
         $$1.put($$2, new gjq($$2, 0, gxt.b().a(), $$0));
      }

      gjp $$3 = new gjp(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      gjt $$4 = new gjt(null, List.of($$3), Map.of("particle", Either.left(new ham(gyc.d, gxt.b()))), null, null, gjz.a, List.of());
      $$4.c = "missingno";
      return $$4;
   }
}
