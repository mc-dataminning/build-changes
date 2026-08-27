import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.joml.Matrix4f;

public class fza {
   private static final int a = avs.b.a(255, 255, 100, 255);
   private static final int b = avs.b.a(255, 100, 255, 255);
   private static final int c = avs.b.a(255, 0, 255, 0);
   private static final int d = avs.b.a(255, 255, 165, 0);
   private static final int e = avs.b.a(255, 255, 0, 0);
   private static final int f = 20;
   private static final float g = (float) (Math.PI / 10);
   private final exo h;
   private final Map<Integer, yx.a> i = new HashMap<>();

   public fza(exo $$0) {
      this.h = $$0;
   }

   public void a(esh $$0, fvt $$1, double $$2, double $$3, double $$4) {
      fuv $$5 = this.h.s;
      $$5.dM().a(bnw.m, $$5.cH().g(100.0), $$0x -> true).forEach($$6 -> {
         Optional<yx.a> $$7 = Optional.ofNullable(this.i.get($$6.aj()));
         $$7.map(yx.a::d).map($$1xx -> $$5.dM().a($$1xx)).map($$0xx -> $$0xx.l(this.h.at())).ifPresent($$6x -> {
            a($$0, $$1, $$2, $$3, $$4, $$6.dk(), $$6x, b);
            enz $$7x = $$6x.b(0.0, 0.01F, 0.0);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(fwb.a(2.0)), $$7x, 4.0F, c);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(fwb.a(2.0)), $$7x, 8.0F, d);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(fwb.a(2.0)), $$7x, 20.0F, e);
         });
         $$7.map(yx.a::e).ifPresent($$6x -> {
            a($$0, $$1, $$2, $$3, $$4, $$6.dk(), $$6x.b(), a);
            fze.a($$0, $$1, enu.a(enz.a($$6x)).d(-$$2, -$$3, -$$4), 1.0F, 0.0F, 0.0F, 1.0F);
         });
      });
   }

   private static void a(esh $$0, fvt $$1, double $$2, double $$3, double $$4, enz $$5, enz $$6, int $$7) {
      esl $$8 = $$1.getBuffer(fwb.a(2.0));
      $$8.a($$0.c().a(), (float)($$5.c - $$2), (float)($$5.d - $$3), (float)($$5.e - $$4)).a($$7).e();
      $$8.a($$0.c().a(), (float)($$6.c - $$2), (float)($$6.d - $$3), (float)($$6.e - $$4)).a($$7).e();
   }

   private static void a(Matrix4f $$0, double $$1, double $$2, double $$3, esl $$4, enz $$5, float $$6, int $$7) {
      for (int $$8 = 0; $$8 < 20; $$8++) {
         a($$8, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      a(0, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void a(int $$0, Matrix4f $$1, double $$2, double $$3, double $$4, esl $$5, enz $$6, float $$7, int $$8) {
      float $$9 = (float)$$0 * (float) (Math.PI / 10);
      enz $$10 = $$6.b((double)$$7 * Math.cos((double)$$9), 0.0, (double)$$7 * Math.sin((double)$$9));
      $$5.a($$1, (float)($$10.c - $$2), (float)($$10.d - $$3), (float)($$10.e - $$4)).a($$8).e();
   }

   public void a() {
      this.i.clear();
   }

   public void a(yx.a $$0) {
      this.i.put($$0.c(), $$0);
   }
}
