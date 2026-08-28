import java.util.List;
import javax.annotation.Nullable;

public class gpy implements avf {
   public static final all a = all.b("textures/misc/enchanted_glint_entity.png");
   public static final all b = all.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final hbj i = hbj.a(all.b("trident"));
   public static final hbj j = hbj.a(all.b("spyglass"));
   private final hbi k;
   private final gir l;
   private final fld m;
   private final gie n;

   public gpy(hbi $$0, fld $$1, gie $$2) {
      this.k = $$0;
      this.l = new gir($$0);
      this.n = $$2;
      this.m = $$1;
   }

   private void a(hav $$0, cwf $$1, int $$2, int $$3, fek $$4, feo $$5) {
      azv $$6 = azv.a();
      long $$7 = 42L;

      for (jm $$8 : jm.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cwf $$0, cwd $$1, boolean $$2, fek $$3, gix $$4, int $$5, int $$6, hav $$7) {
      if (!$$0.f()) {
         this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, a($$1));
      }
   }

   public void a(cwf $$0, cwd $$1, boolean $$2, fek $$3, gix $$4, int $$5, int $$6, hav $$7, @Nullable dff $$8, @Nullable bve $$9, int $$10) {
      if ($$0.h() instanceof cus $$11) {
         if (cus.g($$0)) {
            boolean $$13 = a($$1);
            hav $$14 = this.a(this.l.a($$11.c()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$14, $$13, -1.5F);
            cwf $$15 = cus.i($$0);
            hav $$16 = this.a($$15, $$8, $$9, $$10);
            this.a($$15, $$1, $$2, $$3, $$4, $$5, $$6, $$16, $$13);
            hav $$17 = this.a(this.l.a($$11.b()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$17, $$13, 0.5F);
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(cwf $$0, cwd $$1, boolean $$2, fek $$3, gix $$4, int $$5, int $$6, hav $$7, boolean $$8) {
      if ($$8) {
         if ($$0.a(cwj.wk)) {
            $$7 = this.k.a(i);
         } else if ($$0.a(cwj.ro)) {
            $$7 = this.k.a(j);
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, -0.5F);
   }

   private void a(cwf $$0, cwd $$1, boolean $$2, fek $$3, gix $$4, int $$5, int $$6, hav $$7, boolean $$8, float $$9) {
      $$3.a();
      $$7.f().a($$1).a($$2, $$3);
      $$3.a(-0.5F, -0.5F, $$9);
      this.a($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8);
      $$3.b();
   }

   private void a(cwf $$0, cwd $$1, fek $$2, gix $$3, int $$4, int $$5, hav $$6, boolean $$7) {
      if (!$$6.d() && (!$$0.a(cwj.wk) || $$7)) {
         gjh $$8 = gip.a($$0);
         feo $$10;
         if (a($$0) && $$0.B()) {
            fek.a $$9 = $$2.c().c();
            if ($$1 == cwd.g) {
               f.a($$9.a(), 0.5F);
            } else if ($$1.b()) {
               f.a($$9.a(), 0.75F);
            }

            $$10 = a($$3, $$8, $$9);
         } else {
            $$10 = a($$3, $$8, true, $$0.B());
         }

         this.a($$6, $$0, $$4, $$5, $$2, $$10);
      } else {
         this.n.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static boolean a(cwd $$0) {
      return $$0 == cwd.g || $$0 == cwd.h || $$0 == cwd.i;
   }

   private static boolean a(cwf $$0) {
      return $$0.a(axm.bu) || $$0.a(cwj.rn);
   }

   public static feo a(gix $$0, gjh $$1, boolean $$2) {
      return $$2 ? fer.a($$0.getBuffer(gjh.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static feo a(gix $$0, gjh $$1, fek.a $$2) {
      return fer.a(new fel($$0.getBuffer(gjh.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static feo a(gix $$0, gjh $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fjx.O() && $$1 == gjs.j()
            ? fer.a($$0.getBuffer(gjh.k()), $$0.getBuffer($$1))
            : fer.a($$0.getBuffer($$2 ? gjh.l() : gjh.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private void a(fek $$0, feo $$1, List<gke> $$2, cwf $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.f();
      fek.a $$7 = $$0.c();

      for (gke $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.m.a($$3, $$8.d());
         }

         float $$10 = (float)axy.a($$9) / 255.0F;
         float $$11 = (float)axy.b($$9) / 255.0F;
         float $$12 = (float)axy.c($$9) / 255.0F;
         float $$13 = (float)axy.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public hav a(cwf $$0, @Nullable dff $$1, @Nullable bve $$2, int $$3) {
      hav $$4 = this.l.a($$0);
      return this.a($$4, $$0, $$1, $$2, $$3);
   }

   public void a(cwf $$0, cwd $$1, int $$2, int $$3, fek $$4, gix $$5, @Nullable dff $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bve $$0, cwf $$1, cwd $$2, boolean $$3, fek $$4, gix $$5, @Nullable dff $$6, int $$7, int $$8, int $$9) {
      if (!$$1.f()) {
         hav $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(ave $$0) {
      this.l.a();
   }

   @Nullable
   public hav a(cwf $$0, bve $$1, cwd $$2) {
      return $$0.f() ? null : this.a($$0, $$1.dY(), $$1, $$1.as() + $$2.ordinal());
   }

   private hav a(hav $$0, cwf $$1, @Nullable dff $$2, @Nullable bve $$3, int $$4) {
      gcy $$5 = $$2 instanceof gcy ? (gcy)$$2 : null;
      hav $$6 = $$0.g().a($$1, $$5, $$3, $$4);
      return $$6 == null ? $$0 : $$6;
   }
}
