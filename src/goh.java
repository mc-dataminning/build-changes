import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class goh implements auu {
   public static final alc a = alc.b("textures/misc/enchanted_glint_entity.png");
   public static final alc b = alc.b("textures/misc/enchanted_glint_item.png");
   private static final Set<cvk> k = Sets.newHashSet(new cvk[]{cvt.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gzo l = gzo.a(alc.b("trident"));
   public static final gzo i = gzo.a(alc.b("trident_in_hand"));
   private static final gzo m = gzo.a(alc.b("spyglass"));
   public static final gzo j = gzo.a(alc.b("spyglass_in_hand"));
   private final fil n;
   private final gha o;
   private final gxc p;
   private final fjr q;
   private final ggn r;

   public goh(fil $$0, gxc $$1, gzn $$2, fjr $$3, ggn $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gha($$2);
      this.r = $$4;

      for (cvk $$5 : lu.g) {
         if (!k.contains($$5)) {
            this.o.a($$5, gzo.a(lu.g.b($$5)));
         }
      }

      this.q = $$3;
   }

   public gha a() {
      return this.o;
   }

   private void a(gzd $$0, cvp $$1, int $$2, int $$3, fde $$4, fdi $$5) {
      azl $$6 = azl.a();
      long $$7 = 42L;

      for (jj $$8 : jj.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cvp $$0, cvm $$1, boolean $$2, fde $$3, ghg $$4, int $$5, int $$6, gzd $$7) {
      if (!$$0.f()) {
         $$3.a();
         boolean $$8 = $$1 == cvm.g || $$1 == cvm.h || $$1 == cvm.i;
         if ($$8) {
            if ($$0.a(cvt.vU)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cvt.qY)) {
               $$7 = this.o.a().a(m);
            } else if ($$0.a(cvt.qV) && cty.f($$0)) {
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

   private void a(cvp $$0, cvm $$1, boolean $$2, fde $$3, ghg $$4, int $$5, int $$6, boolean $$7) {
      if ($$0.h() instanceof cty $$8) {
         $$3.a();
         gzd $$9 = this.o.a().a(b($$8));
         $$9.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -1.5F);
         this.a($$0, $$1, $$3, $$4, $$5, $$6, $$9, $$7);
         $$3.b();
         $$3.a();
         cvp $$10 = cty.h($$0);
         gzd $$11 = this.o.a($$10);
         $$11.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.a($$10, $$1, $$3, $$4, $$5, $$6, $$11, $$7);
         $$3.b();
         $$3.a();
         gzd $$12 = this.o.a().a(a($$8));
         $$12.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, 0.5F);
         this.a($$0, $$1, $$3, $$4, $$5, $$6, $$12, $$7);
         $$3.b();
      }
   }

   private void a(cvp $$0, cvm $$1, fde $$2, ghg $$3, int $$4, int $$5, gzd $$6, boolean $$7) {
      if (!$$6.d() && (!$$0.a(cvt.vU) || $$7)) {
         ghq $$8 = ggy.a($$0);
         fdi $$10;
         if (a($$0) && $$0.z()) {
            fde.a $$9 = $$2.c().c();
            if ($$1 == cvm.g) {
               f.a($$9.a(), 0.5F);
            } else if ($$1.b()) {
               f.a($$9.a(), 0.75F);
            }

            $$10 = a($$3, $$8, $$9);
         } else {
            $$10 = a($$3, $$8, true, $$0.z());
         }

         this.a($$6, $$0, $$4, $$5, $$2, $$10);
      } else {
         this.r.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static boolean a(cvp $$0) {
      return $$0.a(axc.bh) || $$0.a(cvt.qX);
   }

   public static fdi a(ghg $$0, ghq $$1, boolean $$2) {
      return $$2 ? fdl.a($$0.getBuffer(ghq.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fdi a(ghg $$0, ghq $$1, fde.a $$2) {
      return fdl.a(new fdf($$0.getBuffer(ghq.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fdi a(ghg $$0, ghq $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fil.O() && $$1 == gib.j()
            ? fdl.a($$0.getBuffer(ghq.k()), $$0.getBuffer($$1))
            : fdl.a($$0.getBuffer($$2 ? ghq.l() : ghq.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private void a(fde $$0, fdi $$1, List<gim> $$2, cvp $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.f();
      fde.a $$7 = $$0.c();

      for (gim $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)axo.a($$9) / 255.0F;
         float $$11 = (float)axo.b($$9) / 255.0F;
         float $$12 = (float)axo.c($$9) / 255.0F;
         float $$13 = (float)axo.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gzd a(cvp $$0, @Nullable deg $$1, @Nullable buk $$2, int $$3) {
      gzd $$4;
      if ($$0.a(cvt.vU)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cvt.qY)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      gbh $$7 = $$1 instanceof gbh ? (gbh)$$1 : null;
      gzd $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public static gzo a(cty $$0) {
      return gzo.a(alc.b($$0.b()));
   }

   public static gzo b(cty $$0) {
      return gzo.a(alc.b($$0.c()));
   }

   public void a(cvp $$0, cvm $$1, int $$2, int $$3, fde $$4, ghg $$5, @Nullable deg $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable buk $$0, cvp $$1, cvm $$2, boolean $$3, fde $$4, ghg $$5, @Nullable deg $$6, int $$7, int $$8, int $$9) {
      if (!$$1.f()) {
         gzd $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aut $$0) {
      this.o.b();
   }

   @Nullable
   public gzd a(cvp $$0, buk $$1, cvm $$2) {
      return $$0.f() ? null : this.a($$0, $$1.dS(), $$1, $$1.ap() + $$2.ordinal());
   }
}
