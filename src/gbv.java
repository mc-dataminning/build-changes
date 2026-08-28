import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gbv {
   private static final Logger a = LogUtils.getLogger();
   private final fip b;
   private final gbn c;
   private jf d = new jf(-1, -1, -1);
   private cvs e = cvs.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private deg j = deg.e;
   @Nullable
   private deg k;
   private int l;

   public gbv(fip $$0, gbn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cnx $$0) {
      this.j.a($$0.ge());
   }

   public void a(deg $$0, @Nullable deg $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.ge());
   }

   public void a(deg $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.ge());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(jf $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         dej $$1 = this.b.s;
         dus $$2 = $$1.a_($$0);
         if (!this.b.t.eW().h().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dhm $$3 = $$2.b();
            if ($$3 instanceof dku && !this.b.t.gA()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cnx)this.b.t);
               eqt $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dek)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(jf $$0, jk $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.B_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dus $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new ahw(ahw.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahw(ahw.a.b, this.d, $$1));
            }

            dus $$3 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.l();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.dS(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.eW();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ap(), this.d, this.l());
               }

               return new ahw(ahw.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dus $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ahw(ahw.a.b, this.d, jk.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ap(), this.d, -1);
         this.b.t.gx();
      }
   }

   public boolean b(jf $$0, jk $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.s.B_().a($$0)) {
         this.h = 5;
         dus $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahw(ahw.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dus $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dS(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dpa $$4 = $$3.A();
               this.b.ak().a(new hav($$4.f(), awh.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hba.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azf.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new ahw(ahw.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.s.a(this.b.t.ap(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(gbm $$0, gcz $$1) {
      try (gcy $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zl<agr> $$4 = $$1.predict($$3);
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

   private boolean b(jf $$0) {
      cvs $$1 = this.b.t.eW();
      return $$0.equals(this.d) && cvs.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.t.gd().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aig(this.l));
      }
   }

   public brs a(ggh $$0, brr $$1, eys $$2) {
      this.m();
      if (!this.b.s.B_().a($$2.b())) {
         return brs.d;
      } else {
         MutableObject<brs> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aip($$1, $$2, $$4);
         });
         return (brs)$$3.getValue();
      }
   }

   private brs b(ggh $$0, brr $$1, eys $$2) {
      jf $$3 = $$2.b();
      cvs $$4 = $$0.b($$1);
      if (this.j == deg.d) {
         return brs.c;
      } else {
         boolean $$5 = !$$0.eW().f() || !$$0.eX().f();
         boolean $$6 = $$0.fT() && $$5;
         if (!$$6) {
            dus $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return brs.d;
            }

            brs $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof brs.f && $$1 == brr.a) {
               brs $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gy().a($$4)) {
            czp $$10 = new czp($$0, $$1, $$2);
            brs $$12;
            if (this.j.g()) {
               int $$11 = $$4.K();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return brs.e;
         }
      }
   }

   public brs a(cnx $$0, brr $$1) {
      if (this.j == deg.d) {
         return brs.e;
      } else {
         this.m();
         MutableObject<brs> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aiq $$4 = new aiq($$1, $$3, $$0.dI(), $$0.dK());
            cvs $$5 = $$0.b($$1);
            if ($$0.gy().a($$5)) {
               $$2.setValue(brs.e);
               return $$4;
            } else {
               brs $$6 = $$5.a(this.b.s, $$0, $$1);
               cvs $$8;
               if ($$6 instanceof brs.d $$7) {
                  $$8 = Objects.requireNonNullElseGet($$7.d(), () -> $$0.b($$1));
               } else {
                  $$8 = $$0.b($$1);
               }

               if ($$8 != $$5) {
                  $$0.a($$1, $$8);
               }

               $$2.setValue($$6);
               return $$4;
            }
         });
         return (brs)$$2.getValue();
      }
   }

   public ggh a(gbm $$0, awr $$1, fia $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public ggh a(gbm $$0, awr $$1, fia $$2, boolean $$3, boolean $$4) {
      return new ggh(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cnx $$0, btr $$1) {
      this.m();
      this.c.b(ahn.a($$1, $$0.ca()));
      if (this.j != deg.d) {
         $$0.e($$1);
         $$0.gx();
      }
   }

   public brs a(cnx $$0, btr $$1, brr $$2) {
      this.m();
      this.c.b(ahn.a($$1, $$0.ca(), $$2));
      return (brs)(this.j == deg.d ? brs.e : $$0.a($$1, $$2));
   }

   public brs a(cnx $$0, btr $$1, eyt $$2, brr $$3) {
      this.m();
      eyw $$4 = $$2.g().a($$1.dx(), $$1.dz(), $$1.dD());
      this.c.b(ahn.a($$1, $$0.ca(), $$3, $$4));
      return (brs)(this.j == deg.d ? brs.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, crk $$3, cnx $$4) {
      cqz $$5 = $$4.bZ;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jx<csw> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cvs> $$8 = Lists.newArrayListWithCapacity($$7);

         for (csw $$9 : $$6) {
            $$8.add($$9.g().u());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cvs> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cvs $$12 = $$8.get($$11);
            cvs $$13 = $$6.get($$11).g();
            if (!cvs.a($$12, $$13)) {
               $$10.put($$11, $$13.u());
            }
         }

         this.c.b(new ahh($$0, $$5.j(), $$1, $$2, $$3, $$5.g().u(), $$10));
      }
   }

   public void a(int $$0, dam<?> $$1, boolean $$2) {
      this.c.b(new ahu($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahg($$0, $$1));
   }

   public void a(cvs $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.h().i())) {
         this.c.b(new aij($$1, $$0));
      }
   }

   public void a(cvs $$0) {
      if (this.j.g() && !$$0.f() && this.c.a($$0.h().i())) {
         this.c.b(new aij(-1, $$0));
      }
   }

   public void b(cnx $$0) {
      this.m();
      this.c.b(new ahw(ahw.a.f, jf.c, jk.a));
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
      return this.b.t.bW() && this.b.t.dg() instanceof bug;
   }

   public boolean h() {
      return this.j == deg.d;
   }

   @Nullable
   public deg i() {
      return this.k;
   }

   public deg j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new aht($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahj($$0, $$1, $$2));
   }
}
