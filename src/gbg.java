import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gbg {
   private static final Logger a = LogUtils.getLogger();
   private final fib b;
   private final gay c;
   private je d = new je(-1, -1, -1);
   private cvl e = cvl.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private ddp j = ddp.e;
   @Nullable
   private ddp k;
   private int l;

   public gbg(fib $$0, gay $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cnp $$0) {
      this.j.a($$0.gd());
   }

   public void a(ddp $$0, @Nullable ddp $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gd());
   }

   public void a(ddp $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gd());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(je $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         dds $$1 = this.b.s;
         dua $$2 = $$1.a_($$0);
         if (!this.b.t.eW().h().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dgv $$3 = $$2.b();
            if ($$3 instanceof dkd && !this.b.t.gz()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cnp)this.b.t);
               eqb $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((ddt)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(je $$0, jj $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.A_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dua $$2 = this.b.s.a_($$0);
            this.b.aA().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new ahv(ahv.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahv(ahv.a.b, this.d, $$1));
            }

            dua $$3 = this.b.s.a_($$0);
            this.b.aA().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.l();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.dS(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.eW();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ap(), this.d, this.l());
               }

               return new ahv(ahv.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dua $$0 = this.b.s.a_(this.d);
         this.b.aA().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ahv(ahv.a.b, this.d, jj.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ap(), this.d, -1);
         this.b.t.gw();
      }
   }

   public boolean b(je $$0, jj $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.s.A_().a($$0)) {
         this.h = 5;
         dua $$2 = this.b.s.a_($$0);
         this.b.aA().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahv(ahv.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dua $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dS(), $$0);
            if (this.g % 4.0F == 0.0F) {
               doj $$4 = $$3.A();
               this.b.aj().a(new gzz($$4.f(), awe.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hae.t(), $$0));
            }

            this.g++;
            this.b.aA().a(this.b.s, $$0, $$3, azc.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new ahv(ahv.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.s.a(this.b.t.ap(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(gax $$0, gck $$1) {
      try (gcj $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zk<agq> $$4 = $$1.predict($$3);
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

   private boolean b(je $$0) {
      cvl $$1 = this.b.t.eW();
      return $$0.equals(this.d) && cvl.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.t.gc().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aif(this.l));
      }
   }

   public brk a(gfs $$0, brj $$1, eya $$2) {
      this.m();
      if (!this.b.s.A_().a($$2.a())) {
         return brk.d;
      } else {
         MutableObject<brk> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aio($$1, $$2, $$4);
         });
         return (brk)$$3.getValue();
      }
   }

   private brk b(gfs $$0, brj $$1, eya $$2) {
      je $$3 = $$2.a();
      cvl $$4 = $$0.b($$1);
      if (this.j == ddp.d) {
         return brk.c;
      } else {
         boolean $$5 = !$$0.eW().f() || !$$0.eX().f();
         boolean $$6 = $$0.fR() && $$5;
         if (!$$6) {
            dua $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return brk.d;
            }

            brk $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof brk.f && $$1 == brj.a) {
               brk $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gx().a($$4.h())) {
            cyy $$10 = new cyy($$0, $$1, $$2);
            brk $$12;
            if (this.j.g()) {
               int $$11 = $$4.J();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return brk.e;
         }
      }
   }

   public brk a(cnp $$0, brj $$1) {
      if (this.j == ddp.d) {
         return brk.e;
      } else {
         this.m();
         MutableObject<brk> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aip $$4 = new aip($$1, $$3, $$0.dI(), $$0.dK());
            cvl $$5 = $$0.b($$1);
            if ($$0.gx().a($$5.h())) {
               $$2.setValue(brk.e);
               return $$4;
            } else {
               brk $$6 = $$5.a(this.b.s, $$0, $$1);
               cvl $$8;
               if ($$6 instanceof brk.d $$7) {
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
         return (brk)$$2.getValue();
      }
   }

   public gfs a(gax $$0, awo $$1, fhm $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gfs a(gax $$0, awo $$1, fhm $$2, boolean $$3, boolean $$4) {
      return new gfs(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cnp $$0, btj $$1) {
      this.m();
      this.c.b(ahm.a($$1, $$0.ca()));
      if (this.j != ddp.d) {
         $$0.e($$1);
         $$0.gw();
      }
   }

   public brk a(cnp $$0, btj $$1, brj $$2) {
      this.m();
      this.c.b(ahm.a($$1, $$0.ca(), $$2));
      return (brk)(this.j == ddp.d ? brk.e : $$0.a($$1, $$2));
   }

   public brk a(cnp $$0, btj $$1, eyb $$2, brj $$3) {
      this.m();
      eye $$4 = $$2.e().a($$1.dx(), $$1.dz(), $$1.dD());
      this.c.b(ahm.a($$1, $$0.ca(), $$3, $$4));
      return (brk)(this.j == ddp.d ? brk.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, crb $$3, cnp $$4) {
      cqq $$5 = $$4.ca;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jw<csn> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cvl> $$8 = Lists.newArrayListWithCapacity($$7);

         for (csn $$9 : $$6) {
            $$8.add($$9.g().u());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cvl> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cvl $$12 = $$8.get($$11);
            cvl $$13 = $$6.get($$11).g();
            if (!cvl.a($$12, $$13)) {
               $$10.put($$11, $$13.u());
            }
         }

         this.c.b(new ahg($$0, $$5.j(), $$1, $$2, $$3, $$5.g().u(), $$10));
      }
   }

   public void a(int $$0, czv<?> $$1, boolean $$2) {
      this.c.b(new aht($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahf($$0, $$1));
   }

   public void a(cvl $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.h().i())) {
         this.c.b(new aii($$1, $$0));
      }
   }

   public void a(cvl $$0) {
      if (this.j.g() && !$$0.f() && this.c.a($$0.h().i())) {
         this.c.b(new aii(-1, $$0));
      }
   }

   public void b(cnp $$0) {
      this.m();
      this.c.b(new ahv(ahv.a.f, je.c, jj.a));
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
      return this.b.t.bW() && this.b.t.dg() instanceof bty;
   }

   public boolean h() {
      return this.j == ddp.d;
   }

   @Nullable
   public ddp i() {
      return this.k;
   }

   public ddp j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new ahs($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahi($$0, $$1, $$2));
   }
}
