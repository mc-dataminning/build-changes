import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fxq extends fyk<chb> {
   private final Map<chb.b, Pair<ahg, fkn<chb>>> a;

   public fxq(fyl.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(chb.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new ahg(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fkn<chb> a(fyl.a $$0, chb.b $$1, boolean $$2) {
      fmt $$3 = $$2 ? fmu.d($$1) : fmu.c($$1);
      fmv $$4 = $$0.a($$3);
      if ($$1 == chb.b.i) {
         return (fkn<chb>)($$2 ? new fji($$4) : new flh($$4));
      } else {
         return (fkn<chb>)($$2 ? new fjh($$4) : new fjc($$4));
      }
   }

   private static String a(chb.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(chb $$0, float $$1, float $$2, epz $$3, ftf $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(aun.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!aun.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<ahg, fkn<chb>> $$9 = this.a.get($$0.y());
      ahg $$10 = (ahg)$$9.getFirst();
      fkn<chb> $$11 = (fkn<chb>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eqd $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gec.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.be()) {
         eqd $$13 = $$4.getBuffer(ftn.i());
         if ($$11 instanceof fmi $$14) {
            $$14.c().a($$3, $$13, $$5, gec.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahg a(chb $$0) {
      return (ahg)this.a.get($$0.y()).getFirst();
   }
}
