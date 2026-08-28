import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gco extends cmy {
   @Nullable
   private fyh g;
   protected evs b;
   public float c;
   public float d;
   public float e;
   public final fxw f;

   public gco(fxw $$0, GameProfile $$1) {
      super($$0, $$0.V(), $$0.W(), $$1);
      this.b = evs.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fyh $$0 = this.a();
      return $$0 != null && $$0.e() == dbw.d;
   }

   @Override
   public boolean f() {
      fyh $$0 = this.a();
      return $$0 != null && $$0.e() == dbw.b;
   }

   @Nullable
   protected fyh a() {
      if (this.g == null) {
         this.g = ffg.Q().L().a(this.cz());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.ds();
      super.l();
   }

   public evs E(float $$0) {
      return this.b.a(this.ds(), (double)$$0);
   }

   public gqa b() {
      fyh $$0 = this.a();
      return $$0 == null ? gps.a(this.cz()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.gd().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(buy.r) / this.gd().b() + 1.0F) / 2.0F;
      if (this.gd().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cuq $$1 = this.fx();
      if (this.fv()) {
         if ($$1.a(cut.ou)) {
            int $$2 = this.fz();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (ffg.Q().m.aA().a() && this.gA()) {
            return 0.1F;
         }
      }

      return ayz.i(ffg.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
