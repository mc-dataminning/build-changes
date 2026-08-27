import com.google.common.collect.Maps;
import java.util.Map;

public class gkn extends gky<cez, fsc<cez>> {
   private static final Map<cfb, akf> a = ac.a(Maps.newEnumMap(cfb.class), $$0 -> {
      $$0.put(cfb.a, null);
      $$0.put(cfb.b, new akf("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cfb.c, new akf("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cfb.d, new akf("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cfb.e, new akf("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gkn(gii<cez, fsc<cez>> $$0) {
      super($$0);
   }

   public void a(exn $$0, gbe $$1, int $$2, cez $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      akf $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.cf()) {
         exr $$11 = $$1.getBuffer(gbm.i($$10));
         this.c().a($$0, $$11, $$2, gho.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
