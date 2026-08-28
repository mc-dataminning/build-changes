import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fyf {
   private static final Logger a = LogUtils.getLogger();
   private final ffg b;
   private final fxx c;
   private iz d = new iz(-1, -1, -1);
   private cuq e = cuq.l;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dbw j = dbw.e;
   @Nullable
   private dbw k;
   private int l;

   public fyf(ffg $$0, fxx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cmy $$0) {
      this.j.a($$0.gd());
   }

   public void a(dbw $$0, @Nullable dbw $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.gd());
   }

   public void a(dbw $$0) {
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
         dbz $$1 = this.b.r;
         dsd $$2 = $$1.a_($$0);
         if (!this.b.s.eX().g().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dfa $$3 = $$2.b();
            if ($$3 instanceof dii && !this.b.s.gz()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cmy)this.b.s);
               enw $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dca)$$1, $$0, $$2);
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
            dsd $$2 = this.b.r.a_($$0);
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

            dsd $$3 = this.b.r.a_($$0);
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
         dsd $$0 = this.b.r.a_(this.d);
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
         dsd $$2 = this.b.r.a_($$0);
         this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new aia(aia.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dsd $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dP(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dmn $$4 = $$3.w();
               this.b.aj().a(new gsj($$4.f(), awb.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gso.t(), $$0));
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

   private void a(fxw $$0, fzj $$1) {
      try (fzi $$2 = $$0.a().a()) {
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
      cuq $$1 = this.b.s.eX();
      return $$0.equals(this.d) && cuq.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.gc().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aij(this.l));
      }
   }

   public bqv a(gcr $$0, bqu $$1, evo $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bqv.f;
      } else {
         MutableObject<bqv> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ais($$1, $$2, $$4);
         });
         return (bqv)$$3.getValue();
      }
   }

   private bqv b(gcr $$0, bqu $$1, evo $$2) {
      iz $$3 = $$2.a();
      cuq $$4 = $$0.b($$1);
      if (this.j == dbw.d) {
         return bqv.a;
      } else {
         boolean $$5 = !$$0.eX().e() || !$$0.eY().e();
         boolean $$6 = $$0.fR() && $$5;
         if (!$$6) {
            dsd $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bqv.f;
            }

            bqx $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bqx.d && $$1 == bqu.a) {
               bqv $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.e() && !$$0.gx().a($$4.g())) {
            cyd $$10 = new cyd($$0, $$1, $$2);
            bqv $$12;
            if (this.j.g()) {
               int $$11 = $$4.I();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bqv.e;
         }
      }
   }

   public bqv a(cmy $$0, bqu $$1) {
      if (this.j == dbw.d) {
         return bqv.e;
      } else {
         this.m();
         this.c.b(new ahu.b($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH(), $$0.aE()));
         MutableObject<bqv> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            ait $$4 = new ait($$1, $$3);
            cuq $$5 = $$0.b($$1);
            if ($$0.gx().a($$5.g())) {
               $$2.setValue(bqv.e);
               return $$4;
            } else {
               bqw<cuq> $$6 = $$5.a(this.b.r, $$0, $$1);
               cuq $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bqv)$$2.getValue();
      }
   }

   public gcr a(fxw $$0, awl $$1, fet $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gcr a(fxw $$0, awl $$1, fet $$2, boolean $$3, boolean $$4) {
      return new gcr(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cmy $$0, bsv $$1) {
      this.m();
      this.c.b(ahr.a($$1, $$0.bV()));
      if (this.j != dbw.d) {
         $$0.e($$1);
         $$0.gw();
      }
   }

   public bqv a(cmy $$0, bsv $$1, bqu $$2) {
      this.m();
      this.c.b(ahr.a($$1, $$0.bV(), $$2));
      return this.j == dbw.d ? bqv.e : $$0.a($$1, $$2);
   }

   public bqv a(cmy $$0, bsv $$1, evp $$2, bqu $$3) {
      this.m();
      evs $$4 = $$2.e().a($$1.du(), $$1.dw(), $$1.dA());
      this.c.b(ahr.a($$1, $$0.bV(), $$3, $$4));
      return this.j == dbw.d ? bqv.e : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cqe $$3, cmy $$4) {
      cpv $$5 = $$4.cb;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         jr<crq> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cuq> $$8 = Lists.newArrayListWithCapacity($$7);

         for (crq $$9 : $$6) {
            $$8.add($$9.g().s());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cuq> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cuq $$12 = $$8.get($$11);
            cuq $$13 = $$6.get($$11).g();
            if (!cuq.a($$12, $$13)) {
               $$10.put($$11, $$13.s());
            }
         }

         this.c.b(new ahl($$0, $$5.j(), $$1, $$2, $$3, $$5.g().s(), $$10));
      }
   }

   public void a(int $$0, cyy<?> $$1, boolean $$2) {
      this.c.b(new ahy($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahk($$0, $$1));
   }

   public void a(cuq $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.g().i())) {
         this.c.b(new aim($$1, $$0));
      }
   }

   public void a(cuq $$0) {
      if (this.j.g() && !$$0.e() && this.c.a($$0.g().i())) {
         this.c.b(new aim(-1, $$0));
      }
   }

   public void b(cmy $$0) {
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
      return this.b.s.bR() && this.b.s.dc() instanceof btj;
   }

   public boolean h() {
      return this.j == dbw.d;
   }

   @Nullable
   public dbw i() {
      return this.k;
   }

   public dbw j() {
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
