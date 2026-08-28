import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class ghz extends giu<cot> {
   private final Map<cot.b, Pair<ale, fuq<cot>>> a;

   public ghz(giv.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cot.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new ale(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fuq<cot> a(giv.a $$0, cot.b $$1, boolean $$2) {
      fww $$3 = $$2 ? fwx.d($$1) : fwx.c($$1);
      fwy $$4 = $$0.a($$3);
      if ($$1 == cot.b.i) {
         return (fuq<cot>)($$2 ? new ftl($$4) : new fvk($$4));
      } else {
         return (fuq<cot>)($$2 ? new ftk($$4) : new fte($$4));
      }
   }

   private static String a(cot.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cot $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(ayx.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!ayx.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<ale, fuq<cot>> $$9 = this.a.get($$0.x());
      ale $$10 = (ale)$$9.getFirst();
      fuq<cot> $$11 = (fuq<cot>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      faa $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bj()) {
         faa $$13 = $$4.getBuffer(gdu.i());
         if ($$11 instanceof fwl $$14) {
            $$14.c().a($$3, $$13, $$5, goo.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ale a(cot $$0) {
      return (ale)this.a.get($$0.x()).getFirst();
   }
}
