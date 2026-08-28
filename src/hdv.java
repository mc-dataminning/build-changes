import com.mojang.datafixers.util.Either;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hdv {
   public static final String a = "missing";
   public static final alz b = hef.a("missing");
   public static final heb c = new heb(b, "missing");

   public static heg a() {
      gmw $$0 = new gmw(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jm, gmu> $$1 = new EnumMap<>(jm.class);

      for (jm $$2 : jm.values()) {
         $$1.put($$2, new gmu($$2, 0, hbb.b().a(), $$0));
      }

      gmt $$3 = new gmt(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      gmx $$4 = new gmx(null, List.of($$3), Map.of("particle", Either.left(gmx.c)), null, null, gnd.a, List.of());
      $$4.d = "missingno";
      return $$4;
   }
}
