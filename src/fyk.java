import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fyk extends fym {
   private static final wp a = wp.c("options.online.title");
   @Nullable
   private fmj<Unit> u;

   public fyk(fvi $$0, fmk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aR_() {
      super.aR_();
      if (this.u != null) {
         fpo $$0 = this.d.b(this.u);
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
            bsv $$1x = $$0x.an();
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
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
