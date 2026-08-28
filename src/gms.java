import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.joml.Matrix4f;

public class gms {
   private static final int a = axy.a(255, 255, 100, 255);
   private static final int b = axy.a(255, 100, 255, 255);
   private static final int c = axy.a(255, 0, 255, 0);
   private static final int d = axy.a(255, 255, 165, 0);
   private static final int e = axy.a(255, 255, 0, 0);
   private static final int f = 20;
   private static final float g = (float) (Math.PI / 10);
   private final fjx h;
   private final Map<Integer, aau.a> i = new HashMap<>();

   public gms(fjx $$0) {
      this.h = $$0;
   }

   public void a(fek $$0, gix $$1, double $$2, double $$3, double $$4) {
      ght $$5 = this.h.t;
      $$5.dY().a(bup.m, $$5.cT().g(100.0), $$0x -> true).forEach($$6 -> {
         Optional<aau.a> $$7 = Optional.ofNullable(this.i.get($$6.as()));
         $$7.map(aau.a::d).map($$1xx -> $$5.dY().a($$1xx)).map($$0xx -> $$0xx.o(this.h.av().a(true))).ifPresent($$6x -> {
            a($$0, $$1, $$2, $$3, $$4, $$6.dw(), $$6x, b);
            ezr $$7x = $$6x.b(0.0, 0.01F, 0.0);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(gjh.a(2.0)), $$7x, 4.0F, c);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(gjh.a(2.0)), $$7x, 8.0F, d);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(gjh.a(2.0)), $$7x, 24.0F, e);
         });
         $$7.map(aau.a::e).ifPresent($$6x -> {
            a($$0, $$1, $$2, $$3, $$4, $$6.dw(), $$6x.b(), a);
            gmx.a($$0, $$1, ezm.a(ezr.a($$6x)).d(-$$2, -$$3, -$$4), 1.0F, 0.0F, 0.0F, 1.0F);
         });
      });
   }

   private static void a(fek $$0, gix $$1, double $$2, double $$3, double $$4, ezr $$5, ezr $$6, int $$7) {
      feo $$8 = $$1.getBuffer(gjh.a(2.0));
      $$8.a($$0.c(), (float)($$5.d - $$2), (float)($$5.e - $$3), (float)($$5.f - $$4)).a($$7);
      $$8.a($$0.c(), (float)($$6.d - $$2), (float)($$6.e - $$3), (float)($$6.f - $$4)).a($$7);
   }

   private static void a(Matrix4f $$0, double $$1, double $$2, double $$3, feo $$4, ezr $$5, float $$6, int $$7) {
      for (int $$8 = 0; $$8 < 20; $$8++) {
         a($$8, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      a(0, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void a(int $$0, Matrix4f $$1, double $$2, double $$3, double $$4, feo $$5, ezr $$6, float $$7, int $$8) {
      float $$9 = (float)$$0 * (float) (Math.PI / 10);
      ezr $$10 = $$6.b((double)$$7 * Math.cos((double)$$9), 0.0, (double)$$7 * Math.sin((double)$$9));
      $$5.a($$1, (float)($$10.d - $$2), (float)($$10.e - $$3), (float)($$10.f - $$4)).a($$8);
   }

   public void a() {
      this.i.clear();
   }

   public void a(aau.a $$0) {
      this.i.put($$0.c(), $$0);
   }
}
