import com.mojang.datafixers.util.Either;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hbd {
   public static final String a = "missing";
   public static final all b = hbn.a("missing");
   public static final hbj c = new hbj(b, "missing");

   public static hbo a() {
      gki $$0 = new gki(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jm, gkg> $$1 = new EnumMap<>(jm.class);

      for (jm $$2 : jm.values()) {
         $$1.put($$2, new gkg($$2, 0, gyj.b().a(), $$0));
      }

      gkf $$3 = new gkf(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      gkj $$4 = new gkj(null, List.of($$3), Map.of("particle", Either.left(new hbc(gys.d, gyj.b()))), null, null, gkp.a, List.of());
      $$4.c = "missingno";
      return $$4;
   }
}
