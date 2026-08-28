import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.joml.Matrix4f;

public class gkl {
   private static final int a = axn.a(255, 255, 100, 255);
   private static final int b = axn.a(255, 100, 255, 255);
   private static final int c = axn.a(255, 0, 255, 0);
   private static final int d = axn.a(255, 255, 165, 0);
   private static final int e = axn.a(255, 255, 0, 0);
   private static final int f = 20;
   private static final float g = (float) (Math.PI / 10);
   private final fib h;
   private final Map<Integer, aam.a> i = new HashMap<>();

   public gkl(fib $$0) {
      this.h = $$0;
   }

   public void a(fcu $$0, ggv $$1, double $$2, double $$3, double $$4) {
      gfs $$5 = this.h.t;
      $$5.dS().a(btq.m, $$5.cO().g(100.0), $$0x -> true).forEach($$6 -> {
         Optional<aam.a> $$7 = Optional.ofNullable(this.i.get($$6.ap()));
         $$7.map(aam.a::d).map($$1xx -> $$5.dS().a($$1xx)).map($$0xx -> $$0xx.o(this.h.au().a(true))).ifPresent($$6x -> {
            a($$0, $$1, $$2, $$3, $$4, $$6.dq(), $$6x, b);
            eye $$7x = $$6x.b(0.0, 0.01F, 0.0);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(ghe.a(2.0)), $$7x, 4.0F, c);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(ghe.a(2.0)), $$7x, 8.0F, d);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(ghe.a(2.0)), $$7x, 24.0F, e);
         });
         $$7.map(aam.a::e).ifPresent($$6x -> {
            a($$0, $$1, $$2, $$3, $$4, $$6.dq(), $$6x.b(), a);
            gkq.a($$0, $$1, exz.a(eye.a($$6x)).d(-$$2, -$$3, -$$4), 1.0F, 0.0F, 0.0F, 1.0F);
         });
      });
   }

   private static void a(fcu $$0, ggv $$1, double $$2, double $$3, double $$4, eye $$5, eye $$6, int $$7) {
      fcy $$8 = $$1.getBuffer(ghe.a(2.0));
      $$8.a($$0.c(), (float)($$5.d - $$2), (float)($$5.e - $$3), (float)($$5.f - $$4)).a($$7);
      $$8.a($$0.c(), (float)($$6.d - $$2), (float)($$6.e - $$3), (float)($$6.f - $$4)).a($$7);
   }

   private static void a(Matrix4f $$0, double $$1, double $$2, double $$3, fcy $$4, eye $$5, float $$6, int $$7) {
      for (int $$8 = 0; $$8 < 20; $$8++) {
         a($$8, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      a(0, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void a(int $$0, Matrix4f $$1, double $$2, double $$3, double $$4, fcy $$5, eye $$6, float $$7, int $$8) {
      float $$9 = (float)$$0 * (float) (Math.PI / 10);
      eye $$10 = $$6.b((double)$$7 * Math.cos((double)$$9), 0.0, (double)$$7 * Math.sin((double)$$9));
      $$5.a($$1, (float)($$10.d - $$2), (float)($$10.e - $$3), (float)($$10.f - $$4)).a($$8);
   }

   public void a() {
      this.i.clear();
   }

   public void a(aam.a $$0) {
      this.i.put($$0.c(), $$0);
   }
}
