import java.util.Arrays;

public class gtx extends gtw<cmq, hac> {
   private static final aku a = aku.b("textures/entity/illager/illusioner.png");

   public gtx(gtd.a $$0) {
      super($$0, new gdo<>($$0.a(ggb.bp)), 0.5F);
      this.a(new gxk<hac, gdo<hac>>(this) {
         public void a(fgr $$0, gmx $$1, int $$2, hac $$3, float $$4, float $$5) {
            if ($$3.n || $$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
      this.h.c().k = true;
   }

   public aku a(hac $$0) {
      return a;
   }

   public hac b() {
      return new hac();
   }

   public void a(cmq $$0, hac $$1, float $$2) {
      super.a($$0, $$1, $$2);
      fbx[] $$3 = $$0.K($$2);
      $$1.a = Arrays.copyOf($$3, $$3.length);
      $$1.n = $$0.gz();
   }

   public void a(hac $$0, fgr $$1, gmx $$2, int $$3) {
      if ($$0.z) {
         fbx[] $$4 = $$0.a;

         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$1.a();
            $$1.a(
               $$4[$$5].d + (double)ayz.b((float)$$5 + $$0.u * 0.5F) * 0.025,
               $$4[$$5].e + (double)ayz.b((float)$$5 + $$0.u * 0.75F) * 0.0125,
               $$4[$$5].f + (double)ayz.b((float)$$5 + $$0.u * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3);
            $$1.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   protected boolean b(hac $$0) {
      return true;
   }

   protected fbs a(cmq $$0) {
      return super.a($$0).c(3.0, 0.0, 3.0);
   }
}
