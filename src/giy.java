import com.mojang.authlib.GameProfile;
import java.util.Map;

public class giy<T extends bqo, M extends fqm<T> & fqu> extends gjt<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<diz.a, fsj> d;
   private final fzv e;

   public giy(ghd<T, M> $$0, fti $$1, fzv $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public giy(ghd<T, M> $$0, fti $$1, float $$2, float $$3, float $$4, fzv $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = gco.a($$1);
      this.e = $$5;
   }

   public void a(ewi $$0, fzz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      crj $$10 = $$3.d(bqc.f);
      if (!$$10.d()) {
         cre $$11 = $$10.f();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cjg || $$3 instanceof cht;
         if ($$3.p_() && !($$3 instanceof cjg)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cph && ((cph)$$11).d() instanceof dau) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            cug $$16 = $$10.a(jp.L);
            GameProfile $$17 = $$16 != null ? $$16.f() : null;
            $$0.a(-0.5, 0.0, -0.5);
            diz.a $$18 = ((dau)((cph)$$11).d()).b();
            fsj $$19 = this.d.get($$18);
            gah $$20 = gco.a($$18, $$17);
            bro $$22;
            if ($$3.cZ() instanceof bqo $$21) {
               $$22 = $$21.aT;
            } else {
               $$22 = $$3.aT;
            }

            float $$24 = $$22.c($$6);
            gco.a(null, 180.0F, $$24, $$0, $$1, $$2, $$19, $$20);
         } else if (!($$11 instanceof coy $$25) || $$25.k() != bqc.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, crg.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(ewi $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
