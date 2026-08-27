import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fvd extends fvw<cfn> {
   private final Map<cfn.b, Pair<agi, fih<cfn>>> a;

   public fvd(fvx.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cfn.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new agi(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fih<cfn> a(fvx.a $$0, cfn.b $$1, boolean $$2) {
      fkm $$3 = $$2 ? fkn.d($$1) : fkn.c($$1);
      fko $$4 = $$0.a($$3);
      if ($$1 == cfn.b.i) {
         return (fih<cfn>)($$2 ? new fhc($$4) : new fjb($$4));
      } else {
         return (fih<cfn>)($$2 ? new fhb($$4) : new fgx($$4));
      }
   }

   private static String a(cfn.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cfn $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(atm.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!atm.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<agi, fih<cfn>> $$9 = this.a.get($$0.y());
      agi $$10 = (agi)$$9.getFirst();
      fih<cfn> $$11 = (fih<cfn>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eoa $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gbl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.be()) {
         eoa $$13 = $$4.getBuffer(frc.i());
         if ($$11 instanceof fkc $$14) {
            $$14.c().a($$3, $$13, $$5, gbl.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agi a(cfn $$0) {
      return (agi)this.a.get($$0.y()).getFirst();
   }
}
