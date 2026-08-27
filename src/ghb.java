import com.google.common.collect.Maps;
import java.util.Map;

public class ghb extends ghm<cdi, fop<cdi>> {
   private static final Map<cdk, ajh> a = ac.a(Maps.newEnumMap(cdk.class), $$0 -> {
      $$0.put(cdk.a, null);
      $$0.put(cdk.b, new ajh("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cdk.c, new ajh("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cdk.d, new ajh("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cdk.e, new ajh("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public ghb(gew<cdi, fop<cdi>> $$0) {
      super($$0);
   }

   public void a(eub $$0, fxs $$1, int $$2, cdi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ajh $$10 = a.get($$3.s());
      if ($$10 != null && !$$3.ce()) {
         euf $$11 = $$1.getBuffer(fya.i($$10));
         this.c().a($$0, $$11, $$2, gec.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
