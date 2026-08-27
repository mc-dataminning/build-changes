import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gaf extends gaz<cjg> {
   private final Map<cjg.b, Pair<aiy, fna<cjg>>> a;

   public gaf(gba.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cjg.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new aiy(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fna<cjg> a(gba.a $$0, cjg.b $$1, boolean $$2) {
      fph $$3 = $$2 ? fpi.d($$1) : fpi.c($$1);
      fpj $$4 = $$0.a($$3);
      if ($$1 == cjg.b.i) {
         return (fna<cjg>)($$2 ? new flv($$4) : new fnu($$4));
      } else {
         return (fna<cjg>)($$2 ? new flu($$4) : new flp($$4));
      }
   }

   private static String a(cjg.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cjg $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(awi.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!awi.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<aiy, fna<cjg>> $$9 = this.a.get($$0.y());
      aiy $$10 = (aiy)$$9.getFirst();
      fna<cjg> $$11 = (fna<cjg>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      esl $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, ggs.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.be()) {
         esl $$13 = $$4.getBuffer(fwb.i());
         if ($$11 instanceof fow $$14) {
            $$14.c().a($$3, $$13, $$5, ggs.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(cjg $$0) {
      return (aiy)this.a.get($$0.y()).getFirst();
   }
}
