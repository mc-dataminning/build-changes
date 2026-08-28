import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gbq {
   private static final Logger a = LogUtils.getLogger();
   private final fil b;
   private final gbi c;
   private je d = new je(-1, -1, -1);
   private cvp e = cvp.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private ded j = ded.e;
   @Nullable
   private ded k;
   private int l;

   public gbq(fil $$0, gbi $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cnu $$0) {
      this.j.a($$0.gd());
   }

   public void a(ded $$0, @Nullable ded $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gd());
   }

   public void a(ded $$0) {
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
         deg $$1 = this.b.s;
         duo $$2 = $$1.a_($$0);
         if (!this.b.t.eW().h().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dhj $$3 = $$2.b();
            if ($$3 instanceof dkr && !this.b.t.gz()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cnu)this.b.t);
               eqp $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((deh)$$1, $$0, $$2);
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
            duo $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new ahv(ahv.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahv(ahv.a.b, this.d, $$1));
            }

            duo $$3 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$3, 0.0F);
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
         duo $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
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
         duo $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahv(ahv.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         duo $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dS(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dox $$4 = $$3.A();
               this.b.ak().a(new haq($$4.f(), awf.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hav.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azd.a(this.f, 0.0F, 1.0F));
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

   private void a(gbh $$0, gcu $$1) {
      try (gct $$2 = $$0.a().a()) {
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
      cvp $$1 = this.b.t.eW();
      return $$0.equals(this.d) && cvp.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.t.gc().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aif(this.l));
      }
   }

   public brp a(ggc $$0, bro $$1, eyo $$2) {
      this.m();
      if (!this.b.s.A_().a($$2.b())) {
         return brp.d;
      } else {
         MutableObject<brp> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aio($$1, $$2, $$4);
         });
         return (brp)$$3.getValue();
      }
   }

   private brp b(ggc $$0, bro $$1, eyo $$2) {
      je $$3 = $$2.b();
      cvp $$4 = $$0.b($$1);
      if (this.j == ded.d) {
         return brp.c;
      } else {
         boolean $$5 = !$$0.eW().f() || !$$0.eX().f();
         boolean $$6 = $$0.fS() && $$5;
         if (!$$6) {
            duo $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return brp.d;
            }

            brp $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof brp.f && $$1 == bro.a) {
               brp $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gx().a($$4)) {
            czm $$10 = new czm($$0, $$1, $$2);
            brp $$12;
            if (this.j.g()) {
               int $$11 = $$4.J();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return brp.e;
         }
      }
   }

   public brp a(cnu $$0, bro $$1) {
      if (this.j == ded.d) {
         return brp.e;
      } else {
         this.m();
         MutableObject<brp> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aip $$4 = new aip($$1, $$3, $$0.dI(), $$0.dK());
            cvp $$5 = $$0.b($$1);
            if ($$0.gx().a($$5)) {
               $$2.setValue(brp.e);
               return $$4;
            } else {
               brp $$6 = $$5.a(this.b.s, $$0, $$1);
               cvp $$8;
               if ($$6 instanceof brp.d $$7) {
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
         return (brp)$$2.getValue();
      }
   }

   public ggc a(gbh $$0, awp $$1, fhw $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public ggc a(gbh $$0, awp $$1, fhw $$2, boolean $$3, boolean $$4) {
      return new ggc(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cnu $$0, bto $$1) {
      this.m();
      this.c.b(ahm.a($$1, $$0.ca()));
      if (this.j != ded.d) {
         $$0.e($$1);
         $$0.gw();
      }
   }

   public brp a(cnu $$0, bto $$1, bro $$2) {
      this.m();
      this.c.b(ahm.a($$1, $$0.ca(), $$2));
      return (brp)(this.j == ded.d ? brp.e : $$0.a($$1, $$2));
   }

   public brp a(cnu $$0, bto $$1, eyp $$2, bro $$3) {
      this.m();
      eys $$4 = $$2.g().a($$1.dx(), $$1.dz(), $$1.dD());
      this.c.b(ahm.a($$1, $$0.ca(), $$3, $$4));
      return (brp)(this.j == ded.d ? brp.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, crh $$3, cnu $$4) {
      cqw $$5 = $$4.bZ;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jw<cst> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cvp> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cst $$9 : $$6) {
            $$8.add($$9.g().u());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cvp> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cvp $$12 = $$8.get($$11);
            cvp $$13 = $$6.get($$11).g();
            if (!cvp.a($$12, $$13)) {
               $$10.put($$11, $$13.u());
            }
         }

         this.c.b(new ahg($$0, $$5.j(), $$1, $$2, $$3, $$5.g().u(), $$10));
      }
   }

   public void a(int $$0, daj<?> $$1, boolean $$2) {
      this.c.b(new aht($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahf($$0, $$1));
   }

   public void a(cvp $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.h().i())) {
         this.c.b(new aii($$1, $$0));
      }
   }

   public void a(cvp $$0) {
      if (this.j.g() && !$$0.f() && this.c.a($$0.h().i())) {
         this.c.b(new aii(-1, $$0));
      }
   }

   public void b(cnu $$0) {
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
      return this.b.t.bW() && this.b.t.dg() instanceof bud;
   }

   public boolean h() {
      return this.j == ded.d;
   }

   @Nullable
   public ded i() {
      return this.k;
   }

   public ded j() {
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
