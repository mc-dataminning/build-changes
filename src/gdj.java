import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class gdj extends gdl {
   private static final xc a = xc.c("options.online.title");
   @Nullable
   private fri<Unit> u;

   public gdj(gaf $$0, frj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aS_() {
      super.aS_();
      if (this.u != null) {
         ful $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fri<?>[] a(frj $$0, frf $$1) {
      List<fri<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      fri<Unit> $$3 = y.a(
         $$1.s,
         $$0x -> {
            buq $$1x = $$0x.an();
            return new fri<>(
               "options.difficulty.online",
               fri.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fri.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fri[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
