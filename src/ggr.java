import com.mojang.authlib.GameProfile;
import java.util.Map;

public class ggr<T extends bpp, M extends foe<T> & fom> extends ghm<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dhd.a, fqc> d;
   private final fxo e;

   public ggr(gew<T, M> $$0, frb $$1, fxo $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public ggr(gew<T, M> $$0, frb $$1, float $$2, float $$3, float $$4, fxo $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = gah.a($$1);
      this.e = $$5;
   }

   public void a(eub $$0, fxs $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cqm $$10 = $$3.d(bpe.f);
      if (!$$10.b()) {
         cqh $$11 = $$10.d();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cih || $$3 instanceof cgu;
         if ($$3.o_() && !($$3 instanceof cih)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof coh && ((coh)$$11).d() instanceof cyy) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            GameProfile $$16 = null;
            if ($$10.v()) {
               ta $$17 = $$10.w();
               if ($$17.b("SkullOwner", 10)) {
                  $$16 = tp.a($$17.p("SkullOwner"));
               }
            }

            $$0.a(-0.5, 0.0, -0.5);
            dhd.a $$18 = ((cyy)((coh)$$11).d()).b();
            fqc $$19 = this.d.get($$18);
            fya $$20 = gah.a($$18, $$16);
            bqp $$22;
            if ($$3.cZ() instanceof bpp $$21) {
               $$22 = $$21.aT;
            } else {
               $$22 = $$3.aT;
            }

            float $$24 = $$22.c($$6);
            gah.a(null, 180.0F, $$24, $$0, $$1, $$2, $$19, $$20);
         } else if (!($$11 instanceof cny $$25) || $$25.i() != bpe.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cqj.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(eub $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
