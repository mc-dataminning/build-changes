import com.google.common.collect.Maps;
import java.util.Map;

public class fzz extends gak<byx, fif<byx>> {
   private static final Map<byz, agm> a = ac.a(Maps.newEnumMap(byz.class), $$0 -> {
      $$0.put(byz.a, null);
      $$0.put(byz.b, new agm("textures/entity/horse/horse_markings_white.png"));
      $$0.put(byz.c, new agm("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(byz.d, new agm("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(byz.e, new agm("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public fzz(fxx<byx, fif<byx>> $$0) {
      super($$0);
   }

   public void a(eob $$0, fqz $$1, int $$2, byx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      agm $$10 = a.get($$3.gf());
      if ($$10 != null && !$$3.ce()) {
         eof $$11 = $$1.getBuffer(frh.i($$10));
         this.c().a($$0, $$11, $$2, fxd.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
