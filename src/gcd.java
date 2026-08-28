import javax.annotation.Nullable;
import org.joml.Vector3f;

public class gcd extends gav {
   public static final float c = 62.500004F;
   public static final float d = 0.9765628F;
   private static final Vector3f s = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private giw u;

   public gcd(dzq $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aS_() {
      super.aS_();
      boolean $$0 = this.a.m().b() instanceof dvh;
      this.u = gvc.a(this.m.aS(), this.b, $$0);
   }

   @Override
   protected void a(ftx $$0, ebe $$1) {
      super.a($$0, $$1);
      boolean $$2 = $$1.b() instanceof dvh;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void c(ftx $$0) {
      if (this.u != null) {
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         $$0.a($$1 -> {
            hnh $$2 = gsu.a(this.b);
            flr $$3 = $$2.a($$1, this.u::a);
            this.u.a($$0.c(), $$3, 15728880, hkq.d);
         });
      }
   }

   @Override
   protected Vector3f m() {
      return s;
   }
}
