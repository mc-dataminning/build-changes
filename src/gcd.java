import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gcd extends gcx<ckp> {
   private final Map<ckp.b, Pair<ajh, fov<ckp>>> a;

   public gcd(gcy.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(ckp.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new ajh(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fov<ckp> a(gcy.a $$0, ckp.b $$1, boolean $$2) {
      frb $$3 = $$2 ? frc.d($$1) : frc.c($$1);
      frd $$4 = $$0.a($$3);
      if ($$1 == ckp.b.i) {
         return (fov<ckp>)($$2 ? new fnp($$4) : new fpp($$4));
      } else {
         return (fov<ckp>)($$2 ? new fno($$4) : new fnj($$4));
      }
   }

   private static String a(ckp.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(ckp $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.N() - $$2;
      float $$7 = $$0.M() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(aww.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.O()));
      }

      float $$8 = $$0.a($$2);
      if (!aww.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<ajh, fov<ckp>> $$9 = this.a.get($$0.x());
      ajh $$10 = (ajh)$$9.getFirst();
      fov<ckp> $$11 = (fov<ckp>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eud $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bh()) {
         eud $$13 = $$4.getBuffer(fxy.i());
         if ($$11 instanceof fqq $$14) {
            $$14.c().a($$3, $$13, $$5, giq.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajh a(ckp $$0) {
      return (ajh)this.a.get($$0.x()).getFirst();
   }
}
