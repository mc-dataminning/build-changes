import com.google.common.collect.Maps;
import java.util.Map;

public class gvk extends gxf<cja, hbw, gfg> {
   private final Map<cjb.a, ged<gfg>> a;

   public gvk(gvz.a $$0) {
      super($$0, new gfg($$0.a(git.al)), 0.7F);
      this.a = a($$0);
   }

   private static Map<cjb.a, ged<gfg>> a(gvz.a $$0) {
      return Maps.newEnumMap(
         Map.of(
            cjb.a.a,
            new ged<>(new gfg($$0.a(git.al)), new gfg($$0.a(git.am))),
            cjb.a.c,
            new ged<>(new gfg($$0.a(git.dM)), new gfg($$0.a(git.dN))),
            cjb.a.b,
            new ged<>(new gfg($$0.a(git.ac)), new gfg($$0.a(git.ad)))
         )
      );
   }

   public alg a(hbw $$0) {
      return $$0.a == null ? hie.c() : $$0.a.b().b().b();
   }

   public hbw a() {
      return new hbw();
   }

   public void a(cja $$0, hbw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t().a();
   }

   public void a(hbw $$0, fjc $$1, gps $$2, int $$3) {
      if ($$0.a != null) {
         this.g = this.a.get($$0.a.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
