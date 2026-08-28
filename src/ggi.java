import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ggi {
   private static final Logger a = LogUtils.getLogger();
   private final flj b;
   private final gfz c;
   private ji d = new ji(-1, -1, -1);
   private cwp e = cwp.j;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dgf j = dgf.e;
   @Nullable
   private dgf k;
   private int l;

   public ggi(flj $$0, gfz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cox $$0) {
      this.j.a($$0.gj());
   }

   public void a(dgf $$0, @Nullable dgf $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gj());
   }

   public void a(dgf $$0) {
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
         dgi $$1 = this.b.s;
         dwx $$2 = $$1.a_($$0);
         if (!this.b.t.eZ().h().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            djm $$3 = $$2.b();
            if ($$3 instanceof dmv && !this.b.t.gG()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cox)this.b.t);
               esz $$4 = $$1.b_($$0);
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
            dwx $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new ahl(ahl.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahl(ahl.a.b, this.d, $$1));
            }

            dwx $$3 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.l();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.dW(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.eZ();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ar(), this.d, this.l());
               }

               return new ahl(ahl.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dwx $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ahl(ahl.a.b, this.d, jn.a));
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
         dwx $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahl(ahl.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dwx $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dW(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dre $$4 = $$3.A();
               this.b.ak().a(new hid($$4.f(), awb.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hii.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, ayz.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new ahl(ahl.a.c, $$0, $$1, $$2);
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

   private void a(gfy $$0, ghm $$1) {
      try (ghl $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         yv<agf> $$4 = $$1.predict($$3);
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
      cwp $$1 = this.b.t.eZ();
      return $$0.equals(this.d) && cwp.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.t.gi().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new ahw(this.l));
      }
   }

   public bsj a(gkv $$0, bsi $$1, faw $$2) {
      this.m();
      if (!this.b.s.F_().a($$2.b())) {
         return bsj.d;
      } else {
         MutableObject<bsj> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aif($$1, $$2, $$4);
         });
         return (bsj)$$3.getValue();
      }
   }

   private bsj b(gkv $$0, bsi $$1, faw $$2) {
      ji $$3 = $$2.b();
      cwp $$4 = $$0.b($$1);
      if (this.j == dgf.d) {
         return bsj.c;
      } else {
         boolean $$5 = !$$0.eZ().f() || !$$0.fa().f();
         boolean $$6 = $$0.fY() && $$5;
         if (!$$6) {
            dwx $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bsj.d;
            }

            bsj $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bsj.f && $$1 == bsi.a) {
               bsj $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gE().a($$4)) {
            dai $$10 = new dai($$0, $$1, $$2);
            bsj $$12;
            if (this.j.g()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bsj.e;
         }
      }
   }

   public bsj a(cox $$0, bsi $$1) {
      if (this.j == dgf.d) {
         return bsj.e;
      } else {
         this.m();
         MutableObject<bsj> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aig $$4 = new aig($$1, $$3, $$0.dM(), $$0.dO());
            cwp $$5 = $$0.b($$1);
            if ($$0.gE().a($$5)) {
               $$2.setValue(bsj.e);
               return $$4;
            } else {
               bsj $$6 = $$5.a(this.b.s, $$0, $$1);
               cwp $$8;
               if ($$6 instanceof bsj.d $$7) {
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
         return (bsj)$$2.getValue();
      }
   }

   public gkv a(gfy $$0, awl $$1, fku $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gkv a(gfy $$0, awl $$1, fku $$2, boolean $$3, boolean $$4) {
      return new gkv(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cox $$0, buk $$1) {
      this.m();
      this.c.b(ahb.a($$1, $$0.cd()));
      if (this.j != dgf.d) {
         $$0.e($$1);
         $$0.gD();
      }
   }

   public bsj a(cox $$0, buk $$1, bsi $$2) {
      this.m();
      this.c.b(ahb.a($$1, $$0.cd(), $$2));
      return (bsj)(this.j == dgf.d ? bsj.e : $$0.a($$1, $$2));
   }

   public bsj a(cox $$0, buk $$1, fax $$2, bsi $$3) {
      this.m();
      fba $$4 = $$2.g().a($$1.dB(), $$1.dD(), $$1.dH());
      this.c.b(ahb.a($$1, $$0.cd(), $$3, $$4));
      return (bsj)(this.j == dgf.d ? bsj.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, csn $$3, cox $$4) {
      csc $$5 = $$4.cd;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         ka<ctz> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cwp> $$8 = Lists.newArrayListWithCapacity($$7);

         for (ctz $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cwp> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cwp $$12 = $$8.get($$11);
            cwp $$13 = $$6.get($$11).g();
            if (!cwp.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new agv($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, dcl $$1, boolean $$2) {
      this.c.b(new ahj($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new agu($$0, $$1));
   }

   public void a(cwp $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.h().i())) {
         this.c.b(new ahz($$1, $$0));
      }
   }

   public void a(cwp $$0) {
      boolean $$1 = this.b.z instanceof fuz && !(this.b.z instanceof fvp);
      if (this.j.g() && !$$1 && !$$0.f() && this.c.a($$0.h().i())) {
         this.c.b(new ahz(-1, $$0));
         this.b.t.H().a();
      }
   }

   public void b(cox $$0) {
      this.m();
      this.c.b(new ahl(ahl.a.f, ji.c, jn.a));
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
      return this.b.t.bZ() && this.b.t.dl() instanceof buz;
   }

   public boolean h() {
      return this.j == dgf.d;
   }

   @Nullable
   public dgf i() {
      return this.k;
   }

   public dgf j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(ji $$0, boolean $$1) {
      this.c.b(new ahh($$0, $$1));
   }

   public void a(buk $$0, boolean $$1) {
      this.c.b(new ahi($$0.ar(), $$1));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new agx($$0, $$1, $$2));
   }
}
