import java.util.Arrays;

public class gsj extends gsi<cmu, gym> {
   private static final alz a = alz.b("textures/entity/illager/illusioner.png");

   public gsj(grp.a $$0) {
      super($$0, new gbz<>($$0.a(gem.bk)), 0.5F);
      this.a(new gvw<gym, gbz<gym>>(this, $$0.b()) {
         public void a(fgr $$0, glk $$1, int $$2, gym $$3, float $$4, float $$5) {
            if ($$3.i || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.h.c().k = true;
   }

   public alz a(gym $$0) {
      return a;
   }

   public gym b() {
      return new gym();
   }

   public void a(cmu $$0, gym $$1, float $$2) {
      super.a($$0, $$1, $$2);
      fbx[] $$3 = $$0.J($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.i = $$0.gx();
   }

   public void a(gym $$0, fgr $$1, glk $$2, int $$3) {
      if ($$0.u) {
         fbx[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)bae.b((float)$$5 + $$0.p * 0.5F) * 0.025,
               $$4[$$5].e + (double)bae.b((float)$$5 + $$0.p * 0.75F) * 0.0125,
               $$4[$$5].f + (double)bae.b((float)$$5 + $$0.p * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(gym $$0) {
      return true;
   }

   protected fbs a(cmu $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
