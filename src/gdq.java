import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gdq {
   private static final Logger a = LogUtils.getLogger();
   private final fke b;
   private final gdi c;
   private jh d = new jh(-1, -1, -1);
   private cwm e = cwm.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dfj j = dfj.e;
   @Nullable
   private dfj k;
   private int l;

   public gdq(fke $$0, gdi $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cou $$0) {
      this.j.a($$0.gh());
   }

   public void a(dfj $$0, @Nullable dfj $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gh());
   }

   public void a(dfj $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gh());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(jh $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         dfm $$1 = this.b.s;
         dvv $$2 = $$1.a_($$0);
         if (!this.b.t.eX().h().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            diq $$3 = $$2.b();
            if ($$3 instanceof dlx && !this.b.t.gE()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cou)this.b.t);
               erv $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dfn)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(jh $$0, jm $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.E_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dvv $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new aib(aib.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new aib(aib.a.b, this.d, $$1));
            }

            dvv $$3 = this.b.s.a_($$0);
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
                  this.e = this.b.t.eX();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ar(), this.d, this.l());
               }

               return new aib(aib.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dvv $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new aib(aib.a.b, this.d, jm.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ar(), this.d, -1);
         this.b.t.gB();
      }
   }

   public boolean b(jh $$0, jm $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.s.E_().a($$0)) {
         this.h = 5;
         dvv $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new aib(aib.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dvv $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dV(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dqd $$4 = $$3.A();
               this.b.ak().a(new hcw($$4.f(), awo.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hdb.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azm.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new aib(aib.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.s.a(this.b.t.ar(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(gdh $$0, geu $$1) {
      try (get $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zq<agw> $$4 = $$1.predict($$3);
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

   private boolean b(jh $$0) {
      cwm $$1 = this.b.t.eX();
      return $$0.equals(this.d) && cwm.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.t.gg().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new ail(this.l));
      }
   }

   public bsk a(gic $$0, bsj $$1, ezu $$2) {
      this.m();
      if (!this.b.s.E_().a($$2.b())) {
         return bsk.d;
      } else {
         MutableObject<bsk> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aiu($$1, $$2, $$4);
         });
         return (bsk)$$3.getValue();
      }
   }

   private bsk b(gic $$0, bsj $$1, ezu $$2) {
      jh $$3 = $$2.b();
      cwm $$4 = $$0.b($$1);
      if (this.j == dfj.d) {
         return bsk.c;
      } else {
         boolean $$5 = !$$0.eX().f() || !$$0.eY().f();
         boolean $$6 = $$0.fW() && $$5;
         if (!$$6) {
            dvv $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bsk.d;
            }

            bsk $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bsk.f && $$1 == bsj.a) {
               bsk $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gC().a($$4)) {
            daf $$10 = new daf($$0, $$1, $$2);
            bsk $$12;
            if (this.j.g()) {
               int $$11 = $$4.L();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bsk.e;
         }
      }
   }

   public bsk a(cou $$0, bsj $$1) {
      if (this.j == dfj.d) {
         return bsk.e;
      } else {
         this.m();
         MutableObject<bsk> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aiv $$4 = new aiv($$1, $$3, $$0.dL(), $$0.dN());
            cwm $$5 = $$0.b($$1);
            if ($$0.gC().a($$5)) {
               $$2.setValue(bsk.e);
               return $$4;
            } else {
               bsk $$6 = $$5.a(this.b.s, $$0, $$1);
               cwm $$8;
               if ($$6 instanceof bsk.d $$7) {
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
         return (bsk)$$2.getValue();
      }
   }

   public gic a(gdh $$0, awy $$1, fjp $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gic a(gdh $$0, awy $$1, fjp $$2, boolean $$3, boolean $$4) {
      return new gic(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cou $$0, bul $$1) {
      this.m();
      this.c.b(ahs.a($$1, $$0.cd()));
      if (this.j != dfj.d) {
         $$0.e($$1);
         $$0.gB();
      }
   }

   public bsk a(cou $$0, bul $$1, bsj $$2) {
      this.m();
      this.c.b(ahs.a($$1, $$0.cd(), $$2));
      return (bsk)(this.j == dfj.d ? bsk.e : $$0.a($$1, $$2));
   }

   public bsk a(cou $$0, bul $$1, ezv $$2, bsj $$3) {
      this.m();
      ezy $$4 = $$2.g().a($$1.dA(), $$1.dC(), $$1.dG());
      this.c.b(ahs.a($$1, $$0.cd(), $$3, $$4));
      return (bsk)(this.j == dfj.d ? bsk.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, csk $$3, cou $$4) {
      crz $$5 = $$4.cc;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jz<ctw> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cwm> $$8 = Lists.newArrayListWithCapacity($$7);

         for (ctw $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cwm> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cwm $$12 = $$8.get($$11);
            cwm $$13 = $$6.get($$11).g();
            if (!cwm.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new ahm($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, dbc<?> $$1, boolean $$2) {
      this.c.b(new ahz($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahl($$0, $$1));
   }

   public void a(cwm $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.h().i())) {
         this.c.b(new aio($$1, $$0));
      }
   }

   public void a(cwm $$0) {
      boolean $$1 = this.b.z instanceof fsl && !(this.b.z instanceof ftb);
      if (this.j.g() && !$$1 && !$$0.f() && this.c.a($$0.h().i())) {
         this.c.b(new aio(-1, $$0));
         this.b.t.H().a();
      }
   }

   public void b(cou $$0) {
      this.m();
      this.c.b(new aib(aib.a.f, jh.c, jm.a));
      $$0.fC();
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
      return this.b.t.bZ() && this.b.t.dk() instanceof bva;
   }

   public boolean h() {
      return this.j == dfj.d;
   }

   @Nullable
   public dfj i() {
      return this.k;
   }

   public dfj j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new ahy($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new aho($$0, $$1, $$2));
   }
}
