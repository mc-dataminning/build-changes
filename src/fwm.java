import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fwm extends fve {
   public static final float c = 62.500004F;
   public static final float d = 0.9765628F;
   private static final Vector3f s = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private gcx u;

   public fwm(dvn $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aR_() {
      super.aR_();
      boolean $$0 = this.a.m().b() instanceof drn;
      this.u = goz.a(this.m.aS(), this.b, $$0);
   }

   @Override
   protected void a(fof $$0, dwy $$1) {
      super.a($$0, $$1);
      boolean $$2 = $$1.b() instanceof drn;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void c(fof $$0) {
      if (this.u != null) {
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         $$0.a($$1 -> {
            hha $$2 = gmu.a(this.b);
            ffz $$3 = $$2.a($$1, this.u::a);
            this.u.a($$0.c(), $$3, 15728880, hej.d);
         });
      }
   }

   @Override
   protected Vector3f m() {
      return s;
   }
}
