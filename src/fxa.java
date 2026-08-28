import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fxa extends fxc {
   private static final xv a = xv.c("options.online.title");
   @Nullable
   private fmj<Unit> u;

   public fxa(fty $$0, fmk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aT_() {
      super.aT_();
      if (this.u != null) {
         fod $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fmj<?>[] a(fmk $$0, fmg $$1) {
      List<fmj<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      fmj<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            btg $$1x = $$0x.al();
            return new fmj<>(
               "options.difficulty.online",
               fmj.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fmj.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fmj[0]);
   }

   @Override
   protected void l() {
      this.d.a(this.a(this.c, this.m));
   }
}
