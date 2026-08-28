import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class gam extends gao {
   private static final ww a = ww.c("options.online.title");
   @Nullable
   private foi<Unit> u;

   public gam(fxi $$0, foj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.u != null) {
         fro $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private foi<?>[] a(foj $$0, fof $$1) {
      List<foi<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      foi<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            btv $$1x = $$0x.an();
            return new foi<>(
               "options.difficulty.online",
               foi.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new foi.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new foi[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
