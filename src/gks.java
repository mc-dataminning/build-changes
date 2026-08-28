import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gks extends cow {
   @Nullable
   private ggk h;
   protected faz a = faz.c;
   public float b;
   public float c;
   public float d;
   public final gfy e;
   public float f;
   public float g;

   public gks(gfy $$0, GameProfile $$1) {
      super($$0, $$0.Z(), $$0.aa(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean Z_() {
      ggk $$0 = this.a();
      return $$0 != null && $$0.e() == dge.d;
   }

   @Override
   public boolean b() {
      ggk $$0 = this.a();
      return $$0 != null && $$0.e() == dge.b;
   }

   @Nullable
   protected ggk a() {
      if (this.h == null) {
         this.h = fli.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dy();
      super.h();
   }

   public faz I(float $$0) {
      return this.a.a(this.dy(), (double)$$0);
   }

   public hft d() {
      ggk $$0 = this.a();
      return $$0 == null ? hfk.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gj().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gj().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bwo.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fz()) {
         if (this.fB().a(cws.pa)) {
            float $$5 = Math.min((float)this.fD() / 20.0F, 1.0F);
            $$2 *= 1.0F - ayz.l($$5) * 0.15F;
         } else if ($$0 && this.gH()) {
            return 0.1F;
         }
      }

      return ayz.h($$1, 1.0F, $$2);
   }
}
