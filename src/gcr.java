import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gcr {
   private static final Logger a = LogUtils.getLogger();
   private final fji b;
   private final gcj c;
   private jh d = new jh(-1, -1, -1);
   private cwb e = cwb.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dey j = dey.e;
   @Nullable
   private dey k;
   private int l;

   public gcr(fji $$0, gcj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(com $$0) {
      this.j.a($$0.gl());
   }

   public void a(dey $$0, @Nullable dey $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gl());
   }

   public void a(dey $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gl());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(jh $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         dfb $$1 = this.b.s;
         dvj $$2 = $$1.a_($$0);
         if (!this.b.t.fb().h().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            die $$3 = $$2.b();
            if ($$3 instanceof dll && !this.b.t.gH()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (com)this.b.t);
               erk $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dfc)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(jh $$0, jm $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dvj $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new aia(aia.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new aia(aia.a.b, this.d, $$1));
            }

            dvj $$3 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.l();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.dX(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.fb();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.as(), this.d, this.l());
               }

               return new aia(aia.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dvj $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new aia(aia.a.b, this.d, jm.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.as(), this.d, -1);
         this.b.t.gE();
      }
   }

   public boolean b(jh $$0, jm $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.s.C_().a($$0)) {
         this.h = 5;
         dvj $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new aia(aia.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dvj $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dX(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dpr $$4 = $$3.A();
               this.b.ak().a(new hbv($$4.f(), awm.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hca.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azk.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new aia(aia.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.s.a(this.b.t.as(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(gci $$0, gdv $$1) {
      try (gdu $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zp<agv> $$4 = $$1.predict($$3);
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
      cwb $$1 = this.b.t.fb();
      return $$0.equals(this.d) && cwb.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.t.gk().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aik(this.l));
      }
   }

   public bsd a(ghd $$0, bsc $$1, ezj $$2) {
      this.m();
      if (!this.b.s.C_().a($$2.b())) {
         return bsd.d;
      } else {
         MutableObject<bsd> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ait($$1, $$2, $$4);
         });
         return (bsd)$$3.getValue();
      }
   }

   private bsd b(ghd $$0, bsc $$1, ezj $$2) {
      jh $$3 = $$2.b();
      cwb $$4 = $$0.b($$1);
      if (this.j == dey.d) {
         return bsd.c;
      } else {
         boolean $$5 = !$$0.fb().f() || !$$0.fc().f();
         boolean $$6 = $$0.ga() && $$5;
         if (!$$6) {
            dvj $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bsd.d;
            }

            bsd $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bsd.f && $$1 == bsc.a) {
               bsd $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gF().a($$4)) {
            czu $$10 = new czu($$0, $$1, $$2);
            bsd $$12;
            if (this.j.g()) {
               int $$11 = $$4.L();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bsd.e;
         }
      }
   }

   public bsd a(com $$0, bsc $$1) {
      if (this.j == dey.d) {
         return bsd.e;
      } else {
         this.m();
         MutableObject<bsd> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aiu $$4 = new aiu($$1, $$3, $$0.dN(), $$0.dP());
            cwb $$5 = $$0.b($$1);
            if ($$0.gF().a($$5)) {
               $$2.setValue(bsd.e);
               return $$4;
            } else {
               bsd $$6 = $$5.a(this.b.s, $$0, $$1);
               cwb $$8;
               if ($$6 instanceof bsd.d $$7) {
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
         return (bsd)$$2.getValue();
      }
   }

   public ghd a(gci $$0, aww $$1, fit $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public ghd a(gci $$0, aww $$1, fit $$2, boolean $$3, boolean $$4) {
      return new ghd(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(com $$0, bue $$1) {
      this.m();
      this.c.b(ahr.a($$1, $$0.ce()));
      if (this.j != dey.d) {
         $$0.e($$1);
         $$0.gE();
      }
   }

   public bsd a(com $$0, bue $$1, bsc $$2) {
      this.m();
      this.c.b(ahr.a($$1, $$0.ce(), $$2));
      return (bsd)(this.j == dey.d ? bsd.e : $$0.a($$1, $$2));
   }

   public bsd a(com $$0, bue $$1, ezk $$2, bsc $$3) {
      this.m();
      ezn $$4 = $$2.g().a($$1.dC(), $$1.dE(), $$1.dI());
      this.c.b(ahr.a($$1, $$0.ce(), $$3, $$4));
      return (bsd)(this.j == dey.d ? bsd.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, crz $$3, com $$4) {
      cro $$5 = $$4.cd;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jz<ctl> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cwb> $$8 = Lists.newArrayListWithCapacity($$7);

         for (ctl $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cwb> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cwb $$12 = $$8.get($$11);
            cwb $$13 = $$6.get($$11).g();
            if (!cwb.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new ahl($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, dar<?> $$1, boolean $$2) {
      this.c.b(new ahy($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahk($$0, $$1));
   }

   public void a(cwb $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.h().i())) {
         this.c.b(new ain($$1, $$0));
      }
   }

   public void a(cwb $$0) {
      boolean $$1 = this.b.z instanceof frp && !(this.b.z instanceof fse);
      if (this.j.g() && !$$1 && !$$0.f() && this.c.a($$0.h().i())) {
         this.c.b(new ain(-1, $$0));
      }
   }

   public void b(com $$0) {
      this.m();
      this.c.b(new aia(aia.a.f, jh.c, jm.a));
      $$0.fG();
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
      return this.b.t.ca() && this.b.t.dl() instanceof but;
   }

   public boolean h() {
      return this.j == dey.d;
   }

   @Nullable
   public dey i() {
      return this.k;
   }

   public dey j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new ahx($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahn($$0, $$1, $$2));
   }
}
