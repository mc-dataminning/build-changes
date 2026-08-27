import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class ggx extends ghs<cnv> {
   private final Map<cnv.b, Pair<akn, fto<cnv>>> a;

   public ggx(ght.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cnv.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new akn(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fto<cnv> a(ght.a $$0, cnv.b $$1, boolean $$2) {
      fvu $$3 = $$2 ? fvv.d($$1) : fvv.c($$1);
      fvw $$4 = $$0.a($$3);
      if ($$1 == cnv.b.i) {
         return (fto<cnv>)($$2 ? new fsj($$4) : new fui($$4));
      } else {
         return (fto<cnv>)($$2 ? new fsi($$4) : new fsc($$4));
      }
   }

   private static String a(cnv.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cnv $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(ayf.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!ayf.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<akn, fto<cnv>> $$9 = this.a.get($$0.x());
      akn $$10 = (akn)$$9.getFirst();
      fto<cnv> $$11 = (fto<cnv>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eyy $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bj()) {
         eyy $$13 = $$4.getBuffer(gcs.i());
         if ($$11 instanceof fvj $$14) {
            $$14.c().a($$3, $$13, $$5, gnm.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akn a(cnv $$0) {
      return (akn)this.a.get($$0.x()).getFirst();
   }
}
