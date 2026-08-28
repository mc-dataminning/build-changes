import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class gcu extends gcw {
   private static final xg a = xg.c("options.online.title");
   @Nullable
   private fqt<Unit> u;

   public gcu(fzq $$0, fqu $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aT_() {
      super.aT_();
      if (this.u != null) {
         ftw $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fqt<?>[] a(fqu $$0, fqq $$1) {
      List<fqt<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      fqt<Unit> $$3 = y.a(
         $$1.s,
         $$0x -> {
            buz $$1x = $$0x.an();
            return new fqt<>(
               "options.difficulty.online",
               fqt.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fqt.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fqt[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
