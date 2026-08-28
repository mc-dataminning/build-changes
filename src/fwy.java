import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fwy extends fxa {
   private static final xv a = xv.c("options.online.title");
   @Nullable
   private fmh<Unit> u;

   public fwy(ftw $$0, fmi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aT_() {
      super.aT_();
      if (this.u != null) {
         fob $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fmh<?>[] a(fmi $$0, fme $$1) {
      List<fmh<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      fmh<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            btf $$1x = $$0x.al();
            return new fmh<>(
               "options.difficulty.online",
               fmh.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fmh.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fmh[0]);
   }

   @Override
   protected void l() {
      this.d.a(this.a(this.c, this.m));
   }
}
