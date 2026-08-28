import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fyg {
   private static final Logger a = LogUtils.getLogger();
   private final ffh b;
   private final fxy c;
   private iz d = new iz(-1, -1, -1);
   private cur e = cur.l;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dbx j = dbx.e;
   @Nullable
   private dbx k;
   private int l;

   public fyg(ffh $$0, fxy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cmz $$0) {
      this.j.a($$0.gd());
   }

   public void a(dbx $$0, @Nullable dbx $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.gd());
   }

   public void a(dbx $$0) {
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
         dca $$1 = this.b.r;
         dse $$2 = $$1.a_($$0);
         if (!this.b.s.eX().g().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dfb $$3 = $$2.b();
            if ($$3 instanceof dij && !this.b.s.gz()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cmz)this.b.s);
               enx $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dcb)$$1, $$0, $$2);
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
            dse $$2 = this.b.r.a_($$0);
            this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new aia(aia.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new aia(aia.a.b, this.d, $$1));
            }

            dse $$3 = this.b.r.a_($$0);
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

               return new aia(aia.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dse $$0 = this.b.r.a_(this.d);
         this.b.aA().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new aia(aia.a.b, this.d, je.a));
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
         dse $$2 = this.b.r.a_($$0);
         this.b.aA().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new aia(aia.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dse $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dP(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dmo $$4 = $$3.w();
               this.b.aj().a(new gsk($$4.f(), awb.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gsp.t(), $$0));
            }

            this.g++;
            this.b.aA().a(this.b.r, $$0, $$3, ayz.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new aia(aia.a.c, $$0, $$1, $$2);
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

   private void a(fxx $$0, fzk $$1) {
      try (fzj $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zw<agw> $$4 = $$1.predict($$3);
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
      cur $$1 = this.b.s.eX();
      return $$0.equals(this.d) && cur.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.gc().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aij(this.l));
      }
   }

   public bqw a(gcs $$0, bqv $$1, evp $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bqw.f;
      } else {
         MutableObject<bqw> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ais($$1, $$2, $$4);
         });
         return (bqw)$$3.getValue();
      }
   }

   private bqw b(gcs $$0, bqv $$1, evp $$2) {
      iz $$3 = $$2.a();
      cur $$4 = $$0.b($$1);
      if (this.j == dbx.d) {
         return bqw.a;
      } else {
         boolean $$5 = !$$0.eX().e() || !$$0.eY().e();
         boolean $$6 = $$0.fR() && $$5;
         if (!$$6) {
            dse $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bqw.f;
            }

            bqy $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bqy.d && $$1 == bqv.a) {
               bqw $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.e() && !$$0.gx().a($$4.g())) {
            cye $$10 = new cye($$0, $$1, $$2);
            bqw $$12;
            if (this.j.g()) {
               int $$11 = $$4.I();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bqw.e;
         }
      }
   }

   public bqw a(cmz $$0, bqv $$1) {
      if (this.j == dbx.d) {
         return bqw.e;
      } else {
         this.m();
         this.c.b(new ahu.b($$0.du(), $$0.dw(), $$0.dA(), $$0.dF(), $$0.dH(), $$0.aE()));
         MutableObject<bqw> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            ait $$4 = new ait($$1, $$3);
            cur $$5 = $$0.b($$1);
            if ($$0.gx().a($$5.g())) {
               $$2.setValue(bqw.e);
               return $$4;
            } else {
               bqx<cur> $$6 = $$5.a(this.b.r, $$0, $$1);
               cur $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bqw)$$2.getValue();
      }
   }

   public gcs a(fxx $$0, awl $$1, feu $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gcs a(fxx $$0, awl $$1, feu $$2, boolean $$3, boolean $$4) {
      return new gcs(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cmz $$0, bsw $$1) {
      this.m();
      this.c.b(ahr.a($$1, $$0.bV()));
      if (this.j != dbx.d) {
         $$0.e($$1);
         $$0.gw();
      }
   }

   public bqw a(cmz $$0, bsw $$1, bqv $$2) {
      this.m();
      this.c.b(ahr.a($$1, $$0.bV(), $$2));
      return this.j == dbx.d ? bqw.e : $$0.a($$1, $$2);
   }

   public bqw a(cmz $$0, bsw $$1, evq $$2, bqv $$3) {
      this.m();
      evt $$4 = $$2.e().a($$1.du(), $$1.dw(), $$1.dA());
      this.c.b(ahr.a($$1, $$0.bV(), $$3, $$4));
      return this.j == dbx.d ? bqw.e : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cqf $$3, cmz $$4) {
      cpw $$5 = $$4.cb;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         jr<crr> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cur> $$8 = Lists.newArrayListWithCapacity($$7);

         for (crr $$9 : $$6) {
            $$8.add($$9.g().s());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cur> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cur $$12 = $$8.get($$11);
            cur $$13 = $$6.get($$11).g();
            if (!cur.a($$12, $$13)) {
               $$10.put($$11, $$13.s());
            }
         }

         this.c.b(new ahl($$0, $$5.j(), $$1, $$2, $$3, $$5.g().s(), $$10));
      }
   }

   public void a(int $$0, cyz<?> $$1, boolean $$2) {
      this.c.b(new ahy($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new ahk($$0, $$1));
   }

   public void a(cur $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.g().i())) {
         this.c.b(new aim($$1, $$0));
      }
   }

   public void a(cur $$0) {
      if (this.j.g() && !$$0.e() && this.c.a($$0.g().i())) {
         this.c.b(new aim(-1, $$0));
      }
   }

   public void b(cmz $$0) {
      this.m();
      this.c.b(new aia(aia.a.f, iz.c, je.a));
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
      return this.b.s.bR() && this.b.s.dc() instanceof btk;
   }

   public boolean h() {
      return this.j == dbx.d;
   }

   @Nullable
   public dbx i() {
      return this.k;
   }

   public dbx j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new ahx($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ahn($$0, $$1, $$2));
   }
}
