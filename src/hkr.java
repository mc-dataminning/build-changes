import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;

public abstract class hkr extends hkl {
   private final ali c;

   public hkr(ali $$0) {
      this.c = $$0;
   }

   public ali b() {
      return this.c;
   }

   public void a(hlb $$0) {
      boolean $$1 = $$0.c();
      boolean $$2 = $$0.b();
      this.b = $$2;

      try (fkg $$3 = $$0.d()) {
         this.a($$3, $$2, $$1);
      }
   }

   private void a(fkg $$0, boolean $$1, boolean $$2) {
      fla $$3 = RenderSystem.getDevice();
      this.a = $$3.a(this.c::toString, fli.a, $$0.a(), $$0.b(), 1);
      this.a($$1, false);
      this.a($$2);
      $$3.b().a(this.a, $$0);
   }

   public abstract hlb a(avf var1) throws IOException;
}
