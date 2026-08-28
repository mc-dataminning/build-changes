import com.mojang.datafixers.util.Either;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hac {
   public static final String a = "missing";
   public static final alh b = ham.a("missing");
   public static final hai c = new hai(b, "missing");

   public static han a() {
      gjh $$0 = new gjh(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jl, gjf> $$1 = new EnumMap<>(jl.class);

      for (jl $$2 : jl.values()) {
         $$1.put($$2, new gjf($$2, 0, gxi.b().a(), $$0));
      }

      gje $$3 = new gje(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      gji $$4 = new gji(null, List.of($$3), Map.of("particle", Either.left(new hab(gxr.d, gxi.b()))), null, null, gjo.a, List.of());
      $$4.c = "missingno";
      return $$4;
   }
}
