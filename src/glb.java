import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class glb implements aue {
   public static final akq a = akq.b("textures/misc/enchanted_glint_entity.png");
   public static final akq b = akq.b("textures/misc/enchanted_glint_item.png");
   private static final Set<cuj> k = Sets.newHashSet(new cuj[]{cur.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gsn l = gsn.d("trident", "inventory");
   public static final gsn i = gsn.d("trident_in_hand", "inventory");
   private static final gsn m = gsn.d("spyglass", "inventory");
   public static final gsn j = gsn.d("spyglass_in_hand", "inventory");
   private final fgi n;
   private final geq o;
   private final gqg p;
   private final fho q;
   private final geg r;

   public glb(fgi $$0, gqg $$1, gsm $$2, fho $$3, geg $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new geq($$2);
      this.r = $$4;

      for (cuj $$5 : lt.g) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gsn(lt.g.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public geq a() {
      return this.o;
   }

   private void a(gsg $$0, cuo $$1, int $$2, int $$3, fbc $$4, fbg $$5) {
      ayv $$6 = ayv.a();
      long $$7 = 42L;

      for (ji $$8 : ji.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cuo $$0, cul $$1, boolean $$2, fbc $$3, get $$4, int $$5, int $$6, gsg $$7) {
      if (!$$0.e()) {
         $$3.a();
         boolean $$8 = $$1 == cul.g || $$1 == cul.h || $$1 == cul.i;
         if ($$8) {
            if ($$0.a(cur.vS)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cur.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cur.vS) || $$8)) {
            boolean $$11;
            if ($$1 != cul.g && !$$1.b() && $$0.g() instanceof csm $$9) {
               dfw $$10 = $$9.d();
               $$11 = !($$10 instanceof djm) && !($$10 instanceof dnq);
            } else {
               $$11 = true;
            }

            gfb $$13 = geo.a($$0, $$11);
            fbg $$15;
            if (a($$0) && $$0.x()) {
               fbc.a $$14 = $$3.c().c();
               if ($$1 == cul.g) {
                  f.a($$14.a(), 0.5F);
               } else if ($$1.b()) {
                  f.a($$14.a(), 0.75F);
               }

               $$15 = a($$4, $$13, $$14);
            } else if ($$11) {
               $$15 = b($$4, $$13, true, $$0.x());
            } else {
               $$15 = a($$4, $$13, true, $$0.x());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$15);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(cuo $$0) {
      return $$0.a(awm.bc) || $$0.a(cur.qW);
   }

   public static fbg a(get $$0, gfb $$1, boolean $$2) {
      return $$2 ? fbj.a($$0.getBuffer(gfb.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fbg a(get $$0, gfb $$1, fbc.a $$2) {
      return fbj.a(new fbd($$0.getBuffer(gfb.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fbg a(get $$0, gfb $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fgi.O() && $$1 == gfi.j()
            ? fbj.a($$0.getBuffer(gfb.k()), $$0.getBuffer($$1))
            : fbj.a($$0.getBuffer($$2 ? gfb.l() : gfb.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static fbg b(get $$0, gfb $$1, boolean $$2, boolean $$3) {
      return $$3 ? fbj.a($$0.getBuffer($$2 ? gfb.l() : gfb.n()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(fbc $$0, fbg $$1, List<gfq> $$2, cuo $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.e();
      fbc.a $$7 = $$0.c();

      for (gfq $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)axx.b.a($$9) / 255.0F;
         float $$11 = (float)axx.b.b($$9) / 255.0F;
         float $$12 = (float)axx.b.c($$9) / 255.0F;
         float $$13 = (float)axx.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gsg a(cuo $$0, @Nullable dcu $$1, @Nullable btl $$2, int $$3) {
      gsg $$4;
      if ($$0.a(cur.vS)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cur.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fyz $$7 = $$1 instanceof fyz ? (fyz)$$1 : null;
      gsg $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cuo $$0, cul $$1, int $$2, int $$3, fbc $$4, get $$5, @Nullable dcu $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable btl $$0, cuo $$1, cul $$2, boolean $$3, fbc $$4, get $$5, @Nullable dcu $$6, int $$7, int $$8, int $$9) {
      if (!$$1.e()) {
         gsg $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aud $$0) {
      this.o.b();
   }
}
