import com.mojang.datafixers.util.Either;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hdt {
   public static final String a = "missing";
   public static final alz b = hed.a("missing");
   public static final hdz c = new hdz(b, "missing");

   public static hee a() {
      gmu $$0 = new gmu(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jm, gms> $$1 = new EnumMap<>(jm.class);

      for (jm $$2 : jm.values()) {
         $$1.put($$2, new gms($$2, 0, haz.b().a(), $$0));
      }

      gmr $$3 = new gmr(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      gmv $$4 = new gmv(null, List.of($$3), Map.of("particle", Either.left(gmv.c)), null, null, gnb.a, List.of());
      $$4.d = "missingno";
      return $$4;
   }
}
