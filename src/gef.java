import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gef extends cly {
   @Nullable
   private fzy g;
   protected ewu b;
   public float c;
   public float d;
   public float e;
   public final fzn f;

   public gef(fzn $$0, GameProfile $$1) {
      super($$0, $$0.V(), $$0.W(), $$1);
      this.b = ewu.b;
      this.f = $$0;
   }

   @Override
   public boolean O_() {
      fzy $$0 = this.a();
      return $$0 != null && $$0.e() == dbx.d;
   }

   @Override
   public boolean f() {
      fzy $$0 = this.a();
      return $$0 != null && $$0.e() == dbx.b;
   }

   @Nullable
   protected fzy a() {
      if (this.g == null) {
         this.g = fgj.Q().L().a(this.cE());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.dx();
      super.l();
   }

   public ewu E(float $$0) {
      return this.b.a(this.dx(), (double)$$0);
   }

   public gry b() {
      fzy $$0 = this.a();
      return $$0 == null ? grq.a(this.cE()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.gm().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(btv.r) / this.gm().b() + 1.0F) / 2.0F;
      if (this.gm().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cuh $$1 = this.fG();
      if (this.fE()) {
         if ($$1.a(cuk.pK)) {
            int $$2 = this.fI();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (fgj.Q().m.aA().a() && this.gL()) {
            return 0.1F;
         }
      }

      return aym.i(fgj.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
