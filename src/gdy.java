import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gdy extends cmx {
   @Nullable
   private fzq g;
   protected exc b;
   public float c;
   public float d;
   public float e;
   public final fzf f;

   public gdy(fzf $$0, GameProfile $$1) {
      super($$0, $$0.V(), $$0.W(), $$1);
      this.b = exc.b;
      this.f = $$0;
   }

   @Override
   public boolean R_() {
      fzq $$0 = this.a();
      return $$0 != null && $$0.e() == dct.d;
   }

   @Override
   public boolean f() {
      fzq $$0 = this.a();
      return $$0 != null && $$0.e() == dct.b;
   }

   @Nullable
   protected fzq a() {
      if (this.g == null) {
         this.g = fgo.Q().L().a(this.cz());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.dr();
      super.l();
   }

   public exc G(float $$0) {
      return this.b.a(this.dr(), (double)$$0);
   }

   public grl b() {
      fzq $$0 = this.a();
      return $$0 == null ? grd.a(this.cz()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fZ().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(buw.v) / this.fZ().b() + 1.0F) / 2.0F;
      if (this.fZ().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cuq $$1 = this.ft();
      if (this.fr()) {
         if ($$1.a(cut.ov)) {
            int $$2 = this.fv();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (fgo.Q().m.aB().a() && this.gw()) {
            return 0.1F;
         }
      }

      return ayo.i(fgo.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
