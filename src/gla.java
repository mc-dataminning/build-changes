import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gla {
   private static final Logger a = LogUtils.getLogger();
   private final fpt b;
   private final gkr c;
   private iv d = new iv(-1, -1, -1);
   private czn e = czn.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private djj j = djj.e;
   @Nullable
   private djj k;
   private int l;

   public gla(fpt $$0, gkr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(crm $$0) {
      this.j.a($$0.gj());
   }

   public void a(djj $$0, @Nullable djj $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gj());
   }

   public void a(djj $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gj());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(iv $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         djm $$1 = this.b.s;
         eat $$2 = $$1.a_($$0);
         if (!this.b.t.fa().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dmr $$3 = $$2.b();
            if ($$3 instanceof dqd && !this.b.t.gF()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (crm)this.b.t);
               exa $$4 = $$1.b_($$0);
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
      } else if (!this.b.s.A_().a($$0)) {
         return false;
      } else {
         if (this.b.t.gj().d) {
            eat $$2 = this.b.s.a_($$0);
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

            eat $$3 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.l();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.dU(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.fa();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ao(), this.d, this.k());
               }

               return new ahv(ahv.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         eat $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ahv(ahv.a.b, this.d, jb.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ao(), this.d, -1);
         this.b.t.gD();
      }
   }

   public boolean b(iv $$0, jb $$1) {
      this.l();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.b.t.gj().d && this.b.s.A_().a($$0)) {
         this.h = 5;
         eat $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahv(ahv.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         eat $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dU(), $$0);
            if (this.g % 4.0F == 0.0F) {
               duo $$4 = $$3.A();
               this.b.ak().a(new hnj($$4.f(), awo.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hno.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azm.a(this.f, 0.0F, 1.0F));
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

            this.b.s.a(this.b.t.ao(), this.d, this.k());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(gkq $$0, gme $$1) {
      try (gmd $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zf<agp> $$4 = $$1.predict($$3);
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
      czn $$1 = this.b.t.fa();
      return $$0.equals(this.d) && czn.c($$1, this.e);
   }

   private void l() {
      int $$0 = this.b.t.gi().f();
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aig(this.l));
      }
   }

   public bug a(gpo $$0, buf $$1, fey $$2) {
      this.l();
      if (!this.b.s.A_().a($$2.b())) {
         return bug.d;
      } else {
         MutableObject<bug> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new air($$1, $$2, $$4);
         });
         return (bug)$$3.getValue();
      }
   }

   private bug b(gpo $$0, buf $$1, fey $$2) {
      iv $$3 = $$2.b();
      czn $$4 = $$0.b($$1);
      if (this.j == djj.d) {
         return bug.c;
      } else {
         boolean $$5 = !$$0.fa().f() || !$$0.fb().f();
         boolean $$6 = $$0.fX() && $$5;
         if (!$$6) {
            eat $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().k())) {
               return bug.d;
            }

            bug $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bug.f && $$1 == buf.a) {
               bug $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gE().a($$4)) {
            ddi $$10 = new ddi($$0, $$1, $$2);
            bug $$12;
            if ($$0.fU()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bug.e;
         }
      }
   }

   public bug a(crm $$0, buf $$1) {
      if (this.j == djj.d) {
         return bug.e;
      } else {
         this.l();
         MutableObject<bug> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            ais $$4 = new ais($$1, $$3, $$0.dK(), $$0.dM());
            czn $$5 = $$0.b($$1);
            if ($$0.gE().a($$5)) {
               $$2.setValue(bug.e);
               return $$4;
            } else {
               bug $$6 = $$5.a(this.b.s, $$0, $$1);
               czn $$8;
               if ($$6 instanceof bug.d $$7) {
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
         return (bug)$$2.getValue();
      }
   }

   public gpo a(gkq $$0, awy $$1, fpe $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gpo a(gkq $$0, awy $$1, fpe $$2, boolean $$3, boolean $$4) {
      return new gpo(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(crm $$0, bwi $$1) {
      this.l();
      this.c.b(ahl.a($$1, $$0.cb()));
      if (this.j != djj.d) {
         $$0.e($$1);
         $$0.gD();
      }
   }

   public bug a(crm $$0, bwi $$1, buf $$2) {
      this.l();
      this.c.b(ahl.a($$1, $$0.cb(), $$2));
      return (bug)(this.j == djj.d ? bug.e : $$0.a($$1, $$2));
   }

   public bug a(crm $$0, bwi $$1, fez $$2, buf $$3) {
      this.l();
      ffc $$4 = $$2.g().a($$1.dz(), $$1.dB(), $$1.dF());
      this.c.b(ahl.a($$1, $$0.cb(), $$3, $$4));
      return (bug)(this.j == djj.d ? bug.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, cvq $$3, crm $$4) {
      cvf $$5 = $$4.bR;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jo<cxc> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<czn> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cxc $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<czn> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            czn $$12 = $$8.get($$11);
            czn $$13 = $$6.get($$11).g();
            if (!czn.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new ahf($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, dfm $$1, boolean $$2) {
      this.c.b(new aht($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahe($$0, $$1));
   }

   public void a(czn $$0, int $$1) {
      if (this.b.t.fU() && this.c.a($$0.h().k())) {
         this.c.b(new aij($$1, $$0));
      }
   }

   public void a(czn $$0) {
      boolean $$1 = this.b.z instanceof fzh && !(this.b.z instanceof fzx);
      if (this.b.t.fU() && !$$1 && !$$0.f() && this.c.a($$0.h().k())) {
         this.c.b(new aij(-1, $$0));
         this.b.t.E().a();
      }
   }

   public void b(crm $$0) {
      this.l();
      this.c.b(new ahv(ahv.a.f, iv.c, jb.a));
      $$0.fD();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.b.t.bX() && this.b.t.dj() instanceof bwz;
   }

   public boolean g() {
      return this.j == djj.d;
   }

   @Nullable
   public djj h() {
      return this.k;
   }

   public djj i() {
      return this.j;
   }

   public boolean j() {
      return this.i;
   }

   public int k() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(iv $$0, boolean $$1) {
      this.c.b(new ahr($$0, $$1));
   }

   public void a(bwi $$0, boolean $$1) {
      this.c.b(new ahs($$0.ao(), $$1));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahh($$0, $$1, $$2));
   }
}
