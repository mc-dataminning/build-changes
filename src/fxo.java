import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fxo extends fxq {
   private static final wp a = wp.c("options.online.title");
   @Nullable
   private fln<Unit> u;

   public fxo(fum $$0, flo $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aR_() {
      super.aR_();
      if (this.u != null) {
         fos $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fln<?>[] a(flo $$0, flk $$1) {
      List<fln<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      fln<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            bsi $$1x = $$0x.am();
            return new fln<>(
               "options.difficulty.online",
               fln.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fln.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fln[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
