import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gki extends gjj<btm, fuz<btm>> {
   private static final Map<bsv<?>, alb> a = ImmutableMap.of(
      bsv.aA,
      new alb("textures/entity/piglin/piglin.png"),
      bsv.bx,
      new alb("textures/entity/piglin/zombified_piglin.png"),
      bsv.aB,
      new alb("textures/entity/piglin/piglin_brute.png")
   );
   private static final float i = 1.0019531F;

   public gki(gis.a $$0, fwt $$1, fwt $$2, fwt $$3, boolean $$4) {
      super($$0, a($$0.f(), $$1, $$4), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
      this.a(new gmu<>(this, new fuh($$0.a($$2)), new fuh($$0.a($$3)), $$0.g()));
   }

   private static fuz<btm> a(fwr $$0, fwt $$1, boolean $$2) {
      fuz<btm> $$3 = new fuz<>($$0.a($$1));
      if ($$2) {
         $$3.a.k = false;
      }

      return $$3;
   }

   public alb c(btm $$0) {
      alb $$1 = a.get($$0.ak());
      if ($$1 == null) {
         throw new IllegalArgumentException("I don't know what texture to use for " + $$0.ak());
      } else {
         return $$1;
      }
   }

   protected boolean d(btm $$0) {
      return super.a($$0) || $$0 instanceof clh && ((clh)$$0).gq();
   }
}
