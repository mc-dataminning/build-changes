import com.mojang.authlib.GameProfile;
import java.util.Map;

public class gej<T extends bog, M extends fmb<T> & fmj> extends gfe<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dfp.a, fny> d;
   private final fvi e;

   public gej(gco<T, M> $$0, foy $$1, fvi $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gej(gco<T, M> $$0, foy $$1, float $$2, float $$3, float $$4, fvi $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = fyb.a($$1);
      this.e = $$5;
   }

   public void a(esa $$0, fvm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      coz $$10 = $$3.c(bnv.f);
      if (!$$10.b()) {
         cou $$11 = $$10.d();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cgu || $$3 instanceof cfh;
         if ($$3.o_() && !($$3 instanceof cgu)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cms && ((cms)$$11).e() instanceof cxk) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            GameProfile $$16 = null;
            if ($$10.v()) {
               sw $$17 = $$10.w();
               if ($$17.b("SkullOwner", 10)) {
                  $$16 = tl.a($$17.p("SkullOwner"));
               }
            }

            $$0.a(-0.5, 0.0, -0.5);
            dfp.a $$18 = ((cxk)((cms)$$11).e()).b();
            fny $$19 = this.d.get($$18);
            fvu $$20 = fyb.a($$18, $$16);
            bpe $$22;
            if ($$3.cZ() instanceof bog $$21) {
               $$22 = $$21.aQ;
            } else {
               $$22 = $$3.aQ;
            }

            float $$24 = $$22.c($$6);
            fyb.a(null, 180.0F, $$24, $$0, $$1, $$2, $$19, $$20);
         } else if (!($$11 instanceof cmj $$25) || $$25.g() != bnv.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cow.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(esa $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
