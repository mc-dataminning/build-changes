import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gpg extends crj {
   @Nullable
   private gkx h;
   protected fex a = fex.c;
   public float b;
   public float c;
   public float d;
   public final gkl e;
   public float f;
   public float g;

   public gpg(gkl $$0, GameProfile $$1) {
      super($$0, $$0.aa(), $$0.ab(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean V_() {
      gkx $$0 = this.a();
      return $$0 != null && $$0.e() == dje.d;
   }

   @Override
   public boolean b() {
      gkx $$0 = this.a();
      return $$0 != null && $$0.e() == dje.b;
   }

   @Nullable
   protected gkx a() {
      if (this.h == null) {
         this.h = fpo.Q().L().a(this.cF());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dx();
      super.h();
   }

   public fex I(float $$0) {
      return this.a.a(this.dx(), (double)$$0);
   }

   public hkl c() {
      gkx $$0 = this.a();
      return $$0 == null ? hkc.a(this.cF()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gj().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gj().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(byp.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fy()) {
         if (this.fA().a(czo.pj)) {
            float $$5 = Math.min((float)this.fC() / 20.0F, 1.0F);
            $$2 *= 1.0F - azm.l($$5) * 0.15F;
         } else if ($$0 && this.gG()) {
            return 0.1F;
         }
      }

      return azm.h($$1, 1.0F, $$2);
   }
}
