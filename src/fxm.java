import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fxm extends fxo {
   private static final wp a = wp.c("options.online.title");
   @Nullable
   private fll<Unit> u;

   public fxm(fuk $$0, flm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aR_() {
      super.aR_();
      if (this.u != null) {
         fop $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fll<?>[] a(flm $$0, fli $$1) {
      List<fll<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      fll<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            bsg $$1x = $$0x.am();
            return new fll<>(
               "options.difficulty.online",
               fll.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fll.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fll[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
