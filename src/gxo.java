import com.google.common.collect.Maps;
import java.util.Map;

public final class gxo extends gvo<clk, hdv, ghb> {
   private static final Map<clr, alg> a = Maps.newEnumMap(
      Map.of(
         clr.a,
         alg.b("textures/entity/horse/horse_white.png"),
         clr.b,
         alg.b("textures/entity/horse/horse_creamy.png"),
         clr.c,
         alg.b("textures/entity/horse/horse_chestnut.png"),
         clr.d,
         alg.b("textures/entity/horse/horse_brown.png"),
         clr.e,
         alg.b("textures/entity/horse/horse_black.png"),
         clr.f,
         alg.b("textures/entity/horse/horse_gray.png"),
         clr.g,
         alg.b("textures/entity/horse/horse_darkbrown.png")
      )
   );

   public gxo(gwy.a $$0) {
      super($$0, new ghb($$0.a(gjs.bn)), new ghb($$0.a(gjs.bq)));
      this.a(new hba(this));
      this.a(new hbp<>(this, $$0.h(), hlw.d.e, $$0x -> $$0x.i, new ghb($$0.a(gjs.bo)), new ghb($$0.a(gjs.br))));
      this.a(new hbp<>(this, $$0.h(), hlw.d.j, $$0x -> $$0x.b, new ggq($$0.a(gjs.bp)), new ggq($$0.a(gjs.bs))));
   }

   public alg a(hdv $$0) {
      return a.get($$0.a);
   }

   public hdv b() {
      return new hdv();
   }

   public void a(clk $$0, hdv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.fX().v();
   }
}
