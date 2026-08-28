import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class fyf extends fxi {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   private static final int y = 256;
   private static final int z = 256;
   public static final fyf.a d = new fyf.a(List.of());
   public static final ale s = ale.b("textures/gui/book.png");
   protected static final int u = 114;
   protected static final int v = 128;
   protected static final int w = 192;
   protected static final int x = 192;
   private fyf.a A;
   private int B;
   private List<ayw> C = Collections.emptyList();
   private int D = -1;
   private ww E = wv.a;
   private fzg F;
   private fzg G;
   private final boolean H;

   public fyf(fyf.a $$0) {
      this($$0, true);
   }

   public fyf() {
      this(d, false);
   }

   private fyf(fyf.a $$0, boolean $$1) {
      super(fnw.a);
      this.A = $$0;
      this.H = $$1;
   }

   public void a(fyf.a $$0) {
      this.A = $$0;
      this.B = azk.a(this.B, 0, $$0.a());
      this.L();
      this.D = -1;
   }

   public boolean a(int $$0) {
      int $$1 = azk.a($$0, 0, this.A.a() - 1);
      if ($$1 != this.B) {
         this.B = $$1;
         this.L();
         this.D = -1;
         return true;
      } else {
         return false;
      }
   }

   protected boolean b(int $$0) {
      return this.a($$0);
   }

   @Override
   protected void aN_() {
      this.m();
      this.E();
   }

   protected void m() {
      this.c(frq.a(wv.d, $$0 -> this.aK_()).a(this.n / 2 - 100, 196, 200, 20).a());
   }

   protected void E() {
      int $$0 = (this.n - 192) / 2;
      int $$1 = 2;
      this.F = this.c(new fzg($$0 + 116, 159, true, $$0x -> this.H(), this.H));
      this.G = this.c(new fzg($$0 + 43, 159, false, $$0x -> this.G(), this.H));
      this.L();
   }

   private int F() {
      return this.A.a();
   }

   protected void G() {
      if (this.B > 0) {
         this.B--;
      }

      this.L();
   }

   protected void H() {
      if (this.B < this.F() - 1) {
         this.B++;
      }

      this.L();
   }

   private void L() {
      this.F.k = this.B < this.F() - 1;
      this.G.k = this.B > 0;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         switch ($$0) {
            case 266:
               this.G.b();
               return true;
            case 267:
               this.F.b();
               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 192) / 2;
      int $$5 = 2;
      if (this.D != this.B) {
         xb $$6 = this.A.a(this.B);
         this.C = this.p.c($$6, 114);
         this.E = ww.a("book.pageIndicator", this.B + 1, Math.max(this.F(), 1));
      }

      this.D = this.B;
      int $$7 = this.p.a(this.E);
      $$0.a(this.p, this.E, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.C.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         ayw $$10 = this.C.get($$9);
         $$0.a(this.p, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      xt $$11 = this.b((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.p, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(gpn::H, s, (this.n - 192) / 2, 2, 0.0F, 0.0F, 192, 192, 256, 256);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         xt $$3 = this.b($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(xt $$0) {
      wu $$1 = $$0.i();
      if ($$1 == null) {
         return false;
      } else if ($$1 instanceof wu.b var7) {
         wu.b var10000 = var7;

         try {
            var8 = var10000.b();
         } catch (Throwable var6) {
            throw new MatchException(var6.toString(), var6);
         }

         int var5 = var8;
         return this.b(var5 - 1);
      } else {
         boolean $$3 = super.a($$0);
         if ($$3 && $$1.a() == wu.a.c) {
            this.I();
         }

         return $$3;
      }
   }

   protected void I() {
      this.m.a(null);
   }

   @Nullable
   public xt b(double $$0, double $$1) {
      if (this.C.isEmpty()) {
         return null;
      } else {
         int $$2 = azk.a($$0 - (double)((this.n - 192) / 2) - 36.0);
         int $$3 = azk.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.C.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.C.size()) {
                  ayw $$6 = this.C.get($$5);
                  return this.m.h.b().a($$6, $$2);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   public static record a(List<ww> a) {
      public int a() {
         return this.a.size();
      }

      public xb a(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a.get($$0) : xb.b;
      }

      @Nullable
      public static fyf.a a(cys $$0) {
         boolean $$1 = fof.Q().aT();
         dcc $$2 = $$0.a(kj.V);
         if ($$2 != null) {
            return new fyf.a($$2.a($$1));
         } else {
            dcb $$3 = $$0.a(kj.U);
            return $$3 != null ? new fyf.a($$3.a($$1).map(ww::b).toList()) : null;
         }
      }

      public List<ww> b() {
         return this.a;
      }
   }
}
