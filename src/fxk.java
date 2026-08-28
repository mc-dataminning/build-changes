import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fxk extends fxm {
   private static final wo a = wo.c("options.online.title");
   @Nullable
   private flk<Unit> u;

   public fxk(fui $$0, fll $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aR_() {
      super.aR_();
      if (this.u != null) {
         fon $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private flk<?>[] a(fll $$0, flh $$1) {
      List<flk<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      flk<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            bsf $$1x = $$0x.am();
            return new flk<>(
               "options.difficulty.online",
               flk.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new flk.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new flk[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
