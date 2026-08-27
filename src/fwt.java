import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fwt extends fxn<cgl> {
   private final Map<cgl.b, Pair<agt, fjq<cgl>>> a;

   public fwt(fxo.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cgl.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new agt(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fjq<cgl> a(fxo.a $$0, cgl.b $$1, boolean $$2) {
      flw $$3 = $$2 ? flx.d($$1) : flx.c($$1);
      fly $$4 = $$0.a($$3);
      if ($$1 == cgl.b.i) {
         return (fjq<cgl>)($$2 ? new fil($$4) : new fkk($$4));
      } else {
         return (fjq<cgl>)($$2 ? new fik($$4) : new fif($$4));
      }
   }

   private static String a(cgl.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cgl $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(aty.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!aty.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<agt, fjq<cgl>> $$9 = this.a.get($$0.y());
      agt $$10 = (agt)$$9.getFirst();
      fjq<cgl> $$11 = (fjq<cgl>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eph $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gdf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.be()) {
         eph $$13 = $$4.getBuffer(fsq.i());
         if ($$11 instanceof fll $$14) {
            $$14.c().a($$3, $$13, $$5, gdf.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agt a(cgl $$0) {
      return (agt)this.a.get($$0.y()).getFirst();
   }
}
