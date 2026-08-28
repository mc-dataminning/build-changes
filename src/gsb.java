import com.google.common.collect.Maps;
import java.util.Map;

public final class gsb extends gqb<cju, gyf, gbs> {
   private static final Map<ckb, alp> a = ae.a(Maps.newEnumMap(ckb.class), $$0 -> {
      $$0.put(ckb.a, alp.b("textures/entity/horse/horse_white.png"));
      $$0.put(ckb.b, alp.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(ckb.c, alp.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(ckb.d, alp.b("textures/entity/horse/horse_brown.png"));
      $$0.put(ckb.e, alp.b("textures/entity/horse/horse_black.png"));
      $$0.put(ckb.f, alp.b("textures/entity/horse/horse_gray.png"));
      $$0.put(ckb.g, alp.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gsb(grl.a $$0) {
      super($$0, new gbs($$0.a(gei.bd)), new gbs($$0.a(gei.bf)));
      this.a(new gvo(this));
      this.a(new gvn(this, $$0.f(), $$0.h()));
   }

   public alp a(gyf $$0) {
      return a.get($$0.a);
   }

   public gyf b() {
      return new gyf();
   }

   public void a(cju $$0, gyf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
      $$1.h = $$0.t();
      $$1.i = $$0.af().v();
   }
}
