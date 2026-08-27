import com.google.common.collect.Maps;
import java.util.Map;

public class fzh extends fzs<byk, fhn<byk>> {
   private static final Map<bym, agg> a = ac.a(Maps.newEnumMap(bym.class), $$0 -> {
      $$0.put(bym.a, null);
      $$0.put(bym.b, new agg("textures/entity/horse/horse_markings_white.png"));
      $$0.put(bym.c, new agg("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(bym.d, new agg("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(bym.e, new agg("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public fzh(fxf<byk, fhn<byk>> $$0) {
      super($$0);
   }

   public void a(enk $$0, fqh $$1, int $$2, byk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      agg $$10 = a.get($$3.ge());
      if ($$10 != null && !$$3.cd()) {
         eno $$11 = $$1.getBuffer(fqp.i($$10));
         this.c().a($$0, $$11, $$2, fwl.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
