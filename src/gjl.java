import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gjl extends gkg<cov> {
   private final Map<cov.b, Pair<akr, fwa<cov>>> a;

   public gjl(gkh.a $$0, boolean $$1) {
      super($$0);
      this.e = 0.8F;
      this.a = Stream.of(cov.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(a($$2, $$1), this.a($$0, $$2, $$1))));
   }

   private fwa<cov> a(gkh.a $$0, cov.b $$1, boolean $$2) {
      fyg $$3 = $$2 ? fyh.d($$1) : fyh.c($$1);
      fyi $$4 = $$0.a($$3);
      if ($$1 == cov.b.i) {
         return (fwa<cov>)($$2 ? new fuv($$4) : new fwu($$4));
      } else {
         return (fwa<cov>)($$2 ? new fuu($$4) : new fuo($$4));
      }
   }

   private static akr a(cov.b $$0, boolean $$1) {
      return $$1 ? akr.b("textures/entity/chest_boat/" + $$0.a() + ".png") : akr.b("textures/entity/boat/" + $$0.a() + ".png");
   }

   public void a(cov $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(ayo.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!ayo.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<akr, fwa<cov>> $$9 = this.a.get($$0.x());
      akr $$10 = (akr)$$9.getFirst();
      fwa<cov> $$11 = (fwa<cov>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fbk $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gqa.d);
      if (!$$0.bk()) {
         fbk $$13 = $$4.getBuffer(gff.i());
         if ($$11 instanceof fxv $$14) {
            $$14.c().a($$3, $$13, $$5, gqa.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akr a(cov $$0) {
      return (akr)this.a.get($$0.x()).getFirst();
   }
}
