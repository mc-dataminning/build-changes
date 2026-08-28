import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fyu {
   private static final Logger a = LogUtils.getLogger();
   private final ffw b;
   private final fym c;
   private ja d = new ja(-1, -1, -1);
   private cud e = cud.l;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dcd j = dcd.e;
   @Nullable
   private dcd k;
   private int l;

   public fyu(ffw $$0, fym $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cml $$0) {
      this.j.a($$0.gb());
   }

   public void a(dcd $$0, @Nullable dcd $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.gb());
   }

   public void a(dcd $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.gb());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(ja $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         dcg $$1 = this.b.r;
         dsl $$2 = $$1.a_($$0);
         if (!this.b.s.eV().g().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dfi $$3 = $$2.b();
            if ($$3 instanceof diq && !this.b.s.gx()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cml)this.b.s);
               eoj $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dch)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(ja $$0, jf $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dsl $$2 = this.b.r.a_($$0);
            this.b.ax().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ahf(ahf.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahf(ahf.a.b, this.d, $$1));
            }

            dsl $$3 = this.b.r.a_($$0);
            this.b.ax().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dR(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eV();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.an(), this.d, this.l());
               }

               return new ahf(ahf.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dsl $$0 = this.b.r.a_(this.d);
         this.b.ax().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ahf(ahf.a.b, this.d, jf.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.an(), this.d, -1);
         this.b.s.gu();
      }
   }

   public boolean b(ja $$0, jf $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dsl $$2 = this.b.r.a_($$0);
         this.b.ax().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ahf(ahf.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dsl $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dR(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dmv $$4 = $$3.w();
               this.b.aj().a(new gsz($$4.f(), avi.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gte.t(), $$0));
            }

            this.g++;
            this.b.ax().a(this.b.r, $$0, $$3, ayg.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new ahf(ahf.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.r.a(this.b.s.an(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fyl $$0, fzz $$1) {
      try (fzy $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zb<agb> $$4 = $$1.predict($$3);
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

   private boolean b(ja $$0) {
      cud $$1 = this.b.s.eV();
      return $$0.equals(this.d) && cud.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.ga().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aho(this.l));
      }
   }

   public bqh a(gdh $$0, bqg $$1, ewd $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bqh.f;
      } else {
         MutableObject<bqh> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ahx($$1, $$2, $$4);
         });
         return (bqh)$$3.getValue();
      }
   }

   private bqh b(gdh $$0, bqg $$1, ewd $$2) {
      ja $$3 = $$2.a();
      cud $$4 = $$0.b($$1);
      if (this.j == dcd.d) {
         return bqh.a;
      } else {
         boolean $$5 = !$$0.eV().e() || !$$0.eW().e();
         boolean $$6 = $$0.fP() && $$5;
         if (!$$6) {
            dsl $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bqh.f;
            }

            bqj $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bqj.d && $$1 == bqg.a) {
               bqh $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.e() && !$$0.gv().a($$4.g())) {
            cxp $$10 = new cxp($$0, $$1, $$2);
            bqh $$12;
            if (this.j.g()) {
               int $$11 = $$4.H();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bqh.e;
         }
      }
   }

   public bqh a(cml $$0, bqg $$1) {
      if (this.j == dcd.d) {
         return bqh.e;
      } else {
         this.m();
         MutableObject<bqh> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            ahy $$4 = new ahy($$1, $$3, $$0.dH(), $$0.dJ());
            cud $$5 = $$0.b($$1);
            if ($$0.gv().a($$5.g())) {
               $$2.setValue(bqh.e);
               return $$4;
            } else {
               bqi<cud> $$6 = $$5.a(this.b.r, $$0, $$1);
               cud $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bqh)$$2.getValue();
      }
   }

   public gdh a(fyl $$0, avs $$1, ffi $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gdh a(fyl $$0, avs $$1, ffi $$2, boolean $$3, boolean $$4) {
      return new gdh(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cml $$0, bsh $$1) {
      this.m();
      this.c.b(agw.a($$1, $$0.bX()));
      if (this.j != dcd.d) {
         $$0.e($$1);
         $$0.gu();
      }
   }

   public bqh a(cml $$0, bsh $$1, bqg $$2) {
      this.m();
      this.c.b(agw.a($$1, $$0.bX(), $$2));
      return this.j == dcd.d ? bqh.e : $$0.a($$1, $$2);
   }

   public bqh a(cml $$0, bsh $$1, ewe $$2, bqg $$3) {
      this.m();
      ewh $$4 = $$2.e().a($$1.dw(), $$1.dy(), $$1.dC());
      this.c.b(agw.a($$1, $$0.bX(), $$3, $$4));
      return this.j == dcd.d ? bqh.e : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cps $$3, cml $$4) {
      cpi $$5 = $$4.ce;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         js<cre> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cud> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cre $$9 : $$6) {
            $$8.add($$9.g().s());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cud> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cud $$12 = $$8.get($$11);
            cud $$13 = $$6.get($$11).g();
            if (!cud.a($$12, $$13)) {
               $$10.put($$11, $$13.s());
            }
         }

         this.c.b(new agq($$0, $$5.j(), $$1, $$2, $$3, $$5.g().s(), $$10));
      }
   }

   public void a(int $$0, cyl<?> $$1, boolean $$2) {
      this.c.b(new ahd($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new agp($$0, $$1));
   }

   public void a(cud $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.g().i())) {
         this.c.b(new ahr($$1, $$0));
      }
   }

   public void a(cud $$0) {
      if (this.j.g() && !$$0.e() && this.c.a($$0.g().i())) {
         this.c.b(new ahr(-1, $$0));
      }
   }

   public void b(cml $$0) {
      this.m();
      this.c.b(new ahf(ahf.a.f, ja.c, jf.a));
      $$0.fy();
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
      return this.b.s.bT() && this.b.s.de() instanceof bsv;
   }

   public boolean h() {
      return this.j == dcd.d;
   }

   @Nullable
   public dcd i() {
      return this.k;
   }

   public dcd j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new ahc($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ags($$0, $$1, $$2));
   }
}
