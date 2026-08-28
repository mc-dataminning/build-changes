import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gik extends gjf<coe> {
   private final Map<coe.b, Pair<akk, fva<coe>>> a;

   public gik(gjg.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(coe.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new akk(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fva<coe> a(gjg.a $$0, coe.b $$1, boolean $$2) {
      fxg $$3 = $$2 ? fxh.d($$1) : fxh.c($$1);
      fxi $$4 = $$0.a($$3);
      if ($$1 == coe.b.i) {
         return (fva<coe>)($$2 ? new ftv($$4) : new fvu($$4));
      } else {
         return (fva<coe>)($$2 ? new ftu($$4) : new fto($$4));
      }
   }

   private static String a(coe.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(coe $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(aye.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!aye.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<akk, fva<coe>> $$9 = this.a.get($$0.x());
      akk $$10 = (akk)$$9.getFirst();
      fva<coe> $$11 = (fva<coe>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fak $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bj()) {
         fak $$13 = $$4.getBuffer(gef.i());
         if ($$11 instanceof fwv $$14) {
            $$14.c().a($$3, $$13, $$5, goz.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(coe $$0) {
      return (akk)this.a.get($$0.x()).getFirst();
   }
}
