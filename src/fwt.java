import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fwt extends fwv {
   private static final xk a = xk.c("options.online.title");
   @Nullable
   private fmc<Unit> u;

   public fwt(ftr $$0, fmd $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aT_() {
      super.aT_();
      if (this.u != null) {
         fnw $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fmc<?>[] a(fmd $$0, flz $$1) {
      List<fmc<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      fmc<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            bsx $$1x = $$0x.am();
            return new fmc<>(
               "options.difficulty.online",
               fmc.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fmc.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fmc[0]);
   }

   @Override
   protected void l() {
      this.d.a(this.a(this.c, this.m));
   }
}
