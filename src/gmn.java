import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gmn {
   private static final Logger a = LogUtils.getLogger();
   private final frf b;
   private final gme c;
   private iw d = new iw(-1, -1, -1);
   private daa e = daa.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private djw j = djw.e;
   @Nullable
   private djw k;
   private int l;

   public gmn(frf $$0, gme $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(crz $$0) {
      this.j.a($$0.gk());
   }

   public void a(djw $$0, @Nullable djw $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gk());
   }

   public void a(djw $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gk());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(iw $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         djz $$1 = this.b.s;
         ebg $$2 = $$1.a_($$0);
         if (!this.b.t.fb().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dne $$3 = $$2.b();
            if ($$3 instanceof dqq && !this.b.t.gG()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (crz)this.b.t);
               exq $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a($$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(iw $$0, jc $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.E_().a($$0)) {
         return false;
      } else {
         if (this.b.t.gk().d) {
            ebg $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new ahz(ahz.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahz(ahz.a.b, this.d, $$1));
            }

            ebg $$3 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.l();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.dV(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.fb();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ao(), this.d, this.k());
               }

               return new ahz(ahz.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         ebg $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ahz(ahz.a.b, this.d, jc.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ao(), this.d, -1);
         this.b.t.gE();
      }
   }

   public boolean b(iw $$0, jc $$1) {
      this.l();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.b.t.gk().d && this.b.s.E_().a($$0)) {
         this.h = 5;
         ebg $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahz(ahz.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         ebg $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dV(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dvb $$4 = $$3.A();
               this.b.ak().a(new hou($$4.f(), aws.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hoz.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azq.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new ahz(ahz.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.s.a(this.b.t.ao(), this.d, this.k());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(gmd $$0, gnr $$1) {
      try (gnq $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zj<agt> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public void c() {
      this.l();
      if (this.c.k().i()) {
         this.c.k().b();
      } else {
         this.c.k().n();
      }
   }

   private boolean b(iw $$0) {
      daa $$1 = this.b.t.fb();
      return $$0.equals(this.d) && daa.c($$1, this.e);
   }

   private void l() {
      int $$0 = this.b.t.gj().f();
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aik(this.l));
      }
   }

   public but a(grb $$0, bus $$1, ffo $$2) {
      this.l();
      if (!this.b.s.E_().a($$2.b())) {
         return but.d;
      } else {
         MutableObject<but> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aiv($$1, $$2, $$4);
         });
         return (but)$$3.getValue();
      }
   }

   private but b(grb $$0, bus $$1, ffo $$2) {
      iw $$3 = $$2.b();
      daa $$4 = $$0.b($$1);
      if (this.j == djw.d) {
         return but.c;
      } else {
         boolean $$5 = !$$0.fb().f() || !$$0.fc().f();
         boolean $$6 = $$0.fY() && $$5;
         if (!$$6) {
            ebg $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().k())) {
               return but.d;
            }

            but $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof but.f && $$1 == bus.a) {
               but $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gF().a($$4)) {
            ddv $$10 = new ddv($$0, $$1, $$2);
            but $$12;
            if ($$0.fV()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return but.e;
         }
      }
   }

   public but a(crz $$0, bus $$1) {
      if (this.j == djw.d) {
         return but.e;
      } else {
         this.l();
         MutableObject<but> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aiw $$4 = new aiw($$1, $$3, $$0.dL(), $$0.dN());
            daa $$5 = $$0.b($$1);
            if ($$0.gF().a($$5)) {
               $$2.setValue(but.e);
               return $$4;
            } else {
               but $$6 = $$5.a(this.b.s, $$0, $$1);
               daa $$8;
               if ($$6 instanceof but.d $$7) {
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
         return (but)$$2.getValue();
      }
   }

   public grb a(gmd $$0, axc $$1, fqq $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public grb a(gmd $$0, axc $$1, fqq $$2, boolean $$3, boolean $$4) {
      return new grb(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(crz $$0, bwv $$1) {
      this.l();
      this.c.b(ahp.a($$1, $$0.cc()));
      if (this.j != djw.d) {
         $$0.e($$1);
         $$0.gE();
      }
   }

   public but a(crz $$0, bwv $$1, bus $$2) {
      this.l();
      this.c.b(ahp.a($$1, $$0.cc(), $$2));
      return (but)(this.j == djw.d ? but.e : $$0.a($$1, $$2));
   }

   public but a(crz $$0, bwv $$1, ffp $$2, bus $$3) {
      this.l();
      ffs $$4 = $$2.g().a($$1.dA(), $$1.dC(), $$1.dG());
      this.c.b(ahp.a($$1, $$0.cc(), $$3, $$4));
      return (but)(this.j == djw.d ? but.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, cwd $$3, crz $$4) {
      cvs $$5 = $$4.bR;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jp<cxp> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<daa> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cxp $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<daa> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            daa $$12 = $$8.get($$11);
            daa $$13 = $$6.get($$11).g();
            if (!daa.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new ahj($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, dfz $$1, boolean $$2) {
      this.c.b(new ahx($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahi($$0, $$1));
   }

   public void a(daa $$0, int $$1) {
      if (this.b.t.fV() && this.c.a($$0.h().k())) {
         this.c.b(new ain($$1, $$0));
      }
   }

   public void a(daa $$0) {
      boolean $$1 = this.b.z instanceof gau && !(this.b.z instanceof gbk);
      if (this.b.t.fV() && !$$1 && !$$0.f() && this.c.a($$0.h().k())) {
         this.c.b(new ain(-1, $$0));
         this.b.t.E().a();
      }
   }

   public void b(crz $$0) {
      this.l();
      this.c.b(new ahz(ahz.a.f, iw.c, jc.a));
      $$0.fE();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.b.t.bY() && this.b.t.dk() instanceof bxm;
   }

   public boolean g() {
      return this.j == djw.d;
   }

   @Nullable
   public djw h() {
      return this.k;
   }

   public djw i() {
      return this.j;
   }

   public boolean j() {
      return this.i;
   }

   public int k() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(iw $$0, boolean $$1) {
      this.c.b(new ahv($$0, $$1));
   }

   public void a(bwv $$0, boolean $$1) {
      this.c.b(new ahw($$0.ao(), $$1));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahl($$0, $$1, $$2));
   }
}
