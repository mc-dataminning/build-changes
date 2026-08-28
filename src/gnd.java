import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gnd extends gny<cqh, gtp> {
   private final Map<cqh.b, Pair<alh, fxz<gtp>>> a;
   private final fyu b;

   public gnd(gnz.a $$0, boolean $$1) {
      super($$0);
      this.f = 0.8F;
      this.a = Stream.of(cqh.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(a($$2, $$1), this.a($$0, $$2, $$1))));
      this.b = new fyu.a($$0.a(gba.v), $$0x -> gig.i());
   }

   private fxz<gtp> a(gnz.a $$0, cqh.b $$1, boolean $$2) {
      gaz $$3 = $$2 ? gba.b($$1) : gba.a($$1);
      gbb $$4 = $$0.a($$3);

      return (fxz<gtp>)(switch ($$1) {
         case i -> new fzl($$4);
         default -> new fxh($$4);
      });
   }

   private static alh a(cqh.b $$0, boolean $$1) {
      return $$1 ? alh.b("textures/entity/chest_boat/" + $$0.a() + ".png") : alh.b("textures/entity/boat/" + $$0.a() + ".png");
   }

   public void a(gtp $$0, fdt $$1, ghw $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.375F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$0.a));
      float $$4 = $$0.c;
      if ($$4 > 0.0F) {
         $$1.a(a.b.rotationDegrees(azj.a($$4) * $$4 * $$0.d / 10.0F * (float)$$0.b));
      }

      if (!azj.a($$0.e, 0.0F)) {
         $$1.a(new Quaternionf().setAngleAxis($$0.e * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<alh, fxz<gtp>> $$5 = this.a.get($$0.g);
      alh $$6 = (alh)$$5.getFirst();
      fxz<gtp> $$7 = (fxz<gtp>)$$5.getSecond();
      $$1.b(-1.0F, -1.0F, 1.0F);
      $$1.a(a.d.rotationDegrees(90.0F));
      $$7.a($$0);
      fdx $$8 = $$2.getBuffer($$7.a($$6));
      $$7.a($$1, $$8, $$3, gxj.d);
      if (!$$0.f && $$0.g != cqh.b.i) {
         this.b.a($$1, $$2.getBuffer(this.b.a($$6)), $$3, gxj.d);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gtp a() {
      return new gtp();
   }

   public void a(cqh $$0, gtp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.c = (float)$$0.R() - $$2;
      $$1.b = $$0.S();
      $$1.d = Math.max($$0.Q() - $$2, 0.0F);
      $$1.e = $$0.a($$2);
      $$1.f = $$0.bp();
      $$1.g = $$0.w();
      $$1.h = $$0.a(0, $$2);
      $$1.i = $$0.a(1, $$2);
   }
}
