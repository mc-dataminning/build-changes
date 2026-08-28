import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ggk {
   private static final Logger a = LogUtils.getLogger();
   private final flk b;
   private final ggb c;
   private ji d = new ji(-1, -1, -1);
   private cwq e = cwq.j;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dgg j = dgg.e;
   @Nullable
   private dgg k;
   private int l;

   public ggk(flk $$0, ggb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(coy $$0) {
      this.j.a($$0.gj());
   }

   public void a(dgg $$0, @Nullable dgg $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gj());
   }

   public void a(dgg $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gj());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(ji $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         dgj $$1 = this.b.s;
         dwy $$2 = $$1.a_($$0);
         if (!this.b.t.eZ().h().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            djn $$3 = $$2.b();
            if ($$3 instanceof dmw && !this.b.t.gG()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (coy)this.b.t);
               eta $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a($$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(ji $$0, jn $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.F_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dwy $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new ahm(ahm.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahm(ahm.a.b, this.d, $$1));
            }

            dwy $$3 = this.b.s.a_($$0);
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
                  this.e = this.b.t.eZ();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ar(), this.d, this.l());
               }

               return new ahm(ahm.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dwy $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ahm(ahm.a.b, this.d, jn.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ar(), this.d, -1);
         this.b.t.gD();
      }
   }

   public boolean b(ji $$0, jn $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.s.F_().a($$0)) {
         this.h = 5;
         dwy $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahm(ahm.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dwy $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dV(), $$0);
            if (this.g % 4.0F == 0.0F) {
               drf $$4 = $$3.A();
               this.b.ak().a(new hil($$4.f(), awb.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hiq.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, ayz.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new ahm(ahm.a.c, $$0, $$1, $$2);
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

   private void a(gga $$0, gho $$1) {
      try (ghn $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         yw<agg> $$4 = $$1.predict($$3);
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

   private boolean b(ji $$0) {
      cwq $$1 = this.b.t.eZ();
      return $$0.equals(this.d) && cwq.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.t.gi().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new ahx(this.l));
      }
   }

   public bsl a(gkx $$0, bsk $$1, fax $$2) {
      this.m();
      if (!this.b.s.F_().a($$2.b())) {
         return bsl.d;
      } else {
         MutableObject<bsl> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aig($$1, $$2, $$4);
         });
         return (bsl)$$3.getValue();
      }
   }

   private bsl b(gkx $$0, bsk $$1, fax $$2) {
      ji $$3 = $$2.b();
      cwq $$4 = $$0.b($$1);
      if (this.j == dgg.d) {
         return bsl.c;
      } else {
         boolean $$5 = !$$0.eZ().f() || !$$0.fa().f();
         boolean $$6 = $$0.fY() && $$5;
         if (!$$6) {
            dwy $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bsl.d;
            }

            bsl $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bsl.f && $$1 == bsk.a) {
               bsl $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gE().a($$4)) {
            daj $$10 = new daj($$0, $$1, $$2);
            bsl $$12;
            if (this.j.g()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bsl.e;
         }
      }
   }

   public bsl a(coy $$0, bsk $$1) {
      if (this.j == dgg.d) {
         return bsl.e;
      } else {
         this.m();
         MutableObject<bsl> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aih $$4 = new aih($$1, $$3, $$0.dL(), $$0.dN());
            cwq $$5 = $$0.b($$1);
            if ($$0.gE().a($$5)) {
               $$2.setValue(bsl.e);
               return $$4;
            } else {
               bsl $$6 = $$5.a(this.b.s, $$0, $$1);
               cwq $$8;
               if ($$6 instanceof bsl.d $$7) {
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
         return (bsl)$$2.getValue();
      }
   }

   public gkx a(gga $$0, awl $$1, fkv $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gkx a(gga $$0, awl $$1, fkv $$2, boolean $$3, boolean $$4) {
      return new gkx(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(coy $$0, bum $$1) {
      this.m();
      this.c.b(ahc.a($$1, $$0.cd()));
      if (this.j != dgg.d) {
         $$0.e($$1);
         $$0.gD();
      }
   }

   public bsl a(coy $$0, bum $$1, bsk $$2) {
      this.m();
      this.c.b(ahc.a($$1, $$0.cd(), $$2));
      return (bsl)(this.j == dgg.d ? bsl.e : $$0.a($$1, $$2));
   }

   public bsl a(coy $$0, bum $$1, fay $$2, bsk $$3) {
      this.m();
      fbb $$4 = $$2.g().a($$1.dA(), $$1.dC(), $$1.dG());
      this.c.b(ahc.a($$1, $$0.cd(), $$3, $$4));
      return (bsl)(this.j == dgg.d ? bsl.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, cso $$3, coy $$4) {
      csd $$5 = $$4.cd;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         ka<cua> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cwq> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cua $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cwq> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cwq $$12 = $$8.get($$11);
            cwq $$13 = $$6.get($$11).g();
            if (!cwq.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new agw($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, dcm $$1, boolean $$2) {
      this.c.b(new ahk($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new agv($$0, $$1));
   }

   public void a(cwq $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.h().i())) {
         this.c.b(new aia($$1, $$0));
      }
   }

   public void a(cwq $$0) {
      boolean $$1 = this.b.z instanceof fvb && !(this.b.z instanceof fvr);
      if (this.j.g() && !$$1 && !$$0.f() && this.c.a($$0.h().i())) {
         this.c.b(new aia(-1, $$0));
         this.b.t.H().a();
      }
   }

   public void b(coy $$0) {
      this.m();
      this.c.b(new ahm(ahm.a.f, ji.c, jn.a));
      $$0.fE();
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
      return this.b.t.bZ() && this.b.t.dk() instanceof bvb;
   }

   public boolean h() {
      return this.j == dgg.d;
   }

   @Nullable
   public dgg i() {
      return this.k;
   }

   public dgg j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(ji $$0, boolean $$1) {
      this.c.b(new ahi($$0, $$1));
   }

   public void a(bum $$0, boolean $$1) {
      this.c.b(new ahj($$0.ar(), $$1));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new agy($$0, $$1, $$2));
   }
}
