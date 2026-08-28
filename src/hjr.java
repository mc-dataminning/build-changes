import com.mojang.serialization.MapCodec;
import java.util.Objects;
import javax.annotation.Nullable;

public class hjr implements hju<ki> {
   private final gjf a;

   public hjr(gjf $$0) {
      this.a = $$0;
   }

   @Nullable
   public ki a(dak $$0) {
      return $$0.e();
   }

   public void a(@Nullable ki $$0, dai $$1, fld $$2, grn $$3, int $$4, int $$5, boolean $$6) {
      dye $$7 = $$0 != null ? $$0.a(kl.am, dye.a) : dye.a;
      czi $$8 = $$0 != null ? $$0.a(kl.an) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hmx $$10 = $$9 ? hna.g : hna.h;
      flg $$11 = $$10.c().a(gyt.a($$3, this.a.a($$10.a()), $$1 == dai.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         gtv.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, czi.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   public static record a() implements hju.a {
      public static final hjr.a a = new hjr.a();
      public static final MapCodec<hjr.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hjr.a> a() {
         return b;
      }

      @Override
      public hju<?> a(gkn $$0) {
         return new hjr(new gjf($$0.a(gkq.cT)));
      }
   }
}
