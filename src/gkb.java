import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gkb {
   private static final Logger a = LogUtils.getLogger();
   private final fos b;
   private final gjs c;
   private iu d = new iu(-1, -1, -1);
   private cyy e = cyy.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dis j = dis.e;
   @Nullable
   private dis k;
   private int l;

   public gkb(fos $$0, gjs $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cqy $$0) {
      this.j.a($$0.gj());
   }

   public void a(dis $$0, @Nullable dis $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gj());
   }

   public void a(dis $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gj());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(iu $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         div $$1 = this.b.s;
         dzz $$2 = $$1.a_($$0);
         if (!this.b.t.fa().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dma $$3 = $$2.b();
            if ($$3 instanceof dpl && !this.b.t.gF()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cqy)this.b.t);
               ewg $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a($$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(iu $$0, ja $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.A_().a($$0)) {
         return false;
      } else {
         if (this.b.t.gj().d) {
            dzz $$2 = this.b.s.a_($$0);
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

            dzz $$3 = this.b.s.a_($$0);
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
                  this.e = this.b.t.fa();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ar(), this.d, this.k());
               }

               return new ahv(ahv.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dzz $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ahv(ahv.a.b, this.d, ja.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ar(), this.d, -1);
         this.b.t.gD();
      }
   }

   public boolean b(iu $$0, ja $$1) {
      this.l();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.b.t.gj().d && this.b.s.A_().a($$0)) {
         this.h = 5;
         dzz $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ahv(ahv.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dzz $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dV(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dtv $$4 = $$3.A();
               this.b.ak().a(new hmh($$4.f(), awo.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hmm.t(), $$0));
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

            this.b.s.a(this.b.t.ar(), this.d, this.k());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(gjr $$0, glf $$1) {
      try (gle $$2 = $$0.a().a()) {
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

   private boolean b(iu $$0) {
      cyy $$1 = this.b.t.fa();
      return $$0.equals(this.d) && cyy.c($$1, this.e);
   }

   private void l() {
      int $$0 = this.b.t.gi().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aig(this.l));
      }
   }

   public bub a(gop $$0, bua $$1, fee $$2) {
      this.l();
      if (!this.b.s.A_().a($$2.b())) {
         return bub.d;
      } else {
         MutableObject<bub> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new air($$1, $$2, $$4);
         });
         return (bub)$$3.getValue();
      }
   }

   private bub b(gop $$0, bua $$1, fee $$2) {
      iu $$3 = $$2.b();
      cyy $$4 = $$0.b($$1);
      if (this.j == dis.d) {
         return bub.c;
      } else {
         boolean $$5 = !$$0.fa().f() || !$$0.fb().f();
         boolean $$6 = $$0.fX() && $$5;
         if (!$$6) {
            dzz $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().k())) {
               return bub.d;
            }

            bub $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bub.f && $$1 == bua.a) {
               bub $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gE().a($$4)) {
            dct $$10 = new dct($$0, $$1, $$2);
            bub $$12;
            if ($$0.fU()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bub.e;
         }
      }
   }

   public bub a(cqy $$0, bua $$1) {
      if (this.j == dis.d) {
         return bub.e;
      } else {
         this.l();
         MutableObject<bub> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            ais $$4 = new ais($$1, $$3, $$0.dL(), $$0.dN());
            cyy $$5 = $$0.b($$1);
            if ($$0.gE().a($$5)) {
               $$2.setValue(bub.e);
               return $$4;
            } else {
               bub $$6 = $$5.a(this.b.s, $$0, $$1);
               cyy $$8;
               if ($$6 instanceof bub.d $$7) {
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
         return (bub)$$2.getValue();
      }
   }

   public gop a(gjr $$0, awy $$1, foc $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gop a(gjr $$0, awy $$1, foc $$2, boolean $$3, boolean $$4) {
      return new gop(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cqy $$0, bwd $$1) {
      this.l();
      this.c.b(ahl.a($$1, $$0.cd()));
      if (this.j != dis.d) {
         $$0.e($$1);
         $$0.gD();
      }
   }

   public bub a(cqy $$0, bwd $$1, bua $$2) {
      this.l();
      this.c.b(ahl.a($$1, $$0.cd(), $$2));
      return (bub)(this.j == dis.d ? bub.e : $$0.a($$1, $$2));
   }

   public bub a(cqy $$0, bwd $$1, fef $$2, bua $$3) {
      this.l();
      fei $$4 = $$2.g().a($$1.dA(), $$1.dC(), $$1.dG());
      this.c.b(ahl.a($$1, $$0.cd(), $$3, $$4));
      return (bub)(this.j == dis.d ? bub.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, cvb $$3, cqy $$4) {
      cuq $$5 = $$4.bQ;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jn<cwn> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cyy> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cwn $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cyy> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cyy $$12 = $$8.get($$11);
            cyy $$13 = $$6.get($$11).g();
            if (!cyy.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new ahf($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, dex $$1, boolean $$2) {
      this.c.b(new aht($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahe($$0, $$1));
   }

   public void a(cyy $$0, int $$1) {
      if (this.b.t.fU() && this.c.a($$0.h().k())) {
         this.c.b(new aij($$1, $$0));
      }
   }

   public void a(cyy $$0) {
      boolean $$1 = this.b.z instanceof fyj && !(this.b.z instanceof fyz);
      if (this.b.t.fU() && !$$1 && !$$0.f() && this.c.a($$0.h().k())) {
         this.c.b(new aij(-1, $$0));
         this.b.t.E().a();
      }
   }

   public void b(cqy $$0) {
      this.l();
      this.c.b(new ahv(ahv.a.f, iu.c, ja.a));
      $$0.fD();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.b.t.bZ() && this.b.t.dk() instanceof bwu;
   }

   public boolean g() {
      return this.j == dis.d;
   }

   @Nullable
   public dis h() {
      return this.k;
   }

   public dis i() {
      return this.j;
   }

   public boolean j() {
      return this.i;
   }

   public int k() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(iu $$0, boolean $$1) {
      this.c.b(new ahr($$0, $$1));
   }

   public void a(bwd $$0, boolean $$1) {
      this.c.b(new ahs($$0.ar(), $$1));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahh($$0, $$1, $$2));
   }
}
