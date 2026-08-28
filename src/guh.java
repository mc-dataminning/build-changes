import java.util.Calendar;

public class guh<T extends dyo & dzv> implements gua<T> {
   private final ggx a;
   private final ggx b;
   private final ggx c;
   private final boolean d = b();

   public guh(gub.a $$0) {
      this.a = new ggx($$0.a(gkq.X));
      this.b = new ggx($$0.a(gkq.aD));
      this.c = new ggx($$0.a(gkq.aE));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      dkj $$7 = $$0.i();
      boolean $$8 = $$7 != null;
      ebq $$9 = $$8 ? $$0.m() : dnq.cG.m().b(dos.c, jc.d);
      eci $$10 = $$9.b(dos.d) ? $$9.c(dos.d) : eci.a;
      if ($$9.b() instanceof dmi<?> $$12) {
         boolean $$13 = $$10 != eci.a;
         $$2.a();
         float $$14 = $$9.c(dos.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$14));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dpw.c<? extends dyw> $$15;
         if ($$8) {
            $$15 = $$12.a($$9, $$7, $$0.aC_(), true);
         } else {
            $$15 = dpw.b::b;
         }

         float $$17 = $$15.apply(dos.a($$0)).get($$1);
         $$17 = 1.0F - $$17;
         $$17 = 1.0F - $$17 * $$17 * $$17;
         int $$18 = $$15.apply(new gue<>()).applyAsInt($$4);
         hmx $$19 = gsh.a($$0, $$10, this.d);
         flg $$20 = $$19.a($$3, gry::f);
         if ($$13) {
            if ($$10 == eci.b) {
               this.a($$2, $$20, this.b, $$17, $$18, $$5);
            } else {
               this.a($$2, $$20, this.c, $$17, $$18, $$5);
            }
         } else {
            this.a($$2, $$20, this.a, $$17, $$18, $$5);
         }

         $$2.b();
      }
   }

   private void a(fld $$0, flg $$1, ggx $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
