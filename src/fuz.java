import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fuz {
   private static final Logger a = LogUtils.getLogger();
   private final fby b;
   private final fur c;
   private id d = new id(-1, -1, -1);
   private crs e = crs.i;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private czd j = czd.e;
   @Nullable
   private czd k;
   private int l;

   public fuz(fby $$0, fur $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cka $$0) {
      this.j.a($$0.ga());
   }

   public void a(czd $$0, @Nullable czd $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.ga());
   }

   public void a(czd $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.ga());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(id $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         czg $$1 = this.b.r;
         dpi $$2 = $$1.a_($$0);
         if (!this.b.s.eU().f().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dch $$3 = $$2.b();
            if ($$3 instanceof dfp && !this.b.s.gw()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cka)this.b.s);
               elb $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((czh)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(id $$0, ij $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dpi $$2 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new agq(agq.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new agq(agq.a.b, this.d, $$1));
            }

            dpi $$3 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dM(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eU();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.aj(), this.d, this.l());
               }

               return new agq(agq.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dpi $$0 = this.b.r.a_(this.d);
         this.b.aB().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new agq(agq.a.b, this.d, ij.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.aj(), this.d, -1);
         this.b.s.gt();
      }
   }

   public boolean b(id $$0, ij $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dpi $$2 = this.b.r.a_($$0);
         this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new agq(agq.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dpi $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dM(), $$0);
            if (this.g % 4.0F == 0.0F) {
               djt $$4 = $$3.w();
               this.b.ak().a(new gpa($$4.f(), aup.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gpf.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.r, $$0, $$3, axm.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new agq(agq.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.r.a(this.b.s.aj(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fuq $$0, fwd $$1) {
      try (fwc $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         yp<afn> $$4 = $$1.predict($$3);
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

   private boolean b(id $$0) {
      crs $$1 = this.b.s.eU();
      return $$0.equals(this.d) && crs.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.fZ().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new agz(this.l));
      }
   }

   public bof a(fzk $$0, boe $$1, esf $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bof.e;
      } else {
         MutableObject<bof> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ahi($$1, $$2, $$4);
         });
         return (bof)$$3.getValue();
      }
   }

   private bof b(fzk $$0, boe $$1, esf $$2) {
      id $$3 = $$2.a();
      crs $$4 = $$0.b($$1);
      if (this.j == czd.d) {
         return bof.a;
      } else {
         boolean $$5 = !$$0.eU().d() || !$$0.eV().d();
         boolean $$6 = $$0.fO() && $$5;
         if (!$$6) {
            dpi $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bof.e;
            }

            boh $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == boh.d && $$1 == boe.a) {
               bof $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.d() && !$$0.gu().a($$4.f())) {
            cuz $$10 = new cuz($$0, $$1, $$2);
            bof $$12;
            if (this.j.g()) {
               int $$11 = $$4.G();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bof.d;
         }
      }
   }

   public bof a(cka $$0, boe $$1) {
      if (this.j == czd.d) {
         return bof.d;
      } else {
         this.m();
         this.c.b(new agk.b($$0.dr(), $$0.dt(), $$0.dx(), $$0.dC(), $$0.dE(), $$0.aC()));
         MutableObject<bof> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            ahj $$4 = new ahj($$1, $$3);
            crs $$5 = $$0.b($$1);
            if ($$0.gu().a($$5.f())) {
               $$2.setValue(bof.d);
               return $$4;
            } else {
               bog<crs> $$6 = $$5.a(this.b.r, $$0, $$1);
               crs $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bof)$$2.getValue();
      }
   }

   public fzk a(fuq $$0, ava $$1, fbl $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fzk a(fuq $$0, ava $$1, fbl $$2, boolean $$3, boolean $$4) {
      return new fzk(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cka $$0, bqa $$1) {
      this.m();
      this.c.b(agh.a($$1, $$0.bS()));
      if (this.j != czd.d) {
         $$0.e($$1);
         $$0.gt();
      }
   }

   public bof a(cka $$0, bqa $$1, boe $$2) {
      this.m();
      this.c.b(agh.a($$1, $$0.bS(), $$2));
      return this.j == czd.d ? bof.d : $$0.a($$1, $$2);
   }

   public bof a(cka $$0, bqa $$1, esg $$2, boe $$3) {
      this.m();
      esj $$4 = $$2.e().a($$1.dr(), $$1.dt(), $$1.dx());
      this.c.b(agh.a($$1, $$0.bS(), $$3, $$4));
      return this.j == czd.d ? bof.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cnf $$3, cka $$4) {
      cmw $$5 = $$4.ca;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         iw<cos> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<crs> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cos $$9 : $$6) {
            $$8.add($$9.g().r());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<crs> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            crs $$12 = $$8.get($$11);
            crs $$13 = $$6.get($$11).g();
            if (!crs.a($$12, $$13)) {
               $$10.put($$11, $$13.r());
            }
         }

         this.c.b(new agb($$0, $$5.j(), $$1, $$2, $$3, $$5.g().r(), $$10));
      }
   }

   public void a(int $$0, cvu<?> $$1, boolean $$2) {
      this.c.b(new ago($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new aga($$0, $$1));
   }

   public void a(crs $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.f().m())) {
         this.c.b(new ahc($$1, $$0));
      }
   }

   public void a(crs $$0) {
      if (this.j.g() && !$$0.d() && this.c.a($$0.f().m())) {
         this.c.b(new ahc(-1, $$0));
      }
   }

   public void b(cka $$0) {
      this.m();
      this.c.b(new agq(agq.a.f, id.c, ij.a));
      $$0.fx();
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
      return this.b.s.bO() && this.b.s.cZ() instanceof bqm;
   }

   public boolean h() {
      return this.j == czd.d;
   }

   @Nullable
   public czd i() {
      return this.k;
   }

   public czd j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new agn($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new agd($$0, $$1, $$2));
   }
}
