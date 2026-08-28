import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gno extends goj<cqm, gua> {
   private final Map<cqm.b, Pair<ali, fyk<gua>>> a;
   private final fzf b;

   public gno(gok.a $$0, boolean $$1) {
      super($$0);
      this.f = 0.8F;
      this.a = Stream.of(cqm.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(a($$2, $$1), this.a($$0, $$2, $$1))));
      this.b = new fzf.a($$0.a(gbl.v), $$0x -> gir.i());
   }

   private fyk<gua> a(gok.a $$0, cqm.b $$1, boolean $$2) {
      gbk $$3 = $$2 ? gbl.b($$1) : gbl.a($$1);
      gbm $$4 = $$0.a($$3);

      return (fyk<gua>)(switch ($$1) {
         case i -> new fzw($$4);
         default -> new fxs($$4);
      });
   }

   private static ali a(cqm.b $$0, boolean $$1) {
      return $$1 ? ali.b("textures/entity/chest_boat/" + $$0.a() + ".png") : ali.b("textures/entity/boat/" + $$0.a() + ".png");
   }

   public void a(gua $$0, feb $$1, gih $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.375F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$0.a));
      float $$4 = $$0.c;
      if ($$4 > 0.0F) {
         $$1.a(a.b.rotationDegrees(azk.a($$4) * $$4 * $$0.d / 10.0F * (float)$$0.b));
      }

      if (!azk.a($$0.e, 0.0F)) {
         $$1.a(new Quaternionf().setAngleAxis($$0.e * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<ali, fyk<gua>> $$5 = this.a.get($$0.g);
      ali $$6 = (ali)$$5.getFirst();
      fyk<gua> $$7 = (fyk<gua>)$$5.getSecond();
      $$1.b(-1.0F, -1.0F, 1.0F);
      $$1.a(a.d.rotationDegrees(90.0F));
      $$7.a($$0);
      fef $$8 = $$2.getBuffer($$7.a($$6));
      $$7.a($$1, $$8, $$3, gxu.d);
      if (!$$0.f && $$0.g != cqm.b.i) {
         this.b.a($$1, $$2.getBuffer(this.b.a($$6)), $$3, gxu.d);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gua a() {
      return new gua();
   }

   public void a(cqm $$0, gua $$1, float $$2) {
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
