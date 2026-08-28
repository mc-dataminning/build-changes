import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gge extends cnx {
   @Nullable
   private gbx cv;
   protected eyw b = eyw.c;
   public float c;
   public float d;
   public float e;
   public final gbm f;
   public float g;
   public float h;

   public gge(gbm $$0, GameProfile $$1) {
      super($$0, $$0.W(), $$0.X(), $$1);
      this.f = $$0;
   }

   @Override
   public boolean Q_() {
      gbx $$0 = this.a();
      return $$0 != null && $$0.e() == deg.d;
   }

   @Override
   public boolean f() {
      gbx $$0 = this.a();
      return $$0 != null && $$0.e() == deg.b;
   }

   @Nullable
   protected gbx a() {
      if (this.cv == null) {
         this.cv = fip.Q().L().a(this.cD());
      }

      return this.cv;
   }

   @Override
   public void l() {
      this.g = this.h;
      this.b = this.dv();
      super.l();
   }

   public eyw I(float $$0) {
      return this.b.a(this.dv(), (double)$$0);
   }

   public gyh b() {
      gbx $$0 = this.a();
      return $$0 == null ? gxy.a(this.cD()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.ge().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.ge().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bvu.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fv()) {
         if (this.fx().a(cvw.ow)) {
            float $$5 = Math.min((float)this.fz() / 20.0F, 1.0F);
            $$2 *= 1.0F - azf.l($$5) * 0.15F;
         } else if ($$0 && this.gB()) {
            return 0.1F;
         }
      }

      return azf.h($$1, 1.0F, $$2);
   }
}
