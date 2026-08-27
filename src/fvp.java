import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fvp extends cia {
   @Nullable
   private frk g;
   protected eov b;
   public float c;
   public float d;
   public float e;
   public final fra f;

   public fvp(fra $$0, GameProfile $$1) {
      super($$0, $$0.T(), $$0.U(), $$1);
      this.b = eov.b;
      this.f = $$0;
   }

   @Override
   public boolean P_() {
      frk $$0 = this.a();
      return $$0 != null && $$0.e() == cwb.d;
   }

   @Override
   public boolean f() {
      frk $$0 = this.a();
      return $$0 != null && $$0.e() == cwb.b;
   }

   @Nullable
   protected frk a() {
      if (this.g == null) {
         this.g = eyk.P().K().a(this.ct());
      }

      return this.g;
   }

   @Override
   public void l() {
      this.b = this.dm();
      super.l();
   }

   public eov C(float $$0) {
      return this.b.a(this.dm(), (double)$$0);
   }

   public giy b() {
      frk $$0 = this.a();
      return $$0 == null ? gir.a(this.ct()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fW().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(bqe.o) / this.fW().b() + 1.0F) / 2.0F;
      if (this.fW().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cpq $$1 = this.fr();
      if (this.fp()) {
         if ($$1.a(cpt.ot)) {
            int $$2 = this.ft();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (eyk.P().m.ax().a() && this.gt()) {
            return 0.1F;
         }
      }

      return awm.i(eyk.P().m.ah().c().floatValue(), 1.0F, $$0);
   }
}
