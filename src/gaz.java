import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;

public class gaz extends gad {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int d = 192;
   private static final int s = 256;
   private static final int u = 256;
   private static final xa v = xa.c("book.editTitle");
   private static final xa w = xa.c("book.finalizeWarning");
   private static final aza x = aza.forward("_", xx.a.a(o.a));
   private static final aza y = aza.forward("_", xx.a.a(o.h));
   private final crx z;
   private final czy A;
   private boolean B;
   private boolean C;
   private int D;
   private int E;
   private final List<String> F = Lists.newArrayList();
   private String G = "";
   private final fxg H = new fxg(this::R, this::b, this::m, this::a, $$0x -> $$0x.length() < 1024 && this.p.b($$0x, 114) <= 128);
   private final fxg I = new fxg(() -> this.G, $$0x -> this.G = $$0x, this::m, this::a, $$0x -> $$0x.length() < 16);
   private long J;
   private int K = -1;
   private gcb L;
   private gcb M;
   private ful N;
   private ful O;
   private ful P;
   private ful Q;
   private final buq R;
   @Nullable
   private gaz.a S = gaz.a.a;
   private xa T = wz.a;
   private final xa U;

   public gaz(crx $$0, czy $$1, buq $$2, ddh $$3) {
      super(fqu.a);
      this.z = $$0;
      this.A = $$1;
      this.R = $$2;
      $$3.a(frd.Q().aT()).forEach(this.F::add);
      if (this.F.isEmpty()) {
         this.F.add("");
      }

      this.U = xa.a("book.byAuthor", $$0.ai()).a(o.i);
   }

   private void a(String $$0) {
      if (this.m != null) {
         fxg.a(this.m, $$0);
      }
   }

   private String m() {
      return this.m != null ? fxg.b(this.m) : "";
   }

   private int E() {
      return this.F.size();
   }

   @Override
   public void e() {
      super.e();
      this.D++;
   }

   @Override
   protected void aS_() {
      this.T();
      this.O = this.c((ful)ful.a(xa.c("book.signButton"), $$0x -> {
         this.C = true;
         this.H();
      }).a(this.n / 2 - 100, 196, 98, 20).a());
      this.N = this.c((ful)ful.a(wz.d, $$0x -> {
         this.m.a(null);
         this.c(false);
      }).a(this.n / 2 + 2, 196, 98, 20).a());
      this.P = this.c((ful)ful.a(xa.c("book.finalizeButton"), $$0x -> {
         if (this.C) {
            this.c(true);
            this.m.a(null);
         }
      }).a(this.n / 2 - 100, 196, 98, 20).a());
      this.Q = this.c((ful)ful.a(wz.e, $$0x -> {
         if (this.C) {
            this.C = false;
         }

         this.H();
      }).a(this.n / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.n - 192) / 2;
      int $$1 = 2;
      this.L = this.c(new gcb($$0 + 116, 159, true, $$0x -> this.G(), true));
      this.M = this.c(new gcb($$0 + 43, 159, false, $$0x -> this.F(), true));
      this.H();
   }

   private void F() {
      if (this.E > 0) {
         this.E--;
      }

      this.H();
      this.U();
   }

   private void G() {
      if (this.E < this.E() - 1) {
         this.E++;
      } else {
         this.M();
         if (this.E < this.E() - 1) {
            this.E++;
         }
      }

      this.H();
      this.U();
   }

   private void H() {
      this.M.k = !this.C && this.E > 0;
      this.L.k = !this.C;
      this.N.k = !this.C;
      this.O.k = !this.C;
      this.Q.k = this.C;
      this.P.k = this.C;
      this.P.j = !ban.h(this.G);
   }

   private void I() {
      ListIterator<String> $$0 = this.F.listIterator(this.F.size());

      while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
         $$0.remove();
      }
   }

   private void c(boolean $$0) {
      if (this.B) {
         this.I();
         this.L();
         int $$1 = this.R == buq.a ? this.z.gj().f() : 40;
         this.m.L().b(new ahl($$1, this.F, $$0 ? Optional.of(this.G.trim()) : Optional.empty()));
      }
   }

   private void L() {
      this.A.b(kk.U, new ddh(this.F.stream().map(ask::a).toList()));
   }

