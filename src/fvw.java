import com.mojang.authlib.GameProfile;
import java.util.Map;

public class fvw<T extends biw, M extends fek<T> & fes> extends fwr<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<czm.a, fgh> d;
   private final fnc e;

   public fvw(fue<T, M> $$0, fhf $$1, fnc $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public fvw(fue<T, M> $$0, fhf $$1, float $$2, float $$3, float $$4, fnc $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = fpv.a($$1);
      this.e = $$5;
   }

   public void a(elh $$0, fng $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ciw $$10 = $$3.c(bil.f);
      if (!$$10.b()) {
         cir $$11 = $$10.d();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cay || $$3 instanceof bzt;
         if ($$3.i_() && !($$3 instanceof cay)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cgp && ((cgp)$$11).e() instanceof crh) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            GameProfile $$16 = null;
            if ($$10.u()) {
               qs $$17 = $$10.v();
               if ($$17.b("SkullOwner", 10)) {
                  $$16 = re.a($$17.p("SkullOwner"));
               }
            }

            $$0.a(-0.5, 0.0, -0.5);
            czm.a $$18 = ((crh)((cgp)$$11).e()).a();
            fgh $$19 = this.d.get($$18);
            fno $$20 = fpv.a($$18, $$16);
            bjw $$22;
            if ($$3.cY() instanceof biw $$21) {
               $$22 = $$21.aQ;
            } else {
               $$22 = $$3.aQ;
            }

            float $$24 = $$22.c($$6);
            fpv.a(null, 180.0F, $$24, $$0, $$1, $$2, $$19, $$20);
         } else if (!($$11 instanceof cgg $$25) || $$25.g() != bil.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cit.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(elh $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
