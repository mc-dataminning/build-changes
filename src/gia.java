import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gia extends giv<cou> {
   private final Map<cou.b, Pair<ale, fur<cou>>> a;

   public gia(giw.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cou.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new ale(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fur<cou> a(giw.a $$0, cou.b $$1, boolean $$2) {
      fwx $$3 = $$2 ? fwy.d($$1) : fwy.c($$1);
      fwz $$4 = $$0.a($$3);
      if ($$1 == cou.b.i) {
         return (fur<cou>)($$2 ? new ftm($$4) : new fvl($$4));
      } else {
         return (fur<cou>)($$2 ? new ftl($$4) : new ftf($$4));
      }
   }

   private static String a(cou.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cou $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(ayy.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!ayy.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<ale, fur<cou>> $$9 = this.a.get($$0.x());
      ale $$10 = (ale)$$9.getFirst();
      fur<cou> $$11 = (fur<cou>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fab $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gop.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bj()) {
         fab $$13 = $$4.getBuffer(gdv.i());
         if ($$11 instanceof fwm $$14) {
            $$14.c().a($$3, $$13, $$5, gop.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ale a(cou $$0) {
      return (ale)this.a.get($$0.x()).getFirst();
   }
}
