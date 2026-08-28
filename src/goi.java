import com.google.common.collect.Maps;
import java.util.Map;

public class goi extends got<chk, fvt<chk>> {
   private static final Map<chm, akr> a = ad.a(Maps.newEnumMap(chm.class), $$0 -> {
      $$0.put(chm.a, null);
      $$0.put(chm.b, akr.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(chm.c, akr.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(chm.d, akr.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(chm.e, akr.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public goi(gmd<chk, fvt<chk>> $$0) {
      super($$0);
   }

   public void a(fbg $$0, gex $$1, int $$2, chk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      akr $$10 = a.get($$3.t());
      if ($$10 != null && !$$3.ci()) {
         fbk $$11 = $$1.getBuffer(gff.i($$10));
         this.c().a($$0, $$11, $$2, gli.c($$3, 0.0F));
      }
   }
}
