import com.google.common.collect.Maps;
import java.util.Map;

public class grq extends gsb<guf, fxz> {
   private static final Map<cil, ale> a = ad.a(Maps.newEnumMap(cil.class), $$0 -> {
      $$0.put(cil.a, null);
      $$0.put(cil.b, ale.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cil.c, ale.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cil.d, ale.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cil.e, ale.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public grq(gpk<guf, fxz> $$0) {
      super($$0);
   }

   public void a(fdi $$0, ghl $$1, int $$2, guf $$3, float $$4, float $$5) {
      ale $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.u) {
         fdm $$7 = $$1.getBuffer(ghv.i($$6));
         this.d().a($$0, $$7, $$2, gop.a($$3, 0.0F));
      }
   }
}
