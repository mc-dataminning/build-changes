import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.joml.Matrix4f;

public class gvy {
   private static final int a = axy.a(255, 255, 100, 255);
   private static final int b = axy.a(255, 100, 255, 255);
   private static final int c = axy.a(255, 0, 255, 0);
   private static final int d = axy.a(255, 255, 165, 0);
   private static final int e = axy.a(255, 255, 0, 0);
   private static final int f = 20;
   private static final float g = (float) (Math.PI / 10);
   private final frd h;
   private final Map<Integer, aaj.a> i = new HashMap<>();

   public gvy(frd $$0) {
      this.h = $$0;
   }

   public void a(flo $$0, gsa $$1, double $$2, double $$3, double $$4) {
      gqz $$5 = this.h.t;
      $$5.dV().a(bxc.s, $$5.cR().g(100.0), $$0x -> true).forEach($$6 -> {
         Optional<aaj.a> $$7 = Optional.ofNullable(this.i.get($$6.ao()));
         $$7.map(aaj.a::d).map($$1xx -> $$5.dV().a($$1xx)).map($$0xx -> $$0xx.p(this.h.av().a(true))).ifPresent($$6x -> {
            a($$0, $$1, $$2, $$3, $$4, $$6.dt(), $$6x, b);
            ffq $$7x = $$6x.b(0.0, 0.01F, 0.0);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(gsl.a(2.0)), $$7x, 4.0F, c);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(gsl.a(2.0)), $$7x, 8.0F, d);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(gsl.a(2.0)), $$7x, 24.0F, e);
         });
         $$7.map(aaj.a::e).ifPresent($$6x -> {
            a($$0, $$1, $$2, $$3, $$4, $$6.dt(), $$6x.b(), a);
            gwd.a($$0, $$1, ffl.a(ffq.a($$6x)).d(-$$2, -$$3, -$$4), 1.0F, 0.0F, 0.0F, 1.0F);
         });
      });
   }

   private static void a(flo $$0, gsa $$1, double $$2, double $$3, double $$4, ffq $$5, ffq $$6, int $$7) {
      flr $$8 = $$1.getBuffer(gsl.a(2.0));
      $$8.a($$0.c(), (float)($$5.d - $$2), (float)($$5.e - $$3), (float)($$5.f - $$4)).a($$7);
      $$8.a($$0.c(), (float)($$6.d - $$2), (float)($$6.e - $$3), (float)($$6.f - $$4)).a($$7);
   }

   private static void a(Matrix4f $$0, double $$1, double $$2, double $$3, flr $$4, ffq $$5, float $$6, int $$7) {
      for (int $$8 = 0; $$8 < 20; $$8++) {
         a($$8, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      a(0, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void a(int $$0, Matrix4f $$1, double $$2, double $$3, double $$4, flr $$5, ffq $$6, float $$7, int $$8) {
      float $$9 = (float)$$0 * (float) (Math.PI / 10);
      ffq $$10 = $$6.b((double)$$7 * Math.cos((double)$$9), 0.0, (double)$$7 * Math.sin((double)$$9));
      $$5.a($$1, (float)($$10.d - $$2), (float)($$10.e - $$3), (float)($$10.f - $$4)).a($$8);
   }

   public void a() {
      this.i.clear();
   }

   public void a(aaj.a $$0) {
      this.i.put($$0.c(), $$0);
   }
}
