import com.google.common.collect.Maps;
import java.util.Map;

public final class gpq extends gnr<cjb, gvs, fzl> {
   private static final Map<cji, all> a = ae.a(Maps.newEnumMap(cji.class), $$0 -> {
      $$0.put(cji.a, all.b("textures/entity/horse/horse_white.png"));
      $$0.put(cji.b, all.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(cji.c, all.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cji.d, all.b("textures/entity/horse/horse_brown.png"));
      $$0.put(cji.e, all.b("textures/entity/horse/horse_black.png"));
      $$0.put(cji.f, all.b("textures/entity/horse/horse_gray.png"));
      $$0.put(cji.g, all.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gpq(gpa.a $$0) {
      super($$0, new fzl($$0.a(gcb.aP)), new fzl($$0.a(gcb.aQ)), 1.1F);
      this.a(new gtc(this));
      this.a(new gtb(this, $$0.f(), $$0.h()));
   }

   public all a(gvs $$0) {
      return a.get($$0.a);
   }

   public gvs c() {
      return new gvs();
   }

   public void a(cjb $$0, gvs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.ak().v();
   }
}
