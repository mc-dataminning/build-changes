import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gpl extends crm {
   @Nullable
   private glc h;
   protected ffc a = ffc.c;
   public float b;
   public float c;
   public float d;
   public final gkq e;
   public float f;
   public float g;

   public gpl(gkq $$0, GameProfile $$1) {
      super($$0, $$0.aa(), $$0.ab(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean V_() {
      glc $$0 = this.a();
      return $$0 != null && $$0.e() == djj.d;
   }

   @Override
   public boolean b() {
      glc $$0 = this.a();
      return $$0 != null && $$0.e() == djj.b;
   }

   @Nullable
   protected glc a() {
      if (this.h == null) {
         this.h = fpt.Q().L().a(this.cF());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dx();
      super.h();
   }

   public ffc I(float $$0) {
      return this.a.a(this.dx(), (double)$$0);
   }

   public hks c() {
      glc $$0 = this.a();
      return $$0 == null ? hki.a(this.cF()) : $$0.g();
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
         if (this.fA().a(czr.pj)) {
            float $$5 = Math.min((float)this.fC() / 20.0F, 1.0F);
            $$2 *= 1.0F - azm.l($$5) * 0.15F;
         } else if ($$0 && this.gG()) {
            return 0.1F;
         }
      }

      return azm.h($$1, 1.0F, $$2);
   }
}
