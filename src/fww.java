import com.mojang.authlib.GameProfile;
import java.util.Map;

public class fww<T extends bji, M extends fff<T> & ffn> extends fxr<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<czz.a, fhc> d;
   private final foc e;

   public fww(fve<T, M> $$0, fia $$1, foc $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public fww(fve<T, M> $$0, fia $$1, float $$2, float $$3, float $$4, foc $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = fqv.a($$1);
      this.e = $$5;
   }

   public void a(elr $$0, fog $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cjh $$10 = $$3.c(bix.f);
      if (!$$10.b()) {
         cjc $$11 = $$10.d();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cbj || $$3 instanceof cae;
         if ($$3.m_() && !($$3 instanceof cbj)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cha && ((cha)$$11).e() instanceof cru) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            GameProfile $$16 = null;
            if ($$10.u()) {
               qy $$17 = $$10.v();
               if ($$17.b("SkullOwner", 10)) {
                  $$16 = rl.a($$17.p("SkullOwner"));
               }
            }

            $$0.a(-0.5, 0.0, -0.5);
            czz.a $$18 = ((cru)((cha)$$11).e()).a();
            fhc $$19 = this.d.get($$18);
            foo $$20 = fqv.a($$18, $$16);
            bkh $$22;
            if ($$3.cY() instanceof bji $$21) {
               $$22 = $$21.aQ;
            } else {
               $$22 = $$3.aQ;
            }

            float $$24 = $$22.c($$6);
            fqv.a(null, 180.0F, $$24, $$0, $$1, $$2, $$19, $$20);
         } else if (!($$11 instanceof cgr $$25) || $$25.g() != bix.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cje.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(elr $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
