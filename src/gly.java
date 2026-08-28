import com.google.common.collect.Lists;
import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gly {
   private static final Logger a = LogUtils.getLogger();
   private final fqq b;
   private final glp c;
   private iw d = new iw(-1, -1, -1);
   private dak e = dak.l;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dkg j = dkg.e;
   @Nullable
   private dkg k;
   private int l;

   public gly(fqq $$0, glp $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(csi $$0) {
      this.j.a($$0.gk());
   }

   public void a(dkg $$0, @Nullable dkg $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gk());
   }

   public void a(dkg $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gk());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(iw $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         dkj $$1 = this.b.s;
         ebq $$2 = $$1.a_($$0);
         if (!this.b.t.fb().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dno $$3 = $$2.b();
            if ($$3 instanceof dra && !this.b.t.gH()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (csi)this.b.t);
               eya $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a($$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(iw $$0, jc $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.E_().a($$0)) {
         return false;
      } else {
         if (this.b.t.gk().d) {
            ebq $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new aig(aig.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new aig(aig.a.b, this.d, $$1));
            }

            ebq $$3 = this.b.s.a_($$0);
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

               return new aig(aig.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         ebq $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new aig(aig.a.b, this.d, jc.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ao(), this.d, -1);
         this.b.t.gF();
      }
   }

   public boolean b(iw $$0, jc $$1) {
      this.l();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.b.t.gk().d && this.b.s.E_().a($$0)) {
         this.h = 5;
         ebq $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new aig(aig.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         ebq $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dV(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dvl $$4 = $$3.A();
               this.b.ak().a(new hoi($$4.f(), awz.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hon.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azz.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new aig(aig.a.c, $$0, $$1, $$2);
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

   private void a(glo $$0, gnc $$1) {
      try (gnb $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zo<aha> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public void c() {
      this.l();
      if (this.c.j().i()) {
         this.c.j().b();
      } else {
         this.c.j().n();
      }
   }

   private boolean b(iw $$0) {
      dak $$1 = this.b.t.fb();
      return $$0.equals(this.d) && dak.c($$1, this.e);
   }

   private void l() {
      int $$0 = this.b.t.gj().f();
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new air(this.l));
      }
   }

   public bvc a(gqm $$0, bvb $$1, ffy $$2) {
      this.l();
      if (!this.b.s.E_().a($$2.b())) {
         return bvc.d;
      } else {
         MutableObject<bvc> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ajc($$1, $$2, $$4);
         });
         return (bvc)$$3.getValue();
      }
   }

   private bvc b(gqm $$0, bvb $$1, ffy $$2) {
      iw $$3 = $$2.b();
      dak $$4 = $$0.b($$1);
      if (this.j == dkg.d) {
         return bvc.c;
      } else {
         boolean $$5 = !$$0.fb().f() || !$$0.fc().f();
         boolean $$6 = $$0.fY() && $$5;
         if (!$$6) {
            ebq $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().k())) {
               return bvc.d;
            }

            bvc $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bvc.f && $$1 == bvb.a) {
               bvc $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gG().a($$4)) {
            def $$10 = new def($$0, $$1, $$2);
            bvc $$12;
            if ($$0.fV()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bvc.e;
         }
      }
   }

   public bvc a(csi $$0, bvb $$1) {
      if (this.j == dkg.d) {
         return bvc.e;
      } else {
         this.l();
         MutableObject<bvc> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            ajd $$4 = new ajd($$1, $$3, $$0.dL(), $$0.dN());
            dak $$5 = $$0.b($$1);
            if ($$0.gG().a($$5)) {
               $$2.setValue(bvc.e);
               return $$4;
            } else {
               bvc $$6 = $$5.a(this.b.s, $$0, $$1);
               dak $$8;
               if ($$6 instanceof bvc.d $$7) {
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
         return (bvc)$$2.getValue();
      }
   }

   public gqm a(glo $$0, axj $$1, fqb $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gqm a(glo $$0, axj $$1, fqb $$2, boolean $$3, boolean $$4) {
      return new gqm(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(csi $$0, bxe $$1) {
      this.l();
      this.c.b(ahw.a($$1, $$0.cc()));
      if (this.j != dkg.d) {
         $$0.e($$1);
         $$0.gF();
      }
   }

   public bvc a(csi $$0, bxe $$1, bvb $$2) {
      this.l();
      this.c.b(ahw.a($$1, $$0.cc(), $$2));
      return (bvc)(this.j == dkg.d ? bvc.e : $$0.a($$1, $$2));
   }

   public bvc a(csi $$0, bxe $$1, ffz $$2, bvb $$3) {
      this.l();
      fgc $$4 = $$2.g().a($$1.dA(), $$1.dC(), $$1.dG());
      this.c.b(ahw.a($$1, $$0.cc(), $$3, $$4));
      return (bvc)(this.j == dkg.d ? bvc.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, cwm $$3, csi $$4) {
      cwb $$5 = $$4.bR;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jp<cxz> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<dak> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cxz $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<wb> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            dak $$12 = $$8.get($$11);
            dak $$13 = $$6.get($$11).g();
            if (!dak.a($$12, $$13)) {
               $$10.put($$11, wb.b($$13, this.c.E()));
            }
         }

         wb $$14 = wb.b($$5.g(), this.c.E());
         this.c.b(new ahq($$0, $$5.j(), Shorts.checkedCast((long)$$1), SignedBytes.checkedCast((long)$$2), $$3, $$10, $$14));
      }
   }

   public void a(int $$0, dgj $$1, boolean $$2) {
      this.c.b(new aie($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahp($$0, $$1));
   }

   public void a(dak $$0, int $$1) {
      if (this.b.t.fV() && this.c.a($$0.h().k())) {
         this.c.b(new aiu($$1, $$0));
      }
   }

   public void a(dak $$0) {
      boolean $$1 = this.b.z instanceof gaf && !(this.b.z instanceof gav);
      if (this.b.t.fV() && !$$1 && !$$0.f() && this.c.a($$0.h().k())) {
         this.c.b(new aiu(-1, $$0));
         this.b.t.G().a();
      }
   }

   public void b(csi $$0) {
      this.l();
      this.c.b(new aig(aig.a.f, iw.c, jc.a));
      $$0.fE();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.b.t.bY() && this.b.t.dk() instanceof bxv;
   }

   public boolean g() {
      return this.j == dkg.d;
   }

   @Nullable
   public dkg h() {
      return this.k;
   }

   public dkg i() {
      return this.j;
   }

   public boolean j() {
      return this.i;
   }

   public int k() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(iw $$0, boolean $$1) {
      this.c.b(new aic($$0, $$1));
   }

   public void a(bxe $$0, boolean $$1) {
      this.c.b(new aid($$0.ao(), $$1));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahs($$0, $$1, $$2));
   }
}
