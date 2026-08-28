import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fzi {
   private static final Logger a = LogUtils.getLogger();
   private final fgi b;
   private final fza c;
   private jd d = new jd(-1, -1, -1);
   private cuo e = cuo.l;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dcr j = dcr.e;
   @Nullable
   private dcr k;
   private int l;

   public fzi(fgi $$0, fza $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cmv $$0) {
      this.j.a($$0.ga());
   }

   public void a(dcr $$0, @Nullable dcr $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.ga());
   }

   public void a(dcr $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.ga());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(jd $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         dcu $$1 = this.b.r;
         dta $$2 = $$1.a_($$0);
         if (!this.b.s.eU().g().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dfw $$3 = $$2.b();
            if ($$3 instanceof dje && !this.b.s.gw()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cmv)this.b.s);
               eoy $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dcv)$$1, $$0, $$2);
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
            dta $$2 = this.b.r.a_($$0);
            this.b.ax().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ahl(ahl.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahl(ahl.a.b, this.d, $$1));
            }

            dta $$3 = this.b.r.a_($$0);
            this.b.ax().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dQ(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eU();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.an(), this.d, this.l());
               }

               return new ahl(ahl.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dta $$0 = this.b.r.a_(this.d);
         this.b.ax().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ahl(ahl.a.b, this.d, ji.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.an(), this.d, -1);
         this.b.s.gt();
      }
   }

   public boolean b(jd $$0, ji $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dta $$2 = this.b.r.a_($$0);
         this.b.ax().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ahl(ahl.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dta $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dQ(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dnk $$4 = $$3.w();
               this.b.aj().a(new gto($$4.f(), avp.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gtt.t(), $$0));
            }

            this.g++;
            this.b.ax().a(this.b.r, $$0, $$3, ayn.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new ahl(ahl.a.c, $$0, $$1, $$2);
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

   private void a(fyz $$0, gan $$1) {
      try (gam $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zf<agh> $$4 = $$1.predict($$3);
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
      cuo $$1 = this.b.s.eU();
      return $$0.equals(this.d) && cuo.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.fZ().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new ahu(this.l));
      }
   }

   public bqq a(gdv $$0, bqp $$1, ews $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bqq.f;
      } else {
         MutableObject<bqq> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aid($$1, $$2, $$4);
         });
         return (bqq)$$3.getValue();
      }
   }

   private bqq b(gdv $$0, bqp $$1, ews $$2) {
      jd $$3 = $$2.a();
      cuo $$4 = $$0.b($$1);
      if (this.j == dcr.d) {
         return bqq.a;
      } else {
         boolean $$5 = !$$0.eU().e() || !$$0.eV().e();
         boolean $$6 = $$0.fO() && $$5;
         if (!$$6) {
            dta $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bqq.f;
            }

            bqs $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bqs.d && $$1 == bqp.a) {
               bqq $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.e() && !$$0.gu().a($$4.g())) {
            cyd $$10 = new cyd($$0, $$1, $$2);
            bqq $$12;
            if (this.j.g()) {
               int $$11 = $$4.H();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bqq.e;
         }
      }
   }

   public bqq a(cmv $$0, bqp $$1) {
      if (this.j == dcr.d) {
         return bqq.e;
      } else {
         this.m();
         MutableObject<bqq> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            aie $$4 = new aie($$1, $$3, $$0.dG(), $$0.dI());
            cuo $$5 = $$0.b($$1);
            if ($$0.gu().a($$5.g())) {
               $$2.setValue(bqq.e);
               return $$4;
            } else {
               bqr<cuo> $$6 = $$5.a(this.b.r, $$0, $$1);
               cuo $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bqq)$$2.getValue();
      }
   }

   public gdv a(fyz $$0, avz $$1, ffu $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gdv a(fyz $$0, avz $$1, ffu $$2, boolean $$3, boolean $$4) {
      return new gdv(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cmv $$0, bsq $$1) {
      this.m();
      this.c.b(ahc.a($$1, $$0.bW()));
      if (this.j != dcr.d) {
         $$0.e($$1);
         $$0.gt();
      }
   }

   public bqq a(cmv $$0, bsq $$1, bqp $$2) {
      this.m();
      this.c.b(ahc.a($$1, $$0.bW(), $$2));
      return this.j == dcr.d ? bqq.e : $$0.a($$1, $$2);
   }

   public bqq a(cmv $$0, bsq $$1, ewt $$2, bqp $$3) {
      this.m();
      eww $$4 = $$2.e().a($$1.dv(), $$1.dx(), $$1.dB());
      this.c.b(ahc.a($$1, $$0.bW(), $$3, $$4));
      return this.j == dcr.d ? bqq.e : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cqc $$3, cmv $$4) {
      cps $$5 = $$4.cd;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         jv<cro> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cuo> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cro $$9 : $$6) {
            $$8.add($$9.g().s());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cuo> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cuo $$12 = $$8.get($$11);
            cuo $$13 = $$6.get($$11).g();
            if (!cuo.a($$12, $$13)) {
               $$10.put($$11, $$13.s());
            }
         }

         this.c.b(new agw($$0, $$5.j(), $$1, $$2, $$3, $$5.g().s(), $$10));
      }
   }

   public void a(int $$0, cyz<?> $$1, boolean $$2) {
      this.c.b(new ahj($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new agv($$0, $$1));
   }

   public void a(cuo $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.g().i())) {
         this.c.b(new ahx($$1, $$0));
      }
   }

   public void a(cuo $$0) {
      if (this.j.g() && !$$0.e() && this.c.a($$0.g().i())) {
         this.c.b(new ahx(-1, $$0));
      }
   }

   public void b(cmv $$0) {
      this.m();
      this.c.b(new ahl(ahl.a.f, jd.c, ji.a));
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
      return this.b.s.bS() && this.b.s.dd() instanceof bte;
   }

   public boolean h() {
      return this.j == dcr.d;
   }

   @Nullable
   public dcr i() {
      return this.k;
   }

   public dcr j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new ahi($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new agy($$0, $$1, $$2));
   }
}
