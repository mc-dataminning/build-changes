import com.google.common.collect.Maps;
import java.util.Map;

public final class gwx extends gux<clj, hdd, ggk> {
   private static final Map<clq, alg> a = Maps.newEnumMap(
      Map.of(
         clq.a,
         alg.b("textures/entity/horse/horse_white.png"),
         clq.b,
         alg.b("textures/entity/horse/horse_creamy.png"),
         clq.c,
         alg.b("textures/entity/horse/horse_chestnut.png"),
         clq.d,
         alg.b("textures/entity/horse/horse_brown.png"),
         clq.e,
         alg.b("textures/entity/horse/horse_black.png"),
         clq.f,
         alg.b("textures/entity/horse/horse_gray.png"),
         clq.g,
         alg.b("textures/entity/horse/horse_darkbrown.png")
      )
   );

   public gwx(gwh.a $$0) {
      super($$0, new ggk($$0.a(gjb.bn)), new ggk($$0.a(gjb.bq)));
      this.a(new haj(this));
      this.a(new hax<>(this, $$0.h(), hld.d.e, $$0x -> $$0x.i, new ggk($$0.a(gjb.bo)), new ggk($$0.a(gjb.br))));
      this.a(new hax<>(this, $$0.h(), hld.d.j, $$0x -> $$0x.b, new gfz($$0.a(gjb.bp)), new gfz($$0.a(gjb.bs))));
   }

   public alg a(hdd $$0) {
      return a.get($$0.a);
   }

   public hdd b() {
      return new hdd();
   }

   public void a(clj $$0, hdd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.aj().v();
   }
}
