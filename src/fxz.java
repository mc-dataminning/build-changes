import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fxz {
   private static final Logger a = LogUtils.getLogger();
   private final ffa b;
   private final fxr c;
   private iz d = new iz(-1, -1, -1);
   private cuk e = cuk.l;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dbq j = dbq.e;
   @Nullable
   private dbq k;
   private int l;

   public fxz(ffa $$0, fxr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cms $$0) {
      this.j.a($$0.gd());
   }

   public void a(dbq $$0, @Nullable dbq $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.gd());
   }

   public void a(dbq $$0) {
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
         dbt $$1 = this.b.r;
         drx $$2 = $$1.a_($$0);
         if (!this.b.s.eX().g().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            deu $$3 = $$2.b();
            if ($$3 instanceof dic && !this.b.s.gz()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cms)this.b.s);
               enq $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dbu)$$1, $$0, $$2);
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
            drx $$2 = this.b.r.a_($$0);
            this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ahw(ahw.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahw(ahw.a.b, this.d, $$1));
            }

            drx $$3 = this.b.r.a_($$0);
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

               return new ahw(ahw.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         drx $$0 = this.b.r.a_(this.d);
         this.b.aA().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ahw(ahw.a.b, this.d, je.a));
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
         drx $$2 = this.b.r.a_($$0);
         this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ahw(ahw.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         drx $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dP(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dmh $$4 = $$3.w();
               this.b.aj().a(new gsd($$4.f(), avx.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gsi.t(), $$0));
            }

            this.g++;
            this.b.aA().a(this.b.r, $$0, $$3, ayu.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new ahw(ahw.a.c, $$0, $$1, $$2);
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

   private void a(fxq $$0, fzd $$1) {
      try (fzc $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zs<ags> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public void c() {
      this.m();
      if (this.c.l().i()) {
         this.c.l().b();
      } else {
         this.c.l().n();
      }
   }

   private boolean b(iz $$0) {
      cuk $$1 = this.b.s.eX();
      return $$0.equals(this.d) && cuk.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.gc().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aif(this.l));
      }
   }

   public bqp a(gcl $$0, bqo $$1, evi $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bqp.f;
      } else {
         MutableObject<bqp> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aio($$1, $$2, $$4);
         });
         return (bqp)$$3.getValue();
      }
   }

   private bqp b(gcl $$0, bqo $$1, evi $$2) {
      iz $$3 = $$2.a();
      cuk $$4 = $$0.b($$1);
      if (this.j == dbq.d) {
         return bqp.a;
      } else {
         boolean $$5 = !$$0.eX().e() || !$$0.eY().e();
         boolean $$6 = $$0.fR() && $$5;
         if (!$$6) {
            drx $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bqp.f;
            }

            bqr $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bqr.d && $$1 == bqo.a) {
               bqp $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.e() && !$$0.gx().a($$4.g())) {
            cxx $$10 = new cxx($$0, $$1, $$2);
            bqp $$12;
            if (this.j.g()) {
               int $$11 = $$4.I();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bqp.e;
         }
      }
   }

   public bqp a(cms $$0, bqo $$1) {
      if (this.j == dbq.d) {
         return bqp.e;
      } else {
         this.m();
         this.c.b(new ahq.b($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH(), $$0.aE()));
         MutableObject<bqp> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            aip $$4 = new aip($$1, $$3);
            cuk $$5 = $$0.b($$1);
            if ($$0.gx().a($$5.g())) {
               $$2.setValue(bqp.e);
               return $$4;
            } else {
               bqq<cuk> $$6 = $$5.a(this.b.r, $$0, $$1);
               cuk $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bqp)$$2.getValue();
      }
   }

   public gcl a(fxq $$0, awh $$1, fen $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gcl a(fxq $$0, awh $$1, fen $$2, boolean $$3, boolean $$4) {
      return new gcl(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cms $$0, bsp $$1) {
      this.m();
      this.c.b(ahn.a($$1, $$0.bV()));
      if (this.j != dbq.d) {
         $$0.e($$1);
         $$0.gw();
      }
   }

   public bqp a(cms $$0, bsp $$1, bqo $$2) {
      this.m();
      this.c.b(ahn.a($$1, $$0.bV(), $$2));
      return this.j == dbq.d ? bqp.e : $$0.a($$1, $$2);
   }

   public bqp a(cms $$0, bsp $$1, evj $$2, bqo $$3) {
      this.m();
      evm $$4 = $$2.e().a($$1.du(), $$1.dw(), $$1.dA());
      this.c.b(ahn.a($$1, $$0.bV(), $$3, $$4));
      return this.j == dbq.d ? bqp.e : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cpy $$3, cms $$4) {
      cpp $$5 = $$4.cb;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         jr<crk> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cuk> $$8 = Lists.newArrayListWithCapacity($$7);

         for (crk $$9 : $$6) {
            $$8.add($$9.g().s());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cuk> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cuk $$12 = $$8.get($$11);
            cuk $$13 = $$6.get($$11).g();
            if (!cuk.a($$12, $$13)) {
               $$10.put($$11, $$13.s());
            }
         }

         this.c.b(new ahh($$0, $$5.j(), $$1, $$2, $$3, $$5.g().s(), $$10));
      }
   }

   public void a(int $$0, cys<?> $$1, boolean $$2) {
      this.c.b(new ahu($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahg($$0, $$1));
   }

   public void a(cuk $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.g().i())) {
         this.c.b(new aii($$1, $$0));
      }
   }

   public void a(cuk $$0) {
      if (this.j.g() && !$$0.e() && this.c.a($$0.g().i())) {
         this.c.b(new aii(-1, $$0));
      }
   }

   public void b(cms $$0) {
      this.m();
      this.c.b(new ahw(ahw.a.f, iz.c, je.a));
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
      return this.b.s.bR() && this.b.s.dc() instanceof btd;
   }

   public boolean h() {
      return this.j == dbq.d;
   }

   @Nullable
   public dbq i() {
      return this.k;
   }

   public dbq j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new aht($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahj($$0, $$1, $$2));
   }
}
