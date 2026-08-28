import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hlf {
   private static final String c = "missing";
   private static final String d = "missingno";
   public static final alg a = alg.b("builtin/missing");
   public static final hlm b = new hlm(a, "missing");

   public static hls a() {
      grl $$0 = new grl(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      Map<ja, grj> $$1 = af.a(ja.class, $$1x -> new grj($$1x, -1, "missingno", $$0));
      gri $$2 = new gri(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      return new grm(null, List.of($$2), new grt.a.a().a("particle", "missingno").a("missingno", new hle(hiw.d, him.c())).a(), null, null, grr.a);
   }
}
