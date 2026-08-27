import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fxs extends fym<chc> {
   private final Map<chc.b, Pair<ahg, fkp<chc>>> a;

   public fxs(fyn.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(chc.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new ahg(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fkp<chc> a(fyn.a $$0, chc.b $$1, boolean $$2) {
      fmv $$3 = $$2 ? fmw.d($$1) : fmw.c($$1);
      fmx $$4 = $$0.a($$3);
      if ($$1 == chc.b.i) {
         return (fkp<chc>)($$2 ? new fjk($$4) : new flj($$4));
      } else {
         return (fkp<chc>)($$2 ? new fjj($$4) : new fje($$4));
      }
   }

   private static String a(chc.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(chc $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(auo.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!auo.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<ahg, fkp<chc>> $$9 = this.a.get($$0.y());
      ahg $$10 = (ahg)$$9.getFirst();
      fkp<chc> $$11 = (fkp<chc>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eqf $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gee.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.be()) {
         eqf $$13 = $$4.getBuffer(ftp.i());
         if ($$11 instanceof fmk $$14) {
            $$14.c().a($$3, $$13, $$5, gee.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahg a(chc $$0) {
      return (ahg)this.a.get($$0.y()).getFirst();
   }
}
