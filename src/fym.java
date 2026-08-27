import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fym implements apt {
   public static final agt a = new agt("textures/misc/enchanted_glint_entity.png");
   public static final agt b = new agt("textures/misc/enchanted_glint_item.png");
   private static final Set<cmc> k = Sets.newHashSet(new cmc[]{cmk.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gfw l = gfw.c("trident", "inventory");
   public static final gfw i = gfw.c("trident_in_hand", "inventory");
   private static final gfw m = gfw.c("spyglass", "inventory");
   public static final gfw j = gfw.c("spyglass_in_hand", "inventory");
   private final euk n;
   private final fsf o;
   private final gdp p;
   private final evr q;
   private final frv r;

   public fym(euk $$0, gdp $$1, gfv $$2, evr $$3, frv $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fsf($$2);
      this.r = $$4;

      for (cmc $$5 : kb.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gfw(kb.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fsf a() {
      return this.o;
   }

   private void a(gfp $$0, cmh $$1, int $$2, int $$3, epd $$4, eph $$5) {
      auf $$6 = auf.a();
      long $$7 = 42L;

      for (ia $$8 : ia.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cmh $$0, cme $$1, boolean $$2, epd $$3, fsi $$4, int $$5, int $$6, gfp $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cme.g || $$1 == cme.h || $$1 == cme.i;
         if ($$8) {
            if ($$0.a(cmk.vI)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cmk.qU)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cmk.vI) || $$8)) {
            boolean $$10;
            if ($$1 != cme.g && !$$1.b() && $$0.d() instanceof cka) {
               cvz $$9 = ((cka)$$0.d()).e();
               $$10 = !($$9 instanceof czp) && !($$9 instanceof ddr);
            } else {
               $$10 = true;
            }

            fsq $$12 = fsd.a($$0, $$10);
            eph $$14;
            if (a($$0) && $$0.B()) {
               $$3.a();
               epd.a $$13 = $$3.c();
               if ($$1 == cme.g) {
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

   private static boolean a(cmh $$0) {
      return $$0.a(arz.aD) || $$0.a(cmk.qT);
   }

   public static eph a(fsi $$0, fsq $$1, boolean $$2, boolean $$3) {
      return $$3 ? epk.a($$0.getBuffer($$2 ? fsq.j() : fsq.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static eph a(fsi $$0, fsq $$1, epd.a $$2) {
      return epk.a(new epe($$0.getBuffer(fsq.m()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eph b(fsi $$0, fsq $$1, epd.a $$2) {
      return epk.a(new epe($$0.getBuffer(fsq.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static eph b(fsi $$0, fsq $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return euk.L() && $$1 == fsx.j()
            ? epk.a($$0.getBuffer(fsq.l()), $$0.getBuffer($$1))
            : epk.a($$0.getBuffer($$2 ? fsq.m() : fsq.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static eph c(fsi $$0, fsq $$1, boolean $$2, boolean $$3) {
      return $$3 ? epk.a($$0.getBuffer($$2 ? fsq.n() : fsq.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(epd $$0, eph $$1, List<ftf> $$2, cmh $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      epd.a $$7 = $$0.c();

      for (ftf $$8 : $$2) {
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

   public gfp a(cmh $$0, @Nullable csy $$1, @Nullable blv $$2, int $$3) {
      gfp $$4;
      if ($$0.a(cmk.vI)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cmk.qU)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fmt $$7 = $$1 instanceof fmt ? (fmt)$$1 : null;
      gfp $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cmh $$0, cme $$1, int $$2, int $$3, epd $$4, fsi $$5, @Nullable csy $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable blv $$0, cmh $$1, cme $$2, boolean $$3, epd $$4, fsi $$5, @Nullable csy $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         gfp $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aps $$0) {
      this.o.b();
   }
}
