import com.mojang.datafixers.util.Either;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hdq {
   public static final String a = "missing";
   public static final alp b = hea.a("missing");
   public static final hdw c = new hdw(b, "missing");

   public static heb a() {
      gmr $$0 = new gmr(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jm, gmp> $$1 = new EnumMap<>(jm.class);

      for (jm $$2 : jm.values()) {
         $$1.put($$2, new gmp($$2, 0, haw.b().a(), $$0));
      }

      gmo $$3 = new gmo(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      gms $$4 = new gms(null, List.of($$3), Map.of("particle", Either.left(gms.c)), null, null, gmy.a, List.of());
      $$4.d = "missingno";
      return $$4;
   }
}
