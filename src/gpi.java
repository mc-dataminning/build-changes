import java.util.List;
import javax.annotation.Nullable;

public class gpi implements avc {
   public static final ali a = ali.b("textures/misc/enchanted_glint_entity.png");
   public static final ali b = ali.b("textures/misc/enchanted_glint_item.png");
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   public static final hat i = hat.a(ali.b("trident"));
   public static final hat j = hat.a(ali.b("spyglass"));
   private final has k;
   private final gib l;
   private final fko m;
   private final gho n;

   public gpi(has $$0, fko $$1, gho $$2) {
      this.k = $$0;
      this.l = new gib($$0);
      this.n = $$2;
      this.m = $$1;
   }

   private void a(haf $$0, cwb $$1, int $$2, int $$3, feb $$4, fef $$5) {
      azs $$6 = azs.a();
      long $$7 = 42L;

      for (jm $$8 : jm.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cwb $$0, cvz $$1, boolean $$2, feb $$3, gih $$4, int $$5, int $$6, haf $$7) {
      if (!$$0.f()) {
         this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, a($$1));
      }
   }

   public void a(cwb $$0, cvz $$1, boolean $$2, feb $$3, gih $$4, int $$5, int $$6, haf $$7, @Nullable dfb $$8, @Nullable bva $$9, int $$10) {
      if ($$0.h() instanceof cuo $$11) {
         if (cuo.g($$0)) {
            boolean $$13 = a($$1);
            haf $$14 = this.a(this.l.a($$11.c()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$14, $$13, -1.5F);
            cwb $$15 = cuo.i($$0);
            haf $$16 = this.a($$15, $$8, $$9, $$10);
            this.a($$15, $$1, $$2, $$3, $$4, $$5, $$6, $$16, $$13);
            haf $$17 = this.a(this.l.a($$11.b()), $$0, $$8, $$9, $$10);
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$17, $$13, 0.5F);
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         }
      }
   }

   private void a(cwb $$0, cvz $$1, boolean $$2, feb $$3, gih $$4, int $$5, int $$6, haf $$7, boolean $$8) {
      if ($$8) {
         if ($$0.a(cwf.vU)) {
            $$7 = this.k.a(i);
         } else if ($$0.a(cwf.qY)) {
            $$7 = this.k.a(j);
         }
      }

      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, -0.5F);
   }

   private void a(cwb $$0, cvz $$1, boolean $$2, feb $$3, gih $$4, int $$5, int $$6, haf $$7, boolean $$8, float $$9) {
      $$3.a();
      $$7.f().a($$1).a($$2, $$3);
      $$3.a(-0.5F, -0.5F, $$9);
      this.a($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8);
      $$3.b();
   }

   private void a(cwb $$0, cvz $$1, feb $$2, gih $$3, int $$4, int $$5, haf $$6, boolean $$7) {
      if (!$$6.d() && (!$$0.a(cwf.vU) || $$7)) {
         gir $$8 = ghz.a($$0);
         fef $$10;
         if (a($$0) && $$0.B()) {
            feb.a $$9 = $$2.c().c();
            if ($$1 == cvz.g) {
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

   private static boolean a(cvz $$0) {
      return $$0 == cvz.g || $$0 == cvz.h || $$0 == cvz.i;
   }

   private static boolean a(cwb $$0) {
      return $$0.a(axj.bt) || $$0.a(cwf.qX);
   }

   public static fef a(gih $$0, gir $$1, boolean $$2) {
      return $$2 ? fei.a($$0.getBuffer(gir.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fef a(gih $$0, gir $$1, feb.a $$2) {
      return fei.a(new fec($$0.getBuffer(gir.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fef a(gih $$0, gir $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fji.O() && $$1 == gjc.j()
            ? fei.a($$0.getBuffer(gir.k()), $$0.getBuffer($$1))
            : fei.a($$0.getBuffer($$2 ? gir.l() : gir.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private void a(feb $$0, fef $$1, List<gjo> $$2, cwb $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.f();
      feb.a $$7 = $$0.c();

      for (gjo $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.m.a($$3, $$8.d());
         }

         float $$10 = (float)axv.a($$9) / 255.0F;
         float $$11 = (float)axv.b($$9) / 255.0F;
         float $$12 = (float)axv.c($$9) / 255.0F;
         float $$13 = (float)axv.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public haf a(cwb $$0, @Nullable dfb $$1, @Nullable bva $$2, int $$3) {
      haf $$4 = this.l.a($$0);
      return this.a($$4, $$0, $$1, $$2, $$3);
   }

   public void a(cwb $$0, cvz $$1, int $$2, int $$3, feb $$4, gih $$5, @Nullable dfb $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bva $$0, cwb $$1, cvz $$2, boolean $$3, feb $$4, gih $$5, @Nullable dfb $$6, int $$7, int $$8, int $$9) {
      if (!$$1.f()) {
         haf $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(avb $$0) {
      this.l.a();
   }

   @Nullable
   public haf a(cwb $$0, bva $$1, cvz $$2) {
      return $$0.f() ? null : this.a($$0, $$1.dX(), $$1, $$1.as() + $$2.ordinal());
   }

   private haf a(haf $$0, cwb $$1, @Nullable dfb $$2, @Nullable bva $$3, int $$4) {
      gci $$5 = $$2 instanceof gci ? (gci)$$2 : null;
      haf $$6 = $$0.g().a($$1, $$5, $$3, $$4);
      return $$6 == null ? $$0 : $$6;
   }
}
