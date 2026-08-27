import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fwf {
   private static final Logger a = LogUtils.getLogger();
   private final fde b;
   private final fvx c;
   private in d = new in(-1, -1, -1);
   private csz e = csz.i;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private daa j = daa.e;
   @Nullable
   private daa k;
   private int l;

   public fwf(fde $$0, fvx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(clh $$0) {
      this.j.a($$0.gb());
   }

   public void a(daa $$0, @Nullable daa $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.gb());
   }

   public void a(daa $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.gb());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(in $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         dad $$1 = this.b.r;
         dqh $$2 = $$1.a_($$0);
         if (!this.b.s.eV().f().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dde $$3 = $$2.b();
            if ($$3 instanceof dgm && !this.b.s.gx()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (clh)this.b.s);
               ema $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dae)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(in $$0, is $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dqh $$2 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ahc(ahc.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahc(ahc.a.b, this.d, $$1));
            }

            dqh $$3 = this.b.r.a_($$0);
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

               return new ahc(ahc.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dqh $$0 = this.b.r.a_(this.d);
         this.b.aB().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ahc(ahc.a.b, this.d, is.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gu();
      }
   }

   public boolean b(in $$0, is $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dqh $$2 = this.b.r.a_($$0);
         this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ahc(ahc.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dqh $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dN(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dkr $$4 = $$3.w();
               this.b.ak().a(new gqh($$4.f(), avd.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gqm.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.r, $$0, $$3, axz.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new ahc(ahc.a.c, $$0, $$1, $$2);
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

   private void a(fvw $$0, fxj $$1) {
      try (fxi $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zb<afz> $$4 = $$1.predict($$3);
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

   private boolean b(in $$0) {
      csz $$1 = this.b.s.eV();
      return $$0.equals(this.d) && csz.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.ga().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new ahl(this.l));
      }
   }

   public bpm a(gaq $$0, bpl $$1, etl $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bpm.e;
      } else {
         MutableObject<bpm> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ahu($$1, $$2, $$4);
         });
         return (bpm)$$3.getValue();
      }
   }

   private bpm b(gaq $$0, bpl $$1, etl $$2) {
      in $$3 = $$2.a();
      csz $$4 = $$0.b($$1);
      if (this.j == daa.d) {
         return bpm.a;
      } else {
         boolean $$5 = !$$0.eV().d() || !$$0.eW().d();
         boolean $$6 = $$0.fP() && $$5;
         if (!$$6) {
            dqh $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bpm.e;
            }

            bpo $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bpo.d && $$1 == bpl.a) {
               bpm $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.d() && !$$0.gv().a($$4.f())) {
            cwk $$10 = new cwk($$0, $$1, $$2);
            bpm $$12;
            if (this.j.g()) {
               int $$11 = $$4.G();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bpm.d;
         }
      }
   }

   public bpm a(clh $$0, bpl $$1) {
      if (this.j == daa.d) {
         return bpm.d;
      } else {
         this.m();
         this.c.b(new agw.b($$0.ds(), $$0.du(), $$0.dy(), $$0.dD(), $$0.dF(), $$0.aC()));
         MutableObject<bpm> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            ahv $$4 = new ahv($$1, $$3);
            csz $$5 = $$0.b($$1);
            if ($$0.gv().a($$5.f())) {
               $$2.setValue(bpm.d);
               return $$4;
            } else {
               bpn<csz> $$6 = $$5.a(this.b.r, $$0, $$1);
               csz $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bpm)$$2.getValue();
      }
   }

   public gaq a(fvw $$0, avn $$1, fcr $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gaq a(fvw $$0, avn $$1, fcr $$2, boolean $$3, boolean $$4) {
      return new gaq(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(clh $$0, brh $$1) {
      this.m();
      this.c.b(agt.a($$1, $$0.bT()));
      if (this.j != daa.d) {
         $$0.e($$1);
         $$0.gu();
      }
   }

   public bpm a(clh $$0, brh $$1, bpl $$2) {
      this.m();
      this.c.b(agt.a($$1, $$0.bT(), $$2));
      return this.j == daa.d ? bpm.d : $$0.a($$1, $$2);
   }

   public bpm a(clh $$0, brh $$1, etm $$2, bpl $$3) {
      this.m();
      etp $$4 = $$2.e().a($$1.ds(), $$1.du(), $$1.dy());
      this.c.b(agt.a($$1, $$0.bT(), $$3, $$4));
      return this.j == daa.d ? bpm.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, com $$3, clh $$4) {
      cod $$5 = $$4.cc;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         jf<cpz> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<csz> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cpz $$9 : $$6) {
            $$8.add($$9.g().r());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<csz> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            csz $$12 = $$8.get($$11);
            csz $$13 = $$6.get($$11).g();
            if (!csz.a($$12, $$13)) {
               $$10.put($$11, $$13.r());
            }
         }

         this.c.b(new agn($$0, $$5.j(), $$1, $$2, $$3, $$5.g().r(), $$10));
      }
   }

   public void a(int $$0, cxf<?> $$1, boolean $$2) {
      this.c.b(new aha($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new agm($$0, $$1));
   }

   public void a(csz $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.f().m())) {
         this.c.b(new aho($$1, $$0));
      }
   }

   public void a(csz $$0) {
      if (this.j.g() && !$$0.d() && this.c.a($$0.f().m())) {
         this.c.b(new aho(-1, $$0));
      }
   }

   public void b(clh $$0) {
      this.m();
      this.c.b(new ahc(ahc.a.f, in.c, is.a));
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
      return this.b.s.bP() && this.b.s.da() instanceof brt;
   }

   public boolean h() {
      return this.j == daa.d;
   }

   @Nullable
   public daa i() {
      return this.k;
   }

   public daa j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new agz($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new agp($$0, $$1, $$2));
   }
}
