import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gms extends gnn<cpx, gtd> {
   private final Map<cpx.b, Pair<ale, fxo<gtd>>> a;
   private final fyj b;

   public gms(gno.a $$0, boolean $$1) {
      super($$0);
      this.f = 0.8F;
      this.a = Stream.of(cpx.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(a($$2, $$1), this.a($$0, $$2, $$1))));
      this.b = new fyj.a($$0.a(gap.v), $$0x -> ghv.i());
   }

   private fxo<gtd> a(gno.a $$0, cpx.b $$1, boolean $$2) {
      gao $$3 = $$2 ? gap.b($$1) : gap.a($$1);
      gaq $$4 = $$0.a($$3);

      return (fxo<gtd>)(switch ($$1) {
         case i -> new fza($$4);
         default -> new fww($$4);
      });
   }

   private static ale a(cpx.b $$0, boolean $$1) {
      return $$1 ? ale.b("textures/entity/chest_boat/" + $$0.a() + ".png") : ale.b("textures/entity/boat/" + $$0.a() + ".png");
   }

   public void a(gtd $$0, fdi $$1, ghl $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.375F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$0.a));
      float $$4 = $$0.c;
      if ($$4 > 0.0F) {
         $$1.a(a.b.rotationDegrees(azf.a($$4) * $$4 * $$0.d / 10.0F * (float)$$0.b));
      }

      if (!azf.a($$0.e, 0.0F)) {
         $$1.a(new Quaternionf().setAngleAxis($$0.e * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<ale, fxo<gtd>> $$5 = this.a.get($$0.g);
      ale $$6 = (ale)$$5.getFirst();
      fxo<gtd> $$7 = (fxo<gtd>)$$5.getSecond();
      $$1.b(-1.0F, -1.0F, 1.0F);
      $$1.a(a.d.rotationDegrees(90.0F));
      $$7.a($$0);
      fdm $$8 = $$2.getBuffer($$7.a($$6));
      $$7.a($$1, $$8, $$3, gwx.d);
      if (!$$0.f && $$0.g != cpx.b.i) {
         this.b.a($$1, $$2.getBuffer(this.b.a($$6)), $$3, gwx.d);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gtd a() {
      return new gtd();
   }

   public void a(cpx $$0, gtd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.k($$2);
      $$1.c = (float)$$0.S() - $$2;
      $$1.b = $$0.T();
      $$1.d = Math.max($$0.R() - $$2, 0.0F);
      $$1.e = $$0.a($$2);
      $$1.f = $$0.bn();
      $$1.g = $$0.w();
      $$1.h = $$0.a(0, $$2);
      $$1.i = $$0.a(1, $$2);
   }
}
