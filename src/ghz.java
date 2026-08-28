import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class ghz extends cou {
   @Nullable
   private gds h;
   protected ezy a = ezy.c;
   public float b;
   public float c;
   public float d;
   public final gdh e;
   public float f;
   public float g;

   public ghz(gdh $$0, GameProfile $$1) {
      super($$0, $$0.X(), $$0.Y(), $$1);
      this.e = $$0;
   }

   @Override
   public boolean Y_() {
      gds $$0 = this.a();
      return $$0 != null && $$0.e() == dfj.d;
   }

   @Override
   public boolean b() {
      gds $$0 = this.a();
      return $$0 != null && $$0.e() == dfj.b;
   }

   @Nullable
   protected gds a() {
      if (this.h == null) {
         this.h = fke.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void h() {
      this.f = this.g;
      this.a = this.dy();
      super.h();
   }

   public ezy I(float $$0) {
      return this.a.a(this.dy(), (double)$$0);
   }

   public haf d() {
      gds $$0 = this.a();
      return $$0 == null ? gzw.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gh().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gh().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bwp.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fx()) {
         if (this.fz().a(cwq.ow)) {
            float $$5 = Math.min((float)this.fB() / 20.0F, 1.0F);
            $$2 *= 1.0F - azm.l($$5) * 0.15F;
         } else if ($$0 && this.gF()) {
            return 0.1F;
         }
      }

      return azm.h($$1, 1.0F, $$2);
   }
}
