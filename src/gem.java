import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gem extends gfh<clq> {
   private final Map<clq.b, Pair<ajt, fre<clq>>> a;

   public gem(gfi.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(clq.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new ajt(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fre<clq> a(gfi.a $$0, clq.b $$1, boolean $$2) {
      ftk $$3 = $$2 ? ftl.d($$1) : ftl.c($$1);
      ftm $$4 = $$0.a($$3);
      if ($$1 == clq.b.i) {
         return (fre<clq>)($$2 ? new fpz($$4) : new fry($$4));
      } else {
         return (fre<clq>)($$2 ? new fpy($$4) : new fps($$4));
      }
   }

   private static String a(clq.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(clq $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(axk.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!axk.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<ajt, fre<clq>> $$9 = this.a.get($$0.x());
      ajt $$10 = (ajt)$$9.getFirst();
      fre<clq> $$11 = (fre<clq>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      ewm $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bh()) {
         ewm $$13 = $$4.getBuffer(gah.i());
         if ($$11 instanceof fsz $$14) {
            $$14.c().a($$3, $$13, $$5, gla.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajt a(clq $$0) {
      return (ajt)this.a.get($$0.x()).getFirst();
   }
}
