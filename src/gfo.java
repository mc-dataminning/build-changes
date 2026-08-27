import com.mojang.authlib.GameProfile;
import java.util.Map;

public class gfo<T extends box, M extends fne<T> & fnm> extends ggj<T, M> {
   private final float a;
   private final float b;
   private final float c;
   private final Map<dgg.a, fpc> d;
   private final fwm e;

   public gfo(gdt<T, M> $$0, fqb $$1, fwm $$2) {
      this($$0, $$1, 1.0F, 1.0F, 1.0F, $$2);
   }

   public gfo(gdt<T, M> $$0, fqb $$1, float $$2, float $$3, float $$4, fwm $$5) {
      super($$0);
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = fzf.a($$1);
      this.e = $$5;
   }

   public void a(etd $$0, fwq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cpq $$10 = $$3.c(bom.f);
      if (!$$10.b()) {
         cpl $$11 = $$10.d();
         $$0.a();
         $$0.b(this.a, this.b, this.c);
         boolean $$12 = $$3 instanceof chn || $$3 instanceof cga;
         if ($$3.o_() && !($$3 instanceof chn)) {
            float $$13 = 2.0F;
            float $$14 = 1.4F;
            $$0.a(0.0F, 0.03125F, 0.0F);
            $$0.b(0.7F, 0.7F, 0.7F);
            $$0.a(0.0F, 1.0F, 0.0F);
         }

         this.c().d().a($$0);
         if ($$11 instanceof cnl && ((cnl)$$11).d() instanceof cyb) {
            float $$15 = 1.1875F;
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            if ($$12) {
               $$0.a(0.0F, 0.0625F, 0.0F);
            }

            GameProfile $$16 = null;
            if ($$10.v()) {
               sy $$17 = $$10.w();
               if ($$17.b("SkullOwner", 10)) {
                  $$16 = tn.a($$17.p("SkullOwner"));
               }
            }

            $$0.a(-0.5, 0.0, -0.5);
            dgg.a $$18 = ((cyb)((cnl)$$11).d()).b();
            fpc $$19 = this.d.get($$18);
            fwy $$20 = fzf.a($$18, $$16);
            bpx $$22;
            if ($$3.cW() instanceof box $$21) {
               $$22 = $$21.aR;
            } else {
               $$22 = $$3.aR;
            }

            float $$24 = $$22.c($$6);
            fzf.a(null, 180.0F, $$24, $$0, $$1, $$2, $$19, $$20);
         } else if (!($$11 instanceof cnc $$25) || $$25.i() != bom.f) {
            a($$0, $$12);
            this.e.a($$3, $$10, cpn.f, false, $$0, $$1, $$2);
         }

         $$0.b();
      }
   }

   public static void a(etd $$0, boolean $$1) {
      float $$2 = 0.625F;
      $$0.a(0.0F, -0.25F, 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
      if ($$1) {
         $$0.a(0.0F, 0.1875F, 0.0F);
      }
   }
}
