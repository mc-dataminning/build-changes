import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class fys {
   private static final Logger a = LogUtils.getLogger();
   private final fft b;
   private final fyk c;
   private ja d = new ja(-1, -1, -1);
   private cuc e = cuc.l;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dcc j = dcc.e;
   @Nullable
   private dcc k;
   private int l;

   public fys(fft $$0, fyk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cmk $$0) {
      this.j.a($$0.ga());
   }

   public void a(dcc $$0, @Nullable dcc $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.s.ga());
   }

   public void a(dcc $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.s.ga());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(ja $$0) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else {
         dcf $$1 = this.b.r;
         dsk $$2 = $$1.a_($$0);
         if (!this.b.s.eU().g().a($$2, $$1, $$0, this.b.s)) {
            return false;
         } else {
            dfh $$3 = $$2.b();
            if ($$3 instanceof dip && !this.b.s.gw()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cmk)this.b.s);
               eoh $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((dcg)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(ja $$0, jf $$1) {
      if (this.b.s.a(this.b.r, $$0, this.j)) {
         return false;
      } else if (!this.b.r.C_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dsk $$2 = this.b.r.a_($$0);
            this.b.ay().a(this.b.r, $$0, $$2, 1.0F);
            this.a(this.b.r, $$2x -> {
               this.a($$0);
               return new ahf(ahf.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ahf(ahf.a.b, this.d, $$1));
            }

            dsk $$3 = this.b.r.a_($$0);
            this.b.ay().a(this.b.r, $$0, $$3, 0.0F);
            this.a(this.b.r, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.r, $$0, this.b.s);
               }

               if ($$4 && $$3.a(this.b.s, this.b.s.dQ(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.s.eU();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.r.a(this.b.s.am(), this.d, this.l());
               }

               return new ahf(ahf.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dsk $$0 = this.b.r.a_(this.d);
         this.b.ay().a(this.b.r, this.d, $$0, -1.0F);
         this.c.b(new ahf(ahf.a.b, this.d, jf.a));
         this.i = false;
         this.f = 0.0F;
         this.b.r.a(this.b.s.am(), this.d, -1);
         this.b.s.gt();
      }
   }

   public boolean b(ja $$0, jf $$1) {
      this.m();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.r.C_().a($$0)) {
         this.h = 5;
         dsk $$2 = this.b.r.a_($$0);
         this.b.ay().a(this.b.r, $$0, $$2, 1.0F);
         this.a(this.b.r, $$2x -> {
            this.a($$0);
            return new ahf(ahf.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dsk $$3 = this.b.r.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.s, this.b.s.dQ(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dmu $$4 = $$3.w();
               this.b.aj().a(new gsx($$4.f(), avi.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, gtc.t(), $$0));
            }

            this.g++;
            this.b.ay().a(this.b.r, $$0, $$3, ayg.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.r, $$2 -> {
                  this.a($$0);
                  return new ahf(ahf.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.r.a(this.b.s.am(), this.d, this.l());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(fyj $$0, fzx $$1) {
      try (fzw $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         zb<agb> $$4 = $$1.predict($$3);
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

   private boolean b(ja $$0) {
      cuc $$1 = this.b.s.eU();
      return $$0.equals(this.d) && cuc.c($$1, this.e);
   }

   private void m() {
      int $$0 = this.b.s.fZ().k;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aho(this.l));
      }
   }

   public bqg a(gdf $$0, bqf $$1, ewb $$2) {
      this.m();
      if (!this.b.r.C_().a($$2.a())) {
         return bqg.f;
      } else {
         MutableObject<bqg> $$3 = new MutableObject();
         this.a(this.b.r, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ahx($$1, $$2, $$4);
         });
         return (bqg)$$3.getValue();
      }
   }

   private bqg b(gdf $$0, bqf $$1, ewb $$2) {
      ja $$3 = $$2.a();
      cuc $$4 = $$0.b($$1);
      if (this.j == dcc.d) {
         return bqg.a;
      } else {
         boolean $$5 = !$$0.eU().e() || !$$0.eV().e();
         boolean $$6 = $$0.fO() && $$5;
         if (!$$6) {
            dsk $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().i())) {
               return bqg.f;
            }

            bqi $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8.b();
            }

            if ($$8 == bqi.d && $$1 == bqf.a) {
               bqg $$9 = $$7.a(this.b.r, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.e() && !$$0.gu().a($$4.g())) {
            cxo $$10 = new cxo($$0, $$1, $$2);
            bqg $$12;
            if (this.j.g()) {
               int $$11 = $$4.H();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bqg.e;
         }
      }
   }

   public bqg a(cmk $$0, bqf $$1) {
      if (this.j == dcc.d) {
         return bqg.e;
      } else {
         this.m();
         this.c.b(new agz.b($$0.dv(), $$0.dx(), $$0.dB(), $$0.dG(), $$0.dI(), $$0.aF()));
         MutableObject<bqg> $$2 = new MutableObject();
         this.a(this.b.r, $$3 -> {
            ahy $$4 = new ahy($$1, $$3);
            cuc $$5 = $$0.b($$1);
            if ($$0.gu().a($$5.g())) {
               $$2.setValue(bqg.e);
               return $$4;
            } else {
               bqh<cuc> $$6 = $$5.a(this.b.r, $$0, $$1);
               cuc $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bqg)$$2.getValue();
      }
   }

   public gdf a(fyj $$0, avs $$1, ffg $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public gdf a(fyj $$0, avs $$1, ffg $$2, boolean $$3, boolean $$4) {
      return new gdf(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cmk $$0, bsg $$1) {
      this.m();
      this.c.b(agw.a($$1, $$0.bW()));
      if (this.j != dcc.d) {
         $$0.e($$1);
         $$0.gt();
      }
   }

   public bqg a(cmk $$0, bsg $$1, bqf $$2) {
      this.m();
      this.c.b(agw.a($$1, $$0.bW(), $$2));
      return this.j == dcc.d ? bqg.e : $$0.a($$1, $$2);
   }

   public bqg a(cmk $$0, bsg $$1, ewc $$2, bqf $$3) {
      this.m();
      ewf $$4 = $$2.e().a($$1.dv(), $$1.dx(), $$1.dB());
      this.c.b(agw.a($$1, $$0.bW(), $$3, $$4));
      return this.j == dcc.d ? bqg.e : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cpr $$3, cmk $$4) {
      cph $$5 = $$4.cd;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         js<crd> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cuc> $$8 = Lists.newArrayListWithCapacity($$7);

         for (crd $$9 : $$6) {
            $$8.add($$9.g().s());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cuc> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cuc $$12 = $$8.get($$11);
            cuc $$13 = $$6.get($$11).g();
            if (!cuc.a($$12, $$13)) {
               $$10.put($$11, $$13.s());
            }
         }

         this.c.b(new agq($$0, $$5.j(), $$1, $$2, $$3, $$5.g().s(), $$10));
      }
   }

   public void a(int $$0, cyk<?> $$1, boolean $$2) {
      this.c.b(new ahd($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new agp($$0, $$1));
   }

   public void a(cuc $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.g().i())) {
         this.c.b(new ahr($$1, $$0));
      }
   }

   public void a(cuc $$0) {
      if (this.j.g() && !$$0.e() && this.c.a($$0.g().i())) {
         this.c.b(new ahr(-1, $$0));
      }
   }

   public void b(cmk $$0) {
      this.m();
      this.c.b(new ahf(ahf.a.f, ja.c, jf.a));
      $$0.fx();
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
      return this.b.s.bS() && this.b.s.dd() instanceof bsu;
   }

   public boolean h() {
      return this.j == dcc.d;
   }

   @Nullable
   public dcc i() {
      return this.k;
   }

   public dcc j() {
      return this.j;
   }

   public boolean k() {
      return this.i;
   }

   public int l() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.b(new ahc($$0));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new ags($$0, $$1, $$2));
   }
}
