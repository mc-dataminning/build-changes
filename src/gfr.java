import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gfr extends ggm<cmi> {
   private final Map<cmi.b, Pair<akf, fsj<cmi>>> a;

   public gfr(ggn.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cmi.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new akf(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fsj<cmi> a(ggn.a $$0, cmi.b $$1, boolean $$2) {
      fup $$3 = $$2 ? fuq.d($$1) : fuq.c($$1);
      fur $$4 = $$0.a($$3);
      if ($$1 == cmi.b.i) {
         return (fsj<cmi>)($$2 ? new fre($$4) : new ftd($$4));
      } else {
         return (fsj<cmi>)($$2 ? new frd($$4) : new fqx($$4));
      }
   }

   private static String a(cmi.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cmi $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(axw.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!axw.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<akf, fsj<cmi>> $$9 = this.a.get($$0.x());
      akf $$10 = (akf)$$9.getFirst();
      fsj<cmi> $$11 = (fsj<cmi>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      exr $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.bh()) {
         exr $$13 = $$4.getBuffer(gbm.i());
         if ($$11 instanceof fue $$14) {
            $$14.c().a($$3, $$13, $$5, gmf.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akf a(cmi $$0) {
      return (akf)this.a.get($$0.x()).getFirst();
   }
}
