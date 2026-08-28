import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gqj extends csi {
   @Nullable
   private gma h;
   protected fgc a = fgc.c;
   public float b;
   public float c;
   public float d;
   public final glo e;
   public float f;
   public float g;

   public gqj(glo $$0, GameProfile $$1) {
      super($$0, $$0.aa(), $$0.ab(), $$1);
      this.e = $$0;
   }

   @Nullable
   @Override
   public dkg a() {
      gma $$0 = this.b();
      return $$0 != null ? $$0.e() : null;
   }

   @Nullable
   protected gma b() {
      if (this.h == null) {
         this.h = fqq.Q().L().a(this.cG());
      }

      return this.h;
   }

   @Override
   public void g() {
      this.f = this.g;
      this.a = this.dy();
      super.g();
   }

   public fgc I(float $$0) {
      return this.a.a(this.dy(), (double)$$0);
   }

   public hls c() {
      gma $$0 = this.b();
      return $$0 == null ? hli.a(this.cG()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gk().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gk().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.h(bzl.v) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fz()) {
         if (this.fB().a(dao.pj)) {
            float $$5 = Math.min((float)this.fD() / 20.0F, 1.0F);
            $$2 *= 1.0F - azz.l($$5) * 0.15F;
         } else if ($$0 && this.gI()) {
            return 0.1F;
         }
      }

      return azz.h($$1, 1.0F, $$2);
   }
}
