import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fvw extends fuo {
   public static final float c = 62.500004F;
   public static final float d = 0.9765628F;
   private static final Vector3f s = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private gcf u;

   public fvw(dwj $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aT_() {
      super.aT_();
      boolean $$0 = this.a.m().b() instanceof dsj;
      this.u = goi.a(this.m.aS(), this.b, $$0);
   }

   @Override
   protected void a(fnq $$0, dxu $$1) {
      super.a($$0, $$1);
      boolean $$2 = $$1.b() instanceof dsj;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void c(fnq $$0) {
      if (this.u != null) {
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         $$0.a($$1 -> {
            hds $$2 = gme.a(this.b);
            fgu $$3 = $$2.a($$1, this.u::a);
            this.u.a($$0.c(), $$3, 15728880, hba.d);
         });
      }
   }

   @Override
   protected Vector3f l() {
      return s;
   }
}
