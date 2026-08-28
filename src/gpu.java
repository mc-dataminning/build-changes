import java.util.Arrays;

public class gpu extends gpt<clt, gvv> {
   private static final all a = all.b("textures/entity/illager/illusioner.png");

   public gpu(gpa.a $$0) {
      super($$0, new fzo<>($$0.a(gcb.aZ)), 0.5F);
      this.a(new gtg<gvv, fzo<gvv>>(this, $$0.b()) {
         public void a(fek $$0, gix $$1, int $$2, gvv $$3, float $$4, float $$5) {
            if ($$3.i || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.h.c().k = true;
   }

   public all a(gvv $$0) {
      return a;
   }

   public gvv c() {
      return new gvv();
   }

   public void a(clt $$0, gvv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      ezr[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.i = $$0.gF();
   }

   public void a(gvv $$0, fek $$1, gix $$2, int $$3) {
      if ($$0.u) {
         ezr[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)azn.b((float)$$5 + $$0.p * 0.5F) * 0.025,
               $$4[$$5].e + (double)azn.b((float)$$5 + $$0.p * 0.75F) * 0.0125,
               $$4[$$5].f + (double)azn.b((float)$$5 + $$0.p * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(gvv $$0) {
      return true;
   }

   protected ezm a(clt $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
