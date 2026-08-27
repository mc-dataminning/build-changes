import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fxa {
   private static final Logger a = LogUtils.getLogger();
   private final feb b;
   private final fws c;
   private io d = new io(-1, -1, -1);
   private ctq e = ctq.i;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private daw j = daw.e;
   @Nullable
   private daw k;
   private int l;

   public fxa(feb $$0, fws $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cly $$0) {
      this.j.a($$0.gd());
   }

   public void a(daw $$0, @Nullable daw $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.gd());
   }

   public void a(daw $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.gd());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(io $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         daz $$1 = this.b.r;
         drd $$2 = $$1.a_($$0);
         if (!this.b.s.eX().g().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dea $$3 = $$2.b();
            if ($$3 instanceof dhi && !this.b.s.gz()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cly)this.b.s);
               emw $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dba)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(io $$0, it $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            drd $$2 = this.b.r.a_($$0);
            this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ahi(ahi.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahi(ahi.a.b, this.d, $$1));
            }

            drd $$3 = this.b.r.a_($$0);
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

               return new ahi(ahi.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         drd $$0 = this.b.r.a_(this.d);
         this.b.aA().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ahi(ahi.a.b, this.d, it.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.al(), this.d, -1);
         this.b.s.gw();
      }
   }

   public boolean b(io $$0, it $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         drd $$2 = this.b.r.a_($$0);
         this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ahi(ahi.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         drd $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dP(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dln $$4 = $$3.w();
               this.b.aj().a(new gre($$4.f(), avj.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, grj.t(), $$0));
            }

            this.g++;
            this.b.aA().a(this.b.r, $$0, $$3, ayf.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new ahi(ahi.a.c, $$0, $$1, $$2);
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

   private void a(fwr $$0, fye $$1) {
      try (fyd $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         ze<age> $$4 = $$1.predict($$3);
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

   private boolean b(io $$0) {
      ctq $$1 = this.b.s.eX();
      return $$0.equals(this.d) && ctq.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.gc().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new ahr(this.l));
      }
   }

   public bpw a(gbm $$0, bpv $$1, eui $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bpw.e;
      } else {
         MutableObject<bpw> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aia($$1, $$2, $$4);
         });
         return (bpw)$$3.getValue();
      }
   }

   private bpw b(gbm $$0, bpv $$1, eui $$2) {
      io $$3 = $$2.a();
      ctq $$4 = $$0.b($$1);
      if (this.j == daw.d) {
         return bpw.a;
      } else {
         boolean $$5 = !$$0.eX().e() || !$$0.eY().e();
         boolean $$6 = $$0.fR() && $$5;
         if (!$$6) {
            drd $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bpw.e;
            }

            bpy $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bpy.d && $$1 == bpv.a) {
               bpw $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.e() && !$$0.gx().a($$4.g())) {
            cxd $$10 = new cxd($$0, $$1, $$2);
            bpw $$12;
            if (this.j.g()) {
               int $$11 = $$4.I();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bpw.d;
         }
      }
   }

   public bpw a(cly $$0, bpv $$1) {
      if (this.j == daw.d) {
         return bpw.d;
      } else {
         this.m();
         this.c.b(new ahc.b($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH(), $$0.aE()));
         MutableObject<bpw> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            aib $$4 = new aib($$1, $$3);
            ctq $$5 = $$0.b($$1);
            if ($$0.gx().a($$5.g())) {
               $$2.setValue(bpw.d);
               return $$4;
            } else {
               bpx<ctq> $$6 = $$5.a(this.b.r, $$0, $$1);
               ctq $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bpw)$$2.getValue();
      }
   }

   public gbm a(fwr $$0, avt $$1, fdo $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gbm a(fwr $$0, avt $$1, fdo $$2, boolean $$3, boolean $$4) {
      return new gbm(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cly $$0, brw $$1) {
      this.m();
      this.c.b(agz.a($$1, $$0.bV()));
      if (this.j != daw.d) {
         $$0.e($$1);
         $$0.gw();
      }
   }

   public bpw a(cly $$0, brw $$1, bpv $$2) {
      this.m();
      this.c.b(agz.a($$1, $$0.bV(), $$2));
      return this.j == daw.d ? bpw.d : $$0.a($$1, $$2);
   }

   public bpw a(cly $$0, brw $$1, euj $$2, bpv $$3) {
      this.m();
      eum $$4 = $$2.e().a($$1.du(), $$1.dw(), $$1.dA());
      this.c.b(agz.a($$1, $$0.bV(), $$3, $$4));
      return this.j == daw.d ? bpw.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cpe $$3, cly $$4) {
      cov $$5 = $$4.cb;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         jg<cqq> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<ctq> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cqq $$9 : $$6) {
            $$8.add($$9.g().s());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<ctq> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            ctq $$12 = $$8.get($$11);
            ctq $$13 = $$6.get($$11).g();
            if (!ctq.a($$12, $$13)) {
               $$10.put($$11, $$13.s());
            }
         }

         this.c.b(new agt($$0, $$5.j(), $$1, $$2, $$3, $$5.g().s(), $$10));
      }
   }

   public void a(int $$0, cxy<?> $$1, boolean $$2) {
      this.c.b(new ahg($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ags($$0, $$1));
   }

   public void a(ctq $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.g().i())) {
         this.c.b(new ahu($$1, $$0));
      }
   }

   public void a(ctq $$0) {
      if (this.j.g() && !$$0.e() && this.c.a($$0.g().i())) {
         this.c.b(new ahu(-1, $$0));
      }
   }

   public void b(cly $$0) {
      this.m();
      this.c.b(new ahi(ahi.a.f, io.c, it.a));
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
      return this.b.s.bR() && this.b.s.dc() instanceof bsj;
   }

   public boolean h() {
      return this.j == daw.d;
   }

   @Nullable
   public daw i() {
      return this.k;
   }

   public daw j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new ahf($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new agv($$0, $$1, $$2));
   }
}
