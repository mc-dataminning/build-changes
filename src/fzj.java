import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fzj extends fzl {
   private static final wv a = wv.c("options.online.title");
   @Nullable
   private fng<Unit> u;

   public fzj(fwf $$0, fnh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.u != null) {
         fql $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fng<?>[] a(fnh $$0, fnd $$1) {
      List<fng<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      fng<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            btn $$1x = $$0x.an();
            return new fng<>(
               "options.difficulty.online",
               fng.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fng.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fng[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
