import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gom implements auw {
   public static final ale a = ale.b("textures/misc/enchanted_glint_entity.png");
   public static final ale b = ale.b("textures/misc/enchanted_glint_item.png");
   private static final Set<cvn> k = Sets.newHashSet(new cvn[]{cvw.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gzt l = gzt.a(ale.b("trident"));
   public static final gzt i = gzt.a(ale.b("trident_in_hand"));
   private static final gzt m = gzt.a(ale.b("spyglass"));
   public static final gzt j = gzt.a(ale.b("spyglass_in_hand"));
   private final fip n;
   private final ghf o;
   private final gxh p;
   private final fjv q;
   private final ggs r;

   public gom(fip $$0, gxh $$1, gzs $$2, fjv $$3, ggs $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new ghf($$2);
      this.r = $$4;

      for (cvn $$5 : lv.g) {
         if (!k.contains($$5)) {
            this.o.a($$5, gzt.a(lv.g.b($$5)));
         }
      }

      this.q = $$3;
   }

   public ghf a() {
      return this.o;
   }

   private void a(gzi $$0, cvs $$1, int $$2, int $$3, fdi $$4, fdm $$5) {
      azn $$6 = azn.a();
      long $$7 = 42L;

      for (jk $$8 : jk.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cvs $$0, cvp $$1, boolean $$2, fdi $$3, ghl $$4, int $$5, int $$6, gzi $$7) {
      if (!$$0.f()) {
         $$3.a();
         boolean $$8 = $$1 == cvp.g || $$1 == cvp.h || $$1 == cvp.i;
         if ($$8) {
            if ($$0.a(cvw.vU)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cvw.qY)) {
               $$7 = this.o.a().a(m);
            } else if ($$0.a(cvw.qV) && cub.f($$0)) {
               this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
               $$3.b();
               return;
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.a($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8);
         $$3.b();
      }
   }

   private void a(cvs $$0, cvp $$1, boolean $$2, fdi $$3, ghl $$4, int $$5, int $$6, boolean $$7) {
      if ($$0.h() instanceof cub $$8) {
         $$3.a();
         gzi $$9 = this.o.a().a(b($$8));
         $$9.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -1.5F);
         this.a($$0, $$1, $$3, $$4, $$5, $$6, $$9, $$7);
         $$3.b();
         $$3.a();
         cvs $$10 = cub.h($$0);
         gzi $$11 = this.o.a($$10);
         $$11.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.a($$10, $$1, $$3, $$4, $$5, $$6, $$11, $$7);
         $$3.b();
         $$3.a();
         gzi $$12 = this.o.a().a(a($$8));
         $$12.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, 0.5F);
         this.a($$0, $$1, $$3, $$4, $$5, $$6, $$12, $$7);
         $$3.b();
      }
   }

   private void a(cvs $$0, cvp $$1, fdi $$2, ghl $$3, int $$4, int $$5, gzi $$6, boolean $$7) {
      if (!$$6.d() && (!$$0.a(cvw.vU) || $$7)) {
         ghv $$8 = ghd.a($$0);
         fdm $$10;
         if (a($$0) && $$0.A()) {
            fdi.a $$9 = $$2.c().c();
            if ($$1 == cvp.g) {
               f.a($$9.a(), 0.5F);
            } else if ($$1.b()) {
               f.a($$9.a(), 0.75F);
            }

            $$10 = a($$3, $$8, $$9);
         } else {
            $$10 = a($$3, $$8, true, $$0.A());
         }

         this.a($$6, $$0, $$4, $$5, $$2, $$10);
      } else {
         this.r.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static boolean a(cvs $$0) {
      return $$0.a(axe.bh) || $$0.a(cvw.qX);
   }

   public static fdm a(ghl $$0, ghv $$1, boolean $$2) {
      return $$2 ? fdp.a($$0.getBuffer(ghv.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fdm a(ghl $$0, ghv $$1, fdi.a $$2) {
      return fdp.a(new fdj($$0.getBuffer(ghv.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fdm a(ghl $$0, ghv $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fip.O() && $$1 == gig.j()
            ? fdp.a($$0.getBuffer(ghv.k()), $$0.getBuffer($$1))
            : fdp.a($$0.getBuffer($$2 ? ghv.l() : ghv.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private void a(fdi $$0, fdm $$1, List<gir> $$2, cvs $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.f();
      fdi.a $$7 = $$0.c();

      for (gir $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)axq.a($$9) / 255.0F;
         float $$11 = (float)axq.b($$9) / 255.0F;
         float $$12 = (float)axq.c($$9) / 255.0F;
         float $$13 = (float)axq.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gzi a(cvs $$0, @Nullable dej $$1, @Nullable bun $$2, int $$3) {
      gzi $$4;
      if ($$0.a(cvw.vU)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cvw.qY)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      gbm $$7 = $$1 instanceof gbm ? (gbm)$$1 : null;
      gzi $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public static gzt a(cub $$0) {
      return gzt.a(ale.b($$0.b()));
   }

   public static gzt b(cub $$0) {
      return gzt.a(ale.b($$0.c()));
   }

   public void a(cvs $$0, cvp $$1, int $$2, int $$3, fdi $$4, ghl $$5, @Nullable dej $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bun $$0, cvs $$1, cvp $$2, boolean $$3, fdi $$4, ghl $$5, @Nullable dej $$6, int $$7, int $$8, int $$9) {
      if (!$$1.f()) {
         gzi $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(auv $$0) {
      this.o.b();
   }

   @Nullable
   public gzi a(cvs $$0, bun $$1, cvp $$2) {
      return $$0.f() ? null : this.a($$0, $$1.dS(), $$1, $$1.ap() + $$2.ordinal());
   }
}
