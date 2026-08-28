import com.google.common.collect.Maps;
import java.util.Map;

public final class gsf extends gqf<ckc, gyj, gbw> {
   private static final Map<ckj, alz> a = ae.a(Maps.newEnumMap(ckj.class), $$0 -> {
      $$0.put(ckj.a, alz.b("textures/entity/horse/horse_white.png"));
      $$0.put(ckj.b, alz.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(ckj.c, alz.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(ckj.d, alz.b("textures/entity/horse/horse_brown.png"));
      $$0.put(ckj.e, alz.b("textures/entity/horse/horse_black.png"));
      $$0.put(ckj.f, alz.b("textures/entity/horse/horse_gray.png"));
      $$0.put(ckj.g, alz.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gsf(grp.a $$0) {
      super($$0, new gbw($$0.a(gem.ba)), new gbw($$0.a(gem.bc)), 1.1F);
      this.a(new gvs(this));
      this.a(new gvr(this, $$0.f(), $$0.h()));
   }

   public alz a(gyj $$0) {
      return a.get($$0.a);
   }

   public gyj b() {
      return new gyj();
   }

   public void a(ckc $$0, gyj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
      $$1.h = $$0.t();
      $$1.i = $$0.af().v();
   }
}
