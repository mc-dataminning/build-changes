import com.google.common.collect.Maps;
import java.util.Map;

public final class grz extends gpz<cjy, gyd, gbq> {
   private static final Map<ckf, alz> a = ae.a(Maps.newEnumMap(ckf.class), $$0 -> {
      $$0.put(ckf.a, alz.b("textures/entity/horse/horse_white.png"));
      $$0.put(ckf.b, alz.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(ckf.c, alz.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(ckf.d, alz.b("textures/entity/horse/horse_brown.png"));
      $$0.put(ckf.e, alz.b("textures/entity/horse/horse_black.png"));
      $$0.put(ckf.f, alz.b("textures/entity/horse/horse_gray.png"));
      $$0.put(ckf.g, alz.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public grz(grj.a $$0) {
      super($$0, new gbq($$0.a(geg.ba)), new gbq($$0.a(geg.bc)), 1.1F);
      this.a(new gvm(this));
      this.a(new gvl(this, $$0.f(), $$0.h()));
   }

   public alz a(gyd $$0) {
      return a.get($$0.a);
   }

   public gyd b() {
      return new gyd();
   }

   public void a(cjy $$0, gyd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
      $$1.h = $$0.t();
      $$1.i = $$0.af().v();
   }
}
