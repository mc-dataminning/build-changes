import java.util.OptionalInt;

public class fyl<T extends cax> extends fxn<T> {
   private static final gfw g = gfw.c("item_frame", "map=false");
   private static final gfw h = gfw.c("item_frame", "map=true");
   private static final gfw i = gfw.c("glow_item_frame", "map=false");
   private static final gfw j = gfw.c("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int f = 30;
   private final fym k;
   private final ftc l;

   public fyl(fxo.a $$0) {
      super($$0);
      this.k = $$0.b();
      this.l = $$0.c();
   }

   protected int a(T $$0, hv $$1) {
      return $$0.ai() == blj.T ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      ia $$6 = $$0.cE();
      elb $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dE()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dC()));
      boolean $$9 = $$0.ce();
      cmh $$10 = $$0.G();
      if (!$$9) {
         gfv $$11 = this.l.a().a();
         gfw $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.l.b().a($$3.c(), $$4.getBuffer(fsx.h()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, gdf.d);
         $$3.b();
      }

      if (!$$10.b()) {
         OptionalInt $$13 = $$0.H();
         if ($$9) {
            $$3.a(0.0F, 0.0F, 0.5F);
         } else {
            $$3.a(0.0F, 0.0F, 0.4375F);
         }

         int $$14 = $$13.isPresent() ? $$0.J() % 4 * 2 : $$0.J();
         $$3.a(a.f.rotationDegrees((float)$$14 * 360.0F / 8.0F));
         if ($$13.isPresent()) {
            $$3.a(a.f.rotationDegrees(180.0F));
            float $$15 = 0.0078125F;
            $$3.b(0.0078125F, 0.0078125F, 0.0078125F);
            $$3.a(-64.0F, -64.0F, 0.0F);
            efj $$16 = cmo.a($$13.getAsInt(), $$0.dM());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               euk.N().j.j().a($$3, $$4, $$13.getAsInt(), $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.k.a($$10, cme.i, $$18, gdf.d, $$3, $$4, $$0.dM(), $$0.aj());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.ai() == blj.T ? $$1 : $$2;
   }

   private gfw a(T $$0, cmh $$1) {
      boolean $$2 = $$0.ai() == blj.T;
      if ($$1.a(cmk.rR)) {
         return $$2 ? j : h;
      } else {
         return $$2 ? i : g;
      }
   }

   public elb a(T $$0, float $$1) {
      return new elb((double)((float)$$0.cE().j() * 0.3F), -0.25, (double)((float)$$0.cE().l() * 0.3F));
   }

   public agt a(T $$0) {
      return gdn.e;
   }

   protected boolean b(T $$0) {
      if (euk.J() && !$$0.G().b() && $$0.G().A() && this.c.c == $$0) {
         double $$1 = this.c.b($$0);
         float $$2 = $$0.bV() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, vb $$1, epd $$2, fsi $$3, int $$4) {
      super.a($$0, $$0.G().y(), $$2, $$3, $$4);
   }
}
