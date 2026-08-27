import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fxa {
   private static final Logger a = LogUtils.getLogger();
   private final fdz b;
   private final fws c;
   private io d = new io(-1, -1, -1);
   private cto e = cto.i;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dau j = dau.e;
   @Nullable
   private dau k;
   private int l;

   public fxa(fdz $$0, fws $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(clw $$0) {
      this.j.a($$0.gd());
   }

   public void a(dau $$0, @Nullable dau $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.gd());
   }

   public void a(dau $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.gd());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(io $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         dax $$1 = this.b.r;
         drb $$2 = $$1.a_($$0);
         if (!this.b.s.eX().g().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            ddy $$3 = $$2.b();
            if ($$3 instanceof dhg && !this.b.s.gz()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (clw)this.b.s);
               emu $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((day)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(io $$0, it $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            drb $$2 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ahh(ahh.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahh(ahh.a.b, this.d, $$1));
            }

            drb $$3 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dP(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eX();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.al(), this.d, this.l());
               }

               return new ahh(ahh.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         drb $$0 = this.b.r.a_(this.d);
         this.b.aB().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ahh(ahh.a.b, this.d, it.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.al(), this.d, -1);
         this.b.s.gw();
      }
   }

   public boolean b(io $$0, it $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         drb $$2 = this.b.r.a_($$0);
         this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ahh(ahh.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         drb $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dP(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dll $$4 = $$3.w();
               this.b.ak().a(new gre($$4.f(), avi.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, grj.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.r, $$0, $$3, ayd.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new ahh(ahh.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.r.a(this.b.s.al(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fwr $$0, fye $$1) {
      try (fyd $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         ze<agd> $$4 = $$1.predict($$3);
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

   private boolean b(io $$0) {
      cto $$1 = this.b.s.eX();
      return $$0.equals(this.d) && cto.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.gc().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new ahq(this.l));
      }
   }

   public bpu a(gbm $$0, bpt $$1, eug $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bpu.e;
      } else {
         MutableObject<bpu> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ahz($$1, $$2, $$4);
         });
         return (bpu)$$3.getValue();
      }
   }

   private bpu b(gbm $$0, bpt $$1, eug $$2) {
      io $$3 = $$2.a();
      cto $$4 = $$0.b($$1);
      if (this.j == dau.d) {
         return bpu.a;
      } else {
         boolean $$5 = !$$0.eX().e() || !$$0.eY().e();
         boolean $$6 = $$0.fR() && $$5;
         if (!$$6) {
            drb $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bpu.e;
            }

            bpw $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bpw.d && $$1 == bpt.a) {
               bpu $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.e() && !$$0.gx().a($$4.g())) {
            cxb $$10 = new cxb($$0, $$1, $$2);
            bpu $$12;
            if (this.j.g()) {
               int $$11 = $$4.I();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bpu.d;
         }
      }
   }

   public bpu a(clw $$0, bpt $$1) {
      if (this.j == dau.d) {
         return bpu.d;
      } else {
         this.m();
         this.c.b(new ahb.b($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH(), $$0.aE()));
         MutableObject<bpu> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            aia $$4 = new aia($$1, $$3);
            cto $$5 = $$0.b($$1);
            if ($$0.gx().a($$5.g())) {
               $$2.setValue(bpu.d);
               return $$4;
            } else {
               bpv<cto> $$6 = $$5.a(this.b.r, $$0, $$1);
               cto $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bpu)$$2.getValue();
      }
   }

   public gbm a(fwr $$0, avs $$1, fdm $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gbm a(fwr $$0, avs $$1, fdm $$2, boolean $$3, boolean $$4) {
      return new gbm(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(clw $$0, bru $$1) {
      this.m();
      this.c.b(agy.a($$1, $$0.bV()));
      if (this.j != dau.d) {
         $$0.e($$1);
         $$0.gw();
      }
   }

   public bpu a(clw $$0, bru $$1, bpt $$2) {
      this.m();
      this.c.b(agy.a($$1, $$0.bV(), $$2));
      return this.j == dau.d ? bpu.d : $$0.a($$1, $$2);
   }

   public bpu a(clw $$0, bru $$1, euh $$2, bpt $$3) {
      this.m();
      euk $$4 = $$2.e().a($$1.du(), $$1.dw(), $$1.dA());
      this.c.b(agy.a($$1, $$0.bV(), $$3, $$4));
      return this.j == dau.d ? bpu.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cpc $$3, clw $$4) {
      cot $$5 = $$4.cc;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         jg<cqo> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cto> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cqo $$9 : $$6) {
            $$8.add($$9.g().s());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cto> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cto $$12 = $$8.get($$11);
            cto $$13 = $$6.get($$11).g();
            if (!cto.a($$12, $$13)) {
               $$10.put($$11, $$13.s());
            }
         }

         this.c.b(new ags($$0, $$5.j(), $$1, $$2, $$3, $$5.g().s(), $$10));
      }
   }

   public void a(int $$0, cxw<?> $$1, boolean $$2) {
      this.c.b(new ahf($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new agr($$0, $$1));
   }

   public void a(cto $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.g().i())) {
         this.c.b(new aht($$1, $$0));
      }
   }

   public void a(cto $$0) {
      if (this.j.g() && !$$0.e() && this.c.a($$0.g().i())) {
         this.c.b(new aht(-1, $$0));
      }
   }

   public void b(clw $$0) {
      this.m();
      this.c.b(new ahh(ahh.a.f, io.c, it.a));
      $$0.fA();
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
      return this.b.s.bR() && this.b.s.dc() instanceof bsh;
   }

   public boolean h() {
      return this.j == dau.d;
   }

   @Nullable
   public dau i() {
      return this.k;
   }

   public dau j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new ahe($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new agu($$0, $$1, $$2));
   }
}
