import com.google.common.collect.Maps;
import java.util.Map;

public class hbx extends hcj<heu, ghz> {
   private static final alr a = alr.b("invisible");
   private static final Map<cmi, alr> b = Maps.newEnumMap(
      Map.of(
         cmi.a,
         a,
         cmi.b,
         alr.b("textures/entity/horse/horse_markings_white.png"),
         cmi.c,
         alr.b("textures/entity/horse/horse_markings_whitefield.png"),
         cmi.d,
         alr.b("textures/entity/horse/horse_markings_whitedots.png"),
         cmi.e,
         alr.b("textures/entity/horse/horse_markings_blackdots.png")
      )
   );

   public hbx(gzs<heu, ghz> $$0) {
      super($$0);
   }

   public void a(fld $$0, grn $$1, int $$2, heu $$3, float $$4, float $$5) {
      alr $$6 = b.get($$3.h);
      if ($$6 != a && !$$3.A) {
         flg $$7 = $$1.getBuffer(gry.j($$6));
         this.d().a($$0, $$7, $$2, gyw.a($$3, 0.0F));
      }
   }
}
