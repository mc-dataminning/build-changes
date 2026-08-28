import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gic extends gix<cow> {
   private final Map<cow.b, Pair<alf, fut<cow>>> a;

   public gic(giy.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cow.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new alf(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fut<cow> a(giy.a $$0, cow.b $$1, boolean $$2) {
      fwz $$3 = $$2 ? fxa.d($$1) : fxa.c($$1);
      fxb $$4 = $$0.a($$3);
      if ($$1 == cow.b.i) {
         return (fut<cow>)($$2 ? new fto($$4) : new fvn($$4));
      } else {
         return (fut<cow>)($$2 ? new ftn($$4) : new fth($$4));
      }
   }

   private static String a(cow.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cow $$0, float $$1, float $$2, ezz $$3, gdp $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(ayz.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!ayz.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<alf, fut<cow>> $$9 = this.a.get($$0.x());
      alf $$10 = (alf)$$9.getFirst();
      fut<cow> $$11 = (fut<cow>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fad $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gor.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bj()) {
         fad $$13 = $$4.getBuffer(gdx.i());
         if ($$11 instanceof fwo $$14) {
            $$14.c().a($$3, $$13, $$5, gor.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(cow $$0) {
      return (alf)this.a.get($$0.x()).getFirst();
   }
}
