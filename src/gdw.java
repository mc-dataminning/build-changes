import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gdw extends cmx {
   @Nullable
   private fzo g;
   protected exa b;
   public float c;
   public float d;
   public float e;
   public final fzd f;

   public gdw(fzd $$0, GameProfile $$1) {
      super($$0, $$0.V(), $$0.W(), $$1);
      this.b = exa.b;
      this.f = $$0;
   }

   @Override
   public boolean R_() {
      fzo $$0 = this.a();
      return $$0 != null && $$0.e() == dct.d;
   }

   @Override
   public boolean f() {
      fzo $$0 = this.a();
      return $$0 != null && $$0.e() == dct.b;
   }

   @Nullable
   protected fzo a() {
      if (this.g == null) {
         this.g = fgm.Q().L().a(this.cA());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.ds();
      super.l();
   }

   public exa G(float $$0) {
      return this.b.a(this.ds(), (double)$$0);
   }

   public grj b() {
      fzo $$0 = this.a();
      return $$0 == null ? grb.a(this.cA()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.ga().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(buw.v) / this.ga().b() + 1.0F) / 2.0F;
      if (this.ga().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cuq $$1 = this.fu();
      if (this.fs()) {
         if ($$1.a(cut.ov)) {
            int $$2 = this.fw();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (fgm.Q().m.aA().a() && this.gx()) {
            return 0.1F;
         }
      }

      return ayo.i(fgm.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
