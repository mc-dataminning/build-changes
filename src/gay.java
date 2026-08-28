import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class gay extends gba {
   private static final wy a = wy.c("options.online.title");
   @Nullable
   private fov<Unit> u;

   public gay(fxu $$0, fow $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.u != null) {
         fsa $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fov<?>[] a(fow $$0, fos $$1) {
      List<fov<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      fov<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            bty $$1x = $$0x.an();
            return new fov<>(
               "options.difficulty.online",
               fov.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fov.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$3 != null) {
         this.u = $$3;
         $$2.add($$3);
      }

      return $$2.toArray(new fov[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
