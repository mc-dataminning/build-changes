import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hgt {
   private static final String c = "missing";
   private static final String d = "missingno";
   public static final aku a = aku.b("builtin/missing");
   public static final hha b = new hha(a, "missing");

   public static hhg a() {
      gni $$0 = new gni(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jn, gng> $$1 = new EnumMap<>(jn.class);

      for (jn $$2 : jn.values()) {
         $$1.put($$2, new gng($$2, -1, "missingno", $$0));
      }

      gnf $$3 = new gnf(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      return new gnj(null, List.of($$3), new gnq.a.a().a("particle", "missingno").a("missingno", new hgs(hei.d, hdz.b())).a(), null, null, gno.a);
   }
}
