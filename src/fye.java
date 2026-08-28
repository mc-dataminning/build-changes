import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fye {
   private static final Logger a = LogUtils.getLogger();
   private final fff b;
   private final fxw c;
   private iz d = new iz(-1, -1, -1);
   private cup e = cup.l;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dbv j = dbv.e;
   @Nullable
   private dbv k;
   private int l;

   public fye(fff $$0, fxw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cmx $$0) {
      this.j.a($$0.gd());
   }

   public void a(dbv $$0, @Nullable dbv $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.gd());
   }

   public void a(dbv $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.gd());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(iz $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         dby $$1 = this.b.r;
         dsc $$2 = $$1.a_($$0);
         if (!this.b.s.eX().g().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dez $$3 = $$2.b();
            if ($$3 instanceof dih && !this.b.s.gz()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cmx)this.b.s);
               env $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dbz)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(iz $$0, je $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dsc $$2 = this.b.r.a_($$0);
            this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new aia(aia.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new aia(aia.a.b, this.d, $$1));
            }

            dsc $$3 = this.b.r.a_($$0);
            this.b.aA().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dP(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eX();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.al(), this.d, this.l());
               }

               return new aia(aia.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dsc $$0 = this.b.r.a_(this.d);
         this.b.aA().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new aia(aia.a.b, this.d, je.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.al(), this.d, -1);
         this.b.s.gw();
      }
   }

   public boolean b(iz $$0, je $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dsc $$2 = this.b.r.a_($$0);
         this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new aia(aia.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dsc $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dP(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dmm $$4 = $$3.w();
               this.b.aj().a(new gsi($$4.f(), awb.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gsn.t(), $$0));
            }

            this.g++;
            this.b.aA().a(this.b.r, $$0, $$3, ayz.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new aia(aia.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.r.a(this.b.s.al(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fxv $$0, fzi $$1) {
      try (fzh $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zw<agw> $$4 = $$1.predict($$3);
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

   private boolean b(iz $$0) {
      cup $$1 = this.b.s.eX();
      return $$0.equals(this.d) && cup.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.gc().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aij(this.l));
      }
   }

   public bqu a(gcq $$0, bqt $$1, evn $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bqu.f;
      } else {
         MutableObject<bqu> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ais($$1, $$2, $$4);
         });
         return (bqu)$$3.getValue();
      }
   }

   private bqu b(gcq $$0, bqt $$1, evn $$2) {
      iz $$3 = $$2.a();
      cup $$4 = $$0.b($$1);
      if (this.j == dbv.d) {
         return bqu.a;
      } else {
         boolean $$5 = !$$0.eX().e() || !$$0.eY().e();
         boolean $$6 = $$0.fR() && $$5;
         if (!$$6) {
            dsc $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bqu.f;
            }

            bqw $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bqw.d && $$1 == bqt.a) {
               bqu $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.e() && !$$0.gx().a($$4.g())) {
            cyc $$10 = new cyc($$0, $$1, $$2);
            bqu $$12;
            if (this.j.g()) {
               int $$11 = $$4.I();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bqu.e;
         }
      }
   }

   public bqu a(cmx $$0, bqt $$1) {
      if (this.j == dbv.d) {
         return bqu.e;
      } else {
         this.m();
         this.c.b(new ahu.b($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH(), $$0.aE()));
         MutableObject<bqu> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            ait $$4 = new ait($$1, $$3);
            cup $$5 = $$0.b($$1);
            if ($$0.gx().a($$5.g())) {
               $$2.setValue(bqu.e);
               return $$4;
            } else {
               bqv<cup> $$6 = $$5.a(this.b.r, $$0, $$1);
               cup $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bqu)$$2.getValue();
      }
   }

   public gcq a(fxv $$0, awl $$1, fes $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gcq a(fxv $$0, awl $$1, fes $$2, boolean $$3, boolean $$4) {
      return new gcq(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cmx $$0, bsu $$1) {
      this.m();
      this.c.b(ahr.a($$1, $$0.bV()));
      if (this.j != dbv.d) {
         $$0.e($$1);
         $$0.gw();
      }
   }

   public bqu a(cmx $$0, bsu $$1, bqt $$2) {
      this.m();
      this.c.b(ahr.a($$1, $$0.bV(), $$2));
      return this.j == dbv.d ? bqu.e : $$0.a($$1, $$2);
   }

   public bqu a(cmx $$0, bsu $$1, evo $$2, bqt $$3) {
      this.m();
      evr $$4 = $$2.e().a($$1.du(), $$1.dw(), $$1.dA());
      this.c.b(ahr.a($$1, $$0.bV(), $$3, $$4));
      return this.j == dbv.d ? bqu.e : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cqd $$3, cmx $$4) {
      cpu $$5 = $$4.cb;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         jr<crp> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cup> $$8 = Lists.newArrayListWithCapacity($$7);

         for (crp $$9 : $$6) {
            $$8.add($$9.g().s());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cup> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cup $$12 = $$8.get($$11);
            cup $$13 = $$6.get($$11).g();
            if (!cup.a($$12, $$13)) {
               $$10.put($$11, $$13.s());
            }
         }

         this.c.b(new ahl($$0, $$5.j(), $$1, $$2, $$3, $$5.g().s(), $$10));
      }
   }

   public void a(int $$0, cyx<?> $$1, boolean $$2) {
      this.c.b(new ahy($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahk($$0, $$1));
   }

   public void a(cup $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.g().i())) {
         this.c.b(new aim($$1, $$0));
      }
   }

   public void a(cup $$0) {
      if (this.j.g() && !$$0.e() && this.c.a($$0.g().i())) {
         this.c.b(new aim(-1, $$0));
      }
   }

   public void b(cmx $$0) {
      this.m();
      this.c.b(new aia(aia.a.f, iz.c, je.a));
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
      return this.b.s.bR() && this.b.s.dc() instanceof bti;
   }

   public boolean h() {
      return this.j == dbv.d;
   }

   @Nullable
   public dbv i() {
      return this.k;
   }

   public dbv j() {
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
