import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gbj extends clw {
   @Nullable
   private fxc g;
   protected euk b;
   public float c;
   public float d;
   public float e;
   public final fwr f;

   public gbj(fwr $$0, GameProfile $$1) {
      super($$0, $$0.U(), $$0.V(), $$1);
      this.b = euk.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fxc $$0 = this.a();
      return $$0 != null && $$0.e() == dau.d;
   }

   @Override
   public boolean f() {
      fxc $$0 = this.a();
      return $$0 != null && $$0.e() == dau.b;
   }

   @Nullable
   protected fxc a() {
      if (this.g == null) {
         this.g = fdz.Q().L().a(this.cz());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.ds();
      super.l();
   }

   public euk E(float $$0) {
      return this.b.a(this.ds(), (double)$$0);
   }

   public gov b() {
      fxc $$0 = this.a();
      return $$0 == null ? gon.a(this.cz()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.gd().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(btw.r) / this.gd().b() + 1.0F) / 2.0F;
      if (this.gd().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cto $$1 = this.fx();
      if (this.fv()) {
         if ($$1.a(ctr.ou)) {
            int $$2 = this.fz();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (fdz.Q().m.aA().a() && this.gA()) {
            return 0.1F;
         }
      }

      return ayd.i(fdz.Q().m.ak().c().floatValue(), 1.0F, $$0);
   }
}
