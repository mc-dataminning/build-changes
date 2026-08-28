import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fyd {
   private static final Logger a = LogUtils.getLogger();
   private final ffe b;
   private final fxv c;
   private iz d = new iz(-1, -1, -1);
   private cuo e = cuo.l;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dbu j = dbu.e;
   @Nullable
   private dbu k;
   private int l;

   public fyd(ffe $$0, fxv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cmw $$0) {
      this.j.a($$0.gd());
   }

   public void a(dbu $$0, @Nullable dbu $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.gd());
   }

   public void a(dbu $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.gd());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(iz $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         dbx $$1 = this.b.r;
         dsb $$2 = $$1.a_($$0);
         if (!this.b.s.eX().g().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dey $$3 = $$2.b();
            if ($$3 instanceof dig && !this.b.s.gz()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cmw)this.b.s);
               enu $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dby)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(iz $$0, je $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dsb $$2 = this.b.r.a_($$0);
            this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ahz(ahz.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahz(ahz.a.b, this.d, $$1));
            }

            dsb $$3 = this.b.r.a_($$0);
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

               return new ahz(ahz.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dsb $$0 = this.b.r.a_(this.d);
         this.b.aA().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ahz(ahz.a.b, this.d, je.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.al(), this.d, -1);
         this.b.s.gw();
      }
   }

   public boolean b(iz $$0, je $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dsb $$2 = this.b.r.a_($$0);
         this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ahz(ahz.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dsb $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dP(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dml $$4 = $$3.w();
               this.b.aj().a(new gsh($$4.f(), awa.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gsm.t(), $$0));
            }

            this.g++;
            this.b.aA().a(this.b.r, $$0, $$3, ayy.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new ahz(ahz.a.c, $$0, $$1, $$2);
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

   private void a(fxu $$0, fzh $$1) {
      try (fzg $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zv<agv> $$4 = $$1.predict($$3);
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

   private boolean b(iz $$0) {
      cuo $$1 = this.b.s.eX();
      return $$0.equals(this.d) && cuo.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.gc().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aii(this.l));
      }
   }

   public bqt a(gcp $$0, bqs $$1, evm $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bqt.f;
      } else {
         MutableObject<bqt> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new air($$1, $$2, $$4);
         });
         return (bqt)$$3.getValue();
      }
   }

   private bqt b(gcp $$0, bqs $$1, evm $$2) {
      iz $$3 = $$2.a();
      cuo $$4 = $$0.b($$1);
      if (this.j == dbu.d) {
         return bqt.a;
      } else {
         boolean $$5 = !$$0.eX().e() || !$$0.eY().e();
         boolean $$6 = $$0.fR() && $$5;
         if (!$$6) {
            dsb $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bqt.f;
            }

            bqv $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bqv.d && $$1 == bqs.a) {
               bqt $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.e() && !$$0.gx().a($$4.g())) {
            cyb $$10 = new cyb($$0, $$1, $$2);
            bqt $$12;
            if (this.j.g()) {
               int $$11 = $$4.I();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bqt.e;
         }
      }
   }

   public bqt a(cmw $$0, bqs $$1) {
      if (this.j == dbu.d) {
         return bqt.e;
      } else {
         this.m();
         this.c.b(new aht.b($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH(), $$0.aE()));
         MutableObject<bqt> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            ais $$4 = new ais($$1, $$3);
            cuo $$5 = $$0.b($$1);
            if ($$0.gx().a($$5.g())) {
               $$2.setValue(bqt.e);
               return $$4;
            } else {
               bqu<cuo> $$6 = $$5.a(this.b.r, $$0, $$1);
               cuo $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bqt)$$2.getValue();
      }
   }

   public gcp a(fxu $$0, awk $$1, fer $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gcp a(fxu $$0, awk $$1, fer $$2, boolean $$3, boolean $$4) {
      return new gcp(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cmw $$0, bst $$1) {
      this.m();
      this.c.b(ahq.a($$1, $$0.bV()));
      if (this.j != dbu.d) {
         $$0.e($$1);
         $$0.gw();
      }
   }

   public bqt a(cmw $$0, bst $$1, bqs $$2) {
      this.m();
      this.c.b(ahq.a($$1, $$0.bV(), $$2));
      return this.j == dbu.d ? bqt.e : $$0.a($$1, $$2);
   }

   public bqt a(cmw $$0, bst $$1, evn $$2, bqs $$3) {
      this.m();
      evq $$4 = $$2.e().a($$1.du(), $$1.dw(), $$1.dA());
      this.c.b(ahq.a($$1, $$0.bV(), $$3, $$4));
      return this.j == dbu.d ? bqt.e : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cqc $$3, cmw $$4) {
      cpt $$5 = $$4.cb;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         jr<cro> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cuo> $$8 = Lists.newArrayListWithCapacity($$7);

         for (cro $$9 : $$6) {
            $$8.add($$9.g().s());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cuo> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cuo $$12 = $$8.get($$11);
            cuo $$13 = $$6.get($$11).g();
            if (!cuo.a($$12, $$13)) {
               $$10.put($$11, $$13.s());
            }
         }

         this.c.b(new ahk($$0, $$5.j(), $$1, $$2, $$3, $$5.g().s(), $$10));
      }
   }

   public void a(int $$0, cyw<?> $$1, boolean $$2) {
      this.c.b(new ahx($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahj($$0, $$1));
   }

   public void a(cuo $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.g().i())) {
         this.c.b(new ail($$1, $$0));
      }
   }

   public void a(cuo $$0) {
      if (this.j.g() && !$$0.e() && this.c.a($$0.g().i())) {
         this.c.b(new ail(-1, $$0));
      }
   }

   public void b(cmw $$0) {
      this.m();
      this.c.b(new ahz(ahz.a.f, iz.c, je.a));
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
      return this.b.s.bR() && this.b.s.dc() instanceof bth;
   }

   public boolean h() {
      return this.j == dbu.d;
   }

   @Nullable
   public dbu i() {
      return this.k;
   }

   public dbu j() {
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
