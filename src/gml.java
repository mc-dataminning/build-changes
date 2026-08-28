import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gml {
   private static final Logger a = LogUtils.getLogger();
   private final frd b;
   private final gmc c;
   private iv d = new iv(-1, -1, -1);
   private czy e = czy.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dju j = dju.e;
   @Nullable
   private dju k;
   private int l;

   public gml(frd $$0, gmc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(crx $$0) {
      this.j.a($$0.gk());
   }

   public void a(dju $$0, @Nullable dju $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gk());
   }

   public void a(dju $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gk());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(iv $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         djx $$1 = this.b.s;
         ebe $$2 = $$1.a_($$0);
         if (!this.b.t.fb().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dnc $$3 = $$2.b();
            if ($$3 instanceof dqo && !this.b.t.gG()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (crx)this.b.t);
               exo $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a($$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(iv $$0, jb $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.E_().a($$0)) {
         return false;
      } else {
         if (this.b.t.gk().d) {
            ebe $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new ahx(ahx.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahx(ahx.a.b, this.d, $$1));
            }

            ebe $$3 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.l();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.dV(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.fb();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ao(), this.d, this.k());
               }

               return new ahx(ahx.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         ebe $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ahx(ahx.a.b, this.d, jb.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ao(), this.d, -1);
         this.b.t.gE();
      }
   }

   public boolean b(iv $$0, jb $$1) {
      this.l();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.b.t.gk().d && this.b.s.E_().a($$0)) {
         this.h = 5;
         ebe $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahx(ahx.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         ebe $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dV(), $$0);
            if (this.g % 4.0F == 0.0F) {
               duz $$4 = $$3.A();
               this.b.ak().a(new hos($$4.f(), awq.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hox.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azo.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new ahx(ahx.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.s.a(this.b.t.ao(), this.d, this.k());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(gmb $$0, gnp $$1) {
      try (gno $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zh<agr> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public void c() {
      this.l();
      if (this.c.k().i()) {
         this.c.k().b();
      } else {
         this.c.k().n();
      }
   }

   private boolean b(iv $$0) {
      czy $$1 = this.b.t.fb();
      return $$0.equals(this.d) && czy.c($$1, this.e);
   }

   private void l() {
      int $$0 = this.b.t.gj().f();
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aii(this.l));
      }
   }

   public bur a(gqz $$0, buq $$1, ffm $$2) {
      this.l();
      if (!this.b.s.E_().a($$2.b())) {
         return bur.d;
      } else {
         MutableObject<bur> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ait($$1, $$2, $$4);
         });
         return (bur)$$3.getValue();
      }
   }

   private bur b(gqz $$0, buq $$1, ffm $$2) {
      iv $$3 = $$2.b();
      czy $$4 = $$0.b($$1);
      if (this.j == dju.d) {
         return bur.c;
      } else {
         boolean $$5 = !$$0.fb().f() || !$$0.fc().f();
         boolean $$6 = $$0.fY() && $$5;
         if (!$$6) {
            ebe $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().k())) {
               return bur.d;
            }

            bur $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bur.f && $$1 == buq.a) {
               bur $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gF().a($$4)) {
            ddt $$10 = new ddt($$0, $$1, $$2);
            bur $$12;
            if ($$0.fV()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bur.e;
         }
      }
   }

   public bur a(crx $$0, buq $$1) {
      if (this.j == dju.d) {
         return bur.e;
      } else {
         this.l();
         MutableObject<bur> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aiu $$4 = new aiu($$1, $$3, $$0.dL(), $$0.dN());
            czy $$5 = $$0.b($$1);
            if ($$0.gF().a($$5)) {
               $$2.setValue(bur.e);
               return $$4;
            } else {
               bur $$6 = $$5.a(this.b.s, $$0, $$1);
               czy $$8;
               if ($$6 instanceof bur.d $$7) {
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
         return (bur)$$2.getValue();
      }
   }

   public gqz a(gmb $$0, axa $$1, fqo $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gqz a(gmb $$0, axa $$1, fqo $$2, boolean $$3, boolean $$4) {
      return new gqz(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(crx $$0, bwt $$1) {
      this.l();
      this.c.b(ahn.a($$1, $$0.cc()));
      if (this.j != dju.d) {
         $$0.e($$1);
         $$0.gE();
      }
   }

   public bur a(crx $$0, bwt $$1, buq $$2) {
      this.l();
      this.c.b(ahn.a($$1, $$0.cc(), $$2));
      return (bur)(this.j == dju.d ? bur.e : $$0.a($$1, $$2));
   }

   public bur a(crx $$0, bwt $$1, ffn $$2, buq $$3) {
      this.l();
      ffq $$4 = $$2.g().a($$1.dA(), $$1.dC(), $$1.dG());
      this.c.b(ahn.a($$1, $$0.cc(), $$3, $$4));
      return (bur)(this.j == dju.d ? bur.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, cwb $$3, crx $$4) {
      cvq $$5 = $$4.bR;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jo<cxn> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<czy> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cxn $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<czy> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            czy $$12 = $$8.get($$11);
            czy $$13 = $$6.get($$11).g();
            if (!czy.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new ahh($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, dfx $$1, boolean $$2) {
      this.c.b(new ahv($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahg($$0, $$1));
   }

   public void a(czy $$0, int $$1) {
      if (this.b.t.fV() && this.c.a($$0.h().k())) {
         this.c.b(new ail($$1, $$0));
      }
   }

   public void a(czy $$0) {
      boolean $$1 = this.b.z instanceof gas && !(this.b.z instanceof gbi);
      if (this.b.t.fV() && !$$1 && !$$0.f() && this.c.a($$0.h().k())) {
         this.c.b(new ail(-1, $$0));
         this.b.t.E().a();
      }
   }

   public void b(crx $$0) {
      this.l();
      this.c.b(new ahx(ahx.a.f, iv.c, jb.a));
      $$0.fE();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.b.t.bY() && this.b.t.dk() instanceof bxk;
   }

   public boolean g() {
      return this.j == dju.d;
   }

   @Nullable
   public dju h() {
      return this.k;
   }

   public dju i() {
      return this.j;
   }

   public boolean j() {
      return this.i;
   }

   public int k() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(iv $$0, boolean $$1) {
      this.c.b(new aht($$0, $$1));
   }

   public void a(bwt $$0, boolean $$1) {
      this.c.b(new ahu($$0.ao(), $$1));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahj($$0, $$1, $$2));
   }
}
