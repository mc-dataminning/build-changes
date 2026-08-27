import com.mojang.authlib.GameProfile;
import java.util.Map;

public class fzk<T extends blg, M extends fhp<T> & fhx> extends gaf<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dcb.a, fjm> d;
   private final fqq e;

   public fzk(fxs<T, M> $$0, fkk $$1, fqq $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public fzk(fxs<T, M> $$0, fkk $$1, float $$2, float $$3, float $$4, fqq $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = ftj.a($$1);
      this.e = $$5;
   }

   public void a(enw $$0, fqu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      clj $$10 = $$3.c(bkv.f);
      if (!$$10.b()) {
         cle $$11 = $$10.d();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cdh || $$3 instanceof ccc;
         if ($$3.n_() && !($$3 instanceof cdh)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cjc && ((cjc)$$11).e() instanceof ctw) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            GameProfile $$16 = null;
            if ($$10.u()) {
               rz $$17 = $$10.v();
               if ($$17.b("SkullOwner", 10)) {
                  $$16 = so.a($$17.p("SkullOwner"));
               }
            }

            $$0.a(-0.5, 0.0, -0.5);
            dcb.a $$18 = ((ctw)((cjc)$$11).e()).b();
            fjm $$19 = this.d.get($$18);
            frc $$20 = ftj.a($$18, $$16);
            bmf $$22;
            if ($$3.da() instanceof blg $$21) {
               $$22 = $$21.aQ;
            } else {
               $$22 = $$3.aQ;
            }

            float $$24 = $$22.c($$6);
            ftj.a(null, 180.0F, $$24, $$0, $$1, $$2, $$19, $$20);
         } else if (!($$11 instanceof cit $$25) || $$25.g() != bkv.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, clg.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(enw $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
