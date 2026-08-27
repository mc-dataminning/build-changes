import com.google.common.collect.Maps;
import java.util.Map;

public class fxe extends fxp<bws, ffo<bws>> {
   private static final Map<bwu, aex> a = ac.a(Maps.newEnumMap(bwu.class), $$0 -> {
      $$0.put(bwu.a, null);
      $$0.put(bwu.b, new aex("textures/entity/horse/horse_markings_white.png"));
      $$0.put(bwu.c, new aex("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(bwu.d, new aex("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(bwu.e, new aex("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public fxe(fvc<bws, ffo<bws>> $$0) {
      super($$0);
   }

   public void a(elp $$0, foe $$1, int $$2, bws $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      aex $$10 = a.get($$3.gd());
      if ($$10 != null && !$$3.ce()) {
         elt $$11 = $$1.getBuffer(fom.i($$10));
         this.c().a($$0, $$11, $$2, fui.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
