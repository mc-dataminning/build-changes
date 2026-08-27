import java.util.OptionalInt;

public class fwz<T extends cal> extends fwb<T> {
   private static final geh g = geh.c("item_frame", "map=false");
   private static final geh h = geh.c("item_frame", "map=true");
   private static final geh i = geh.c("glow_item_frame", "map=false");
   private static final geh j = geh.c("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int f = 30;
   private final fxa k;
   private final frt l;

   public fwz(fwc.a $$0) {
      super($$0);
      this.k = $$0.b();
      this.l = $$0.c();
   }

   protected int a(T $$0, hx $$1) {
      return $$0.ai() == bkz.S ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      ib $$6 = $$0.cE();
      ejz $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dF()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dD()));
      boolean $$9 = $$0.ce();
      clo $$10 = $$0.G();
      if (!$$9) {
         geg $$11 = this.l.a().a();
         geh $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.l.b().a($$3.c(), $$4.getBuffer(fro.h()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, gbq.d);
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
            eeh $$16 = clv.a($$13.getAsInt(), $$0.dN());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               eti.N().j.j().a($$3, $$4, $$13.getAsInt(), $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.k.a($$10, cll.i, $$18, gbq.d, $$3, $$4, $$0.dN(), $$0.aj());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.ai() == bkz.S ? $$1 : $$2;
   }

   private geh a(T $$0, clo $$1) {
      boolean $$2 = $$0.ai() == bkz.S;
      if ($$1.a(clr.rR)) {
         return $$2 ? j : h;
      } else {
         return $$2 ? i : g;
      }
   }

   public ejz a(T $$0, float $$1) {
      return new ejz((double)((float)$$0.cE().j() * 0.3F), -0.25, (double)((float)$$0.cE().l() * 0.3F));
   }

   public agm a(T $$0) {
      return gby.e;
   }

   protected boolean b(T $$0) {
      if (eti.J() && !$$0.G().b() && $$0.G().A() && this.c.c == $$0) {
         double $$1 = this.c.b($$0);
         float $$2 = $$0.bV() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, uv $$1, eob $$2, fqz $$3, int $$4) {
      super.a($$0, $$0.G().y(), $$2, $$3, $$4);
   }
}
