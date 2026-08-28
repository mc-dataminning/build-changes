import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gls extends cpr {
   @Nullable
   private ghk h;
   protected fbx a = fbx.c;
   public float b;
   public float c;
   public float d;
   public final ggy e;
   public float f;
   public float g;

   public gls(ggy $$0, GameProfile $$1) {
      super($$0, $$0.aa(), $$0.ab(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean U_() {
      ghk $$0 = this.a();
      return $$0 != null && $$0.e() == dgw.d;
   }

   @Override
   public boolean b() {
      ghk $$0 = this.a();
      return $$0 != null && $$0.e() == dgw.b;
   }

   @Nullable
   protected ghk a() {
      if (this.h == null) {
         this.h = fmg.Q().L().a(this.cF());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dx();
      super.h();
   }

   public fbx J(float $$0) {
      return this.a.a(this.dx(), (double)$$0);
   }

   public hgt c() {
      ghk $$0 = this.a();
      return $$0 == null ? hgk.a(this.cF()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gm().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gm().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bxg.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fB()) {
         if (this.fD().a(cxl.pc)) {
            float $$5 = Math.min((float)this.fF() / 20.0F, 1.0F);
            $$2 *= 1.0F - ayz.l($$5) * 0.15F;
         } else if ($$0 && this.gJ()) {
            return 0.1F;
         }
      }

      return ayz.h($$1, 1.0F, $$2);
   }
}
