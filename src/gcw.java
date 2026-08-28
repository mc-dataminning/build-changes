import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gcw extends cmh {
   @Nullable
   private fyo g;
   protected evz b;
   public float c;
   public float d;
   public float e;
   public final fyd f;

   public gcw(fyd $$0, GameProfile $$1) {
      super($$0, $$0.V(), $$0.W(), $$1);
      this.b = evz.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fyo $$0 = this.a();
      return $$0 != null && $$0.e() == dca.d;
   }

   @Override
   public boolean f() {
      fyo $$0 = this.a();
      return $$0 != null && $$0.e() == dca.b;
   }

   @Nullable
   protected fyo a() {
      if (this.g == null) {
         this.g = ffn.Q().L().a(this.cz());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.ds();
      super.l();
   }

   public evz F(float $$0) {
      return this.b.a(this.ds(), (double)$$0);
   }

   public gqi b() {
      fyo $$0 = this.a();
      return $$0 == null ? gqa.a(this.cz()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fZ().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(bug.v) / this.fZ().b() + 1.0F) / 2.0F;
      if (this.fZ().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cua $$1 = this.ft();
      if (this.fr()) {
         if ($$1.a(cud.ou)) {
            int $$2 = this.fv();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (ffn.Q().m.aA().a() && this.gw()) {
            return 0.1F;
         }
      }

      return aye.i(ffn.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
