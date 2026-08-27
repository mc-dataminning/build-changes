import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fxk extends fye<cgv> {
   private final Map<cgv.b, Pair<ahd, fkh<cgv>>> a;

   public fxk(fyf.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cgv.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new ahd(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fkh<cgv> a(fyf.a $$0, cgv.b $$1, boolean $$2) {
      fmn $$3 = $$2 ? fmo.d($$1) : fmo.c($$1);
      fmp $$4 = $$0.a($$3);
      if ($$1 == cgv.b.i) {
         return (fkh<cgv>)($$2 ? new fjc($$4) : new flb($$4));
      } else {
         return (fkh<cgv>)($$2 ? new fjb($$4) : new fiw($$4));
      }
   }

   private static String a(cgv.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cgv $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(aui.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!aui.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<ahd, fkh<cgv>> $$9 = this.a.get($$0.y());
      ahd $$10 = (ahd)$$9.getFirst();
      fkh<cgv> $$11 = (fkh<cgv>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      epx $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.be()) {
         epx $$13 = $$4.getBuffer(fth.i());
         if ($$11 instanceof fmc $$14) {
            $$14.c().a($$3, $$13, $$5, gdw.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahd a(cgv $$0) {
      return (ahd)this.a.get($$0.y()).getFirst();
   }
}
