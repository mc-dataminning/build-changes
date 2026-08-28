import com.mojang.datafixers.util.Either;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class gyr {
   public static final String a = "missing";
   public static final alb b = gzb.a("missing");
   public static final gyx c = new gyx(b, "missing");

   public static gzc a() {
      gib $$0 = new gib(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jj, ghz> $$1 = new EnumMap<>(jj.class);

      for (jj $$2 : jj.values()) {
         $$1.put($$2, new ghz($$2, 0, gwa.b().a(), $$0));
      }

      ghy $$3 = new ghy(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      gic $$4 = new gic(null, List.of($$3), Map.of("particle", Either.left(new gyq(gwj.d, gwa.b()))), null, null, gij.a, List.of());
      $$4.c = "missingno";
      return $$4;
   }
}
