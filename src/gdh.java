import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class gdh extends gdj {
   private static final xa a = xa.c("options.online.title");
   @Nullable
   private frg<Unit> u;

   public gdh(gad $$0, frh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aS_() {
      super.aS_();
      if (this.u != null) {
         fuj $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private frg<?>[] a(frh $$0, frd $$1) {
      List<frg<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      frg<Unit> $$3 = y.a(
         $$1.s,
         $$0x -> {
            buo $$1x = $$0x.an();
            return new frg<>(
               "options.difficulty.online",
               frg.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new frg.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new frg[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
