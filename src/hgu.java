import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hgu {
   private static final String c = "missing";
   private static final String d = "missingno";
   public static final aku a = aku.b("builtin/missing");
   public static final hhb b = new hhb(a, "missing");

   public static hhh a() {
      gng $$0 = new gng(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<jn, gne> $$1 = new EnumMap<>(jn.class);

      for (jn $$2 : jn.values()) {
         $$1.put($$2, new gne($$2, -1, "missingno", $$0));
      }

      gnd $$3 = new gnd(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      return new gnh(null, List.of($$3), new gno.a.a().a("particle", "missingno").a("missingno", new hgt(hel.d, heb.c())).a(), null, null, gnm.a);
   }
}
