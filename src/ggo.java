import com.mojang.authlib.GameProfile;
import java.util.Map;

public class ggo<T extends bpo, M extends foc<T> & fok> extends ghj<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dhb.a, fqa> d;
   private final fxm e;

   public ggo(get<T, M> $$0, fqz $$1, fxm $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public ggo(get<T, M> $$0, fqz $$1, float $$2, float $$3, float $$4, fxm $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = gaf.a($$1);
      this.e = $$5;
   }

   public void a(etz $$0, fxq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cqk $$10 = $$3.d(bpd.f);
      if (!$$10.b()) {
         cqf $$11 = $$10.d();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof cif || $$3 instanceof cgs;
         if ($$3.o_() && !($$3 instanceof cif)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cof && ((cof)$$11).d() instanceof cyw) {
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
            dhb.a $$18 = ((cyw)((cof)$$11).d()).b();
            fqa $$19 = this.d.get($$18);
            fxy $$20 = gaf.a($$18, $$16);
            bqo $$22;
            if ($$3.cZ() instanceof bpo $$21) {
               $$22 = $$21.aT;
            } else {
               $$22 = $$3.aT;
            }

            float $$24 = $$22.c($$6);
            gaf.a(null, 180.0F, $$24, $$0, $$1, $$2, $$19, $$20);
         } else if (!($$11 instanceof cnw $$25) || $$25.i() != bpd.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cqh.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(etz $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
