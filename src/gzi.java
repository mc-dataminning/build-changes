import com.mojang.datafixers.util.Either;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class gzi {
   public static final String a = "missing";
   public static final alc b = gzs.a("missing");
   public static final gzo c = new gzo(b, "missing");

   public static gzt a() {
      giq $$0 = new giq(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jj, gio> $$1 = new EnumMap<>(jj.class);

      for (jj $$2 : jj.values()) {
         $$1.put($$2, new gio($$2, 0, gwr.b().a(), $$0));
      }

      gin $$3 = new gin(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      gir $$4 = new gir(null, List.of($$3), Map.of("particle", Either.left(new gzh(gxa.d, gwr.b()))), null, null, giy.a, List.of());
      $$4.c = "missingno";
      return $$4;
   }
}
