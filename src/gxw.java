import com.google.common.collect.Maps;
import java.util.Map;

public class gxw extends gxn<cjp, hdx, ggz> {
   private final Map<cjq.a, gek<ggz>> a;

   public gxw(gwh.a $$0) {
      super($$0, new ggz($$0.a(gjb.cd)), 0.7F);
      this.a = a($$0);
      this.a(new hax<>(this, $$0.h(), hld.d.g, $$0x -> $$0x.a, new ggz($$0.a(gjb.cq)), new ggz($$0.a(gjb.cp))));
   }

   private static Map<cjq.a, gek<ggz>> a(gwh.a $$0) {
      return Maps.newEnumMap(
         Map.of(cjq.a.a, new gek<>(new ggz($$0.a(gjb.cd)), new ggz($$0.a(gjb.co))), cjq.a.b, new gek<>(new gfn($$0.a(gjb.ag)), new gfn($$0.a(gjb.ah))))
      );
   }

   public void a(hdx $$0, fjj $$1, gqa $$2, int $$3) {
      if ($$0.b != null) {
         this.g = this.a.get($$0.b.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alg a(hdx $$0) {
      return $$0.b == null ? him.c() : $$0.b.b().b().b();
   }

   public hdx b() {
      return new hdx();
   }

   public void a(cjp $$0, hdx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bwp.h).v();
      $$1.b = $$0.t().a();
   }
}
