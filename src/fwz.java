import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fwz extends fxb {
   private static final xv a = xv.c("options.online.title");
   @Nullable
   private fmi<Unit> u;

   public fwz(ftx $$0, fmj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aT_() {
      super.aT_();
      if (this.u != null) {
         foc $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fmi<?>[] a(fmj $$0, fmf $$1) {
      List<fmi<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      fmi<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            btf $$1x = $$0x.al();
            return new fmi<>(
               "options.difficulty.online",
               fmi.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fmi.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fmi[0]);
   }

   @Override
   protected void l() {
      this.d.a(this.a(this.c, this.m));
   }
}
