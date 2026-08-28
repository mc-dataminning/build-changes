import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class glf implements auf {
   public static final akr a = akr.b("textures/misc/enchanted_glint_entity.png");
   public static final akr b = akr.b("textures/misc/enchanted_glint_item.png");
   private static final Set<cul> k = Sets.newHashSet(new cul[]{cut.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gss l = gss.a(akr.b("trident"));
   public static final gss i = gss.a(akr.b("trident_in_hand"));
   private static final gss m = gss.a(akr.b("spyglass"));
   public static final gss j = gss.a(akr.b("spyglass_in_hand"));
   private final fgm n;
   private final geu o;
   private final gqk p;
   private final fhs q;
   private final gek r;

   public glf(fgm $$0, gqk $$1, gsr $$2, fhs $$3, gek $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new geu($$2);
      this.r = $$4;

      for (cul $$5 : lt.g) {
         if (!k.contains($$5)) {
            this.o.a($$5, gss.a(lt.g.b($$5)));
         }
      }

      this.q = $$3;
   }

   public geu a() {
      return this.o;
   }

   private void a(gsk $$0, cuq $$1, int $$2, int $$3, fbg $$4, fbk $$5) {
      ayw $$6 = ayw.a();
      long $$7 = 42L;

      for (ji $$8 : ji.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(cuq $$0, cun $$1, boolean $$2, fbg $$3, gex $$4, int $$5, int $$6, gsk $$7) {
      if (!$$0.e()) {
         $$3.a();
         boolean $$8 = $$1 == cun.g || $$1 == cun.h || $$1 == cun.i;
         if ($$8) {
            if ($$0.a(cut.vS)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(cut.qX)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(cut.vS) || $$8)) {
            boolean $$11;
            if ($$1 != cun.g && !$$1.b() && $$0.g() instanceof cso $$9) {
               dfy $$10 = $$9.d();
               $$11 = !($$10 instanceof djo) && !($$10 instanceof dns);
            } else {
               $$11 = true;
            }

            gff $$13 = ges.a($$0, $$11);
            fbk $$15;
            if (a($$0) && $$0.x()) {
               fbg.a $$14 = $$3.c().c();
               if ($$1 == cun.g) {
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

   private static boolean a(cuq $$0) {
      return $$0.a(awn.bc) || $$0.a(cut.qW);
   }

   public static fbk a(gex $$0, gff $$1, boolean $$2) {
      return $$2 ? fbn.a($$0.getBuffer(gff.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static fbk a(gex $$0, gff $$1, fbg.a $$2) {
      return fbn.a(new fbh($$0.getBuffer(gff.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fbk a(gex $$0, gff $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fgm.O() && $$1 == gfm.j()
            ? fbn.a($$0.getBuffer(gff.k()), $$0.getBuffer($$1))
            : fbn.a($$0.getBuffer($$2 ? gff.l() : gff.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static fbk b(gex $$0, gff $$1, boolean $$2, boolean $$3) {
      return $$3 ? fbn.a($$0.getBuffer($$2 ? gff.l() : gff.n()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(fbg $$0, fbk $$1, List<gfu> $$2, cuq $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.e();
      fbg.a $$7 = $$0.c();

      for (gfu $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)axy.b.a($$9) / 255.0F;
         float $$11 = (float)axy.b.b($$9) / 255.0F;
         float $$12 = (float)axy.b.c($$9) / 255.0F;
         float $$13 = (float)axy.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gsk a(cuq $$0, @Nullable dcw $$1, @Nullable btn $$2, int $$3) {
      gsk $$4;
      if ($$0.a(cut.vS)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(cut.qX)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fzd $$7 = $$1 instanceof fzd ? (fzd)$$1 : null;
      gsk $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(cuq $$0, cun $$1, int $$2, int $$3, fbg $$4, gex $$5, @Nullable dcw $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable btn $$0, cuq $$1, cun $$2, boolean $$3, fbg $$4, gex $$5, @Nullable dcw $$6, int $$7, int $$8, int $$9) {
      if (!$$1.e()) {
         gsk $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(aue $$0) {
      this.o.b();
   }
}
