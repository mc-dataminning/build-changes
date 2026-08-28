import com.mojang.datafixers.util.Either;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class gzn {
   public static final String a = "missing";
   public static final ale b = gzx.a("missing");
   public static final gzt c = new gzt(b, "missing");

   public static gzy a() {
      giv $$0 = new giv(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jk, git> $$1 = new EnumMap<>(jk.class);

      for (jk $$2 : jk.values()) {
         $$1.put($$2, new git($$2, 0, gww.b().a(), $$0));
      }

      gis $$3 = new gis(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      giw $$4 = new giw(null, List.of($$3), Map.of("particle", Either.left(new gzm(gxf.d, gww.b()))), null, null, gjd.a, List.of());
      $$4.c = "missingno";
      return $$4;
   }
}
