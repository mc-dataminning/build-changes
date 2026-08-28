import com.google.common.collect.Maps;
import java.util.Map;

public class gyi extends gxz<cju, hej, ghl> {
   private final Map<cjv.a, gew<ghl>> a;

   public gyi(gwt.a $$0) {
      super($$0, new ghl($$0.a(gjn.cd)), 0.7F);
      this.a = a($$0);
      this.a(new hbj<>(this, $$0.h(), hlp.d.g, $$0x -> $$0x.a, new ghl($$0.a(gjn.cq)), new ghl($$0.a(gjn.cp))));
   }

   private static Map<cjv.a, gew<ghl>> a(gwt.a $$0) {
      return Maps.newEnumMap(
         Map.of(cjv.a.a, new gew<>(new ghl($$0.a(gjn.cd)), new ghl($$0.a(gjn.co))), cjv.a.b, new gew<>(new gfz($$0.a(gjn.ag)), new gfz($$0.a(gjn.ah))))
      );
   }

   public void a(hej $$0, fjy $$1, gqm $$2, int $$3) {
      if ($$0.b != null) {
         this.g = this.a.get($$0.b.b().a()).a($$0.aj);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alg a(hej $$0) {
      return $$0.b == null ? hiz.c() : $$0.b.b().b().b();
   }

   public hej b() {
      return new hej();
   }

   public void a(cju $$0, hej $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.a(bws.h).v();
      $$1.b = $$0.t().a();
   }
}
