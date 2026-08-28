import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fzo {
   private static final Logger a = LogUtils.getLogger();
   private final fgo b;
   private final fzg c;
   private jd d = new jd(-1, -1, -1);
   private cuq e = cuq.l;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dct j = dct.e;
   @Nullable
   private dct k;
   private int l;

   public fzo(fgo $$0, fzg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cmx $$0) {
      this.j.a($$0.fZ());
   }

   public void a(dct $$0, @Nullable dct $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fZ());
   }

   public void a(dct $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fZ());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(jd $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         dcw $$1 = this.b.r;
         dtc $$2 = $$1.a_($$0);
         if (!this.b.s.eT().g().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dfy $$3 = $$2.b();
            if ($$3 instanceof djg && !this.b.s.gv()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cmx)this.b.s);
               epe $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dcx)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(jd $$0, ji $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dtc $$2 = this.b.r.a_($$0);
            this.b.ax().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ahm(ahm.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahm(ahm.a.b, this.d, $$1));
            }

            dtc $$3 = this.b.r.a_($$0);
            this.b.ax().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dO(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eT();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.an(), this.d, this.l());
               }

               return new ahm(ahm.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dtc $$0 = this.b.r.a_(this.d);
         this.b.ax().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ahm(ahm.a.b, this.d, ji.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.an(), this.d, -1);
         this.b.s.gs();
      }
   }

   public boolean b(jd $$0, ji $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dtc $$2 = this.b.r.a_($$0);
         this.b.ax().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ahm(ahm.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dtc $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dO(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dnm $$4 = $$3.w();
               this.b.aj().a(new gtv($$4.f(), avq.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gua.t(), $$0));
            }

            this.g++;
            this.b.ax().a(this.b.r, $$0, $$3, ayo.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new ahm(ahm.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.r.a(this.b.s.an(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fzf $$0, gat $$1) {
      try (gas $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zg<agi> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public void c() {
      this.m();
      if (this.c.k().i()) {
         this.c.k().b();
      } else {
         this.c.k().n();
      }
   }

   private boolean b(jd $$0) {
      cuq $$1 = this.b.s.eT();
      return $$0.equals(this.d) && cuq.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.fY().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new ahv(this.l));
      }
   }

   public bqr a(geb $$0, bqq $$1, ewy $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bqr.f;
      } else {
         MutableObject<bqr> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aie($$1, $$2, $$4);
         });
         return (bqr)$$3.getValue();
      }
   }

   private bqr b(geb $$0, bqq $$1, ewy $$2) {
      jd $$3 = $$2.a();
      cuq $$4 = $$0.b($$1);
      if (this.j == dct.d) {
         return bqr.a;
      } else {
         boolean $$5 = !$$0.eT().e() || !$$0.eU().e();
         boolean $$6 = $$0.fN() && $$5;
         if (!$$6) {
            dtc $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bqr.f;
            }

            bqt $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bqt.d && $$1 == bqq.a) {
               bqr $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.e() && !$$0.gt().a($$4.g())) {
            cyf $$10 = new cyf($$0, $$1, $$2);
            bqr $$12;
            if (this.j.g()) {
               int $$11 = $$4.H();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bqr.e;
         }
      }
   }

   public bqr a(cmx $$0, bqq $$1) {
      if (this.j == dct.d) {
         return bqr.e;
      } else {
         this.m();
         MutableObject<bqr> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            aif $$4 = new aif($$1, $$3, $$0.dE(), $$0.dG());
            cuq $$5 = $$0.b($$1);
            if ($$0.gt().a($$5.g())) {
               $$2.setValue(bqr.e);
               return $$4;
            } else {
               bqs<cuq> $$6 = $$5.a(this.b.r, $$0, $$1);
               cuq $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bqr)$$2.getValue();
      }
   }

   public geb a(fzf $$0, awa $$1, fga $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public geb a(fzf $$0, awa $$1, fga $$2, boolean $$3, boolean $$4) {
      return new geb(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cmx $$0, bsr $$1) {
      this.m();
      this.c.b(ahd.a($$1, $$0.bW()));
      if (this.j != dct.d) {
         $$0.e($$1);
         $$0.gs();
      }
   }

   public bqr a(cmx $$0, bsr $$1, bqq $$2) {
      this.m();
      this.c.b(ahd.a($$1, $$0.bW(), $$2));
      return this.j == dct.d ? bqr.e : $$0.a($$1, $$2);
   }

   public bqr a(cmx $$0, bsr $$1, ewz $$2, bqq $$3) {
      this.m();
      exc $$4 = $$2.e().a($$1.dt(), $$1.dv(), $$1.dz());
      this.c.b(ahd.a($$1, $$0.bW(), $$3, $$4));
      return this.j == dct.d ? bqr.e : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cqe $$3, cmx $$4) {
      cpu $$5 = $$4.cd;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         jv<crq> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cuq> $$8 = Lists.newArrayListWithCapacity($$7);

         for (crq $$9 : $$6) {
            $$8.add($$9.g().s());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cuq> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cuq $$12 = $$8.get($$11);
            cuq $$13 = $$6.get($$11).g();
            if (!cuq.a($$12, $$13)) {
               $$10.put($$11, $$13.s());
            }
         }

         this.c.b(new agx($$0, $$5.j(), $$1, $$2, $$3, $$5.g().s(), $$10));
      }
   }

   public void a(int $$0, czb<?> $$1, boolean $$2) {
      this.c.b(new ahk($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new agw($$0, $$1));
   }

   public void a(cuq $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.g().i())) {
         this.c.b(new ahy($$1, $$0));
      }
   }

   public void a(cuq $$0) {
      if (this.j.g() && !$$0.e() && this.c.a($$0.g().i())) {
         this.c.b(new ahy(-1, $$0));
      }
   }

   public void b(cmx $$0) {
      this.m();
      this.c.b(new ahm(ahm.a.f, jd.c, ji.a));
      $$0.fw();
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
      return this.b.s.bS() && this.b.s.dc() instanceof btf;
   }

   public boolean h() {
      return this.j == dct.d;
   }

   @Nullable
   public dct i() {
      return this.k;
   }

   public dct j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new ahj($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new agz($$0, $$1, $$2));
   }
}
