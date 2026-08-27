import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fuq {
   private static final Logger a = LogUtils.getLogger();
   private final fbp b;
   private final fui c;
   private ib d = new ib(-1, -1, -1);
   private crj e = crj.i;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cyu j = cyu.e;
   @Nullable
   private cyu k;
   private int l;

   public fuq(fbp $$0, fui $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cjt $$0) {
      this.j.a($$0.ga());
   }

   public void a(cyu $$0, @Nullable cyu $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.ga());
   }

   public void a(cyu $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.ga());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(ib $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         cyx $$1 = this.b.r;
         doz $$2 = $$1.a_($$0);
         if (!this.b.s.eU().f().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dby $$3 = $$2.b();
            if ($$3 instanceof dfg && !this.b.s.gw()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cjt)this.b.s);
               eks $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cyy)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(ib $$0, ih $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            doz $$2 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ago(ago.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ago(ago.a.b, this.d, $$1));
            }

            doz $$3 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dM(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eU();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.aj(), this.d, this.l());
               }

               return new ago(ago.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         doz $$0 = this.b.r.a_(this.d);
         this.b.aB().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ago(ago.a.b, this.d, ih.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gt();
      }
   }

   public boolean b(ib $$0, ih $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         doz $$2 = this.b.r.a_($$0);
         this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ago(ago.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         doz $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dM(), $$0);
            if (this.g % 4.0F == 0.0F) {
               djk $$4 = $$3.w();
               this.b.ak().a(new gor($$4.f(), aun.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gow.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.r, $$0, $$3, axk.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new ago(ago.a.c, $$0, $$1, $$2);
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

   private void a(fuh $$0, fvu $$1) {
      try (fvt $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         yn<afl> $$4 = $$1.predict($$3);
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

   private boolean b(ib $$0) {
      crj $$1 = this.b.s.eU();
      return $$0.equals(this.d) && crj.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.fZ().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new agx(this.l));
      }
   }

   public boa a(fzb $$0, bnz $$1, erw $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return boa.e;
      } else {
         MutableObject<boa> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ahg($$1, $$2, $$4);
         });
         return (boa)$$3.getValue();
      }
   }

   private boa b(fzb $$0, bnz $$1, erw $$2) {
      ib $$3 = $$2.a();
      crj $$4 = $$0.b($$1);
      if (this.j == cyu.d) {
         return boa.a;
      } else {
         boolean $$5 = !$$0.eU().d() || !$$0.eV().d();
         boolean $$6 = $$0.fO() && $$5;
         if (!$$6) {
            doz $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return boa.e;
            }

            boc $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == boc.d && $$1 == bnz.a) {
               boa $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.d() && !$$0.gu().a($$4.f())) {
            cuq $$10 = new cuq($$0, $$1, $$2);
            boa $$12;
            if (this.j.g()) {
               int $$11 = $$4.G();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return boa.d;
         }
      }
   }

   public boa a(cjt $$0, bnz $$1) {
      if (this.j == cyu.d) {
         return boa.d;
      } else {
         this.m();
         this.c.b(new agi.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE(), $$0.aC()));
         MutableObject<boa> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            ahh $$4 = new ahh($$1, $$3);
            crj $$5 = $$0.b($$1);
            if ($$0.gu().a($$5.f())) {
               $$2.setValue(boa.d);
               return $$4;
            } else {
               bob<crj> $$6 = $$5.a(this.b.r, $$0, $$1);
               crj $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (boa)$$2.getValue();
      }
   }

   public fzb a(fuh $$0, auy $$1, fbc $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fzb a(fuh $$0, auy $$1, fbc $$2, boolean $$3, boolean $$4) {
      return new fzb(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cjt $$0, bpv $$1) {
      this.m();
      this.c.b(agf.a($$1, $$0.bS()));
      if (this.j != cyu.d) {
         $$0.e($$1);
         $$0.gt();
      }
   }

   public boa a(cjt $$0, bpv $$1, bnz $$2) {
      this.m();
      this.c.b(agf.a($$1, $$0.bS(), $$2));
      return this.j == cyu.d ? boa.d : $$0.a($$1, $$2);
   }

   public boa a(cjt $$0, bpv $$1, erx $$2, bnz $$3) {
      this.m();
      esa $$4 = $$2.e().a($$1.dr(), $$1.dt(), $$1.dx());
      this.c.b(agf.a($$1, $$0.bS(), $$3, $$4));
      return this.j == cyu.d ? boa.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cmy $$3, cjt $$4) {
      cmp $$5 = $$4.bY;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         iu<cok> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<crj> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cok $$9 : $$6) {
            $$8.add($$9.g().r());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<crj> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            crj $$12 = $$8.get($$11);
            crj $$13 = $$6.get($$11).g();
            if (!crj.a($$12, $$13)) {
               $$10.put($$11, $$13.r());
            }
         }

         this.c.b(new afz($$0, $$5.j(), $$1, $$2, $$3, $$5.g().r(), $$10));
      }
   }

   public void a(int $$0, cvl<?> $$1, boolean $$2) {
      this.c.b(new agm($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new afy($$0, $$1));
   }

   public void a(crj $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.f().m())) {
         this.c.b(new aha($$1, $$0));
      }
   }

   public void a(crj $$0) {
      if (this.j.g() && !$$0.d() && this.c.a($$0.f().m())) {
         this.c.b(new aha(-1, $$0));
      }
   }

   public void b(cjt $$0) {
      this.m();
      this.c.b(new ago(ago.a.f, ib.c, ih.a));
      $$0.fx();
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
      return this.b.s.bO() && this.b.s.cZ() instanceof bqh;
   }

   public boolean h() {
      return this.j == cyu.d;
   }

   @Nullable
   public cyu i() {
      return this.k;
   }

   public cyu j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new agl($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new agb($$0, $$1, $$2));
   }
}
