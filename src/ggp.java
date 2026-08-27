import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ggp implements atf {
   public static final ajv a = new ajv("textures/misc/enchanted_glint_entity.png");
   public static final ajv b = new ajv("textures/misc/enchanted_glint_item.png");
   private static final Set<crn> k = Sets.newHashSet(new crn[]{crv.a});
   public static final int c = 8;
   public static final int d = 8;
   public static final int e = 200;
   public static final float f = 0.5F;
   public static final float g = 0.75F;
   public static final float h = 0.0078125F;
   private static final gnz l = gnz.c("trident", "inventory");
   public static final gnz i = gnz.c("trident_in_hand", "inventory");
   private static final gnz m = gnz.c("spyglass", "inventory");
   public static final gnz j = gnz.c("spyglass_in_hand", "inventory");
   private final fby n;
   private final gaf o;
   private final glt p;
   private final fdg q;
   private final fzv r;

   public ggp(fby $$0, glt $$1, gny $$2, fdg $$3, fzv $$4) {
      this.n = $$0;
      this.p = $$1;
      this.o = new gaf($$2);
      this.r = $$4;

      for (crn $$5 : kt.h) {
         if (!k.contains($$5)) {
            this.o.a($$5, new gnz(kt.h.b($$5), "inventory"));
         }
      }

      this.q = $$3;
   }

   public gaf a() {
      return this.o;
   }

   private void a(gns $$0, crs $$1, int $$2, int $$3, ewr $$4, ewv $$5) {
      axt $$6 = axt.a();
      long $$7 = 42L;

      for (ij $$8 : ij.values()) {
         $$6.b(42L);
         this.a($$4, $$5, $$0.a(null, $$8, $$6), $$1, $$2, $$3);
      }

      $$6.b(42L);
      this.a($$4, $$5, $$0.a(null, null, $$6), $$1, $$2, $$3);
   }

   public void a(crs $$0, crp $$1, boolean $$2, ewr $$3, gai $$4, int $$5, int $$6, gns $$7) {
      if (!$$0.d()) {
         $$3.a();
         boolean $$8 = $$1 == crp.g || $$1 == crp.h || $$1 == crp.i;
         if ($$8) {
            if ($$0.a(crv.vN)) {
               $$7 = this.o.a().a(l);
            } else if ($$0.a(crv.qW)) {
               $$7 = this.o.a().a(m);
            }
         }

         $$7.f().a($$1).a($$2, $$3);
         $$3.a(-0.5F, -0.5F, -0.5F);
         if (!$$7.d() && (!$$0.a(crv.vN) || $$8)) {
            boolean $$10;
            if ($$1 != crp.g && !$$1.b() && $$0.f() instanceof cpq) {
               dch $$9 = ((cpq)$$0.f()).d();
               $$10 = !($$9 instanceof dfx) && !($$9 instanceof djz);
            } else {
               $$10 = true;
            }

            gaq $$12 = gad.a($$0, $$10);
            ewv $$14;
            if (a($$0) && $$0.x()) {
               ewr.a $$13 = $$3.c().c();
               if ($$1 == crp.g) {
                  f.a($$13.a(), 0.5F);
               } else if ($$1.b()) {
                  f.a($$13.a(), 0.75F);
               }

               if ($$10) {
                  $$14 = b($$4, $$12, $$13);
               } else {
                  $$14 = a($$4, $$12, $$13);
               }
            } else if ($$10) {
               $$14 = c($$4, $$12, true, $$0.x());
            } else {
               $$14 = b($$4, $$12, true, $$0.x());
            }

            this.a($$7, $$0, $$5, $$6, $$3, $$14);
         } else {
            this.r.a($$0, $$1, $$3, $$4, $$5, $$6);
         }

         $$3.b();
      }
   }

   private static boolean a(crs $$0) {
      return $$0.a(avm.aD) || $$0.a(crv.qV);
   }

   public static ewv a(gai $$0, gaq $$1, boolean $$2, boolean $$3) {
      return $$3 ? ewy.a($$0.getBuffer($$2 ? gaq.j() : gaq.k()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   public static ewv a(gai $$0, gaq $$1, ewr.a $$2) {
      return ewy.a(new ews($$0.getBuffer(gaq.m()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static ewv b(gai $$0, gaq $$1, ewr.a $$2) {
      return ewy.a(new ews($$0.getBuffer(gaq.n()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static ewv b(gai $$0, gaq $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return fby.O() && $$1 == gax.j()
            ? ewy.a($$0.getBuffer(gaq.l()), $$0.getBuffer($$1))
            : ewy.a($$0.getBuffer($$2 ? gaq.m() : gaq.o()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   public static ewv c(gai $$0, gaq $$1, boolean $$2, boolean $$3) {
      return $$3 ? ewy.a($$0.getBuffer($$2 ? gaq.n() : gaq.p()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private void a(ewr $$0, ewv $$1, List<gbf> $$2, crs $$3, int $$4, int $$5) {
      boolean $$6 = !$$3.d();
      ewr.a $$7 = $$0.c();

      for (gbf $$8 : $$2) {
         int $$9 = -1;
         if ($$6 && $$8.c()) {
            $$9 = this.q.a($$3, $$8.d());
         }

         float $$10 = (float)aww.b.a($$9) / 255.0F;
         float $$11 = (float)aww.b.b($$9) / 255.0F;
         float $$12 = (float)aww.b.c($$9) / 255.0F;
         float $$13 = (float)aww.b.d($$9) / 255.0F;
         $$1.a($$7, $$8, $$11, $$12, $$13, $$10, $$4, $$5);
      }
   }

   public gns a(crs $$0, @Nullable czg $$1, @Nullable bqt $$2, int $$3) {
      gns $$4;
      if ($$0.a(crv.vN)) {
         $$4 = this.o.a().a(i);
      } else if ($$0.a(crv.qW)) {
         $$4 = this.o.a().a(j);
      } else {
         $$4 = this.o.a($$0);
      }

      fuq $$7 = $$1 instanceof fuq ? (fuq)$$1 : null;
      gns $$8 = $$4.g().a($$4, $$0, $$7, $$2, $$3);
      return $$8 == null ? this.o.a().a() : $$8;
   }

   public void a(crs $$0, crp $$1, int $$2, int $$3, ewr $$4, gai $$5, @Nullable czg $$6, int $$7) {
      this.a(null, $$0, $$1, false, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable bqt $$0, crs $$1, crp $$2, boolean $$3, ewr $$4, gai $$5, @Nullable czg $$6, int $$7, int $$8, int $$9) {
      if (!$$1.d()) {
         gns $$10 = this.a($$1, $$6, $$0, $$9);
         this.a($$1, $$2, $$3, $$4, $$5, $$7, $$8, $$10);
      }
   }

   @Override
   public void a(ate $$0) {
      this.o.b();
   }
}
