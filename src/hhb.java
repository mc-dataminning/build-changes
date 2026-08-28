import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hhb {
   private static final String c = "missing";
   private static final String d = "missingno";
   public static final akv a = akv.b("builtin/missing");
   public static final hhi b = new hhi(a, "missing");

   public static hho a() {
      gnk $$0 = new gnk(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jn, gni> $$1 = new EnumMap<>(jn.class);

      for (jn $$2 : jn.values()) {
         $$1.put($$2, new gni($$2, -1, "missingno", $$0));
      }

      gnh $$3 = new gnh(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      return new gnl(null, List.of($$3), new gns.a.a().a("particle", "missingno").a("missingno", new hha(hes.d, hei.c())).a(), null, null, gnq.a);
   }
}
