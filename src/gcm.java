import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gcm extends cmw {
   @Nullable
   private fyf g;
   protected evq b;
   public float c;
   public float d;
   public float e;
   public final fxu f;

   public gcm(fxu $$0, GameProfile $$1) {
      super($$0, $$0.V(), $$0.W(), $$1);
      this.b = evq.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fyf $$0 = this.a();
      return $$0 != null && $$0.e() == dbu.d;
   }

   @Override
   public boolean f() {
      fyf $$0 = this.a();
      return $$0 != null && $$0.e() == dbu.b;
   }

   @Nullable
   protected fyf a() {
      if (this.g == null) {
         this.g = ffe.Q().L().a(this.cz());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.ds();
      super.l();
   }

   public evq E(float $$0) {
      return this.b.a(this.ds(), (double)$$0);
   }

   public gpy b() {
      fyf $$0 = this.a();
      return $$0 == null ? gpq.a(this.cz()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.gd().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(buw.r) / this.gd().b() + 1.0F) / 2.0F;
      if (this.gd().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cuo $$1 = this.fx();
      if (this.fv()) {
         if ($$1.a(cur.ou)) {
            int $$2 = this.fz();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (ffe.Q().m.aA().a() && this.gA()) {
            return 0.1F;
         }
      }

      return ayy.i(ffe.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
