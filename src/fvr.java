import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fvr extends fuj {
   public static final float c = 62.500004F;
   public static final float d = 0.9765628F;
   private static final Vector3f s = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private gca u;

   public fvr(dwc $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aT_() {
      super.aT_();
      boolean $$0 = this.a.m().b() instanceof dsc;
      this.u = god.a(this.m.aS(), this.b, $$0);
   }

   @Override
   protected void a(fnl $$0, dxn $$1) {
      super.a($$0, $$1);
      boolean $$2 = $$1.b() instanceof dsc;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void c(fnl $$0) {
      if (this.u != null) {
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         $$0.a($$1 -> {
            hdn $$2 = glz.a(this.b);
            fgp $$3 = $$2.a($$1, this.u::a);
            this.u.a($$0.c(), $$3, 15728880, hav.d);
         });
      }
   }

   @Override
   protected Vector3f l() {
      return s;
   }
}
