import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hkx {
   private static final String c = "missing";
   private static final String d = "missingno";
   public static final alg a = alg.b("builtin/missing");
   public static final hle b = new hle(a, "missing");

   public static hlk a() {
      grd $$0 = new grd(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<ja, grb> $$1 = af.a(ja.class, $$1x -> new grb($$1x, -1, "missingno", $$0));
      gra $$2 = new gra(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      return new gre(null, List.of($$2), new grl.a.a().a("particle", "missingno").a("missingno", new hkw(hio.d, hie.c())).a(), null, null, grj.a);
   }
}
