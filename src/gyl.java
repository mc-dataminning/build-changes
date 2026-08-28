import com.google.common.collect.Maps;
import java.util.Map;

public final class gyl extends gwl<cmg, heu, ghz> {
   private static final Map<cmn, alr> a = Maps.newEnumMap(
      Map.of(
         cmn.a,
         alr.b("textures/entity/horse/horse_white.png"),
         cmn.b,
         alr.b("textures/entity/horse/horse_creamy.png"),
         cmn.c,
         alr.b("textures/entity/horse/horse_chestnut.png"),
         cmn.d,
         alr.b("textures/entity/horse/horse_brown.png"),
         cmn.e,
         alr.b("textures/entity/horse/horse_black.png"),
         cmn.f,
         alr.b("textures/entity/horse/horse_gray.png"),
         cmn.g,
         alr.b("textures/entity/horse/horse_darkbrown.png")
      )
   );

   public gyl(gxv.a $$0) {
      super($$0, new ghz($$0.a(gkq.bn)), new ghz($$0.a(gkq.bq)));
      this.a(new hbx(this));
      this.a(new hcm<>(this, $$0.h(), hmw.d.e, $$0x -> $$0x.i, new ghz($$0.a(gkq.bo)), new ghz($$0.a(gkq.br))));
      this.a(new hcm<>(this, $$0.h(), hmw.d.j, $$0x -> $$0x.b, new gho($$0.a(gkq.bp)), new gho($$0.a(gkq.bs))));
   }

   public alr a(heu $$0) {
      return a.get($$0.a);
   }

   public heu b() {
      return new heu();
   }

   public void a(cmg $$0, heu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.fY().v();
   }
}
