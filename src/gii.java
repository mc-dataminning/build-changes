import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.joml.Matrix4f;

public class gii {
   private static final int a = axy.b.a(255, 255, 100, 255);
   private static final int b = axy.b.a(255, 100, 255, 255);
   private static final int c = axy.b.a(255, 0, 255, 0);
   private static final int d = axy.b.a(255, 255, 165, 0);
   private static final int e = axy.b.a(255, 255, 0, 0);
   private static final int f = 20;
   private static final float g = (float) (Math.PI / 10);
   private final fgo h;
   private final Map<Integer, aai.a> i = new HashMap<>();

   public gii(fgo $$0) {
      this.h = $$0;
   }

   public void a(fbi $$0, gez $$1, double $$2, double $$3, double $$4) {
      geb $$5 = this.h.s;
      $$5.dO().a(bsx.m, $$5.cK().g(100.0), $$0x -> true).forEach($$6 -> {
         Optional<aai.a> $$7 = Optional.ofNullable(this.i.get($$6.an()));
         $$7.map(aai.a::d).map($$1xx -> $$5.dO().a($$1xx)).map($$0xx -> $$0xx.m(this.h.at().a(true))).ifPresent($$6x -> {
            a($$0, $$1, $$2, $$3, $$4, $$6.dm(), $$6x, b);
            exc $$7x = $$6x.b(0.0, 0.01F, 0.0);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(gfh.a(2.0)), $$7x, 4.0F, c);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(gfh.a(2.0)), $$7x, 8.0F, d);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(gfh.a(2.0)), $$7x, 20.0F, e);
         });
         $$7.map(aai.a::e).ifPresent($$6x -> {
            a($$0, $$1, $$2, $$3, $$4, $$6.dm(), $$6x.b(), a);
            gim.a($$0, $$1, ewx.a(exc.a($$6x)).d(-$$2, -$$3, -$$4), 1.0F, 0.0F, 0.0F, 1.0F);
         });
      });
   }

   private static void a(fbi $$0, gez $$1, double $$2, double $$3, double $$4, exc $$5, exc $$6, int $$7) {
      fbm $$8 = $$1.getBuffer(gfh.a(2.0));
      $$8.a($$0.c(), (float)($$5.c - $$2), (float)($$5.d - $$3), (float)($$5.e - $$4)).a($$7);
      $$8.a($$0.c(), (float)($$6.c - $$2), (float)($$6.d - $$3), (float)($$6.e - $$4)).a($$7);
   }

   private static void a(Matrix4f $$0, double $$1, double $$2, double $$3, fbm $$4, exc $$5, float $$6, int $$7) {
      for (int $$8 = 0; $$8 < 20; $$8++) {
         a($$8, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      a(0, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void a(int $$0, Matrix4f $$1, double $$2, double $$3, double $$4, fbm $$5, exc $$6, float $$7, int $$8) {
      float $$9 = (float)$$0 * (float) (Math.PI / 10);
      exc $$10 = $$6.b((double)$$7 * Math.cos((double)$$9), 0.0, (double)$$7 * Math.sin((double)$$9));
      $$5.a($$1, (float)($$10.c - $$2), (float)($$10.d - $$3), (float)($$10.e - $$4)).a($$8);
   }

   public void a() {
      this.i.clear();
   }

   public void a(aai.a $$0) {
      this.i.put($$0.c(), $$0);
   }
}
