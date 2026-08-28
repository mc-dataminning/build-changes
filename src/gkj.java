import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gkj {
   private static final Logger a = LogUtils.getLogger();
   private final foz b;
   private final gka c;
   private iu d = new iu(-1, -1, -1);
   private czd e = czd.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dix j = dix.e;
   @Nullable
   private dix k;
   private int l;

   public gkj(foz $$0, gka $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(crc $$0) {
      this.j.a($$0.gk());
   }

   public void a(dix $$0, @Nullable dix $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gk());
   }

   public void a(dix $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gk());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(iu $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         dja $$1 = this.b.s;
         eah $$2 = $$1.a_($$0);
         if (!this.b.t.fb().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dmf $$3 = $$2.b();
            if ($$3 instanceof dpr && !this.b.t.gG()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (crc)this.b.t);
               ewo $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a($$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(iu $$0, ja $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.A_().a($$0)) {
         return false;
      } else {
         if (this.b.t.gk().d) {
            eah $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new ahv(ahv.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahv(ahv.a.b, this.d, $$1));
            }

            eah $$3 = this.b.s.a_($$0);
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
                  this.b.s.a(this.b.t.ar(), this.d, this.k());
               }

               return new ahv(ahv.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         eah $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ahv(ahv.a.b, this.d, ja.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ar(), this.d, -1);
         this.b.t.gE();
      }
   }

   public boolean b(iu $$0, ja $$1) {
      this.l();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.b.t.gk().d && this.b.s.A_().a($$0)) {
         this.h = 5;
         eah $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahv(ahv.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         eah $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dV(), $$0);
            if (this.g % 4.0F == 0.0F) {
               duc $$4 = $$3.A();
               this.b.ak().a(new hmp($$4.f(), awo.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hmu.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azm.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new ahv(ahv.a.c, $$0, $$1, $$2);
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

   private void a(gjz $$0, gln $$1) {
      try (glm $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zf<agp> $$4 = $$1.predict($$3);
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

   private boolean b(iu $$0) {
      czd $$1 = this.b.t.fb();
      return $$0.equals(this.d) && czd.c($$1, this.e);
   }

   private void l() {
      int $$0 = this.b.t.gj().f();
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aig(this.l));
      }
   }

   public bud a(gox $$0, buc $$1, fem $$2) {
      this.l();
      if (!this.b.s.A_().a($$2.b())) {
         return bud.d;
      } else {
         MutableObject<bud> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new air($$1, $$2, $$4);
         });
         return (bud)$$3.getValue();
      }
   }

   private bud b(gox $$0, buc $$1, fem $$2) {
      iu $$3 = $$2.b();
      czd $$4 = $$0.b($$1);
      if (this.j == dix.d) {
         return bud.c;
      } else {
         boolean $$5 = !$$0.fb().f() || !$$0.fc().f();
         boolean $$6 = $$0.fY() && $$5;
         if (!$$6) {
            eah $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().k())) {
               return bud.d;
            }

            bud $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bud.f && $$1 == buc.a) {
               bud $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gF().a($$4)) {
            dcy $$10 = new dcy($$0, $$1, $$2);
            bud $$12;
            if ($$0.fV()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bud.e;
         }
      }
   }

   public bud a(crc $$0, buc $$1) {
      if (this.j == dix.d) {
         return bud.e;
      } else {
         this.l();
         MutableObject<bud> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            ais $$4 = new ais($$1, $$3, $$0.dL(), $$0.dN());
            czd $$5 = $$0.b($$1);
            if ($$0.gF().a($$5)) {
               $$2.setValue(bud.e);
               return $$4;
            } else {
               bud $$6 = $$5.a(this.b.s, $$0, $$1);
               czd $$8;
               if ($$6 instanceof bud.d $$7) {
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
         return (bud)$$2.getValue();
      }
   }

   public gox a(gjz $$0, awy $$1, foj $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gox a(gjz $$0, awy $$1, foj $$2, boolean $$3, boolean $$4) {
      return new gox(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(crc $$0, bwf $$1) {
      this.l();
      this.c.b(ahl.a($$1, $$0.cd()));
      if (this.j != dix.d) {
         $$0.e($$1);
         $$0.gE();
      }
   }

   public bud a(crc $$0, bwf $$1, buc $$2) {
      this.l();
      this.c.b(ahl.a($$1, $$0.cd(), $$2));
      return (bud)(this.j == dix.d ? bud.e : $$0.a($$1, $$2));
   }

   public bud a(crc $$0, bwf $$1, fen $$2, buc $$3) {
      this.l();
      feq $$4 = $$2.g().a($$1.dA(), $$1.dC(), $$1.dG());
      this.c.b(ahl.a($$1, $$0.cd(), $$3, $$4));
      return (bud)(this.j == dix.d ? bud.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, cvg $$3, crc $$4) {
      cuv $$5 = $$4.bR;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jn<cws> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<czd> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cws $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<czd> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            czd $$12 = $$8.get($$11);
            czd $$13 = $$6.get($$11).g();
            if (!czd.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new ahf($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, dfc $$1, boolean $$2) {
      this.c.b(new aht($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahe($$0, $$1));
   }

   public void a(czd $$0, int $$1) {
      if (this.b.t.fV() && this.c.a($$0.h().k())) {
         this.c.b(new aij($$1, $$0));
      }
   }

   public void a(czd $$0) {
      boolean $$1 = this.b.z instanceof fyq && !(this.b.z instanceof fzg);
      if (this.b.t.fV() && !$$1 && !$$0.f() && this.c.a($$0.h().k())) {
         this.c.b(new aij(-1, $$0));
         this.b.t.E().a();
      }
   }

   public void b(crc $$0) {
      this.l();
      this.c.b(new ahv(ahv.a.f, iu.c, ja.a));
      $$0.fE();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.b.t.bZ() && this.b.t.dk() instanceof bww;
   }

   public boolean g() {
      return this.j == dix.d;
   }

   @Nullable
   public dix h() {
      return this.k;
   }

   public dix i() {
      return this.j;
   }

   public boolean j() {
      return this.i;
   }

   public int k() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(iu $$0, boolean $$1) {
      this.c.b(new ahr($$0, $$1));
   }

   public void a(bwf $$0, boolean $$1) {
      this.c.b(new ahs($$0.ar(), $$1));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahh($$0, $$1, $$2));
   }
}
