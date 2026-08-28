import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gde extends cml {
   @Nullable
   private fyw g;
   protected ewh b;
   public float c;
   public float d;
   public float e;
   public final fyl f;

   public gde(fyl $$0, GameProfile $$1) {
      super($$0, $$0.V(), $$0.W(), $$1);
      this.b = ewh.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fyw $$0 = this.a();
      return $$0 != null && $$0.e() == dcd.d;
   }

   @Override
   public boolean f() {
      fyw $$0 = this.a();
      return $$0 != null && $$0.e() == dcd.b;
   }

   @Nullable
   protected fyw a() {
      if (this.g == null) {
         this.g = ffw.Q().L().a(this.cB());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.du();
      super.l();
   }

   public ewh F(float $$0) {
      return this.b.a(this.du(), (double)$$0);
   }

   public gqq b() {
      fyw $$0 = this.a();
      return $$0 == null ? gqi.a(this.cB()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.gb().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(buk.v) / this.gb().b() + 1.0F) / 2.0F;
      if (this.gb().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cud $$1 = this.fv();
      if (this.ft()) {
         if ($$1.a(cug.ov)) {
            int $$2 = this.fx();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (ffw.Q().m.aA().a() && this.gy()) {
            return 0.1F;
         }
      }

      return ayg.i(ffw.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
