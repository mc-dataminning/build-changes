import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gcl extends cmv {
   @Nullable
   private fye g;
   protected evp b;
   public float c;
   public float d;
   public float e;
   public final fxt f;

   public gcl(fxt $$0, GameProfile $$1) {
      super($$0, $$0.V(), $$0.W(), $$1);
      this.b = evp.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fye $$0 = this.a();
      return $$0 != null && $$0.e() == dbt.d;
   }

   @Override
   public boolean f() {
      fye $$0 = this.a();
      return $$0 != null && $$0.e() == dbt.b;
   }

   @Nullable
   protected fye a() {
      if (this.g == null) {
         this.g = ffd.Q().L().a(this.cz());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.ds();
      super.l();
   }

   public evp E(float $$0) {
      return this.b.a(this.ds(), (double)$$0);
   }

   public gpx b() {
      fye $$0 = this.a();
      return $$0 == null ? gpp.a(this.cz()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.gd().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(buv.r) / this.gd().b() + 1.0F) / 2.0F;
      if (this.gd().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cun $$1 = this.fx();
      if (this.fv()) {
         if ($$1.a(cuq.ou)) {
            int $$2 = this.fz();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (ffd.Q().m.aA().a() && this.gA()) {
            return 0.1F;
         }
      }

      return ayx.i(ffd.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
