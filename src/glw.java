import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class glw extends gmr<cpo, gsh> {
   private final Map<cpo.b, Pair<alb, fxa<gsh>>> a;
   private final fxv b;

   public glw(gms.a $$0, boolean $$1) {
      super($$0);
      this.f = 0.8F;
      this.a = Stream.of(cpo.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(a($$2, $$1), this.a($$0, $$2, $$1))));
      this.b = new fxv.a($$0.a(gaa.v), $$0x -> ghe.i());
   }

   private fxa<gsh> a(gms.a $$0, cpo.b $$1, boolean $$2) {
      fzz $$3 = $$2 ? gaa.b($$1) : gaa.a($$1);
      gab $$4 = $$0.a($$3);

      return (fxa<gsh>)(switch ($$1) {
         case i -> new fym($$4);
         default -> new fwi($$4);
      });
   }

   private static alb a(cpo.b $$0, boolean $$1) {
      return $$1 ? alb.b("textures/entity/chest_boat/" + $$0.a() + ".png") : alb.b("textures/entity/boat/" + $$0.a() + ".png");
   }

   public void a(gsh $$0, fcu $$1, ggv $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.375F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$0.a));
      float $$4 = $$0.c;
      if ($$4 > 0.0F) {
         $$1.a(a.b.rotationDegrees(azc.a($$4) * $$4 * $$0.d / 10.0F * (float)$$0.b));
      }

      if (!azc.a($$0.e, 0.0F)) {
         $$1.a(new Quaternionf().setAngleAxis($$0.e * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<alb, fxa<gsh>> $$5 = this.a.get($$0.g);
      alb $$6 = (alb)$$5.getFirst();
      fxa<gsh> $$7 = (fxa<gsh>)$$5.getSecond();
      $$1.b(-1.0F, -1.0F, 1.0F);
      $$1.a(a.d.rotationDegrees(90.0F));
      $$7.a($$0);
      fcy $$8 = $$2.getBuffer($$7.a($$6));
      $$7.a($$1, $$8, $$3, gwb.d);
      if (!$$0.f && $$0.g != cpo.b.i) {
         this.b.a($$1, $$2.getBuffer(this.b.a($$6)), $$3, gwb.d);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alb a(gsh $$0) {
      return (alb)this.a.get($$0.g).getFirst();
   }

   public gsh a() {
      return new gsh();
   }

   public void a(cpo $$0, gsh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.c = (float)$$0.R() - $$2;
      $$1.b = $$0.S();
      $$1.d = Math.max($$0.Q() - $$2, 0.0F);
      $$1.e = $$0.a($$2);
      $$1.f = $$0.bn();
      $$1.g = $$0.w();
      $$1.h = $$0.a(0, $$2);
      $$1.i = $$0.a(1, $$2);
   }
}
