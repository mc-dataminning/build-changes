import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gij {
   private static final Logger a = LogUtils.getLogger();
   private final fnd b;
   private final gia c;
   private jj d = new jj(-1, -1, -1);
   private cxy e = cxy.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dhm j = dhm.e;
   @Nullable
   private dhm k;
   private int l;

   public gij(fnd $$0, gia $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cqi $$0) {
      this.j.a($$0.gj());
   }

   public void a(dhm $$0, @Nullable dhm $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gj());
   }

   public void a(dhm $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gj());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(jj $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         dhp $$1 = this.b.s;
         dym $$2 = $$1.a_($$0);
         if (!this.b.t.fa().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dku $$3 = $$2.b();
            if ($$3 instanceof doe && !this.b.t.gF()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cqi)this.b.t);
               eut $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a($$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(jj $$0, jo $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.A_().a($$0)) {
         return false;
      } else {
         if (this.b.t.gj().d) {
            dym $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new ahs(ahs.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahs(ahs.a.b, this.d, $$1));
            }

            dym $$3 = this.b.s.a_($$0);
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
                  this.e = this.b.t.fa();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ar(), this.d, this.k());
               }

               return new ahs(ahs.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dym $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ahs(ahs.a.b, this.d, jo.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ar(), this.d, -1);
         this.b.t.gD();
      }
   }

   public boolean b(jj $$0, jo $$1) {
      this.l();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.b.t.gj().d && this.b.s.A_().a($$0)) {
         this.h = 5;
         dym $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahs(ahs.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dym $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dV(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dsn $$4 = $$3.A();
               this.b.ak().a(new hkk($$4.f(), awl.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hkp.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azk.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new ahs(ahs.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.s.a(this.b.t.ar(), this.d, this.k());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(ghz $$0, gjn $$1) {
      try (gjm $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zc<agm> $$4 = $$1.predict($$3);
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

   private boolean b(jj $$0) {
      cxy $$1 = this.b.t.fa();
      return $$0.equals(this.d) && cxy.c($$1, this.e);
   }

   private void l() {
      int $$0 = this.b.t.gi().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aid(this.l));
      }
   }

   public btq a(gmw $$0, btp $$1, fcq $$2) {
      this.l();
      if (!this.b.s.A_().a($$2.b())) {
         return btq.d;
      } else {
         MutableObject<btq> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aio($$1, $$2, $$4);
         });
         return (btq)$$3.getValue();
      }
   }

   private btq b(gmw $$0, btp $$1, fcq $$2) {
      jj $$3 = $$2.b();
      cxy $$4 = $$0.b($$1);
      if (this.j == dhm.d) {
         return btq.c;
      } else {
         boolean $$5 = !$$0.fa().f() || !$$0.fb().f();
         boolean $$6 = $$0.fX() && $$5;
         if (!$$6) {
            dym $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().k())) {
               return btq.d;
            }

            btq $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof btq.f && $$1 == btp.a) {
               btq $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gE().a($$4)) {
            dbp $$10 = new dbp($$0, $$1, $$2);
            btq $$12;
            if ($$0.fU()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return btq.e;
         }
      }
   }

   public btq a(cqi $$0, btp $$1) {
      if (this.j == dhm.d) {
         return btq.e;
      } else {
         this.l();
         MutableObject<btq> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aip $$4 = new aip($$1, $$3, $$0.dL(), $$0.dN());
            cxy $$5 = $$0.b($$1);
            if ($$0.gE().a($$5)) {
               $$2.setValue(btq.e);
               return $$4;
            } else {
               btq $$6 = $$5.a(this.b.s, $$0, $$1);
               cxy $$8;
               if ($$6 instanceof btq.d $$7) {
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
         return (btq)$$2.getValue();
      }
   }

   public gmw a(ghz $$0, awv $$1, fmo $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gmw a(ghz $$0, awv $$1, fmo $$2, boolean $$3, boolean $$4) {
      return new gmw(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cqi $$0, bvs $$1) {
      this.l();
      this.c.b(ahi.a($$1, $$0.cd()));
      if (this.j != dhm.d) {
         $$0.e($$1);
         $$0.gD();
      }
   }

   public btq a(cqi $$0, bvs $$1, btp $$2) {
      this.l();
      this.c.b(ahi.a($$1, $$0.cd(), $$2));
      return (btq)(this.j == dhm.d ? btq.e : $$0.a($$1, $$2));
   }

   public btq a(cqi $$0, bvs $$1, fcr $$2, btp $$3) {
      this.l();
      fcu $$4 = $$2.g().a($$1.dA(), $$1.dC(), $$1.dG());
      this.c.b(ahi.a($$1, $$0.cd(), $$3, $$4));
      return (btq)(this.j == dhm.d ? btq.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, cty $$3, cqi $$4) {
      ctn $$5 = $$4.bP;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         kb<cvk> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cxy> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cvk $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cxy> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cxy $$12 = $$8.get($$11);
            cxy $$13 = $$6.get($$11).g();
            if (!cxy.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new ahc($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, ddt $$1, boolean $$2) {
      this.c.b(new ahq($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahb($$0, $$1));
   }

   public void a(cxy $$0, int $$1) {
      if (this.b.t.fU() && this.c.a($$0.h().k())) {
         this.c.b(new aig($$1, $$0));
      }
   }

   public void a(cxy $$0) {
      boolean $$1 = this.b.z instanceof fwu && !(this.b.z instanceof fxk);
      if (this.b.t.fU() && !$$1 && !$$0.f() && this.c.a($$0.h().k())) {
         this.c.b(new aig(-1, $$0));
         this.b.t.E().a();
      }
   }

   public void b(cqi $$0) {
      this.l();
      this.c.b(new ahs(ahs.a.f, jj.c, jo.a));
      $$0.fD();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.b.t.bZ() && this.b.t.dk() instanceof bwj;
   }

   public boolean g() {
      return this.j == dhm.d;
   }

   @Nullable
   public dhm h() {
      return this.k;
   }

   public dhm i() {
      return this.j;
   }

   public boolean j() {
      return this.i;
   }

   public int k() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(jj $$0, boolean $$1) {
      this.c.b(new aho($$0, $$1));
   }

   public void a(bvs $$0, boolean $$1) {
      this.c.b(new ahp($$0.ar(), $$1));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahe($$0, $$1, $$2));
   }
}
