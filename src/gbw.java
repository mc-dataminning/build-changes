import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class gbw extends gby {
   private static final wy a = wy.c("options.online.title");
   @Nullable
   private fpw<Unit> u;

   public gbw(fys $$0, fpx $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aO_() {
      super.aO_();
      if (this.u != null) {
         fsy $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fpw<?>[] a(fpx $$0, fpt $$1) {
      List<fpw<?>> $$2 = new ArrayList<>();
      $$2.add($$0.W());
      $$2.add($$0.X());
      fpw<Unit> $$3 = y.a(
         $$1.s,
         $$0x -> {
            bud $$1x = $$0x.an();
            return new fpw<>(
               "options.difficulty.online",
               fpw.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fpw.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fpw[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
