import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;

public abstract class hkt extends hkn {
   private final alk c;

   public hkt(alk $$0) {
      this.c = $$0;
   }

   public alk b() {
      return this.c;
   }

   public void a(hld $$0) {
      boolean $$1 = $$0.c();
      boolean $$2 = $$0.b();
      this.b = $$2;

      try (fki $$3 = $$0.d()) {
         this.a($$3, $$2, $$1);
      }
   }

   private void a(fki $$0, boolean $$1, boolean $$2) {
      flc $$3 = RenderSystem.getDevice();
      this.a = $$3.a(this.c::toString, flk.a, $$0.a(), $$0.b(), 1);
      this.a($$1, false);
      this.a($$2);
      $$3.b().a(this.a, $$0);
   }

   public abstract hld a(avh var1) throws IOException;
}
