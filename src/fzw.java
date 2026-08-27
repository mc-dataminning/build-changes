import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fzw {
   private static final Logger a = LogUtils.getLogger();
   private final fgj b;
   private final fzo c;
   private ir d = new ir(-1, -1, -1);
   private cuh e = cuh.i;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dbx j = dbx.e;
   @Nullable
   private dbx k;
   private int l;

   public fzw(fgj $$0, fzo $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cly $$0) {
      this.j.a($$0.gm());
   }

   public void a(dbx $$0, @Nullable dbx $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.gm());
   }

   public void a(dbx $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.gm());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(ir $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         dca $$1 = this.b.r;
         dtc $$2 = $$1.a_($$0);
         if (!this.b.s.fg().f().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dfc $$3 = $$2.b();
            if ($$3 instanceof dio && !this.b.s.gK()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cly)this.b.s);
               epe $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dcb)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(ir $$0, iw $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.D_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dtc $$2 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new aho(aho.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new aho(aho.a.b, this.d, $$1));
            }

            dtc $$3 = this.b.r.a_($$0);
            this.b.aB().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dU(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.fg();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.al(), this.d, this.l());
               }

               return new aho(aho.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dtc $$0 = this.b.r.a_(this.d);
         this.b.aB().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new aho(aho.a.b, this.d, iw.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.al(), this.d, -1);
         this.b.s.gH();
      }
   }

   public boolean b(ir $$0, iw $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.D_().a($$0)) {
         this.h = 5;
         dtc $$2 = this.b.r.a_($$0);
         this.b.aB().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new aho(aho.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dtc $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dU(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dnd $$4 = $$3.w();
               this.b.ak().a(new guh($$4.f(), avq.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gum.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.r, $$0, $$3, aym.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new aho(aho.a.c, $$0, $$1, $$2);
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

   private void a(fzn $$0, gba $$1) {
      try (gaz $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zl<agl> $$4 = $$1.predict($$3);
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

   private boolean b(ir $$0) {
      cuh $$1 = this.b.s.fg();
      return $$0.equals(this.d) && cuh.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.gl().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new ahx(this.l));
      }
   }

   public bqa a(gei $$0, bpz $$1, ewq $$2) {
      this.m();
      if (!this.b.r.D_().a($$2.a())) {
         return bqa.e;
      } else {
         MutableObject<bqa> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aig($$1, $$2, $$4);
         });
         return (bqa)$$3.getValue();
      }
   }

   private bqa b(gei $$0, bpz $$1, ewq $$2) {
      ir $$3 = $$2.a();
      cuh $$4 = $$0.b($$1);
      if (this.j == dbx.d) {
         return bqa.a;
      } else {
         boolean $$5 = !$$0.fg().d() || !$$0.fh().d();
         boolean $$6 = $$0.ga() && $$5;
         if (!$$6) {
            dtc $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bqa.e;
            }

            bqc $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bqc.d && $$1 == bpz.a) {
               bqa $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.d() && !$$0.gI().a($$4.f())) {
            cyf $$10 = new cyf($$0, $$1, $$2);
            bqa $$12;
            if (this.j.g()) {
               int $$11 = $$4.G();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bqa.d;
         }
      }
   }

   public bqa a(cly $$0, bpz $$1) {
      if (this.j == dbx.d) {
         return bqa.d;
      } else {
         this.m();
         this.c.b(new ahi.b($$0.dz(), $$0.dB(), $$0.dF(), $$0.dK(), $$0.dM(), $$0.aE()));
         MutableObject<bqa> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            aih $$4 = new aih($$1, $$3);
            cuh $$5 = $$0.b($$1);
            if ($$0.gI().a($$5.f())) {
               $$2.setValue(bqa.d);
               return $$4;
            } else {
               bqb<cuh> $$6 = $$5.a(this.b.r, $$0, $$1);
               cuh $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bqa)$$2.getValue();
      }
   }

   public gei a(fzn $$0, awa $$1, ffw $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gei a(fzn $$0, awa $$1, ffw $$2, boolean $$3, boolean $$4) {
      return new gei(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cly $$0, brv $$1) {
      this.m();
      this.c.b(ahf.a($$1, $$0.ca()));
      if (this.j != dbx.d) {
         $$0.e($$1);
         $$0.gH();
      }
   }

   public bqa a(cly $$0, brv $$1, bpz $$2) {
      this.m();
      this.c.b(ahf.a($$1, $$0.ca(), $$2));
      return this.j == dbx.d ? bqa.d : $$0.a($$1, $$2);
   }

   public bqa a(cly $$0, brv $$1, ewr $$2, bpz $$3) {
      this.m();
      ewu $$4 = $$2.e().a($$1.dz(), $$1.dB(), $$1.dF());
      this.c.b(ahf.a($$1, $$0.ca(), $$3, $$4));
      return this.j == dbx.d ? bqa.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cpp $$3, cly $$4) {
      cpg $$5 = $$4.cq;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         jj<cre> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cuh> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cre $$9 : $$6) {
            $$8.add($$9.g().r());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cuh> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cuh $$12 = $$8.get($$11);
            cuh $$13 = $$6.get($$11).g();
            if (!cuh.a($$12, $$13)) {
               $$10.put($$11, $$13.r());
            }
         }

         this.c.b(new agz($$0, $$5.j(), $$1, $$2, $$3, $$5.g().r(), $$10));
      }
   }

   public void a(int $$0, czc<?> $$1, boolean $$2) {
      this.c.b(new ahm($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new agy($$0, $$1));
   }

   public void a(cuh $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.f().m())) {
         this.c.b(new aia($$1, $$0));
      }
   }

   public void a(cuh $$0) {
      if (this.j.g() && !$$0.d() && this.c.a($$0.f().m())) {
         this.c.b(new aia(-1, $$0));
      }
   }

   public void b(cly $$0) {
      this.m();
      this.c.b(new aho(aho.a.f, ir.c, iw.a));
      $$0.fJ();
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
      return this.b.s.bW() && this.b.s.dh() instanceof bsh;
   }

   public boolean h() {
      return this.j == dbx.d;
   }

   @Nullable
   public dbx i() {
      return this.k;
   }

   public dbx j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new ahl($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahb($$0, $$1, $$2));
   }
}
