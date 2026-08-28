import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fym {
   private static final Logger a = LogUtils.getLogger();
   private final ffn b;
   private final fye c;
   private ja d = new ja(-1, -1, -1);
   private cua e = cua.l;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dca j = dca.e;
   @Nullable
   private dca k;
   private int l;

   public fym(ffn $$0, fye $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cmh $$0) {
      this.j.a($$0.fZ());
   }

   public void a(dca $$0, @Nullable dca $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.fZ());
   }

   public void a(dca $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.fZ());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(ja $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         dcd $$1 = this.b.r;
         dsh $$2 = $$1.a_($$0);
         if (!this.b.s.eT().g().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dff $$3 = $$2.b();
            if ($$3 instanceof din && !this.b.s.gv()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cmh)this.b.s);
               eob $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dce)$$1, $$0, $$2);
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
            dsh $$2 = this.b.r.a_($$0);
            this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ahf(ahf.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahf(ahf.a.b, this.d, $$1));
            }

            dsh $$3 = this.b.r.a_($$0);
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
                  this.e = this.b.s.eT();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.al(), this.d, this.l());
               }

               return new ahf(ahf.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dsh $$0 = this.b.r.a_(this.d);
         this.b.aA().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ahf(ahf.a.b, this.d, jf.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.al(), this.d, -1);
         this.b.s.gs();
      }
   }

   public boolean b(ja $$0, jf $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dsh $$2 = this.b.r.a_($$0);
         this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ahf(ahf.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dsh $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dP(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dms $$4 = $$3.w();
               this.b.aj().a(new gsr($$4.f(), avg.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gsw.t(), $$0));
            }

            this.g++;
            this.b.aA().a(this.b.r, $$0, $$3, aye.a(this.f, 0.0F, 1.0F));
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

            this.b.r.a(this.b.s.al(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fyd $$0, fzr $$1) {
      try (fzq $$2 = $$0.a().a()) {
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
      cua $$1 = this.b.s.eT();
      return $$0.equals(this.d) && cua.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.fY().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aho(this.l));
      }
   }

   public bqd a(gcz $$0, bqc $$1, evv $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bqd.f;
      } else {
         MutableObject<bqd> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ahx($$1, $$2, $$4);
         });
         return (bqd)$$3.getValue();
      }
   }

   private bqd b(gcz $$0, bqc $$1, evv $$2) {
      ja $$3 = $$2.a();
      cua $$4 = $$0.b($$1);
      if (this.j == dca.d) {
         return bqd.a;
      } else {
         boolean $$5 = !$$0.eT().e() || !$$0.eU().e();
         boolean $$6 = $$0.fN() && $$5;
         if (!$$6) {
            dsh $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bqd.f;
            }

            bqf $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bqf.d && $$1 == bqc.a) {
               bqd $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.e() && !$$0.gt().a($$4.g())) {
            cxm $$10 = new cxm($$0, $$1, $$2);
            bqd $$12;
            if (this.j.g()) {
               int $$11 = $$4.H();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bqd.e;
         }
      }
   }

   public bqd a(cmh $$0, bqc $$1) {
      if (this.j == dca.d) {
         return bqd.e;
      } else {
         this.m();
         this.c.b(new agz.b($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH(), $$0.aE()));
         MutableObject<bqd> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            ahy $$4 = new ahy($$1, $$3);
            cua $$5 = $$0.b($$1);
            if ($$0.gt().a($$5.g())) {
               $$2.setValue(bqd.e);
               return $$4;
            } else {
               bqe<cua> $$6 = $$5.a(this.b.r, $$0, $$1);
               cua $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bqd)$$2.getValue();
      }
   }

   public gcz a(fyd $$0, avq $$1, ffa $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gcz a(fyd $$0, avq $$1, ffa $$2, boolean $$3, boolean $$4) {
      return new gcz(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cmh $$0, bsd $$1) {
      this.m();
      this.c.b(agw.a($$1, $$0.bV()));
      if (this.j != dca.d) {
         $$0.e($$1);
         $$0.gs();
      }
   }

   public bqd a(cmh $$0, bsd $$1, bqc $$2) {
      this.m();
      this.c.b(agw.a($$1, $$0.bV(), $$2));
      return this.j == dca.d ? bqd.e : $$0.a($$1, $$2);
   }

   public bqd a(cmh $$0, bsd $$1, evw $$2, bqc $$3) {
      this.m();
      evz $$4 = $$2.e().a($$1.du(), $$1.dw(), $$1.dA());
      this.c.b(agw.a($$1, $$0.bV(), $$3, $$4));
      return this.j == dca.d ? bqd.e : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cpo $$3, cmh $$4) {
      cpe $$5 = $$4.cd;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         js<cra> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cua> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cra $$9 : $$6) {
            $$8.add($$9.g().s());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cua> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cua $$12 = $$8.get($$11);
            cua $$13 = $$6.get($$11).g();
            if (!cua.a($$12, $$13)) {
               $$10.put($$11, $$13.s());
            }
         }

         this.c.b(new agq($$0, $$5.j(), $$1, $$2, $$3, $$5.g().s(), $$10));
      }
   }

   public void a(int $$0, cyi<?> $$1, boolean $$2) {
      this.c.b(new ahd($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new agp($$0, $$1));
   }

   public void a(cua $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.g().i())) {
         this.c.b(new ahr($$1, $$0));
      }
   }

   public void a(cua $$0) {
      if (this.j.g() && !$$0.e() && this.c.a($$0.g().i())) {
         this.c.b(new ahr(-1, $$0));
      }
   }

   public void b(cmh $$0) {
      this.m();
      this.c.b(new ahf(ahf.a.f, ja.c, jf.a));
      $$0.fw();
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
      return this.b.s.bR() && this.b.s.dc() instanceof bsr;
   }

   public boolean h() {
      return this.j == dca.d;
   }

   @Nullable
   public dca i() {
      return this.k;
   }

   public dca j() {
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
