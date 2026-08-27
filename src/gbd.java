import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gbd extends gbx<cjv> {
   private final Map<cjv.b, Pair<ajc, fnw<cjv>>> a;

   public gbd(gby.a $$0, boolean $$1) {
      super($$0);
      this.d = 0.8F;
      this.a = Stream.of(cjv.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(new ajc(a($$2, $$1)), this.a($$0, $$2, $$1))));
   }

   private fnw<cjv> a(gby.a $$0, cjv.b $$1, boolean $$2) {
      fqd $$3 = $$2 ? fqe.d($$1) : fqe.c($$1);
      fqf $$4 = $$0.a($$3);
      if ($$1 == cjv.b.i) {
         return (fnw<cjv>)($$2 ? new fmr($$4) : new foq($$4));
      } else {
         return (fnw<cjv>)($$2 ? new fmq($$4) : new fml($$4));
      }
   }

   private static String a(cjv.b $$0, boolean $$1) {
      return $$1 ? "textures/entity/chest_boat/" + $$0.a() + ".png" : "textures/entity/boat/" + $$0.a() + ".png";
   }

   public void a(cjv $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.375F, 0.0F);
      $$3.a(a.d.rotationDegrees(180.0F - $$1));
      float $$6 = (float)$$0.O() - $$2;
      float $$7 = $$0.N() - $$2;
      if ($$7 < 0.0F) {
         $$7 = 0.0F;
      }

      if ($$6 > 0.0F) {
         $$3.a(a.b.rotationDegrees(awm.a($$6) * $$6 * $$7 / 10.0F * (float)$$0.P()));
      }

      float $$8 = $$0.a($$2);
      if (!awm.a($$8, 0.0F)) {
         $$3.a(new Quaternionf().setAngleAxis($$0.a($$2) * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<ajc, fnw<cjv>> $$9 = this.a.get($$0.y());
      ajc $$10 = (ajc)$$9.getFirst();
      fnw<cjv> $$11 = (fnw<cjv>)$$9.getSecond();
      $$3.b(-1.0F, -1.0F, 1.0F);
      $$3.a(a.d.rotationDegrees(90.0F));
      $$11.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eth $$12 = $$4.getBuffer($$11.a($$10));
      $$11.a($$3, $$12, $$5, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!$$0.be()) {
         eth $$13 = $$4.getBuffer(fwy.i());
         if ($$11 instanceof fps $$14) {
            $$14.c().a($$3, $$13, $$5, ghq.d);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajc a(cjv $$0) {
      return (ajc)this.a.get($$0.y()).getFirst();
   }
}
