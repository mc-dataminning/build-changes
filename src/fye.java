import com.google.common.collect.Maps;
import java.util.Map;

public final class fye extends fwk<bzj, fjj<bzj>> {
   private static final Map<bzq, agt> a = ac.a(Maps.newEnumMap(bzq.class), $$0 -> {
      $$0.put(bzq.a, new agt("textures/entity/horse/horse_white.png"));
      $$0.put(bzq.b, new agt("textures/entity/horse/horse_creamy.png"));
      $$0.put(bzq.c, new agt("textures/entity/horse/horse_chestnut.png"));
      $$0.put(bzq.d, new agt("textures/entity/horse/horse_brown.png"));
      $$0.put(bzq.e, new agt("textures/entity/horse/horse_black.png"));
      $$0.put(bzq.f, new agt("textures/entity/horse/horse_gray.png"));
      $$0.put(bzq.g, new agt("textures/entity/horse/horse_darkbrown.png"));
   });

   public fye(fxo.a $$0) {
      super($$0, new fjj<>($$0.a(flx.am)), 1.1F);
      this.a(new gbo(this));
      this.a(new gbn(this, $$0.f()));
   }

   public agt a(bzj $$0) {
      return a.get($$0.w());
   }
}
