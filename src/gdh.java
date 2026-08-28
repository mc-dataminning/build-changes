import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gdh {
   private static final Logger a = LogUtils.getLogger();
   private final fjx b;
   private final gcz c;
   private jh d = new jh(-1, -1, -1);
   private cwf e = cwf.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dfc j = dfc.e;
   @Nullable
   private dfc k;
   private int l;

   public gdh(fjx $$0, gcz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cor $$0) {
      this.j.a($$0.gm());
   }

   public void a(dfc $$0, @Nullable dfc $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gm());
   }

   public void a(dfc $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gm());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(jh $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         dff $$1 = this.b.s;
         dvo $$2 = $$1.a_($$0);
         if (!this.b.t.fc().h().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dij $$3 = $$2.b();
            if ($$3 instanceof dlq && !this.b.t.gJ()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cor)this.b.t);
               ero $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dfg)$$1, $$0, $$2);
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
            dvo $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new aid(aid.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new aid(aid.a.b, this.d, $$1));
            }

            dvo $$3 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.l();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.dY(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.fc();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.as(), this.d, this.l());
               }

               return new aid(aid.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dvo $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new aid(aid.a.b, this.d, jm.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.as(), this.d, -1);
         this.b.t.gG();
      }
   }

   public boolean b(jh $$0, jm $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.s.C_().a($$0)) {
         this.h = 5;
         dvo $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new aid(aid.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dvo $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dY(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dpw $$4 = $$3.A();
               this.b.ak().a(new hcl($$4.f(), awp.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hcq.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azn.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new aid(aid.a.c, $$0, $$1, $$2);
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

   private void a(gcy $$0, gel $$1) {
      try (gek $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zs<agy> $$4 = $$1.predict($$3);
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
      cwf $$1 = this.b.t.fc();
      return $$0.equals(this.d) && cwf.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.t.gl().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new ain(this.l));
      }
   }

   public bsh a(ght $$0, bsg $$1, ezn $$2) {
      this.m();
      if (!this.b.s.C_().a($$2.b())) {
         return bsh.d;
      } else {
         MutableObject<bsh> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aiw($$1, $$2, $$4);
         });
         return (bsh)$$3.getValue();
      }
   }

   private bsh b(ght $$0, bsg $$1, ezn $$2) {
      jh $$3 = $$2.b();
      cwf $$4 = $$0.b($$1);
      if (this.j == dfc.d) {
         return bsh.c;
      } else {
         boolean $$5 = !$$0.fc().f() || !$$0.fd().f();
         boolean $$6 = $$0.gb() && $$5;
         if (!$$6) {
            dvo $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bsh.d;
            }

            bsh $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bsh.f && $$1 == bsg.a) {
               bsh $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gH().a($$4)) {
            czy $$10 = new czy($$0, $$1, $$2);
            bsh $$12;
            if (this.j.g()) {
               int $$11 = $$4.L();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bsh.e;
         }
      }
   }

   public bsh a(cor $$0, bsg $$1) {
      if (this.j == dfc.d) {
         return bsh.e;
      } else {
         this.m();
         MutableObject<bsh> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aix $$4 = new aix($$1, $$3, $$0.dO(), $$0.dQ());
            cwf $$5 = $$0.b($$1);
            if ($$0.gH().a($$5)) {
               $$2.setValue(bsh.e);
               return $$4;
            } else {
               bsh $$6 = $$5.a(this.b.s, $$0, $$1);
               cwf $$8;
               if ($$6 instanceof bsh.d $$7) {
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
         return (bsh)$$2.getValue();
      }
   }

   public ght a(gcy $$0, awz $$1, fji $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public ght a(gcy $$0, awz $$1, fji $$2, boolean $$3, boolean $$4) {
      return new ght(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cor $$0, bui $$1) {
      this.m();
      this.c.b(ahu.a($$1, $$0.cf()));
      if (this.j != dfc.d) {
         $$0.e($$1);
         $$0.gG();
      }
   }

   public bsh a(cor $$0, bui $$1, bsg $$2) {
      this.m();
      this.c.b(ahu.a($$1, $$0.cf(), $$2));
      return (bsh)(this.j == dfc.d ? bsh.e : $$0.a($$1, $$2));
   }

   public bsh a(cor $$0, bui $$1, ezo $$2, bsg $$3) {
      this.m();
      ezr $$4 = $$2.g().a($$1.dD(), $$1.dF(), $$1.dJ());
      this.c.b(ahu.a($$1, $$0.cf(), $$3, $$4));
      return (bsh)(this.j == dfc.d ? bsh.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, csd $$3, cor $$4) {
      crs $$5 = $$4.cd;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jz<ctp> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cwf> $$8 = Lists.newArrayListWithCapacity($$7);

         for (ctp $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cwf> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cwf $$12 = $$8.get($$11);
            cwf $$13 = $$6.get($$11).g();
            if (!cwf.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new aho($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, dav<?> $$1, boolean $$2) {
      this.c.b(new aib($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahn($$0, $$1));
   }

   public void a(cwf $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.h().i())) {
         this.c.b(new aiq($$1, $$0));
      }
   }

   public void a(cwf $$0) {
      boolean $$1 = this.b.z instanceof fse && !(this.b.z instanceof fst);
      if (this.j.g() && !$$1 && !$$0.f() && this.c.a($$0.h().i())) {
         this.c.b(new aiq(-1, $$0));
         this.b.t.F().a();
      }
   }

   public void b(cor $$0) {
      this.m();
      this.c.b(new aid(aid.a.f, jh.c, jm.a));
      $$0.fH();
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
      return this.b.t.cb() && this.b.t.dm() instanceof bux;
   }

   public boolean h() {
      return this.j == dfc.d;
   }

   @Nullable
   public dfc i() {
      return this.k;
   }

   public dfc j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new aia($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahq($$0, $$1, $$2));
   }
}
