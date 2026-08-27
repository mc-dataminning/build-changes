import com.mojang.authlib.GameProfile;
import java.util.Map;

public class gcq<T extends bmo, M extends fkj<T> & fkr> extends gdl<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<ddz.a, fmg> d;
   private final ftp e;

   public gcq(gav<T, M> $$0, fnf $$1, ftp $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gcq(gav<T, M> $$0, fnf $$1, float $$2, float $$3, float $$4, ftp $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = fwi.a($$1);
      this.e = $$5;
   }

   public void a(eqk $$0, ftt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cng $$10 = $$3.c(bmd.f);
      if (!$$10.b()) {
         cnb $$11 = $$10.d();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cfd || $$3 instanceof cdq;
         if ($$3.o_() && !($$3 instanceof cfd)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cla && ((cla)$$11).e() instanceof cvu) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            GameProfile $$16 = null;
            if ($$10.u()) {
               so $$17 = $$10.v();
               if ($$17.b("SkullOwner", 10)) {
                  $$16 = td.a($$17.p("SkullOwner"));
               }
            }

            $$0.a(-0.5, 0.0, -0.5);
            ddz.a $$18 = ((cvu)((cla)$$11).e()).b();
            fmg $$19 = this.d.get($$18);
            fub $$20 = fwi.a($$18, $$16);
            bnn $$22;
            if ($$3.cZ() instanceof bmo $$21) {
               $$22 = $$21.aQ;
            } else {
               $$22 = $$3.aQ;
            }

            float $$24 = $$22.c($$6);
            fwi.a(null, 180.0F, $$24, $$0, $$1, $$2, $$19, $$20);
         } else if (!($$11 instanceof ckr $$25) || $$25.g() != bmd.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cnd.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(eqk $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
