import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gcg {
   private static final Logger a = LogUtils.getLogger();
   private final fja b;
   private final gby c;
   private jg d = new jg(-1, -1, -1);
   private cvx e = cvx.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private des j = des.e;
   @Nullable
   private des k;
   private int l;

   public gcg(fja $$0, gby $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(coh $$0) {
      this.j.a($$0.gl());
   }

   public void a(des $$0, @Nullable des $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gl());
   }

   public void a(des $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gl());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(jg $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         dev $$1 = this.b.s;
         dvd $$2 = $$1.a_($$0);
         if (!this.b.t.fb().h().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dhy $$3 = $$2.b();
            if ($$3 instanceof dlf && !this.b.t.gH()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (coh)this.b.t);
               ere $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dew)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(jg $$0, jl $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dvd $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new ahz(ahz.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahz(ahz.a.b, this.d, $$1));
            }

            dvd $$3 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.l();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.dX(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.fb();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ar(), this.d, this.l());
               }

               return new ahz(ahz.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dvd $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ahz(ahz.a.b, this.d, jl.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ar(), this.d, -1);
         this.b.t.gE();
      }
   }

   public boolean b(jg $$0, jl $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.s.C_().a($$0)) {
         this.h = 5;
         dvd $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahz(ahz.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dvd $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dX(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dpl $$4 = $$3.A();
               this.b.ak().a(new hbk($$4.f(), awl.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hbp.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azj.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new ahz(ahz.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.s.a(this.b.t.ar(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(gbx $$0, gdk $$1) {
      try (gdj $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zo<agu> $$4 = $$1.predict($$3);
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

   private boolean b(jg $$0) {
      cvx $$1 = this.b.t.fb();
      return $$0.equals(this.d) && cvx.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.t.gk().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aij(this.l));
      }
   }

   public bry a(ggs $$0, brx $$1, ezd $$2) {
      this.m();
      if (!this.b.s.C_().a($$2.b())) {
         return bry.d;
      } else {
         MutableObject<bry> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ais($$1, $$2, $$4);
         });
         return (bry)$$3.getValue();
      }
   }

   private bry b(ggs $$0, brx $$1, ezd $$2) {
      jg $$3 = $$2.b();
      cvx $$4 = $$0.b($$1);
      if (this.j == des.d) {
         return bry.c;
      } else {
         boolean $$5 = !$$0.fb().f() || !$$0.fc().f();
         boolean $$6 = $$0.ga() && $$5;
         if (!$$6) {
            dvd $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bry.d;
            }

            bry $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bry.f && $$1 == brx.a) {
               bry $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gF().a($$4)) {
            czo $$10 = new czo($$0, $$1, $$2);
            bry $$12;
            if (this.j.g()) {
               int $$11 = $$4.L();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bry.e;
         }
      }
   }

   public bry a(coh $$0, brx $$1) {
      if (this.j == des.d) {
         return bry.e;
      } else {
         this.m();
         MutableObject<bry> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            ait $$4 = new ait($$1, $$3, $$0.dN(), $$0.dP());
            cvx $$5 = $$0.b($$1);
            if ($$0.gF().a($$5)) {
               $$2.setValue(bry.e);
               return $$4;
            } else {
               bry $$6 = $$5.a(this.b.s, $$0, $$1);
               cvx $$8;
               if ($$6 instanceof bry.d $$7) {
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
         return (bry)$$2.getValue();
      }
   }

   public ggs a(gbx $$0, awv $$1, fil $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public ggs a(gbx $$0, awv $$1, fil $$2, boolean $$3, boolean $$4) {
      return new ggs(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(coh $$0, btz $$1) {
      this.m();
      this.c.b(ahq.a($$1, $$0.ce()));
      if (this.j != des.d) {
         $$0.e($$1);
         $$0.gE();
      }
   }

   public bry a(coh $$0, btz $$1, brx $$2) {
      this.m();
      this.c.b(ahq.a($$1, $$0.ce(), $$2));
      return (bry)(this.j == des.d ? bry.e : $$0.a($$1, $$2));
   }

   public bry a(coh $$0, btz $$1, eze $$2, brx $$3) {
      this.m();
      ezh $$4 = $$2.g().a($$1.dC(), $$1.dE(), $$1.dI());
      this.c.b(ahq.a($$1, $$0.ce(), $$3, $$4));
      return (bry)(this.j == des.d ? bry.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, cru $$3, coh $$4) {
      crj $$5 = $$4.ca;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jy<ctg> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cvx> $$8 = Lists.newArrayListWithCapacity($$7);

         for (ctg $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cvx> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cvx $$12 = $$8.get($$11);
            cvx $$13 = $$6.get($$11).g();
            if (!cvx.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new ahk($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, dal<?> $$1, boolean $$2) {
      this.c.b(new ahx($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahj($$0, $$1));
   }

   public void a(cvx $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.h().i())) {
         this.c.b(new aim($$1, $$0));
      }
   }

   public void a(cvx $$0) {
      boolean $$1 = this.b.z instanceof frh && !(this.b.z instanceof frw);
      if (this.j.g() && !$$1 && !$$0.f() && this.c.a($$0.h().i())) {
         this.c.b(new aim(-1, $$0));
      }
   }

   public void b(coh $$0) {
      this.m();
      this.c.b(new ahz(ahz.a.f, jg.c, jl.a));
      $$0.fG();
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
      return this.b.t.ca() && this.b.t.dl() instanceof buo;
   }

   public boolean h() {
      return this.j == des.d;
   }

   @Nullable
   public des i() {
      return this.k;
   }

   public des j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new ahw($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahm($$0, $$1, $$2));
   }
}
