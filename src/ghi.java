import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ghi {
   private static final Logger a = LogUtils.getLogger();
   private final fmg b;
   private final ggz c;
   private ji d = new ji(-1, -1, -1);
   private cxh e = cxh.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dgw j = dgw.e;
   @Nullable
   private dgw k;
   private int l;

   public ghi(fmg $$0, ggz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cpr $$0) {
      this.j.a($$0.gm());
   }

   public void a(dgw $$0, @Nullable dgw $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gm());
   }

   public void a(dgw $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gm());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(ji $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         dgz $$1 = this.b.s;
         dxq $$2 = $$1.a_($$0);
         if (!this.b.t.eZ().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dke $$3 = $$2.b();
            if ($$3 instanceof dno && !this.b.t.gI()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cpr)this.b.t);
               etw $$4 = $$1.b_($$0);
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
      } else if (!this.b.s.A_().a($$0)) {
         return false;
      } else {
         if (this.b.t.gm().d) {
            dxq $$2 = this.b.s.a_($$0);
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

            dxq $$3 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.l();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.dU(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.eZ();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ar(), this.d, this.k());
               }

               return new ahl(ahl.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dxq $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ahl(ahl.a.b, this.d, jn.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ar(), this.d, -1);
         this.b.t.gG();
      }
   }

   public boolean b(ji $$0, jn $$1) {
      this.l();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.b.t.gm().d && this.b.s.A_().a($$0)) {
         this.h = 5;
         dxq $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahl(ahl.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dxq $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dU(), $$0);
            if (this.g % 4.0F == 0.0F) {
               drx $$4 = $$3.A();
               this.b.ak().a(new hjj($$4.f(), awb.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hjo.t(), $$0));
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

            this.b.s.a(this.b.t.ar(), this.d, this.k());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(ggy $$0, gim $$1) {
      try (gil $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         yw<agf> $$4 = $$1.predict($$3);
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

   private boolean b(ji $$0) {
      cxh $$1 = this.b.t.eZ();
      return $$0.equals(this.d) && cxh.c($$1, this.e);
   }

   private void l() {
      int $$0 = this.b.t.gl().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new ahw(this.l));
      }
   }

   public bsy a(glv $$0, bsx $$1, fbt $$2) {
      this.l();
      if (!this.b.s.A_().a($$2.b())) {
         return bsy.d;
      } else {
         MutableObject<bsy> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aif($$1, $$2, $$4);
         });
         return (bsy)$$3.getValue();
      }
   }

   private bsy b(glv $$0, bsx $$1, fbt $$2) {
      ji $$3 = $$2.b();
      cxh $$4 = $$0.b($$1);
      if (this.j == dgw.d) {
         return bsy.c;
      } else {
         boolean $$5 = !$$0.eZ().f() || !$$0.fa().f();
         boolean $$6 = $$0.ga() && $$5;
         if (!$$6) {
            dxq $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().k())) {
               return bsy.d;
            }

            bsy $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bsy.f && $$1 == bsx.a) {
               bsy $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gH().a($$4)) {
            daz $$10 = new daz($$0, $$1, $$2);
            bsy $$12;
            if ($$0.fX()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bsy.e;
         }
      }
   }

   public bsy a(cpr $$0, bsx $$1) {
      if (this.j == dgw.d) {
         return bsy.e;
      } else {
         this.l();
         MutableObject<bsy> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aig $$4 = new aig($$1, $$3, $$0.dK(), $$0.dM());
            cxh $$5 = $$0.b($$1);
            if ($$0.gH().a($$5)) {
               $$2.setValue(bsy.e);
               return $$4;
            } else {
               bsy $$6 = $$5.a(this.b.s, $$0, $$1);
               cxh $$8;
               if ($$6 instanceof bsy.d $$7) {
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
         return (bsy)$$2.getValue();
      }
   }

   public glv a(ggy $$0, awl $$1, flr $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public glv a(ggy $$0, awl $$1, flr $$2, boolean $$3, boolean $$4) {
      return new glv(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cpr $$0, bva $$1) {
      this.l();
      this.c.b(ahb.a($$1, $$0.cc()));
      if (this.j != dgw.d) {
         $$0.e($$1);
         $$0.gG();
      }
   }

   public bsy a(cpr $$0, bva $$1, bsx $$2) {
      this.l();
      this.c.b(ahb.a($$1, $$0.cc(), $$2));
      return (bsy)(this.j == dgw.d ? bsy.e : $$0.a($$1, $$2));
   }

   public bsy a(cpr $$0, bva $$1, fbu $$2, bsx $$3) {
      this.l();
      fbx $$4 = $$2.g().a($$1.dz(), $$1.dB(), $$1.dF());
      this.c.b(ahb.a($$1, $$0.cc(), $$3, $$4));
      return (bsy)(this.j == dgw.d ? bsy.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, cth $$3, cpr $$4) {
      csw $$5 = $$4.bQ;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         ka<cut> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cxh> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cut $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cxh> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cxh $$12 = $$8.get($$11);
            cxh $$13 = $$6.get($$11).g();
            if (!cxh.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new agv($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, ddd $$1, boolean $$2) {
      this.c.b(new ahj($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new agu($$0, $$1));
   }

   public void a(cxh $$0, int $$1) {
      if (this.b.t.fX() && this.c.a($$0.h().k())) {
         this.c.b(new ahz($$1, $$0));
      }
   }

   public void a(cxh $$0) {
      boolean $$1 = this.b.z instanceof fvx && !(this.b.z instanceof fwn);
      if (this.b.t.fX() && !$$1 && !$$0.f() && this.c.a($$0.h().k())) {
         this.c.b(new ahz(-1, $$0));
         this.b.t.E().a();
      }
   }

   public void b(cpr $$0) {
      this.l();
      this.c.b(new ahl(ahl.a.f, ji.c, jn.a));
      $$0.fG();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.b.t.bY() && this.b.t.dj() instanceof bvq;
   }

   public boolean g() {
      return this.j == dgw.d;
   }

   @Nullable
   public dgw h() {
      return this.k;
   }

   public dgw i() {
      return this.j;
   }

   public boolean j() {
      return this.i;
   }

   public int k() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(ji $$0, boolean $$1) {
      this.c.b(new ahh($$0, $$1));
   }

   public void a(bva $$0, boolean $$1) {
      this.c.b(new ahi($$0.ar(), $$1));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new agx($$0, $$1, $$2));
   }
}
