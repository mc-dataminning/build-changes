import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class fuq extends fvj<cff> {
   private final Map<cff.b, Pair<agg, fhu<cff>>> a;

   public fuq(fvk.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cff.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new agg(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fhu<cff> a(fvk.a $$0, cff.b $$1, boolean $$2) {
      fjz $$3 = $$2 ? fka.d($$1) : fka.c($$1);
      fkb $$4 = $$0.a($$3);
      if ($$1 == cff.b.i) {
         return (fhu<cff>)($$2 ? new fgp($$4) : new fio($$4));
      } else {
         return (fhu<cff>)($$2 ? new fgo($$4) : new fgk($$4));
      }
   }

   private static String a(cff.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cff $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.N() - $$2;
      float $$7 = $$0.M() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(ati.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.O()));
      }

      float $$8 = $$0.a($$2);
      if (!ati.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<agg, fhu<cff>> $$9 = this.a.get($$0.x());
      agg $$10 = (agg)$$9.getFirst();
      fhu<cff> $$11 = (fhu<cff>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eno $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gay.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bc()) {
         eno $$13 = $$4.getBuffer(fqp.i());
         if ($$11 instanceof fjp $$14) {
            $$14.c().a($$3, $$13, $$5, gay.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agg a(cff $$0) {
      return (agg)this.a.get($$0.x()).getFirst();
   }
}
