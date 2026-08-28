import com.google.common.collect.Maps;
import java.util.Map;

public final class guv extends gsv<ckp, hba, gem> {
   private static final Map<ckw, ald> a = Maps.newEnumMap(
      Map.of(
         ckw.a,
         ald.b("textures/entity/horse/horse_white.png"),
         ckw.b,
         ald.b("textures/entity/horse/horse_creamy.png"),
         ckw.c,
         ald.b("textures/entity/horse/horse_chestnut.png"),
         ckw.d,
         ald.b("textures/entity/horse/horse_brown.png"),
         ckw.e,
         ald.b("textures/entity/horse/horse_black.png"),
         ckw.f,
         ald.b("textures/entity/horse/horse_gray.png"),
         ckw.g,
         ald.b("textures/entity/horse/horse_darkbrown.png")
      )
   );

   public guv(guf.a $$0) {
      super($$0, new gem($$0.a(ghc.bj)), new gem($$0.a(ghc.bm)));
      this.a(new gyh(this));
      this.a(new gyv<>(this, $$0.h(), hiy.d.e, $$0x -> $$0x.i, new gem($$0.a(ghc.bk)), new gem($$0.a(ghc.bn))));
      this.a(new gyv<>(this, $$0.h(), hiy.d.j, $$0x -> $$0x.b, new geb($$0.a(ghc.bl)), new geb($$0.a(ghc.bo))));
   }

   public ald a(hba $$0) {
      return a.get($$0.a);
   }

   public hba b() {
      return new hba();
   }

   public void a(ckp $$0, hba $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.aj().v();
   }
}
