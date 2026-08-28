import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gid extends giy<cox> {
   private final Map<cox.b, Pair<alf, fuu<cox>>> a;

   public gid(giz.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cox.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new alf(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fuu<cox> a(giz.a $$0, cox.b $$1, boolean $$2) {
      fxa $$3 = $$2 ? fxb.d($$1) : fxb.c($$1);
      fxc $$4 = $$0.a($$3);
      if ($$1 == cox.b.i) {
         return (fuu<cox>)($$2 ? new ftp($$4) : new fvo($$4));
      } else {
         return (fuu<cox>)($$2 ? new fto($$4) : new fti($$4));
      }
   }

   private static String a(cox.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cox $$0, float $$1, float $$2, faa $$3, gdq $$4, int $$5) {
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

      Pair<alf, fuu<cox>> $$9 = this.a.get($$0.x());
      alf $$10 = (alf)$$9.getFirst();
      fuu<cox> $$11 = (fuu<cox>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fae $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gos.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bj()) {
         fae $$13 = $$4.getBuffer(gdy.i());
         if ($$11 instanceof fwp $$14) {
            $$14.c().a($$3, $$13, $$5, gos.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(cox $$0) {
      return (alf)this.a.get($$0.x()).getFirst();
   }
}
