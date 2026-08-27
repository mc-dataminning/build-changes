import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fvv {
   private static final Logger a = LogUtils.getLogger();
   private final fcu b;
   private final fvn c;
   private im d = new im(-1, -1, -1);
   private csd e = csd.i;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private czr j = czr.e;
   @Nullable
   private czr k;
   private int l;

   public fvv(fcu $$0, fvn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(ckl $$0) {
      this.j.a($$0.gb());
   }

   public void a(czr $$0, @Nullable czr $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.gb());
   }

   public void a(czr $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.gb());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(im $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         czu $$1 = this.b.r;
         dpy $$2 = $$1.a_($$0);
         if (!this.b.s.eV().f().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dcv $$3 = $$2.b();
            if ($$3 instanceof dgd && !this.b.s.gx()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (ckl)this.b.s);
               elr $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((czv)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(im $$0, ir $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dpy $$2 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new aha(aha.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new aha(aha.a.b, this.d, $$1));
            }

            dpy $$3 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dN(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eV();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.aj(), this.d, this.l());
               }

               return new aha(aha.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dpy $$0 = this.b.r.a_(this.d);
         this.b.aB().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new aha(aha.a.b, this.d, ir.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gu();
      }
   }

   public boolean b(im $$0, ir $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dpy $$2 = this.b.r.a_($$0);
         this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new aha(aha.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dpy $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dN(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dki $$4 = $$3.w();
               this.b.ak().a(new gpw($$4.f(), ava.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gqb.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.r, $$0, $$3, axw.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new aha(aha.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.r.a(this.b.s.aj(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fvm $$0, fwz $$1) {
      try (fwy $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         yz<afx> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public void c() {
      this.m();
      if (this.c.l().i()) {
         this.c.l().b();
      } else {
         this.c.l().n();
      }
   }

   private boolean b(im $$0) {
      csd $$1 = this.b.s.eV();
      return $$0.equals(this.d) && csd.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.ga().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new ahj(this.l));
      }
   }

   public boq a(gag $$0, bop $$1, etb $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return boq.e;
      } else {
         MutableObject<boq> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ahs($$1, $$2, $$4);
         });
         return (boq)$$3.getValue();
      }
   }

   private boq b(gag $$0, bop $$1, etb $$2) {
      im $$3 = $$2.a();
      csd $$4 = $$0.b($$1);
      if (this.j == czr.d) {
         return boq.a;
      } else {
         boolean $$5 = !$$0.eV().d() || !$$0.eW().d();
         boolean $$6 = $$0.fP() && $$5;
         if (!$$6) {
            dpy $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return boq.e;
            }

            bos $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bos.d && $$1 == bop.a) {
               boq $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.d() && !$$0.gv().a($$4.f())) {
            cvn $$10 = new cvn($$0, $$1, $$2);
            boq $$12;
            if (this.j.g()) {
               int $$11 = $$4.G();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return boq.d;
         }
      }
   }

   public boq a(ckl $$0, bop $$1) {
      if (this.j == czr.d) {
         return boq.d;
      } else {
         this.m();
         this.c.b(new agu.b($$0.ds(), $$0.du(), $$0.dy(), $$0.dD(), $$0.dF(), $$0.aC()));
         MutableObject<boq> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            aht $$4 = new aht($$1, $$3);
            csd $$5 = $$0.b($$1);
            if ($$0.gv().a($$5.f())) {
               $$2.setValue(boq.d);
               return $$4;
            } else {
               bor<csd> $$6 = $$5.a(this.b.r, $$0, $$1);
               csd $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (boq)$$2.getValue();
      }
   }

   public gag a(fvm $$0, avk $$1, fch $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gag a(fvm $$0, avk $$1, fch $$2, boolean $$3, boolean $$4) {
      return new gag(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(ckl $$0, bql $$1) {
      this.m();
      this.c.b(agr.a($$1, $$0.bT()));
      if (this.j != czr.d) {
         $$0.e($$1);
         $$0.gu();
      }
   }

   public boq a(ckl $$0, bql $$1, bop $$2) {
      this.m();
      this.c.b(agr.a($$1, $$0.bT(), $$2));
      return this.j == czr.d ? boq.d : $$0.a($$1, $$2);
   }

   public boq a(ckl $$0, bql $$1, etc $$2, bop $$3) {
      this.m();
      etf $$4 = $$2.e().a($$1.ds(), $$1.du(), $$1.dy());
      this.c.b(agr.a($$1, $$0.bT(), $$3, $$4));
      return this.j == czr.d ? boq.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cnq $$3, ckl $$4) {
      cnh $$5 = $$4.cc;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         je<cpd> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<csd> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cpd $$9 : $$6) {
            $$8.add($$9.g().r());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<csd> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            csd $$12 = $$8.get($$11);
            csd $$13 = $$6.get($$11).g();
            if (!csd.a($$12, $$13)) {
               $$10.put($$11, $$13.r());
            }
         }

         this.c.b(new agl($$0, $$5.j(), $$1, $$2, $$3, $$5.g().r(), $$10));
      }
   }

   public void a(int $$0, cwi<?> $$1, boolean $$2) {
      this.c.b(new agy($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new agk($$0, $$1));
   }

   public void a(csd $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.f().m())) {
         this.c.b(new ahm($$1, $$0));
      }
   }

   public void a(csd $$0) {
      if (this.j.g() && !$$0.d() && this.c.a($$0.f().m())) {
         this.c.b(new ahm(-1, $$0));
      }
   }

   public void b(ckl $$0) {
      this.m();
      this.c.b(new aha(aha.a.f, im.c, ir.a));
      $$0.fy();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.j.g();
   }

   public boolean g() {
      return this.b.s.bP() && this.b.s.da() instanceof bqx;
   }

   public boolean h() {
      return this.j == czr.d;
   }

   @Nullable
   public czr i() {
      return this.k;
   }

   public czr j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new agx($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new agn($$0, $$1, $$2));
   }
}
