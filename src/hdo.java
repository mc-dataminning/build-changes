import com.mojang.datafixers.util.Either;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hdo {
   public static final String a = "missing";
   public static final alz b = hdy.a("missing");
   public static final hdu c = new hdu(b, "missing");

   public static hdz a() {
      gmp $$0 = new gmp(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jm, gmn> $$1 = new EnumMap<>(jm.class);

      for (jm $$2 : jm.values()) {
         $$1.put($$2, new gmn($$2, 0, hau.b().a(), $$0));
      }

      gmm $$3 = new gmm(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      gmq $$4 = new gmq(null, List.of($$3), Map.of("particle", Either.left(gmq.c)), null, null, gmw.a, List.of());
      $$4.d = "missingno";
      return $$4;
   }
}
