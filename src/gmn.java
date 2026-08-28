import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import org.joml.Quaternionf;

public class gmn extends gni<cpu, gsy> {
   private final Map<cpu.b, Pair<alc, fxk<gsy>>> a;
   private final fyf b;

   public gmn(gnj.a $$0, boolean $$1) {
      super($$0);
      this.f = 0.8F;
      this.a = Stream.of(cpu.b.values()).collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$2 -> Pair.of(a($$2, $$1), this.a($$0, $$2, $$1))));
      this.b = new fyf.a($$0.a(gak.v), $$0x -> ghq.i());
   }

   private fxk<gsy> a(gnj.a $$0, cpu.b $$1, boolean $$2) {
      gaj $$3 = $$2 ? gak.b($$1) : gak.a($$1);
      gal $$4 = $$0.a($$3);

      return (fxk<gsy>)(switch ($$1) {
         case i -> new fyw($$4);
         default -> new fws($$4);
      });
   }

   private static alc a(cpu.b $$0, boolean $$1) {
      return $$1 ? alc.b("textures/entity/chest_boat/" + $$0.a() + ".png") : alc.b("textures/entity/boat/" + $$0.a() + ".png");
   }

   public void a(gsy $$0, fde $$1, ghg $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.375F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$0.a));
      float $$4 = $$0.c;
      if ($$4 > 0.0F) {
         $$1.a(a.b.rotationDegrees(azd.a($$4) * $$4 * $$0.d / 10.0F * (float)$$0.b));
      }

      if (!azd.a($$0.e, 0.0F)) {
         $$1.a(new Quaternionf().setAngleAxis($$0.e * (float) (Math.PI / 180.0), 1.0F, 0.0F, 1.0F));
      }

      Pair<alc, fxk<gsy>> $$5 = this.a.get($$0.g);
      alc $$6 = (alc)$$5.getFirst();
      fxk<gsy> $$7 = (fxk<gsy>)$$5.getSecond();
      $$1.b(-1.0F, -1.0F, 1.0F);
      $$1.a(a.d.rotationDegrees(90.0F));
      $$7.a($$0);
      fdi $$8 = $$2.getBuffer($$7.a($$6));
      $$7.a($$1, $$8, $$3, gws.d);
      if (!$$0.f && $$0.g != cpu.b.i) {
         this.b.a($$1, $$2.getBuffer(this.b.a($$6)), $$3, gws.d);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alc a(gsy $$0) {
      return (alc)this.a.get($$0.g).getFirst();
   }

   public gsy a() {
      return new gsy();
   }

   public void a(cpu $$0, gsy $$1, float $$2) {
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
