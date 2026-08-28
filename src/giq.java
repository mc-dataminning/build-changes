import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class giq extends gjl<coh> {
   private final Map<coh.b, Pair<akk, fvg<coh>>> a;

   public giq(gjm.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(coh.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new akk(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fvg<coh> a(gjm.a $$0, coh.b $$1, boolean $$2) {
      fxm $$3 = $$2 ? fxn.d($$1) : fxn.c($$1);
      fxo $$4 = $$0.a($$3);
      if ($$1 == coh.b.i) {
         return (fvg<coh>)($$2 ? new fub($$4) : new fwa($$4));
      } else {
         return (fvg<coh>)($$2 ? new fua($$4) : new ftu($$4));
      }
   }

   private static String a(coh.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(coh $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(ayg.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!ayg.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<akk, fvg<coh>> $$9 = this.a.get($$0.x());
      akk $$10 = (akk)$$9.getFirst();
      fvg<coh> $$11 = (fvg<coh>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      faq $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bk()) {
         faq $$13 = $$4.getBuffer(gel.i());
         if ($$11 instanceof fxb $$14) {
            $$14.c().a($$3, $$13, $$5, gpf.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(coh $$0) {
      return (akk)this.a.get($$0.x()).getFirst();
   }
}
