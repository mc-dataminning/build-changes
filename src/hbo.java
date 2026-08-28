import com.mojang.datafixers.util.Either;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hbo {
   public static final String a = "missing";
   public static final alj b = hby.a("missing");
   public static final hbu c = new hbu(b, "missing");

   public static hbz a() {
      gkr $$0 = new gkr(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jm, gkp> $$1 = new EnumMap<>(jm.class);

      for (jm $$2 : jm.values()) {
         $$1.put($$2, new gkp($$2, 0, gyu.b().a(), $$0));
      }

      gko $$3 = new gko(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      gks $$4 = new gks(null, List.of($$3), Map.of("particle", Either.left(new hbn(gzd.d, gyu.b()))), null, null, gky.a, List.of());
      $$4.c = "missingno";
      return $$4;
   }
}
