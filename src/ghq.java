import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class ghq extends cor {
   @Nullable
   private gdj i;
   protected ezr b = ezr.c;
   public float c;
   public float d;
   public float e;
   public final gcy f;
   public float g;
   public float h;

   public ghq(gcy $$0, GameProfile $$1) {
      super($$0, $$0.W(), $$0.X(), $$1);
      this.f = $$0;
   }

   @Override
   public boolean R_() {
      gdj $$0 = this.a();
      return $$0 != null && $$0.e() == dfc.d;
   }

   @Override
   public boolean f() {
      gdj $$0 = this.a();
      return $$0 != null && $$0.e() == dfc.b;
   }

   @Nullable
   protected gdj a() {
      if (this.i == null) {
         this.i = fjx.Q().L().a(this.cI());
      }

      return this.i;
   }

   @Override
   public void l() {
      this.g = this.h;
      this.b = this.dB();
      super.l();
   }

   public ezr I(float $$0) {
      return this.b.a(this.dB(), (double)$$0);
   }

   public gzu b() {
      gdj $$0 = this.a();
      return $$0 == null ? gzl.a(this.cI()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gm().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gm().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bwm.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fC()) {
         if (this.fE().a(cwj.ow)) {
            float $$5 = Math.min((float)this.fG() / 20.0F, 1.0F);
            $$2 *= 1.0F - azn.l($$5) * 0.15F;
         } else if ($$0 && this.gK()) {
            return 0.1F;
         }
      }

      return azn.h($$1, 1.0F, $$2);
   }
}
