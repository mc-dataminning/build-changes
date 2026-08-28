import java.util.Arrays;

public class goi extends goh<clb, gui> {
   private static final ale a = ale.b("textures/entity/illager/illusioner.png");

   public goi(gno.a $$0) {
      super($$0, new fyc<>($$0.a(gap.aZ)), 0.5F);
      this.a(new gru<gui, fyc<gui>>(this, $$0.b()) {
         public void a(fdi $$0, ghl $$1, int $$2, gui $$3, float $$4, float $$5) {
            if ($$3.i || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.h.c().k = true;
   }

   public ale a(gui $$0) {
      return a;
   }

   public gui c() {
      return new gui();
   }

   public void a(clb $$0, gui $$1, float $$2) {
      super.a($$0, $$1, $$2);
      eyw[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.i = $$0.gy();
   }

   public void a(gui $$0, fdi $$1, ghl $$2, int $$3) {
      if ($$0.u) {
         eyw[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azf.b((float)$$5 + $$0.p * 0.5F) * 0.025,
               $$4[$$5].e + (double)azf.b((float)$$5 + $$0.p * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azf.b((float)$$5 + $$0.p * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(gui $$0) {
      return true;
   }

   protected eyr a(clb $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
