import com.mojang.datafixers.util.Either;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hdu {
   public static final String a = "missing";
   public static final alz b = hee.a("missing");
   public static final hea c = new hea(b, "missing");

   public static hef a() {
      gmv $$0 = new gmv(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jm, gmt> $$1 = new EnumMap<>(jm.class);

      for (jm $$2 : jm.values()) {
         $$1.put($$2, new gmt($$2, 0, hba.b().a(), $$0));
      }

      gms $$3 = new gms(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      gmw $$4 = new gmw(null, List.of($$3), Map.of("particle", Either.left(gmw.c)), null, null, gnc.a, List.of());
      $$4.d = "missingno";
      return $$4;
   }
}
