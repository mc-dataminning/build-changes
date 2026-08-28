import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fuq extends fus {
   private static final xl a = xl.c("options.online.title");
   @Nullable
   private fka<Unit> u;

   public fuq(frp $$0, fkb $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aS_() {
      super.aS_();
      if (this.u != null) {
         flu $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fka<?>[] a(fkb $$0, fjx $$1) {
      List<fka<?>> $$2 = new ArrayList<>();
      $$2.add($$0.V());
      $$2.add($$0.W());
      fka<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            bse $$1x = $$0x.ak();
            return new fka<>(
               "options.difficulty.online",
               fka.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fka.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fka[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
