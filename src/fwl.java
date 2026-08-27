import com.google.common.collect.Maps;
import java.util.Map;

public class fwl extends fww<bwl, fez<bwl>> {
   private static final Map<bwn, aer> a = ac.a(Maps.newEnumMap(bwn.class), $$0 -> {
      $$0.put(bwn.a, null);
      $$0.put(bwn.b, new aer("textures/entity/horse/horse_markings_white.png"));
      $$0.put(bwn.c, new aer("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(bwn.d, new aer("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(bwn.e, new aer("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public fwl(fuj<bwl, fez<bwl>> $$0) {
      super($$0);
   }

   public void a(elg $$0, fnl $$1, int $$2, bwl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      aer $$10 = a.get($$3.fZ());
      if ($$10 != null && !$$3.cd()) {
         elk $$11 = $$1.getBuffer(fnt.i($$10));
         this.c().a($$0, $$11, $$2, ftp.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
