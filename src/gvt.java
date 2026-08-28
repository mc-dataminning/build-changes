import com.google.common.collect.Maps;
import java.util.Map;

public class gvt extends gwf<gyk, gbx> {
   private static final Map<ckf, alz> a = ae.a(Maps.newEnumMap(ckf.class), $$0 -> {
      $$0.put(ckf.a, null);
      $$0.put(ckf.b, alz.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(ckf.c, alz.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(ckf.d, alz.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(ckf.e, alz.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gvt(gtn<gyk, gbx> $$0) {
      super($$0);
   }

   public void a(fgs $$0, gll $$1, int $$2, gyk $$3, float $$4, float $$5) {
      alz $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.u) {
         fgw $$7 = $$1.getBuffer(glv.j($$6));
         this.d().a($$0, $$7, $$2, gsr.a($$3, 0.0F));
      }
   }
}
