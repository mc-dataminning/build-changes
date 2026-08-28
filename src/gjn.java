import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gjn {
   private static final Logger a = LogUtils.getLogger();
   private final fof b;
   private final gje c;
   private iu d = new iu(-1, -1, -1);
   private cys e = cys.k;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dim j = dim.e;
   @Nullable
   private dim k;
   private int l;

   public gjn(fof $$0, gje $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cqs $$0) {
      this.j.a($$0.gj());
   }

   public void a(dim $$0, @Nullable dim $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gj());
   }

   public void a(dim $$0) {
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
         dip $$1 = this.b.s;
         dzo $$2 = $$1.a_($$0);
         if (!this.b.t.fa().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dlu $$3 = $$2.b();
            if ($$3 instanceof dpe && !this.b.t.gF()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cqs)this.b.t);
               evv $$4 = $$1.b_($$0);
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
            dzo $$2 = this.b.s.a_($$0);
            this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new aht(aht.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new aht(aht.a.b, this.d, $$1));
            }

            dzo $$3 = this.b.s.a_($$0);
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

               return new aht(aht.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dzo $$0 = this.b.s.a_(this.d);
         this.b.aB().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new aht(aht.a.b, this.d, ja.a));
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
         dzo $$2 = this.b.s.a_($$0);
         this.b.aB().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new aht(aht.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dzo $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dV(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dtn $$4 = $$3.A();
               this.b.ak().a(new hlr($$4.f(), awm.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hlw.t(), $$0));
            }

            this.g++;
            this.b.aB().a(this.b.s, $$0, $$3, azk.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new aht(aht.a.c, $$0, $$1, $$2);
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

   private void a(gjd $$0, gkr $$1) {
      try (gkq $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zd<agn> $$4 = $$1.predict($$3);
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
      cys $$1 = this.b.t.fa();
      return $$0.equals(this.d) && cys.c($$1, this.e);
   }

   private void l() {
      int $$0 = this.b.t.gi().j;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aie(this.l));
      }
   }

   public bty a(goa $$0, btx $$1, fds $$2) {
      this.l();
      if (!this.b.s.A_().a($$2.b())) {
         return bty.d;
      } else {
         MutableObject<bty> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aip($$1, $$2, $$4);
         });
         return (bty)$$3.getValue();
      }
   }

   private bty b(goa $$0, btx $$1, fds $$2) {
      iu $$3 = $$2.b();
      cys $$4 = $$0.b($$1);
      if (this.j == dim.d) {
         return bty.c;
      } else {
         boolean $$5 = !$$0.fa().f() || !$$0.fb().f();
         boolean $$6 = $$0.fX() && $$5;
         if (!$$6) {
            dzo $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().k())) {
               return bty.d;
            }

            bty $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bty.f && $$1 == btx.a) {
               bty $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gE().a($$4)) {
            dcn $$10 = new dcn($$0, $$1, $$2);
            bty $$12;
            if ($$0.fU()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bty.e;
         }
      }
   }

   public bty a(cqs $$0, btx $$1) {
      if (this.j == dim.d) {
         return bty.e;
      } else {
         this.l();
         MutableObject<bty> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aiq $$4 = new aiq($$1, $$3, $$0.dL(), $$0.dN());
            cys $$5 = $$0.b($$1);
            if ($$0.gE().a($$5)) {
               $$2.setValue(bty.e);
               return $$4;
            } else {
               bty $$6 = $$5.a(this.b.s, $$0, $$1);
               cys $$8;
               if ($$6 instanceof bty.d $$7) {
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
         return (bty)$$2.getValue();
      }
   }

   public goa a(gjd $$0, aww $$1, fnq $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public goa a(gjd $$0, aww $$1, fnq $$2, boolean $$3, boolean $$4) {
      return new goa(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cqs $$0, bwa $$1) {
      this.l();
      this.c.b(ahj.a($$1, $$0.cd()));
      if (this.j != dim.d) {
         $$0.e($$1);
         $$0.gD();
      }
   }

   public bty a(cqs $$0, bwa $$1, btx $$2) {
      this.l();
      this.c.b(ahj.a($$1, $$0.cd(), $$2));
      return (bty)(this.j == dim.d ? bty.e : $$0.a($$1, $$2));
   }

   public bty a(cqs $$0, bwa $$1, fdt $$2, btx $$3) {
      this.l();
      fdw $$4 = $$2.g().a($$1.dA(), $$1.dC(), $$1.dG());
      this.c.b(ahj.a($$1, $$0.cd(), $$3, $$4));
      return (bty)(this.j == dim.d ? bty.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, cuv $$3, cqs $$4) {
      cuk $$5 = $$4.bQ;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         jn<cwh> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<cys> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cwh $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cys> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cys $$12 = $$8.get($$11);
            cys $$13 = $$6.get($$11).g();
            if (!cys.a($$12, $$13)) {
               $$10.put($$11, $$13.v());
            }
         }

         this.c.b(new ahd($$0, $$5.j(), $$1, $$2, $$3, $$5.g().v(), $$10));
      }
   }

   public void a(int $$0, der $$1, boolean $$2) {
      this.c.b(new ahr($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahc($$0, $$1));
   }

   public void a(cys $$0, int $$1) {
      if (this.b.t.fU() && this.c.a($$0.h().k())) {
         this.c.b(new aih($$1, $$0));
      }
   }

   public void a(cys $$0) {
      boolean $$1 = this.b.z instanceof fxx && !(this.b.z instanceof fyn);
      if (this.b.t.fU() && !$$1 && !$$0.f() && this.c.a($$0.h().k())) {
         this.c.b(new aih(-1, $$0));
         this.b.t.E().a();
      }
   }

   public void b(cqs $$0) {
      this.l();
      this.c.b(new aht(aht.a.f, iu.c, ja.a));
      $$0.fD();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.b.t.bZ() && this.b.t.dk() instanceof bwr;
   }

   public boolean g() {
      return this.j == dim.d;
   }

   @Nullable
   public dim h() {
      return this.k;
   }

   public dim i() {
      return this.j;
   }

   public boolean j() {
      return this.i;
   }

   public int k() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(iu $$0, boolean $$1) {
      this.c.b(new ahp($$0, $$1));
   }

   public void a(bwa $$0, boolean $$1) {
      this.c.b(new ahq($$0.ar(), $$1));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahf($$0, $$1, $$2));
   }
}
