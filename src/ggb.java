import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class ggb extends ggw<cne> {
   private final Map<cne.b, Pair<akh, fst<cne>>> a;

   public ggb(ggx.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cne.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new akh(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fst<cne> a(ggx.a $$0, cne.b $$1, boolean $$2) {
      fuz $$3 = $$2 ? fva.d($$1) : fva.c($$1);
      fvb $$4 = $$0.a($$3);
      if ($$1 == cne.b.i) {
         return (fst<cne>)($$2 ? new fro($$4) : new ftn($$4));
      } else {
         return (fst<cne>)($$2 ? new frn($$4) : new frh($$4));
      }
   }

   private static String a(cne.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cne $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(axz.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!axz.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<akh, fst<cne>> $$9 = this.a.get($$0.x());
      akh $$10 = (akh)$$9.getFirst();
      fst<cne> $$11 = (fst<cne>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eyb $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bh()) {
         eyb $$13 = $$4.getBuffer(gbw.i());
         if ($$11 instanceof fuo $$14) {
            $$14.c().a($$3, $$13, $$5, gmp.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akh a(cne $$0) {
      return (akh)this.a.get($$0.x()).getFirst();
   }
}
