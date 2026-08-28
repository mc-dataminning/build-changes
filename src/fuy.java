import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fuy extends fva {
   private static final xj a = xj.c("options.online.title");
   @Nullable
   private fkh<Unit> u;

   public fuy(frw $$0, fki $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aR_() {
      super.aR_();
      if (this.u != null) {
         fmb $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fkh<?>[] a(fki $$0, fke $$1) {
      List<fkh<?>> $$2 = new ArrayList<>();
      $$2.add($$0.V());
      $$2.add($$0.W());
      fkh<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            bsh $$1x = $$0x.ak();
            return new fkh<>(
               "options.difficulty.online",
               fkh.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fkh.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fkh[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
