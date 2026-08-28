import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fxm extends fxo {
   private static final wo a = wo.c("options.online.title");
   @Nullable
   private flm<Unit> u;

   public fxm(fuk $$0, fln $$1) {
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

   private flm<?>[] a(fln $$0, flj $$1) {
      List<flm<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      flm<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            bsg $$1x = $$0x.am();
            return new flm<>(
               "options.difficulty.online",
               flm.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new flm.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new flm[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
