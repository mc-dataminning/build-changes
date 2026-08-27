import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gbr implements asb {
   public static final aiy a = new aiy("textures/misc/enchanted_glint_entity.png");
   public static final aiy b = new aiy("textures/misc/enchanted_glint_item.png");
   private static final Set<cou> k = Sets.newHashSet(new cou[]{cpc.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gjb l = gjb.c("trident", "inventory");
   public static final gjb i = gjb.c("trident_in_hand", "inventory");
   private static final gjb m = gjb.c("spyglass", "inventory");
   public static final gjb j = gjb.c("spyglass_in_hand", "inventory");
   private final exh n;
   private final fvj o;
   private final ggv p;
   private final eyp q;
   private final fuz r;

   public gbr(exh $$0, ggv $$1, gja $$2, eyp $$3, fuz $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new fvj($$2);
      this.r = $$4;

      for (cou $$5 : kf.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gjb(kf.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public fvj a() {
      return this.o;
   }

   private void a(giu $$0, coz $$1, int $$2, int $$3, esa $$4, ese $$5) {
      awo $$6 = awo.a();
      long $$7 = 42L;

      for (ie $$8 : ie.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(coz $$0, cow $$1, boolean $$2, esa $$3, fvm $$4, int $$5, int $$6, giu $$7) {
      if (!$$0.b()) {
         $$3.a();
         boolean $$8 = $$1 == cow.g || $$1 == cow.h || $$1 == cow.i;
         if ($$8) {
            if ($$0.a(cpc.vL)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cpc.qW)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cpc.vL) || $$8)) {
            boolean $$10;
            if ($$1 != cow.g && !$$1.b() && $$0.d() instanceof cms) {
               cyo $$9 = ((cms)$$0.d()).e();
               $$10 = !($$9 instanceof dce) && !($$9 instanceof dgg);
            } else {
               $$10 = true;
            }

            fvu $$12 = fvh.a($$0, $$10);
            ese $$14;
            if (a($$0) && $$0.C()) {
               $$3.a();
               esa.a $$13 = $$3.c();
               if ($$1 == cow.g) {
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
               $$14 = c($$4, $$12, true, $$0.C());
            } else {
               $$14 = b($$4, $$12, true, $$0.C());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$14);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(coz $$0) {
      return $$0.a(auh.aD) || $$0.a(cpc.qV);
   }

   public static ese a(fvm $$0, fvu $$1, boolean $$2, boolean $$3) {
      return $$3 ? esh.a($$0.getBuffer($$2 ? fvu.j() : fvu.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static ese a(fvm $$0, fvu $$1, esa.a $$2) {
      return esh.a(new esb($$0.getBuffer(fvu.m()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static ese b(fvm $$0, fvu $$1, esa.a $$2) {
      return esh.a(new esb($$0.getBuffer(fvu.n()), $$2.a(), $$2.b(), 0.0078125F), $$0.getBuffer($$1));
   }

   public static ese b(fvm $$0, fvu $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return exh.M() && $$1 == fwb.j()
            ? esh.a($$0.getBuffer(fvu.l()), $$0.getBuffer($$1))
            : esh.a($$0.getBuffer($$2 ? fvu.m() : fvu.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static ese c(fvm $$0, fvu $$1, boolean $$2, boolean $$3) {
      return $$3 ? esh.a($$0.getBuffer($$2 ? fvu.n() : fvu.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(esa $$0, ese $$1, List<fwj> $$2, coz $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.b();
      esa.a $$7 = $$0.c();

      for (fwj $$8 : $$2) {
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

   public giu a(coz $$0, @Nullable cvn $$1, @Nullable bog $$2, int $$3) {
      giu $$4;
      if ($$0.a(cpc.vL)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cpc.qW)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fpx $$7 = $$1 instanceof fpx ? (fpx)$$1 : null;
      giu $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(coz $$0, cow $$1, int $$2, int $$3, esa $$4, fvm $$5, @Nullable cvn $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bog $$0, coz $$1, cow $$2, boolean $$3, esa $$4, fvm $$5, @Nullable cvn $$6, int $$7, int $$8, int $$9) {
      if (!$$1.b()) {
         giu $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(asa $$0) {
      this.o.b();
   }
}
