import com.google.common.collect.Maps;
import java.util.Map;

public class gxo extends gxf<cjl, hdp, ggr> {
   private final Map<cjm.a, ged<ggr>> a;

   public gxo(gvz.a $$0) {
      super($$0, new ggr($$0.a(git.cb)), 0.7F);
      this.a = a($$0);
      this.a(new hap<>(this, $$0.h(), hkv.d.g, $$0x -> $$0x.a, new ggr($$0.a(git.co)), new ggr($$0.a(git.cn))));
   }

   private static Map<cjm.a, ged<ggr>> a(gvz.a $$0) {
      return Maps.newEnumMap(
         Map.of(cjm.a.a, new ged<>(new ggr($$0.a(git.cb)), new ggr($$0.a(git.cm))), cjm.a.b, new ged<>(new gff($$0.a(git.ae)), new gff($$0.a(git.af))))
      );
   }

   public void a(hdp $$0, fjc $$1, gps $$2, int $$3) {
      if ($$0.b != null) {
         this.g = this.a.get($$0.b.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alg a(hdp $$0) {
      return $$0.b == null ? hie.c() : $$0.b.b().b().b();
   }

   public hdp b() {
      return new hdp();
   }

   public void a(cjl $$0, hdp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bwn.h).v();
      $$1.b = $$0.t().a();
   }
}
