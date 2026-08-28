import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class goe extends goz<cqq, guq> {
   private final Map<cqq.b, Pair<all, fza<guq>>> a;
   private final fzv b;

   public goe(gpa.a $$0, boolean $$1) {
      super($$0);
      this.f = 0.8F;
      this.a = Stream.of(cqq.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(a($$2, $$1), this.a($$0, $$2, $$1))));
      this.b = new fzv.a($$0.a(gcb.v), $$0x -> gjh.i());
   }

   private fza<guq> a(gpa.a $$0, cqq.b $$1, boolean $$2) {
      gca $$3 = $$2 ? gcb.b($$1) : gcb.a($$1);
      gcc $$4 = $$0.a($$3);

      return (fza<guq>)(switch ($$1) {
         case i -> new gam($$4);
         default -> new fyi($$4);
      });
   }

   private static all a(cqq.b $$0, boolean $$1) {
      return $$1 ? all.b("textures/entity/chest_boat/" + $$0.a() + ".png") : all.b("textures/entity/boat/" + $$0.a() + ".png");
   }

   public void a(guq $$0, fek $$1, gix $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.375F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$0.a));
      float $$4 = $$0.c;
      if ($$4 > 0.0F) {
         $$1.a(a.b.rotationDegrees(azn.a($$4) * $$4 * $$0.d / 10.0F * (float)$$0.b));
      }

      if (!azn.a($$0.e, 0.0F)) {
         $$1.a(new Quaternionf().setAngleAxis($$0.e * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<all, fza<guq>> $$5 = this.a.get($$0.g);
      all $$6 = (all)$$5.getFirst();
      fza<guq> $$7 = (fza<guq>)$$5.getSecond();
      $$1.b(-1.0F, -1.0F, 1.0F);
      $$1.a(a.d.rotationDegrees(90.0F));
      $$7.a($$0);
      feo $$8 = $$2.getBuffer($$7.a($$6));
      $$7.a($$1, $$8, $$3, gyk.d);
      if (!$$0.f && $$0.g != cqq.b.i) {
         this.b.a($$1, $$2.getBuffer(this.b.a($$6)), $$3, gyk.d);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public guq a() {
      return new guq();
   }

   public void a(cqq $$0, guq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.c = (float)$$0.S() - $$2;
      $$1.b = $$0.T();
      $$1.d = Math.max($$0.R() - $$2, 0.0F);
      $$1.e = $$0.a($$2);
      $$1.f = $$0.bq();
      $$1.g = $$0.w();
      $$1.h = $$0.a(0, $$2);
      $$1.i = $$0.a(1, $$2);
   }
}
