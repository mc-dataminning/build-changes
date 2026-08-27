import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fvb implements aou {
   public static final afw a = new afw("textures/misc/enchanted_glint_entity.png");
   public static final afw b = new afw("textures/misc/enchanted_glint_item.png");
   private static final Set<cke> k = Sets.newHashSet(new cke[]{ckm.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gci l = gci.c("trident", "inventory");
   public static final gci i = gci.c("trident_in_hand", "inventory");
   private static final gci m = gci.c("spyglass", "inventory");
   public static final gci j = gci.c("spyglass_in_hand", "inventory");
   private final ero n;
   private final foy o;
   private final gab p;
   private final est q;
   private final fon r;

   public fvb(ero $$0, gab $$1, gch $$2, est $$3, fon $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new foy($$2);
      this.r = $$4;

      for (cke $$5 : jy.i) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gci(jy.i.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public foy a() {
      return this.o;
   }

   private void a(gcb $$0, ckj $$1, int $$2, int $$3, emh $$4, eml $$5) {
      ate $$6 = ate.a();
      long $$7 = 42L;

      for (hx $$8 : hx.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(ckj $$0, ckg $$1, boolean $$2, emh $$3, fpb $$4, int $$5, int $$6, gcb $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == ckg.g || $$1 == ckg.h || $$1 == ckg.i;
         if ($$8) {
            if ($$0.a(ckm.uV)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(ckm.qj)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(ckm.uV) || $$8)) {
            boolean $$10;
            if ($$1 != ckg.g && !$$1.b() && $$0.d() instanceof cic) {
               cua $$9 = ((cic)$$0.d()).e();
               $$10 = !($$9 instanceof cxp) && !($$9 instanceof dbr);
            } else {
               $$10 = true;
            }

            fpj $$12 = fow.a($$0, $$10);
            eml $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               emh.a $$13 = $$3.c();
               if ($$1 == ckg.g) {
                  f.a($$13.a(), 0.5F);
               } else if ($$1.b()) {
                  f.a($$13.a(), 0.75F);
               }

               if ($$10) {
                  $$14 = b($$4, $$12, $$13);
               } else {
                  $$14 = a($$4, $$12, $$13);
               }

               $$3.b();
            } else if ($$10) {
               $$14 = c($$4, $$12, true, $$0.B());
            } else {
               $$14 = b($$4, $$12, true, $$0.B());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$14);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(ckj $$0) {
      return $$0.a(ara.aD) || $$0.a(ckm.qi);
   }

   public static eml a(fpb $$0, fpj $$1, boolean $$2, boolean $$3) {
      return $$3 ? emo.a($$0.getBuffer($$2 ? fpj.k() : fpj.l()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eml a(fpb $$0, fpj $$1, emh.a $$2) {
      return emo.a(new emi($$0.getBuffer(fpj.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eml b(fpb $$0, fpj $$1, emh.a $$2) {
      return emo.a(new emi($$0.getBuffer(fpj.o()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eml b(fpb $$0, fpj $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return ero.M() && $$1 == fpp.j()
            ? emo.a($$0.getBuffer(fpj.m()), $$0.getBuffer($$1))
            : emo.a($$0.getBuffer($$2 ? fpj.n() : fpj.p()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eml c(fpb $$0, fpj $$1, boolean $$2, boolean $$3) {
      return $$3 ? emo.a($$0.getBuffer($$2 ? fpj.o() : fpj.q()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(emh $$0, eml $$1, List<fpx> $$2, ckj $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      emh.a $$7 = $$0.c();

      for (fpx $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)($$9 >> 16 & 0xFF) / 255.0F;
         float $$11 = (float)($$9 >> 8 & 0xFF) / 255.0F;
         float $$12 = (float)($$9 & 0xFF) / 255.0F;
         $$1.a($$7, $$8, $$10, $$11, $$12, $$4, $$5);
      }
   }

   public gcb a(ckj $$0, @Nullable cqz $$1, @Nullable bkj $$2, int $$3) {
      gcb $$4;
      if ($$0.a(ckm.uV)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(ckm.qj)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fjr $$7 = $$1 instanceof fjr ? (fjr)$$1 : null;
      gcb $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(ckj $$0, ckg $$1, int $$2, int $$3, emh $$4, fpb $$5, @Nullable cqz $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bkj $$0, ckj $$1, ckg $$2, boolean $$3, emh $$4, fpb $$5, @Nullable cqz $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gcb $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aot $$0) {
      this.o.b();
   }
}
