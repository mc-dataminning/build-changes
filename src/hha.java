import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hha {
   private static final String c = "missing";
   private static final String d = "missingno";
   public static final akv a = akv.b("builtin/missing");
   public static final hhh b = new hhh(a, "missing");

   public static hhn a() {
      gnj $$0 = new gnj(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jn, gnh> $$1 = new EnumMap<>(jn.class);

      for (jn $$2 : jn.values()) {
         $$1.put($$2, new gnh($$2, -1, "missingno", $$0));
      }

      gng $$3 = new gng(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      return new gnk(null, List.of($$3), new gnr.a.a().a("particle", "missingno").a("missingno", new hgz(her.d, heh.c())).a(), null, null, gnp.a);
   }
}
