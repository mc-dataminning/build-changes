import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fwr extends ciu {
   @Nullable
   private fsl g;
   protected ept b;
   public float c;
   public float d;
   public float e;
   public final fsa f;

   public fwr(fsa $$0, GameProfile $$1) {
      super($$0, $$0.T(), $$0.U(), $$1);
      this.b = ept.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fsl $$0 = this.a();
      return $$0 != null && $$0.e() == cwy.d;
   }

   @Override
   public boolean f() {
      fsl $$0 = this.a();
      return $$0 != null && $$0.e() == cwy.b;
   }

   @Nullable
   protected fsl a() {
      if (this.g == null) {
         this.g = ezi.Q().L().a(this.cw());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.dp();
      super.l();
   }

   public ept E(float $$0) {
      return this.b.a(this.dp(), (double)$$0);
   }

   public gkb b() {
      fsl $$0 = this.a();
      return $$0 == null ? gju.a(this.cw()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.ga().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(bqw.r) / this.ga().b() + 1.0F) / 2.0F;
      if (this.ga().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cqm $$1 = this.fu();
      if (this.fs()) {
         if ($$1.a(cqp.ot)) {
            int $$2 = this.fw();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (ezi.Q().m.ay().a() && this.gx()) {
            return 0.1F;
         }
      }

      return aww.i(ezi.Q().m.ai().c().floatValue(), 1.0F, $$0);
   }
}