   private void M() {
      if (this.E() < 100) {
         this.F.add("");
         this.B = true;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.C) {
         return this.d($$0, $$1, $$2);
      } else {
         boolean $$3 = this.b($$0, $$1, $$2);
         if ($$3) {
            this.T();
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if (this.C) {
         boolean $$2 = this.I.a($$0);
         if ($$2) {
            this.H();
            this.B = true;
            return true;
         } else {
            return false;
         }
      } else if (ban.a($$0)) {
         this.H.a(Character.toString($$0));
         this.T();
         return true;
      } else {
         return false;
      }
   }

   private boolean b(int $$0, int $$1, int $$2) {
      if (gad.f($$0)) {
         this.H.d();
         return true;
      } else if (gad.e($$0)) {
         this.H.c();
         return true;
      } else if (gad.d($$0)) {
         this.H.b();
         return true;
      } else if (gad.c($$0)) {
         this.H.a();
         return true;
      } else {
         fxg.a $$3 = gad.s() ? fxg.a.b : fxg.a.a;
         switch ($$0) {
            case 257:
            case 335:
               this.H.a("\n");
               return true;
            case 259:
               this.H.a(-1, $$3);
               return true;
            case 261:
               this.H.a(1, $$3);
               return true;
            case 262:
               this.H.a(1, gad.t(), $$3);
               return true;
            case 263:
               this.H.a(-1, gad.t(), $$3);
               return true;
            case 264:
               this.O();
               return true;
            case 265:
               this.N();
               return true;
            case 266:
               this.M.b();
               return true;
            case 267:
               this.L.b();
               return true;
            case 268:
               this.P();
               return true;
            case 269:
               this.Q();
               return true;
            default:
               return false;
         }
      }
   }

   private void N() {
      this.a(-1);
   }

   private void O() {
      this.a(1);
   }

   private void a(int $$0) {
      int $$1 = this.H.g();
      int $$2 = this.S().a($$1, $$0);
      this.H.c($$2, gad.t());
   }

   private void P() {
      if (gad.s()) {
         this.H.a(gad.t());
      } else {
         int $$0 = this.H.g();
         int $$1 = this.S().a($$0);
         this.H.c($$1, gad.t());
      }
   }

   private void Q() {
      if (gad.s()) {
         this.H.b(gad.t());
      } else {
         gaz.a $$0 = this.S();
         int $$1 = this.H.g();
         int $$2 = $$0.b($$1);
         this.H.c($$2, gad.t());
      }
   }

   private boolean d(int $$0, int $$1, int $$2) {
      switch ($$0) {
         case 257:
         case 335:
            if (!this.G.isEmpty()) {
               this.c(true);
               this.m.a(null);
            }

            return true;
         case 259:
            this.I.e(-1);
            this.H();
            this.B = true;
            return true;
         default:
            return false;
      }
   }

   private String R() {
      return this.E >= 0 && this.E < this.F.size() ? this.F.get(this.E) : "";
   }

   private void b(String $$0) {
      if (this.E >= 0 && this.E < this.F.size()) {
         this.F.set(this.E, $$0);
         this.B = true;
         this.T();
      }
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(null);
      int $$4 = (this.n - 192) / 2;
      int $$5 = 2;
      if (this.C) {
         boolean $$6 = this.D / 6 % 2 == 0;
         aza $$7 = aza.composite(aza.forward(this.G, xx.a), $$6 ? x : y);
         int $$8 = this.p.a(v);
         $$0.a(this.p, v, $$4 + 36 + (114 - $$8) / 2, 34, 0, false);
         int $$9 = this.p.a($$7);
         $$0.a(this.p, $$7, $$4 + 36 + (114 - $$9) / 2, 50, 0, false);
         int $$10 = this.p.a(this.U);
         $$0.a(this.p, this.U, $$4 + 36 + (114 - $$10) / 2, 60, 0, false);
         $$0.a(this.p, w, $$4 + 36, 82, 114, 0, false);
      } else {
         int $$11 = this.p.a(this.T);
         $$0.a(this.p, this.T, $$4 - $$11 + 192 - 44, 18, 0, false);
         gaz.a $$12 = this.S();

         for (gaz.b $$13 : $$12.f) {
            $$0.a(this.p, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(gsl::H, gba.s, (this.n - 192) / 2, 2, 0.0F, 0.0F, 192, 192, 256, 256);
   }

   private void a(ftx $$0, gaz.c $$1, boolean $$2) {
      if (this.D / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.p, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(ftx $$0, gsh[] $$1) {
      for (gsh $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(gsl.I(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private gaz.c a(gaz.c $$0) {
      return new gaz.c($$0.a - (this.n - 192) / 2 - 36, $$0.b - 32);
   }

   private gaz.c b(gaz.c $$0) {
      return new gaz.c($$0.a + (this.n - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ag.c();
            gaz.a $$4 = this.S();
            int $$5 = $$4.a(this.p, this.a(new gaz.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.K || $$3 - this.J >= 250L) {
                  this.H.c($$5, gad.t());
               } else if (!this.H.i()) {
                  this.b($$5);
               } else {
                  this.H.d();
               }

               this.T();
            }

            this.K = $$5;
            this.J = $$3;
         }

         return true;
      }
   }

   private void b(int $$0) {
      String $$1 = this.R();
      this.H.a(frn.a($$1, -1, $$0, false), frn.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            gaz.a $$5 = this.S();
            int $$6 = $$5.a(this.p, this.a(new gaz.c((int)$$0, (int)$$1)));
            this.H.c($$6, true);
            this.T();
         }

         return true;
      }
   }

   private gaz.a S() {
      if (this.S == null) {
         this.S = this.V();
         this.T = xa.a("book.pageIndicator", this.E + 1, this.E());
      }

      return this.S;
   }

   private void T() {
      this.S = null;
   }

   private void U() {
      this.H.f();
      this.T();
   }

   private gaz.a V() {
      String $$0 = this.R();
      if ($$0.isEmpty()) {
         return gaz.a.a;
      } else {
         int $$1 = this.H.g();
         int $$2 = this.H.h();
         IntList $$3 = new IntArrayList();
         List<gaz.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         frn $$7 = this.p.b();
         $$7.a($$0, 114, xx.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            gaz.c $$12 = this.b(new gaz.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new gaz.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         gaz.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new gaz.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.p.b($$0.substring($$8[$$11], $$1));
            $$10 = new gaz.c($$12, $$11 * 9);
         }

         List<gsh> $$14 = Lists.newArrayList();
         if ($$1 != $$2) {
            int $$15 = Math.min($$1, $$2);
            int $$16 = Math.max($$1, $$2);
            int $$17 = a($$8, $$15);
            int $$18 = a($$8, $$16);
            if ($$17 == $$18) {
               int $$19 = $$17 * 9;
               int $$20 = $$8[$$17];
               $$14.add(this.a($$0, $$7, $$15, $$16, $$19, $$20));
            } else {
               int $$21 = $$17 + 1 > $$8.length ? $$0.length() : $$8[$$17 + 1];
               $$14.add(this.a($$0, $$7, $$15, $$21, $$17 * 9, $$8[$$17]));

               for (int $$22 = $$17 + 1; $$22 < $$18; $$22++) {
                  int $$23 = $$22 * 9;
                  String $$24 = $$0.substring($$8[$$22], $$8[$$22 + 1]);
                  int $$25 = (int)$$7.a($$24);
                  $$14.add(this.a(new gaz.c(0, $$23), new gaz.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new gaz.a($$0, $$10, $$9, $$8, $$4.toArray(new gaz.b[0]), $$14.toArray(new gsh[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private gsh a(String $$0, frn $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      gaz.c $$8 = new gaz.c((int)$$1.a($$6), $$4);
      gaz.c $$9 = new gaz.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private gsh a(gaz.c $$0, gaz.c $$1) {
      gaz.c $$2 = this.b($$0);
      gaz.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new gsh($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final gaz.a a = new gaz.a("", new gaz.c(0, 0), true, new int[]{0}, new gaz.b[]{new gaz.b(xx.a, "", 0, 0)}, new gsh[0]);
      private final String b;
      final gaz.c c;
      final boolean d;
      private final int[] e;
      final gaz.b[] f;
      final gsh[] g;

      public a(String $$0, gaz.c $$1, boolean $$2, int[] $$3, gaz.b[] $$4, gsh[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(ftv $$0, gaz.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            gaz.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = gaz.a(this.e, $$0);
         int $$3 = $$2 + $$1;
         int $$6;
         if (0 <= $$3 && $$3 < this.e.length) {
            int $$4 = $$0 - this.e[$$2];
            int $$5 = this.f[$$3].b.length();
            $$6 = this.e[$$3] + Math.min($$4, $$5);
         } else {
            $$6 = $$0;
         }

         return $$6;
      }

      public int a(int $$0) {
         int $$1 = gaz.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = gaz.a(this.e, $$0);
         return this.e[$$1] + this.f[$$1].b.length();
      }
   }

   static class b {
      final xx a;
      final String b;
      final xa c;
      final int d;
      final int e;

      public b(xx $$0, String $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
         this.c = xa.b($$1).b($$0);
      }
   }

   static class c {
      public final int a;
      public final int b;

      c(int $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
