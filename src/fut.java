import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class fut extends ftw {
   public static final int a = 16;
   public static final int b = 36;
   public static final int c = 30;
   private static final int y = 256;
   private static final int z = 256;
   public static final fut.a d = new fut.a(List.of());
   public static final alz s = alz.b("textures/gui/book.png");
   protected static final int u = 114;
   protected static final int v = 128;
   protected static final int w = 192;
   protected static final int x = 192;
   private fut.a A;
   private int B;
   private List<azq> C = Collections.emptyList();
   private int D = -1;
   private xv E = xu.a;
   private fvu F;
   private fvu G;
   private final boolean H;

   public fut(fut.a $$0) {
      this($$0, true);
   }

   public fut() {
      this(d, false);
   }

   private fut(fut.a $$0, boolean $$1) {
      super(flv.a);
      this.A = $$0;
      this.H = $$1;
   }

   public void a(fut.a $$0) {
      this.A = $$0;
      this.B = bae.a(this.B, 0, $$0.a());
      this.L();
      this.D = -1;
   }

   public boolean a(int $$0) {
      int $$1 = bae.a($$0, 0, this.A.a() - 1);
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
   protected void aT_() {
      this.l();
      this.E();
   }

   protected void l() {
      this.c(fod.a(xu.d, $$0 -> this.aP_()).a(this.n / 2 - 100, 196, 200, 20).a());
   }

   protected void E() {
      int $$0 = (this.n - 192) / 2;
      int $$1 = 2;
      this.F = this.c(new fvu($$0 + 116, 159, true, $$0x -> this.J(), this.H));
      this.G = this.c(new fvu($$0 + 43, 159, false, $$0x -> this.G(), this.H));
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

   protected void J() {
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
   public void a(fnq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 192) / 2;
      int $$5 = 2;
      if (this.D != this.B) {
         ya $$6 = this.A.a(this.B);
         this.C = this.p.c($$6, 114);
         this.E = xv.a("book.pageIndicator", this.B + 1, Math.max(this.F(), 1));
      }

      this.D = this.B;
      int $$7 = this.p.a(this.E);
      $$0.a(this.p, this.E, $$4 - $$7 + 192 - 44, 18, 0, false);
      int $$8 = Math.min(128 / 9, this.C.size());

      for (int $$9 = 0; $$9 < $$8; $$9++) {
         azq $$10 = this.C.get($$9);
         $$0.a(this.p, $$10, $$4 + 36, 32 + $$9 * 9, 0, false);
      }

      ys $$11 = this.b((double)$$1, (double)$$2);
      if ($$11 != null) {
         $$0.a(this.p, $$11, $$1, $$2);
      }
   }

   @Override
   public void b(fnq $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(glt::B, s, (this.n - 192) / 2, 2, 0.0F, 0.0F, 192, 192, 256, 256);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         ys $$3 = this.b($$0, $$1);
         if ($$3 != null && this.a($$3)) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(ys $$0) {
      xt $$1 = $$0.h();
      if ($$1 == null) {
         return false;
      } else if ($$1.a() == xt.a.e) {
         String $$2 = $$1.b();

         try {
            int $$3 = Integer.parseInt($$2) - 1;
            return this.b($$3);
         } catch (Exception var5) {
            return false;
         }
      } else {
         boolean $$4 = super.a($$0);
         if ($$4 && $$1.a() == xt.a.c) {
            this.K();
         }

         return $$4;
      }
   }

   protected void K() {
      this.m.a(null);
   }

   @Nullable
   public ys b(double $$0, double $$1) {
      if (this.C.isEmpty()) {
         return null;
      } else {
         int $$2 = bae.a($$0 - (double)((this.n - 192) / 2) - 36.0);
         int $$3 = bae.a($$1 - 2.0 - 30.0);
         if ($$2 >= 0 && $$3 >= 0) {
            int $$4 = Math.min(128 / 9, this.C.size());
            if ($$2 <= 114 && $$3 < 9 * $$4 + $$4) {
               int $$5 = $$3 / 9;
               if ($$5 >= 0 && $$5 < this.C.size()) {
                  azq $$6 = this.C.get($$5);
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

   public static record a(List<xv> a) {
      public int a() {
         return this.a.size();
      }

      public ya a(int $$0) {
         return $$0 >= 0 && $$0 < this.a() ? this.a.get($$0) : ya.b;
      }

      @Nullable
      public static fut.a a(cxo $$0) {
         boolean $$1 = fme.Q().aU();
         daw $$2 = $$0.a(ku.T);
         if ($$2 != null) {
            return new fut.a($$2.a($$1));
         } else {
            dav $$3 = $$0.a(ku.S);
            return $$3 != null ? new fut.a($$3.a($$1).map(xv::b).toList()) : null;
         }
      }

      public List<xv> b() {
         return this.a;
      }
   }
}
