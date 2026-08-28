import com.google.common.collect.Maps;
import java.util.Map;

public final class gxj extends gvj<cln, hdp, ggw> {
   private static final Map<clu, alg> a = Maps.newEnumMap(
      Map.of(
         clu.a,
         alg.b("textures/entity/horse/horse_white.png"),
         clu.b,
         alg.b("textures/entity/horse/horse_creamy.png"),
         clu.c,
         alg.b("textures/entity/horse/horse_chestnut.png"),
         clu.d,
         alg.b("textures/entity/horse/horse_brown.png"),
         clu.e,
         alg.b("textures/entity/horse/horse_black.png"),
         clu.f,
         alg.b("textures/entity/horse/horse_gray.png"),
         clu.g,
         alg.b("textures/entity/horse/horse_darkbrown.png")
      )
   );

   public gxj(gwt.a $$0) {
      super($$0, new ggw($$0.a(gjn.bn)), new ggw($$0.a(gjn.bq)));
      this.a(new hav(this));
      this.a(new hbj<>(this, $$0.h(), hlp.d.e, $$0x -> $$0x.i, new ggw($$0.a(gjn.bo)), new ggw($$0.a(gjn.br))));
      this.a(new hbj<>(this, $$0.h(), hlp.d.j, $$0x -> $$0x.b, new ggl($$0.a(gjn.bp)), new ggl($$0.a(gjn.bs))));
   }

   public alg a(hdp $$0) {
      return a.get($$0.a);
   }

   public hdp b() {
      return new hdp();
   }

   public void a(cln $$0, hdp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.fX().v();
   }
}
