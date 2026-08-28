import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gdc extends cmk {
   @Nullable
   private fyu g;
   protected ewf b;
   public float c;
   public float d;
   public float e;
   public final fyj f;

   public gdc(fyj $$0, GameProfile $$1) {
      super($$0, $$0.V(), $$0.W(), $$1);
      this.b = ewf.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fyu $$0 = this.a();
      return $$0 != null && $$0.e() == dcc.d;
   }

   @Override
   public boolean f() {
      fyu $$0 = this.a();
      return $$0 != null && $$0.e() == dcc.b;
   }

   @Nullable
   protected fyu a() {
      if (this.g == null) {
         this.g = fft.Q().L().a(this.cA());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.dt();
      super.l();
   }

   public ewf F(float $$0) {
      return this.b.a(this.dt(), (double)$$0);
   }

   public gqo b() {
      fyu $$0 = this.a();
      return $$0 == null ? gqg.a(this.cA()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.ga().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(buj.v) / this.ga().b() + 1.0F) / 2.0F;
      if (this.ga().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cuc $$1 = this.fu();
      if (this.fs()) {
         if ($$1.a(cuf.ov)) {
            int $$2 = this.fw();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (fft.Q().m.aA().a() && this.gx()) {
            return 0.1F;
         }
      }

      return ayg.i(fft.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
