import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gjh extends gkc<cot> {
   private final Map<cot.b, Pair<akq, fvw<cot>>> a;

   public gjh(gkd.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cot.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(a($$2, $$1), this.a($$0, $$2, $$1))));
   }

   private fvw<cot> a(gkd.a $$0, cot.b $$1, boolean $$2) {
      fyc $$3 = $$2 ? fyd.d($$1) : fyd.c($$1);
      fye $$4 = $$0.a($$3);
      if ($$1 == cot.b.i) {
         return (fvw<cot>)($$2 ? new fur($$4) : new fwq($$4));
      } else {
         return (fvw<cot>)($$2 ? new fuq($$4) : new fuk($$4));
      }
   }

   private static akq a(cot.b $$0, boolean $$1) {
      return $$1 ? akq.b("textures/entity/chest_boat/" + $$0.a() + ".png") : akq.b("textures/entity/boat/" + $$0.a() + ".png");
   }

   public void a(cot $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(ayn.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!ayn.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<akq, fvw<cot>> $$9 = this.a.get($$0.x());
      akq $$10 = (akq)$$9.getFirst();
      fvw<cot> $$11 = (fvw<cot>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fbg $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gpw.d);
      if (!$$0.bk()) {
         fbg $$13 = $$4.getBuffer(gfb.i());
         if ($$11 instanceof fxr $$14) {
            $$14.c().a($$3, $$13, $$5, gpw.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akq a(cot $$0) {
      return (akq)this.a.get($$0.x()).getFirst();
   }
}
