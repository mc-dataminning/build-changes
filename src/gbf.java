import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class gbf extends gbh {
   private static final wy a = wy.c("options.online.title");
   @Nullable
   private fpc<Unit> u;

   public gbf(fyb $$0, fpd $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aO_() {
      super.aO_();
      if (this.u != null) {
         fsh $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fpc<?>[] a(fpd $$0, foz $$1) {
      List<fpc<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      fpc<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            bua $$1x = $$0x.an();
            return new fpc<>(
               "options.difficulty.online",
               fpc.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fpc.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fpc[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
