import com.mojang.authlib.GameProfile;
import java.util.Map;

public class gcb<T extends bmk, M extends fjv<T> & fkd> extends gcw<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<ddq.a, fls> d;
   private final ftb e;

   public gcb(gag<T, M> $$0, fmr $$1, ftb $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gcb(gag<T, M> $$0, fmr $$1, float $$2, float $$3, float $$4, ftb $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = fvu.a($$1);
      this.e = $$5;
   }

   public void a(epz $$0, ftf $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cmx $$10 = $$3.c(blz.f);
      if (!$$10.b()) {
         cms $$11 = $$10.d();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof ceu || $$3 instanceof cdi;
         if ($$3.o_() && !($$3 instanceof ceu)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof ckq && ((ckq)$$11).e() instanceof cvl) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            GameProfile $$16 = null;
            if ($$10.u()) {
               sn $$17 = $$10.v();
               if ($$17.b("SkullOwner", 10)) {
                  $$16 = tc.a($$17.p("SkullOwner"));
               }
            }

            $$0.a(-0.5, 0.0, -0.5);
            ddq.a $$18 = ((cvl)((ckq)$$11).e()).b();
            fls $$19 = this.d.get($$18);
            ftn $$20 = fvu.a($$18, $$16);
            bnj $$22;
            if ($$3.cZ() instanceof bmk $$21) {
               $$22 = $$21.aQ;
            } else {
               $$22 = $$3.aQ;
            }

            float $$24 = $$22.c($$6);
            fvu.a(null, 180.0F, $$24, $$0, $$1, $$2, $$19, $$20);
         } else if (!($$11 instanceof ckh $$25) || $$25.g() != blz.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cmu.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(epz $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
